前言
===
這是一個紀錄自己練習Kotlin學到的東西, 寫給自己以及想將Android專案改成用Kolint寫的朋友們,

因為本身不擅長寫這些東西, 如果有任何錯誤請來信指教.

email : katelin013@gmail.com    (有工作機會的話也請指教XDDDD)

關於Kotlin
----------
由JetBrains所推出, 2016年推出 v1.0, 2017年的Google I/O 正式宣佈未來 Android Studio 3.0

會正式的支援, 在此之前都需要透過Plugin擴充後支援 (詳細Kotlin歷史就不敘述了)

裝完Plugin之後, 也會提示是否要讓專案支援Kotlin, 選擇是之後, 會修改兩隻檔案

**build.gradle (Project) :**

```
buildscript {
    ext.kotlin_version = '1.1.3-2'
	 ...

    repositories {
			...
        jcenter()
    }
    dependencies {
			...
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}
```

**build.gradle (App) 會加上 :** 

apply plugin: 'kotlin-android'

不過還要加上 "kotlin-android-extensions" 才會有依賴關係 

(直接在code中使用 textView.text = "test", 不需要再findViewById)

現在是否應該使用Kotlin?
--------------------
優缺點, 餵狗一下有太多專業回答了, 至於是否現在就開始使用Kotlin呢? 個人回答 : 舊的code就不用改

了, 新的code 或者是需要重構的部分, 可以嘗試使用Kotlin, 它的語法糖太迷人了, 可以讓code很漂亮, 

寫起來也很開心(個人心得), 基本上現在也不太會有什麼坑, 畢竟它是100%相容Java的 (當然, 同一支

Class 是只能有 Java 或 Kotlin , 但是不同class間目前用起來依然良好)Android Studio 也可以將 

Java 轉換成 Kotlin, 當然沒有那麼簡單, 直接按幾下就完美轉換...不過可以將 Java code copy, 貼

在一個空的kt檔內會做轉換, 在一開始學習Kotlin時, 這功能真的幫了很大的忙啊!! 對於 Android 工程

師, 我相信要學習 Kotlin 的學習曲線並不高, 但是code的整潔性會大大增加不少, 而且看著 Android 目

前依然只能使用1.6 (最近還出了1.9了), Google 跟 Oracle 的爭鬥大概短時間內都不會有個段落, 

Kotlin 借鏡不同語言的想法, 加入了很多比較新穎的構想, 加上 Google 正式宣布支援, 現在正是學習的

好時機！！

*文獻參考 :* 

中國的大神將官方的教學翻譯成中文:

http://www.kotlincn.net/docs/reference/ 


