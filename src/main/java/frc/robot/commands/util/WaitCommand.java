package frc.robot.commands.util;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class WaitCommand extends TimedCommand {

    public WaitCommand(double timeout) {
        super(timeout);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Called once after timeout
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
