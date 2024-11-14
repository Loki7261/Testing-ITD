package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name = "4pt score", group = "Autonomous")
public class Tedt extends LinearOpMode {

  @Override
  public void runOpMode() {
    // Initialize the hardware variables.
    // ? Boolean is init servo
    RobotClass robot = new RobotClass(hardwareMap, false);

    // ! Runs upon initialization
    telemetry.addData("Status", "Initialized");
    telemetry.update();

    // Initialize drive variables
    float vertical;
    float horizontal;
    float pivot;
    double speedScalar = 1.0;
    boolean slowMode = false;
    // true- single button false- trigger
    boolean singleIntakeSelect = false;
    // Season specific variables
    boolean SpinnerClosed = false;
    robot.Claw.setPosition(1.0);

    // ! Runs until the end of the match after play is pressed
    waitForStart();
    robot.timeElapsed.reset();

    while (opModeIsActive()) {
      robot.setDrivePower(.35, .35, .35, .35);
      sleep(5000);
      robot.setDrivePower(-0.3, -0.3, -0.3, -0.3);
      sleep(1000);
      robot.setDrivePower(0, 0, 0, 0);
      sleep(999999999);
    }
  }
}
