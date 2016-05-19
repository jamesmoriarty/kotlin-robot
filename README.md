Robot
=====

Dependencies
------------

```
brew install kotlin
```

Compile
-------

```
kotlinc -d robot.jar $(find src -name "*.kt" | grep -v Test)
```

Run
---

```
kotlin -cp robot.jar MainKt
```
