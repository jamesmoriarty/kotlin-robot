package robot

class MoveCommand(vararg args: String) : ICommand {
    override fun exec(robot: Robot?): Robot? {
        return robot?.let({
            var newRobot = when (it.direction) {
                Direction.NORTH -> Robot(it.direction, it.x, it.y + 1, it.board)
                Direction.EAST -> Robot(it.direction, it.x + 1, it.y, it.board)
                Direction.SOUTH -> Robot(it.direction, it.x, it.y - 1, it.board)
                Direction.WEST -> Robot(it.direction, it.x - 1, it.y, it.board)
            }

            if(isOnBoard(newRobot)) {
                return newRobot
            } else {
                return robot
            }
        })
    }
}