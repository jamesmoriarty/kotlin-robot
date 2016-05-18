package robot.commands

import java.lang.reflect.InvocationTargetException

fun Factory(args: Array<String>): ICommand {
    try {
        var className          = "${args.first().capitalize()}Command"
        var packageName        = ICommand::class.java.getPackage().getName()
        var commandClass       = Class.forName("$packageName.$className").kotlin
        var command : ICommand = commandClass.constructors.first().call(args) as ICommand

        return command
    }
    catch (e: InvocationTargetException) {
        return NullCommand(*args)
    }
    catch (e: ClassNotFoundException) {
        return NullCommand(*args)
    }
}