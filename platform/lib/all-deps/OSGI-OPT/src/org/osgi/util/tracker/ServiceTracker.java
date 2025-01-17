/*
 * $Header: /cvshome/repository/org/osgi/util/tracker/ServiceTracker.java,v 1.14 2003/02/16 16:10:59 hargrave Exp $
 *
 * Copyright (c) The Open Services Gateway Initiative (2000, 2002).
 * All Rights Reserved.
 *
 * Implementation of certain elements of the Open Services Gateway Initiative
 * (OSGI) Specification may be subject to third party intellectual property
 * rights, including without limitation, patent rights (such a third party may
 * or may not be a member of OSGi). OSGi is not responsible and shall not be
 * held responsible in any manner for identifying or failing to identify any or
 * all such third party intellectual property rights.
 *
 * This document and the information contained herein are provided on an "AS
 * IS" basis and OSGI DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO ANY WARRANTY THAT THE USE OF THE INFORMATION HEREIN WILL
 * NOT INFRINGE ANY RIGHTS AND ANY IMPLIED WARRANTIES OF MERCHANTABILITY OR
 * FITNESS FOR A PARTICULAR PURPOSE. IN NO EVENT WILL OSGI BE LIABLE FOR ANY
 * LOSS OF PROFITS, LOSS OF BUSINESS, LOSS OF USE OF DATA, INTERRUPTION OF
 * BUSINESS, OR FOR DIRECT, INDIRECT, SPECIAL OR EXEMPLARY, INCIDENTIAL,
 * PUNITIVE OR CONSEQUENTIAL DAMAGES OF ANY KIND IN CONNECTION WITH THIS
 * DOCUMENT OR THE INFORMATION CONTAINED HEREIN, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH LOSS OR DAMAGE.
 *
 * All Company, brand and product names may be trademarks that are the sole
 * property of their respective owners. All rights reserved.
 */

package org.osgi.util.tracker;

import org.osgi.framework.*;
import java.util.*;

/**
 * The <tt>ServiceTracker</tt> class simplifies using services
 * from the Framework's service registry.
 * <p>
 * A <tt>ServiceTracker</tt> object is constructed with
 * search criteria and a
 * <tt>ServiceTrackerCustomizer</tt> object.
 * A <tt>ServiceTracker</tt> object can use the <tt>ServiceTrackerCustomizer</tt> object
 * to customize the service objects to be tracked.
 * The <tt>ServiceTracker</tt> object can then be opened to begin tracking
 * all services in the
 * Framework's service registry that match the specified
 * search criteria. The <tt>ServiceTracker</tt> object correctly handles all
 * of the details of listening to <tt>ServiceEvent</tt> objects and
 * getting and ungetting services.
 * <p>
 * The <tt>getServiceReferences</tt> method can be called to get
 * references to the services being tracked. The <tt>getService</tt>
 * and <tt>getServices</tt> methods can be called to get the service
 * objects for the tracked service.
 *
 * @version $Revision: 1.14 $
 * @author Open Services Gateway Initiative
 */

public class ServiceTracker implements ServiceTrackerCustomizer
{
    /* set this to true to compile in debug messages */
    private static final boolean DEBUG = false;

    /**
	 * Bundle context this <tt>ServiceTracker</tt> object is tracking against.
	 */
    protected final BundleContext context;

    /**
	 * Filter specifying search criteria for the services to track.
	 * @since 1.1
	 */
    protected final Filter filter;

    /**
	 * Tracked services: <tt>ServiceReference</tt> object -> customized Object
	 * and <tt>ServiceListener</tt> object
	 */
    private Tracked tracked;

    /** <tt>ServiceTrackerCustomizer</tt> object for this tracker. */
    private ServiceTrackerCustomizer customizer;

    /**
	 * Create a <tt>ServiceTracker</tt> object on the specified <tt>ServiceReference</tt> object.
	 *
	 * <p>The service referenced by the specified <tt>ServiceReference</tt> object
	 * will be tracked by this <tt>ServiceTracker</tt> object.
	 *
	 * @param context   <tt>BundleContext</tt> object against which the tracking is done.
	 * @param reference <tt>ServiceReference</tt> object for the service to be tracked.
	 * @param customizer The customizer object to call when services are
	 * added, modified, or removed in this <tt>ServiceTracker</tt> object.
	 * If customizer is <tt>null</tt>, then this <tt>ServiceTracker</tt> object will be used
	 * as the <tt>ServiceTrackerCustomizer</tt> object and the <tt>ServiceTracker</tt>
	 * object will call the <tt>ServiceTrackerCustomizer</tt> methods on itself.
	 */
    public ServiceTracker(BundleContext context, ServiceReference reference,
                          ServiceTrackerCustomizer customizer)
    {
        this.context = context;
        this.customizer = (customizer == null) ? this : customizer;

        try
        {
            this.filter = context.createFilter("("+Constants.SERVICE_ID+"="+reference.getProperty(Constants.SERVICE_ID).toString()+")");
        }
        catch (InvalidSyntaxException e)
        {
            throw new RuntimeException("unexpected InvalidSyntaxException: "+e.getMessage());
        }
    }

