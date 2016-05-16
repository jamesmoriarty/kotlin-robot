package robot

data class Robot(val facing: Direction, val x: Int, val y: Int, val board: Board = Board())