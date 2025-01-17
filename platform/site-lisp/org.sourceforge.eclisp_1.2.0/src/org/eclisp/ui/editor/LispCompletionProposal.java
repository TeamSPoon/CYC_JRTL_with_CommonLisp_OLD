/*
 * Created on 01.05.2004
 * 
 *  
 */
package org.eclisp.ui.editor;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposalExtension2;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;

/**
 *  The completion proposal class 
 */
public class LispCompletionProposal implements ICompletionProposal, ICompletionProposalExtension2 {

    /** The string to be displayed in the completion proposal popup */
    private String fDisplayString;

    /** The replacement string */
    private String fReplacementString;

    /** The replacement offset */
    private int fReplacementOffset;

    /** The replacement length */
    private int fReplacementLength;

    /** The cursor position after this proposal has been applied */
    private int fCursorPosition;

    /** The image to be displayed in the completion proposal popup */
    private Image fImage;

    /** The additional info of this proposal */
    private String fAdditionalProposalInfo;

    /**
     * Creates a new Lisp completion proposal. All fields are initialized based
     * on the provided information.
     * 
     * @param replacementString the actual string to be inserted into the document
     * @param replacementOffset the offset of the text to be replaced
     * @param replacementLength the length of the text to be replaced
     * @param cursorPosition the position of the cursor following the insert relative to replacementOffset
     * @param image the image to display for this proposal
     * @param displayString the string to be displayed for the proposal
     * @param additionalProposalInfo the additional information associated with this proposal
     */
    public LispCompletionProposal(String replacementString,
            int replacementOffset, int replacementLength, int cursorPosition,
            Image image, String displayString, String additionalProposalInfo) {
        fReplacementString = replacementString;
        fReplacementOffset = replacementOffset;
        fReplacementLength = replacementLength;
        fCursorPosition = cursorPosition;
        fImage = image;
        fDisplayString = displayString;
        fAdditionalProposalInfo = additionalProposalInfo;
    }

    /**
     * @see org.eclipse.jface.text.contentassist.ICompletionProposalExtension2#apply(org.eclipse.jface.text.ITextViewer,
     *      char, int, int)
     */
    public void apply(ITextViewer viewer, char trigger, int stateMask, int offset) {
        apply(viewer.getDocument());
    }

    /**
     * @see org.eclipse.jface.text.contentassist.ICompletionProposalExtension2#selected(org.eclipse.jface.text.ITextViewer,
     *      boolean)
     */
    public void selected(ITextViewer viewer, boolean smartToggle) {        
    }

    /** 
     * @see org.eclipse.jface.text.contentassist.ICompletionProposalExtension2#unselected(org.eclipse.jface.text.ITextViewer)
     */
    public void unselected(ITextViewer viewer) {
    }

    /**
     * @see org.eclipse.jface.text.contentassist.ICompletionProposalExtension2#validate(org.eclipse.jface.text.IDocument,
     *      int, org.eclipse.jface.text.DocumentEvent)
     */
    public boolean validate(IDocument document, int offset, DocumentEvent event) {

        String enteredText = "";
        try {
            enteredText = document.get(fReplacementOffset, offset-fReplacementOffset);
        } catch (BadLocationException e) {
            // discard
        }
        
		boolean valid= fDisplayString.toLowerCase().startsWith(enteredText.toLowerCase());
		if (valid) {
			fReplacementLength = enteredText.length();
		}
		return valid;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.text.contentassist.ICompletionProposal#apply(org.eclipse.jface.text.IDocument)
     */
    public void apply(IDocument document) {
		try {
			document.replace(fReplacementOffset, fReplacementLength, fReplacementString);
		} catch (BadLocationException x) {
			// ignore
		}
    }

    /**
     * @see org.eclipse.jface.text.contentassist.ICompletionProposal#getSelection(org.eclipse.jface.text.IDocument)
     */
    public Point getSelection(IDocument document) {
        return new Point(fReplacementOffset + fCursorPosition - 2, 0);
    }

    /**
     * @see org.eclipse.jface.text.contentassist.ICompletionProposal#getAdditionalProposalInfo()
     */
    public String getAdditionalProposalInfo() {
        return fAdditionalProposalInfo;
    }

    /**
     * @see org.eclipse.jface.text.contentassist.ICompletionProposal#getDisplayString()
     */
    public String getDisplayString() {
		if (fDisplayString != null){
			return fDisplayString;
		}
		return fReplacementString;
    }

    /**
     * @see org.eclipse.jface.text.contentassist.ICompletionProposal#getImage()
     */
    public Image getImage() {
        return fImage;
    }

    /**
     * @see org.eclipse.jface.text.contentassist.ICompletionProposal#getContextInformation()
     */
    public IContextInformation getContextInformation() {
        return null;
    }

}