    /**
	 * Create a <tt>ServiceTracker</tt> object on the specified class name.
	 *
	 * <p>Services registered under the specified class name will be tracked
	 * by this <tt>ServiceTracker</tt> object.
	 *
	 * @param context   <tt>BundleContext</tt> object against which the tracking is done.
	 * @param clazz     Class name of the services to be tracked.
	 * @param customizer The customizer object to call when services are
	 * added, modified, or removed in this <tt>ServiceTracker</tt> object.
	 * If customizer is <tt>null</tt>, then this <tt>ServiceTracker</tt> object will be used
	 * as the <tt>ServiceTrackerCustomizer</tt> object and the <tt>ServiceTracker</tt> object
	 * will call the <tt>ServiceTrackerCustomizer</tt> methods on itself.
	 */
    public ServiceTracker(BundleContext context, String clazz,
                          ServiceTrackerCustomizer customizer)
    {
        this.context = context;
        this.customizer = (customizer == null) ? this : customizer;

        try
        {
            this.filter = context.createFilter("("+Constants.OBJECTCLASS+"="+clazz+")");
        }
        catch (InvalidSyntaxException e)
        {
            throw new RuntimeException("unexpected InvalidSyntaxException: "+e.getMessage());
        }

        if (clazz == null)
        {
            throw new NullPointerException();
        }
    }

    /**
	 * Create a <tt>ServiceTracker</tt> object on the specified <tt>Filter</tt> object.
	 *
	 * <p>Services which match the specified <tt>Filter</tt> object will be tracked
	 * by this <tt>ServiceTracker</tt> object.
	 *
	 * @param context   <tt>BundleContext</tt> object against which the tracking is done.
	 * @param filter    <tt>Filter</tt> object to select the services to be tracked.
	 * @param customizer The customizer object to call when services are
	 * added, modified, or removed in this <tt>ServiceTracker</tt> object.
	 * If customizer is null, then this <tt>ServiceTracker</tt> object will be used
	 * as the <tt>ServiceTrackerCustomizer</tt> object and the <tt>ServiceTracker</tt>
	 * object will call the <tt>ServiceTrackerCustomizer</tt> methods on itself.
	 * @since 1.1
	 */
    public ServiceTracker(BundleContext context, Filter filter,
                          ServiceTrackerCustomizer customizer)
    {
        this.context = context;
        this.filter = filter;
        this.customizer = (customizer == null) ? this : customizer;

        if ((context == null) || (filter == null))
        {
            throw new NullPointerException();
        }
    }

    /**
	 * Open this <tt>ServiceTracker</tt> object and begin tracking services.
	 *
	 * <p>Services which match the search criteria specified when
	 * this <tt>ServiceTracker</tt> object was created are now tracked
	 * by this <tt>ServiceTracker</tt> object.
	 *
	 * @throws java.lang.IllegalStateException if the <tt>BundleContext</tt>
	 * object with which this <tt>ServiceTracker</tt> object was created is no longer valid.
	 */
    public synchronized void open()
    {
        if (tracked == null)
        {
            if (DEBUG)
            {
                System.out.println("ServiceTracker.open: "+filter);
            }

            tracked = new Tracked(customizer, filter);

            ServiceReference[] references;

            synchronized (tracked)
            {
                context.addServiceListener(tracked);

                try
                {
                    references = context.getServiceReferences(null, filter.toString());
                }
                catch (InvalidSyntaxException e)
                {
                    throw new RuntimeException("unexpected InvalidSyntaxException");
                }
            }

            /* Call tracked outside of synchronized region */
            if (references != null)
            {
                int size = references.length;

                for (int i=0; i < size; i++)
                {
                    ServiceReference reference = references[i];

                    /* if the service is still registered */
                    if (reference.getBundle() != null)
                    {
                        tracked.track(reference);
                    }
                }
            }
        }
    }

