IF表達式
=======
Java中if else的簡寫如下 :
```
String s = "test";
int a = s.length() > 1 ? 0 : -1;
```
而在Kotlin中可以寫成
```
val s = "test"
var c = if(s.isNotEmpty()) 1 else -1
```
可讀性看起來, Kotlin 略勝一籌

如果是賦予空值的宣告, 還有另外一種寫法 :
Java : 
```
String str = (x != null) ? a : "" ;
```
Kotlin :
```
val str = a ?: ""
```
宣告一個變數也可以這樣寫 : 
```
val a = 5
val b = 10

val max = if (a > b) {
	println(a > b)
	a
} else {
	println(a < b)	
	b
}
println(max) //會直接得到 b 的值
```



