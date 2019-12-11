package frc.robot;

public class RobotMap {
  // Enumerates 5 motors - 2 left motors, 2 rights motors, and one motor for
  // strafe.

  public static enum CANSparkMaxID {
    kLeft1(1, "Left1"), kLeft2(16, "Left2"), kRight1(14, "Right1"), kRight2(15, "Right2"), kMiddle(12, "Middle1");

    // Instance Variables for the CANSparkMaxID constructor.
    public final int id;
    public final String name;

    // Constructor for the CANSparkMaxID object that accepts the parameters id and
    // name.
    private CANSparkMaxID(int id, String name) {
      this.id = id;
      this.name = name;
    }
  };
}
// For example to map the left and right motors, you could define the
// following variables to use with your drivetrain subsystem.
// public static int leftMotor = 1;
