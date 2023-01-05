// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  //Creates talon objects
  TalonFX m_rightFront = new TalonFX(1);
  TalonFX m_rightBack = new TalonFX(2);
  TalonFX m_leftFront = new TalonFX(3);
  TalonFX m_leftBack = new TalonFX(4);

  //Creates controller object
  XboxController m_controller = new XboxController(0);
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    //sets right side of the drive base inverted
    m_rightFront.setInverted(true);
    m_rightBack.setInverted(true);

  }
  
  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {}

  /** This function is called once when teleop is enabled. */
  @Override
  public void teleopInit() {}

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {

    //sets drivebase to the controller joystick 
    m_rightFront.set(ControlMode.PercentOutput, m_controller.getRightY());
    m_rightBack.set(ControlMode.PercentOutput, m_controller.getRightY());
    m_leftFront.set(ControlMode.PercentOutput, m_controller.getLeftY());
    m_leftBack.set(ControlMode.PercentOutput, m_controller.getLeftY());

  }

  /** This function is called once when the robot is disabled. */
  @Override
  public void disabledInit() {}

  /** This function is called periodically when disabled. */
  @Override
  public void disabledPeriodic() {}

  /** This function is called once when test mode is enabled. */
  @Override
  public void testInit() {}

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}

  /** This function is called once when the robot is first started up. */
  @Override
  public void simulationInit() {}

  /** This function is called periodically whilst in simulation. */
  @Override
  public void simulationPeriodic() {}
}
