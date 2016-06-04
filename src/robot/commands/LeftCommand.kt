package robot.commands

import robot.Robot

class LeftCommand(vararg args: String) : Command {
    override fun exec(robot: Robot?): Robot? = robot?.let({
        return it.copy(direction = it.direction.rotate(1))
    })
}