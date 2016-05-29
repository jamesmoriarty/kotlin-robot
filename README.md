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
> PLACE WEST,1,1
> REPORT
WEST 1 1
>
```

```
kotlin -cp robot.jar MainKt < test.txt
> > WEST 1 1
> > WEST 0 1
> > SOUTH 0 1
> %                     
```
