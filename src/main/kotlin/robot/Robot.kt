package robot

// It's very nice, that Robot is immutable
data class Robot(val direction: Direction, val x: Int, val y: Int, val board: Board = Board())

fun isOnBoard(robot: Robot): Boolean {
    return robot.x >= 0 && robot.x < robot.board.width && robot.y >= 0 && robot.y < robot.board.height
}