

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  private static XboxController driver = new XboxController(0);

  
  public static double hDriveR() {
    return driver.getY(Hand.kRight);
  }
  //////
  public static double hDriveL() {
    return driver.getY(Hand.kLeft);
  }
///
 public static double hDriveStrafeLeft() {

  return driver.getTriggerAxis(Hand.kLeft);
 }
///
 public static double hDriveStrafeRight() {

  return driver.getTriggerAxis(Hand.kRight);
 }
 ///

}
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.