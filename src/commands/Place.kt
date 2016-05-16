package robot

class Place(vararg args: String) : ICommand {
    private var direction: Direction = Direction.valueOf(args[1].toUpperCase())
    private var x: Int               = args[2].toInt()
    private var y: Int               = args[3].toInt()

    override fun exec(robot: Robot?): Robot = Robot(direction, x, y)
}
