package robot.commands

import robot.Robot

interface ICommand {
    fun exec(robot: Robot?): Robot?
}
