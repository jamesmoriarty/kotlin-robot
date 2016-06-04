package robot.commands

import java.lang.reflect.InvocationTargetException
import robot.Robot

interface Command {
    fun exec(robot: Robot?): Robot?

    companion object Factory {
        fun factory(args: Array<String>): Command {
            try {
                val className         = "${args.first().capitalize()}Command"
                val packageName       = Command::class.java.getPackage().getName()
                val commandClass      = Class.forName("$packageName.$className").kotlin
                val command : Command = commandClass.constructors.first().call(args) as Command

                return command
            }
            catch (e: InvocationTargetException) {
                return NullCommand(*args)
            }
            catch (e: ClassNotFoundException) {
                return NullCommand(*args)
            }

        }
    }
}