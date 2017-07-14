在 Kotlin 中, 沒有 static 的用法, 而是使用 companion object
```
class Kotlin {
	companion object companionObj{
		var staticInt: Int = 0 
		fun getInstance(): Kotlin {
			return Kotlin
		}
	}
}
```
在需要使用的地方 : 
```
Kotlin.staticInt
Kotlin.getInstance()
```


