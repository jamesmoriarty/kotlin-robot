package robot.commands

import robot.Direction

fun CommandFactory(args: Array<String>): ICommand {
    // My opinion here, that matching over string much more nice and cleaner sollution here:
    val (command) = args;

    return when (command.toUpperCase()) {
        "PLACE" -> {
            val direction = try {
                Direction.valueOf(args[1].toUpperCase())
            } catch (e: Exception) {
                return NullCommand("Invalid direction")
            }

            if (args.size == 4) {
                return PlaceCommand(direction, args[2].toInt(), args[3].toInt())
            } else {
                NullCommand("Invalid direction")
            }
        }
        "LEFT" -> LeftCommand()
        "RIGHT" -> RightCommand()
        "REPORT" -> ReportCommand()
        "MOVE" -> MoveCommand()
        "STOP" -> StopCommand()
        else -> NullCommand("Invalid command")
    }

}