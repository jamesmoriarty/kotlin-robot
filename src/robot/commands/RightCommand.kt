package robot.commands

import robot.Robot

class RightCommand(vararg args: String) : Command {
    override fun exec(robot: Robot?): Robot? {
        return robot?.let({
            return it.copy(direction = it.direction.rotate(-1))
        })
    }
}