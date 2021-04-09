// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.analog.adis16470.frc.ADIS16470_IMU;
import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class DriveSubsystem extends SubsystemBase {

  private final SpeedControllerGroup m_leftMotors =
    new SpeedControllerGroup(
      new CANSparkMax(DriveConstants.kLeftMotor1Port, MotorType.kBrushless), 
      new CANSparkMax(DriveConstants.kLeftMotor2Port, MotorType.kBrushless));

  private final SpeedControllerGroup m_rightMotors =
    new SpeedControllerGroup(
      new CANSparkMax(DriveConstants.kRightMotor1Port, MotorType.kBrushless), 
      new CANSparkMax(DriveConstants.kRightMotor2Port, MotorType.kBrushless));

  private final DifferentialDrive m_drive = new DifferentialDrive(m_leftMotors, m_rightMotors);

  //private final CANEncoder m_leftEncoder = new CANEncoder()


  public DriveSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
