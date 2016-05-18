package robot.commands

import robot.Robot
import robot.rotatedDirection

class LeftCommand(vararg args: String) : ICommand {
    override fun exec(robot: Robot?): Robot? {
        robot?.let({
            var direction = rotatedDirection(robot.direction, -1)

            return Robot(direction, it.x, it.y, it.board)
        })

        return robot
    }
}