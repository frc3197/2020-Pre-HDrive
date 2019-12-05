

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import frc.robot.OI;
import frc.robot.RobotMap.CANSparkMaxID;
import frc.robot.commands.Drive;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class DriveTrain extends Subsystem {
  // Creates CANSparkMax objects using the CANSparkMaxID's we enumerated earlier
  private CANSparkMax l1SparkMax = new CANSparkMax(CANSparkMaxID.kLeft1.id, MotorType.kBrushless);
  private CANSparkMax l2SparkMax = new CANSparkMax(CANSparkMaxID.kLeft2.id, MotorType.kBrushless);
  private CANSparkMax r1SparkMax = new CANSparkMax(CANSparkMaxID.kRight1.id, MotorType.kBrushless);
  private CANSparkMax r2SparkMax = new CANSparkMax(CANSparkMaxID.kRight2.id, MotorType.kBrushless);
  private CANSparkMax m1SparkMax = new CANSparkMax(CANSparkMaxID.kMiddle.id,MotorType.kBrushless);

  // Creates two motorController groups for the left motors and the right motors.
  private SpeedControllerGroup leftMotors = new SpeedControllerGroup(l1SparkMax, l2SparkMax);
  private SpeedControllerGroup rightMotors = new SpeedControllerGroup(r1SparkMax, r2SparkMax);

  // Creates a DifferentialDrive for the tankDrive function
  private DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);

  public DriveTrain() {

    // Sets the motors to brake mode so that they don't coast when they're not getting any inputs.
    l1SparkMax.setIdleMode(IdleMode.kBrake);
    l2SparkMax.setIdleMode(IdleMode.kBrake);
    r1SparkMax.setIdleMode(IdleMode.kBrake);
    r2SparkMax.setIdleMode(IdleMode.kBrake);
    m1SparkMax.setIdleMode(IdleMode.kBrake);

  }

  @Override
  public void initDefaultCommand() {
    // This makes it so the DriveTrain class runs the Drive command on Default.
    setDefaultCommand(new Drive(this));


  }
  // Constructor for the hDrive drivetrain object.
  public void hDrive(double l, double r) {
    drive.tankDrive(l, r, true);
  }
 // Constructor for the strafe functionality.
 // hStrafeVal is the value for a single motor so we make the right trigger a negative value.
 // This can make it so that the right trigger will give a negative value and the left will stay positive. 
  public void hDriveStrafe(double l, double r){
   double hStrafeVal = (r *-1 + l);
   m1SparkMax.set(hStrafeVal);
  }

}
