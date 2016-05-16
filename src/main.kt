import robot.Board
import robot.Robot
import robot.Place

fun main(args: Array<String>) {
    var board         = Board()
    var robot: Robot? = null

    while(true) {
        var tokens = readLine()!!.toLowerCase().split("(,| )+".toRegex())


        try {
            when(tokens.first()) {

                "place" -> {
                    robot = Place(*tokens.toTypedArray()).exec(robot)
                }
                "right" -> {

                }
                "report" -> {
                    println(robot)
                }
                else -> {
                    println("Unknown Command:" + tokens.toString())
                }
            }
        }
        catch (e: IllegalArgumentException) {
            println("Invalid Command Arguments:" + tokens.toString())
        }
        println(robot)
    }
}