    /**
	 * Close this <tt>ServiceTracker</tt> object.
	 *
	 * <p>This method should be called when this <tt>ServiceTracker</tt> object
	 * should end the tracking of services.
	 */

    public synchronized void close()
    {
        if (tracked != null)
        {
            if (DEBUG)
            {
                System.out.println("ServiceTracker.close: "+filter);
            }

            tracked.close();

            ServiceReference references[] = getServiceReferences();

            Tracked outgoing = tracked;
            tracked = null;

            try
            {
                context.removeServiceListener(outgoing);
            }
            catch (IllegalStateException e)
            {
                /* In case the context was stopped. */
            }

            if (references != null)
            {
                for (int i = 0; i < references.length; i++)
                {
                    outgoing.untrack(references[i]);
                }
            }
        }
    }

    /**
	 * Properly close this <tt>ServiceTracker</tt> object when finalized.
	 * This method calls the <tt>close</tt> method to close this <tt>ServiceTracker</tt> object
	 * if it has not already been closed.
	 *
	 */
    protected void finalize() throws Throwable
    {
        close();
    }

    /**
	 * Default implementation of the <tt>ServiceTrackerCustomizer.addingService</tt> method.
	 *
	 * <p>This method is only called when this <tt>ServiceTracker</tt> object
	 * has been constructed with a <tt>null ServiceTrackerCustomizer</tt> argument.
	 *
	 * The default implementation returns the result of
	 * calling <tt>getService</tt>, on the
	 * <tt>BundleContext</tt> object with which this <tt>ServiceTracker</tt> object was created,
	 * passing the specified <tt>ServiceReference</tt> object.
	 * <p>This method can be overridden in a subclass to customize
	 * the service object to be tracked for the service
	 * being added. In that case, take care not
	 * to rely on the default implementation of removedService that will unget the service.
	 *
	 * @param reference Reference to service being added to this
	 * <tt>ServiceTracker</tt> object.
	 * @return The service object to be tracked for the service
	 * added to this <tt>ServiceTracker</tt> object.
	 * @see ServiceTrackerCustomizer
	 */
    public Object addingService(ServiceReference reference)
    {
        return context.getService(reference);
    }

    /**
	 * Default implementation of the <tt>ServiceTrackerCustomizer.modifiedService</tt> method.
	 *
	 * <p>This method is only called when this <tt>ServiceTracker</tt> object
	 * has been constructed with a <tt>null ServiceTrackerCustomizer</tt> argument.
	 *
	 * The default implementation does nothing.
	 *
	 * @param reference Reference to modified service.
	 * @param service The service object for the modified service.
	 * @see ServiceTrackerCustomizer
	 */
    public void modifiedService(ServiceReference reference, Object service)
    {
    }

    /**
	 * Default implementation of the <tt>ServiceTrackerCustomizer.removedService</tt> method.
	 *
	 * <p>This method is only called when this <tt>ServiceTracker</tt> object
	 * has been constructed with a <tt>null ServiceTrackerCustomizer</tt> argument.
	 *
	 * The default implementation
	 * calls <tt>ungetService</tt>, on the
	 * <tt>BundleContext</tt> object with which this <tt>ServiceTracker</tt> object was created,
	 * passing the specified <tt>ServiceReference</tt> object.
	 * <p>This method can be overridden in a subclass. If the default
	 * implementation of <tt>addingService</tt> method was used, this method must unget the service.
	 *
	 * @param reference Reference to removed service.
	 * @param service The service object for the removed service.
	 * @see ServiceTrackerCustomizer
	 */
    public void removedService(ServiceReference reference, Object object)
    {
        context.ungetService(reference);
    }

    /**
	 * Wait for at least one service to be tracked by this <tt>ServiceTracker</tt> object.
	 * <p>It is strongly recommended that <tt>waitForService</tt> is not used
	 * during the calling of the <tt>BundleActivator</tt> methods. <tt>BundleActivator</tt> methods are
	 * expected to complete in a short period of time.
	 *
	 * @param timeout time interval in milliseconds to wait.  If zero,
	 * the method will wait indefinately.
	 * @return Returns the result of <tt>getService()</tt>.
	 * @throws IllegalArgumentException If the value of timeout is
	 * negative.
	 */
    public Object waitForService(long timeout) throws InterruptedException
    {
        if (timeout < 0)
        {
            throw new IllegalArgumentException("timeout value is negative");
        }

        Object object = getService();

        while (object == null)
        {
            Tracked tracked = this.tracked;     /* use local var since we are not synchronized */

            if (tracked == null)    /* if ServiceTracker is not open */
            {
                return null;
            }

            synchronized (tracked)
            {
                if (tracked.size() == 0)
                {
                    tracked.wait(timeout);
                }
            }

            object = getService();

            if (timeout > 0)
            {
                return object;
            }
        }

        return object;
    }

