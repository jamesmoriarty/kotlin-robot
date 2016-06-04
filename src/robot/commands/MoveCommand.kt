package robot.commands

import robot.Direction
import robot.Robot

class MoveCommand(vararg args: String) : Command {
    override fun exec(robot: Robot?): Robot? {
        return robot?.let({
            val newRobot = when (it.direction) {
                Direction.NORTH -> it.copy(y = it.y + 1)
                Direction.EAST  -> it.copy(x = it.x + 1)
                Direction.SOUTH -> it.copy(y = it.y - 1)
                Direction.WEST  -> it.copy(x = it.x - 1)
            }

            if(newRobot.isOnBoard()) {
                return newRobot
            } else {
                return robot
            }
        })
    }
}