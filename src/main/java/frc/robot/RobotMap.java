 package frc.robot;

public class RobotMap {
  public static enum CANSparkMaxID {
    kLeft1(1, "Left1"), kLeft2(2, "Left2"), kRight1(3, "Right1"), kRight2(4, "Right2"), kMiddle(5,"Middle1");

    public final int id;
    public final String name;

    private CANSparkMaxID(int id, String name) {
      this.id = id;
      this.name = name;
    }
  }}

  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;