    /**
	 * Return an array of <tt>ServiceReference</tt> objects for all services
	 * being tracked by this <tt>ServiceTracker</tt> object.
	 *
	 * @return Array of <tt>ServiceReference</tt> objects or <tt>null</tt> if no service
	 * are being tracked.
	 */
    public ServiceReference[] getServiceReferences()
    {
        Tracked tracked = this.tracked;     /* use local var since we are not synchronized */

        if (tracked == null)    /* if ServiceTracker is not open */
        {
            return null;
        }

        synchronized (tracked)
        {
            int size = tracked.size();

            if (size == 0)
            {
                return null;
            }

            ServiceReference references[] = new ServiceReference[size];

            Enumeration enum = tracked.keys();

            for (int i = 0; i < size; i++)
            {
                references[i] = (ServiceReference)enum.nextElement();
            }

            return references;
        }
    }

    /**
	 * Return an array of service objects for all services
	 * being tracked by this <tt>ServiceTracker</tt> object.
	 *
	 * @return Array of service objects or <tt>null</tt> if no service
	 * are being tracked.
	 */
    public Object[] getServices()
    {
        Tracked tracked = this.tracked;     /* use local var since we are not synchronized */

        if (tracked == null)    /* if ServiceTracker is not open */
        {
            return null;
        }

        synchronized (tracked)
        {
            int size = tracked.size();

            if (size == 0)
            {
                return null;
            }

            Object objects[] = new Object[size];

            Enumeration enum = tracked.elements();

            for (int i = 0; i < size; i++)
            {
                objects[i] = enum.nextElement();
            }

            return objects;
        }
    }

    /**
	 * Returns a <tt>ServiceReference</tt> object for one of the services
	 * being tracked by this <tt>ServiceTracker</tt> object.
	 *
	 * <p>If multiple services are being tracked, the service
	 * with the highest ranking (as specified in its <tt>service.ranking</tt> property) is
	 * returned.
	 *
	 * <p>If there is a tie in ranking, the service with the lowest
	 * service ID (as specified in its <tt>service.id</tt> property); that is,
	 * the service that was registered first is returned.
	 * <p>This is the same algorithm used by <tt>BundleContext.getServiceReference</tt>.
	 *
	 * @return <tt>ServiceReference</tt> object or <tt>null</tt> if no service is being tracked.
	 * @since 1.1
	 */
    public ServiceReference getServiceReference()
    {
        ServiceReference[] references = getServiceReferences();

        int length = (references == null) ? 0 : references.length;

        if (length > 0)         /* if a service is being tracked */
        {
            int index = 0;

            if (length > 1)     /* if more than one service, select highest ranking */
            {
                int rankings[] = new int[length];
                int count = 0;
                int maxRanking = Integer.MIN_VALUE;

                for (int i = 0 ; i < length; i++)
                {
                    Object property = references[i].getProperty(Constants.SERVICE_RANKING);

                    int ranking = (property instanceof Integer)
                                    ? ((Integer)property).intValue() : 0;

                    rankings[i] = ranking;

                    if (ranking > maxRanking)
                    {
                        index = i;
                        maxRanking = ranking;
                        count = 1;
                    }
                    else
                    {
                        if (ranking == maxRanking)
                        {
                            count++;
                        }
                    }
                }

                if (count > 1)  /* if still more than one service, select lowest id */
                {
                    long minId = Long.MAX_VALUE;

                    for (int i = 0 ; i < length; i++)
                    {
                        if (rankings[i] == maxRanking)
                        {
                            long id = ((Long)(references[i].getProperty(Constants.SERVICE_ID))).longValue();

                            if (id < minId)
                            {
                                index = i;
                                minId = id;
                            }
                        }
                    }
                }
            }

            return references[index];
        }

        return null;
    }

