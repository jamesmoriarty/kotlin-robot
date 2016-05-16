package robot

class Place(vararg args: String) {
    private var direction: Direction = Direction.valueOf(args[1].toUpperCase())
    private var x: Int               = args[2].toInt()
    private var y: Int               = args[3].toInt()

    fun exec(robot: Robot?): Robot = Robot(direction, x, y)
}
