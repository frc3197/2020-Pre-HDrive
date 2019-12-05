

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  //  Creates an Xbox Controller called driver.
  private static XboxController driver = new XboxController(0);

  //  Returns the Y value of the right joystick and stores it in hDrvieR.
  public static double hDriveR() {
    return driver.getY(Hand.kRight);
  }

  //  Returns the Y value of the left joystick and stores it in hDriveL.
  public static double hDriveL() {
    return driver.getY(Hand.kLeft);
  }

// Returns the axis value of the left trigger and stores it in hDriveStrafeLeft
 public static double hDriveStrafeLeft() {

  return driver.getTriggerAxis(Hand.kLeft);
 }
// Returns the axis value of the right trigger and stores it in hDriveStrafeRight
 public static double hDriveStrafeRight() {

  return driver.getTriggerAxis(Hand.kRight);
 }
 ///

}}
