package robot.commands

import robot.Robot
import robot.rotatedDirection

class RightCommand() : ICommand {
    override fun exec(robot: Robot?): Robot? {
        return robot?.let {
            val direction = rotatedDirection(robot.direction, -1)

            return Robot(direction, it.x, it.y, it.board)
        }
    }
}