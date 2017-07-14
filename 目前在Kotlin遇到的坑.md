開始學習 & 開始轉換到 Kotlin 的時候, 遇到的一些坑記錄在這

(不是 Kotlin 有任何問題, 而是自己不熟悉所遇到的一些狀況罷了)

當 import 時, 遇到相同名稱衝突的解決方式
```
import foo.Bar
import foo.Bar as mBar
```
這樣子就可以使用 Bar 或者是 mBar 了



