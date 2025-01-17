
(IN-PACKAGE :SHOP3-ROVERS) 
(DEFPROBLEM ROVERPROB1234 ROVER
            ((OBJECTIVE OBJECTIVE1) (OBJECTIVE OBJECTIVE0)
             (CAMERA CAMERA0) (WAYPOINT WAYPOINT3) (WAYPOINT WAYPOINT2)
             (WAYPOINT WAYPOINT1) (WAYPOINT WAYPOINT0)
             (STORE ROVER0STORE) (ROVER ROVER0) (MODE LOW_RES)
             (MODE HIGH_RES) (MODE COLOUR) (LANDER GENERAL)
             (VISIBLE WAYPOINT1 WAYPOINT0)
             (VISIBLE WAYPOINT0 WAYPOINT1)
             (VISIBLE WAYPOINT2 WAYPOINT0)
             (VISIBLE WAYPOINT0 WAYPOINT2)
             (VISIBLE WAYPOINT2 WAYPOINT1)
             (VISIBLE WAYPOINT1 WAYPOINT2)
             (VISIBLE WAYPOINT3 WAYPOINT0)
             (VISIBLE WAYPOINT0 WAYPOINT3)
             (VISIBLE WAYPOINT3 WAYPOINT1)
             (VISIBLE WAYPOINT1 WAYPOINT3)
             (VISIBLE WAYPOINT3 WAYPOINT2)
             (VISIBLE WAYPOINT2 WAYPOINT3) (AT_SOIL_SAMPLE WAYPOINT0)
             (AT_ROCK_SAMPLE WAYPOINT1) (AT_SOIL_SAMPLE WAYPOINT2)
             (AT_ROCK_SAMPLE WAYPOINT2) (AT_SOIL_SAMPLE WAYPOINT3)
             (AT_ROCK_SAMPLE WAYPOINT3) (AT_LANDER GENERAL WAYPOINT0)
             (CHANNEL_FREE GENERAL) (AT ROVER0 WAYPOINT3)
             (AVAILABLE ROVER0) (STORE_OF ROVER0STORE ROVER0)
             (EMPTY ROVER0STORE) (EQUIPPED_FOR_SOIL_ANALYSIS ROVER0)
             (EQUIPPED_FOR_ROCK_ANALYSIS ROVER0)
             (EQUIPPED_FOR_IMAGING ROVER0)
             (CAN_TRAVERSE ROVER0 WAYPOINT3 WAYPOINT0)
             (CAN_TRAVERSE ROVER0 WAYPOINT0 WAYPOINT3)
             (CAN_TRAVERSE ROVER0 WAYPOINT3 WAYPOINT1)
             (CAN_TRAVERSE ROVER0 WAYPOINT1 WAYPOINT3)
             (CAN_TRAVERSE ROVER0 WAYPOINT1 WAYPOINT2)
             (CAN_TRAVERSE ROVER0 WAYPOINT2 WAYPOINT1)
             (ON_BOARD CAMERA0 ROVER0)
             (CALIBRATION_TARGET CAMERA0 OBJECTIVE1)
             (SUPPORTS CAMERA0 COLOUR) (SUPPORTS CAMERA0 HIGH_RES)
             (VISIBLE_FROM OBJECTIVE0 WAYPOINT0)
             (VISIBLE_FROM OBJECTIVE0 WAYPOINT1)
             (VISIBLE_FROM OBJECTIVE0 WAYPOINT2)
             (VISIBLE_FROM OBJECTIVE0 WAYPOINT3)
             (VISIBLE_FROM OBJECTIVE1 WAYPOINT0)
             (VISIBLE_FROM OBJECTIVE1 WAYPOINT1)
             (VISIBLE_FROM OBJECTIVE1 WAYPOINT2)
             (VISIBLE_FROM OBJECTIVE1 WAYPOINT3)
             (:ORIGINAL-GOAL
              (AND (COMMUNICATED_SOIL_DATA WAYPOINT2)
                   (COMMUNICATED_ROCK_DATA WAYPOINT3)
                   (COMMUNICATED_IMAGE_DATA OBJECTIVE1 HIGH_RES)))
             (COMMUNICATE_SOIL_DATA WAYPOINT2)
             (COMMUNICATE_ROCK_DATA WAYPOINT3)
             (COMMUNICATE_IMAGE_DATA OBJECTIVE1 HIGH_RES))
            (:TASK ACHIEVE-GOALS)) 