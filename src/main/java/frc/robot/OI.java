

package frc.robot;

import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.POVButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  private static XboxController driver = new XboxController(0);


  

  public static double hDriveY() {
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
  public static double hDriveR() {
    return driver.getX(Hand.kLeft);
  }
}
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.