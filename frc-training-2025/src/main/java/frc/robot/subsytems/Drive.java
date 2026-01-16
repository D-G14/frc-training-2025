// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsytems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Drive extends SubsystemBase {
  /** Creates a new Drive. */
private final TalonSRX m_leftPrimary = new TalonSRX();
private final TalonSRX m_rightPrimary = new TalonSRX();
private final VictorSPX m_leftSecondary = new VictorSPX();
private final VictorSPX m_rightSecondary = new VictorSPX();
  public Drive() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