    /**
	 * Returns the service object for the specified <tt>ServiceReference</tt> object
	 * if the referenced service is
	 * being tracked by this <tt>ServiceTracker</tt> object.
	 *
	 * @param reference Reference to the desired service.
	 * @return Service object or <tt>null</tt> if the service referenced by the
	 * specified <tt>ServiceReference</tt> object is not being tracked.
	 */
    public Object getService(ServiceReference reference)
    {
        Tracked tracked = this.tracked;     /* use local var since we are not synchronized */

        if (tracked == null)    /* if ServiceTracker is not open */
        {
            return null;
        }

        return tracked.get(reference);
    }

    /**
	 * Returns a service object for one of the services
	 * being tracked by this <tt>ServiceTracker</tt> object.
	 *
	 * <p>If any services are being tracked, this method returns the result
	 * of calling <tt>getService(getServiceReference())</tt>.
	 *
	 * @return Service object or <tt>null</tt> if no service is being tracked.
	 */
    public Object getService()
    {
        ServiceReference reference = getServiceReference();

        if (reference != null)
        {
            return getService(reference);
        }

        return null;
    }

    /**
	 * Remove a service from this <tt>ServiceTracker</tt> object.
	 *
	 * The specified service will be removed from this
	 * <tt>ServiceTracker</tt> object.
	 * If the specified service was being tracked then the
	 * <tt>ServiceTrackerCustomizer.removedService</tt> method will be
	 * called for that service.
	 *
	 * @param reference Reference to the service to be removed.
	 */
    public void remove(ServiceReference reference)
    {
        Tracked tracked = this.tracked;     /* use local var since we are not synchronized */

        if (tracked == null)    /* if ServiceTracker is not open */
        {
            return;
        }

        tracked.untrack(reference);
    }

    /**
	 * Return the number of services being tracked by this <tt>ServiceTracker</tt> object.
	 *
	 * @return Number of services being tracked.
	 */

    public int size()
    {
        Tracked tracked = this.tracked;     /* use local var since we are not synchronized */

        if (tracked == null)    /* if ServiceTracker is not open */
        {
            return 0;
        }

        return tracked.size();
    }

    /**
	 * Returns the tracking count for this <tt>ServiceTracker</tt> object.
	 *
	 * The tracking count is initialized to 0 when this
	 * <tt>ServiceTracker</tt> object is opened. Every time a service is
	 * added or removed from this <tt>ServiceTracker</tt> object
	 * the tracking count is incremented.
	 *
	 * <p>The tracking count can
	 * be used to determine if this <tt>ServiceTracker</tt> object
	 * has added or removed a service by comparing a tracking count value
	 * previously collected with the current tracking count value. If the value
	 * has not changed, then no service has been added or removed from
	 * this <tt>ServiceTracker</tt> object
	 * since the previous tracking count was collected.
	 *
	 * @since 1.2
	 * @return The tracking count for this <tt>ServiceTracker</tt> object
	 * or -1 if this <tt>ServiceTracker</tt> object is not open.
	 */
    public int getTrackingCount()
    {
        Tracked tracked = this.tracked;     /* use local var since we are not synchronized */

        if (tracked == null)    /* if ServiceTracker is not open */
        {
            return -1;
        }

        return tracked.getTrackingCount();
    }

    /**
	 * Inner class to track the services.
	 * This class is a hashtable mapping <tt>ServiceReference</tt> object -> customized Object.
	 * This class also implements the <tt>ServiceListener</tt> interface for the tracker.
	 * This is not a public class. It is only for use by the implementation
	 * of the <tt>ServiceTracker</tt> class.
	 *
	 */
    static class Tracked extends Hashtable implements ServiceListener
    {
        private ServiceTrackerCustomizer customizer;    /** ServiceTrackerCustomizer object for this tracker. */
        private Filter filter;      /** The filter used to track */
        private Vector adding;      /** list of ServiceReferences currently being added */
        private boolean closed;     /** true if the tracked object is closed */
        private int trackingCount;  /** modification count */


        /**
		 * Tracked constructor.
		 *
		 * @param customizer Customizer object from parent <tt>ServiceTracker</tt> object.
		 * @param filter <tt>Filter</tt> object from parent <tt>ServiceTracker</tt> object.
		 */
        protected Tracked(ServiceTrackerCustomizer customizer, Filter filter)
        {
            super();
            this.customizer = customizer;
            this.filter = filter;
            closed = false;
            trackingCount = 0;
            adding = new Vector(10, 10);
        }

        /**
		 * Called by the parent <tt>ServiceTracker</tt> object when it is closed.
		 */
        protected void close()
        {
            closed = true;
        }

