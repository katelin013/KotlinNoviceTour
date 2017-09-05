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

或者是使用 import fuction的方式

```
package strings

fun testFunction(){
	...
}

```

在另外一隻 class 中 : 

```
package practice
import xx.strings;

...
override fun onCreate(savedInstanceState: Bundle?) {
	...
	super.onCreate(savedInstanceState)
	testFunction()
	....			
}
...
```

其實這段會等價於Java中的 :

```
package strings;

public class xxx{
	public static String testFunction(){}
}	
```

所以就可在想呼叫的地方呼叫該function了



