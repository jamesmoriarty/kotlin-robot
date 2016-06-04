package robot

data class Robot(val direction: Direction, val x: Int, val y: Int, val board: Board = Board()) {
    fun isOnBoard(): Boolean = this.x >= 0 && this.x < this.board.width && this.y >= 0 && this.y < this.board.height
}