        /**
		 * Called by the parent <tt>ServiceTracker</tt> object to get
		 * the modification count.
		 *
		 * @since 1.2
		 * @return modification count.
		 */
        protected int getTrackingCount()
        {
            return trackingCount;
        }

        /**
		 * <tt>ServiceListener</tt> method for the <tt>ServiceTracker</tt> class.
		 * This method must NOT be synchronized to avoid deadlock potential.
		 *
		 * @param event <tt>ServiceEvent</tt> object from the framework.
		 */
        public void serviceChanged(ServiceEvent event)
        {
            /* Check if we had a delayed call (which could happen when we close). */
            if (closed)
            {
                return;
            }

            ServiceReference reference = event.getServiceReference();

            switch (event.getType())
            {
                case ServiceEvent.REGISTERED:
                case ServiceEvent.MODIFIED:
                    if (filter.match(reference))
                    {
                        track(reference);
                        /* If the customizer throws an unchecked exception, it is safe to let it propagate */
                    }
                    else
                    {
                        untrack(reference);
                        /* If the customizer throws an unchecked exception, it is safe to let it propagate */
                    }

                    break;

                case ServiceEvent.UNREGISTERING:
                    untrack(reference);
                    /* If the customizer throws an unchecked exception, it is safe to let it propagate */

                    break;
            }
        }

        /**
		 * Begin to track the referenced service.
		 *
		 * @param reference Reference to a service to be tracked.
		 */
        protected void track(ServiceReference reference)
        {
            Object object = get(reference);

            if (object != null)     /* we are already tracking the service */
            {
                if (DEBUG)
                {
                    System.out.println("ServiceTracker.Tracked.track[modified]: "+reference);
                }

                /* Call customizer outside of synchronized region */
                customizer.modifiedService(reference, object);
                /* If the customizer throws an unchecked exception, it is safe to let it propagate */

                return;
            }

            synchronized (this)
            {
                if (adding.indexOf(reference, 0) != -1) /* if this service is already
                                                         * in the process of being added. */
                {
                    if (DEBUG)
                    {
                        System.out.println("ServiceTracker.Tracked.track[already adding]: "+reference);
                    }

                    return;
                }

                adding.addElement(reference);   /* mark this service is being added */
            }

            if (DEBUG)
            {
                System.out.println("ServiceTracker.Tracked.track[adding]: "+reference);
            }

            boolean becameUntracked = false;

            /* Call customizer outside of synchronized region */
            try
            {
                object = customizer.addingService(reference);
                /* If the customizer throws an unchecked exception, it will propagate after the finally */
            }
            finally
            {
                synchronized (this)
                {
                    if (adding.removeElement(reference))    /* if the service was not untracked
                                                             * during the customizer callback */
                    {
                        if (object != null)
                        {
                            put(reference, object);

                            trackingCount++;            /* increment modification count */

                            notifyAll();
                        }
                    }
                    else
                    {
                        becameUntracked = true;
                    }
                }
            }

            /* The service became untracked during
			 * the customizer callback.
			 */
            if (becameUntracked)
            {
                if (DEBUG)
                {
                    System.out.println("ServiceTracker.Tracked.track[removed]: "+reference);
                }

                /* Call customizer outside of synchronized region */
                customizer.removedService(reference, object);
                /* If the customizer throws an unchecked exception, it is safe to let it propagate */
            }
        }

        /**
		 * Discontinue tracking the referenced service.
		 *
		 * @param reference Reference to the tracked service.
		 */
        protected void untrack(ServiceReference reference)
        {
            Object object;

            synchronized (this)
            {
                if (adding.removeElement(reference)) /* if the service is in the process
                                                      * of being added */
                {
                    if (DEBUG)
                    {
                        System.out.println("ServiceTracker.Tracked.untrack[being added]: "+reference);
                    }

                    return;                          /* in case the service is untracked
                                                      * while in the process of adding */
                }

                object = this.remove(reference);     /* must remove from tracker before calling
                                                      * customizer callback */

                if (object == null)             /* are we actually tracking the service */
                {
                    return;
                }

                trackingCount++;                /* increment modification count */
            }

            if (DEBUG)
            {
                System.out.println("ServiceTracker.Tracked.untrack[removed]: "+reference);
            }

            /* Call customizer outside of synchronized region */
            customizer.removedService(reference, object);
            /* If the customizer throws an unchecked exception, it is safe to let it propagate */
        }
    }
}

