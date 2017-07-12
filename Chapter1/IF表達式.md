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


