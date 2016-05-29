package robot.commands

import robot.Robot

class StopCommand() : ICommand {
    override fun exec(robot: Robot?): Robot? {
        System.exit(0)
        return null
    }
}
