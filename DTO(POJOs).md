在Java中, 常常會用到POJOs的class

```
public class User(){
	String name ;
	String age ;
	public String setName(){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public int setAge(){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
}
```
光 set 跟 get 的 Fuction可能就可以寫個幾十行又長又雜, 

雖然可以用快速生成 Getter and Setter 或 Plugin 的方式快速生成,

不過一堆看起來跟阿婆裹腳布一樣長的程式碼還是很討厭..

在 Kotlin 中可以使用 DTO (Data Class Object)
```
data class User(val name: String, val age: Int)
```
對, 沒看錯, 就一行 ! 一行就可以解決掉了, 簡單又方便!

