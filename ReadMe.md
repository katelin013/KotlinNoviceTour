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

build.gradle (Project) :

```buildscript {
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

build.gradle (App) :


