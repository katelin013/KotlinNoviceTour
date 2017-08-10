Anko
====

在摸Kotlin時, 就有看到很多文章再討論 Anko 這個 Lib

一開始覺得 Anko 好像很麻煩, 用 xml 刻畫面好像也沒有什麼問題

就只有用 toast, 其他就跳過懶得看XD

不過看到了一篇文章, 讓我又產生了興趣 : 

https://android.jlelse.eu/400-faster-layouts-with-anko-da17f32c45dd

當中使用了 Anko 後, 在四隻不同的手機上, 效率跟使用Xml layout相比, 提升了300%~600%

好吧, 我想再懶還是要看一下 Anko 了

簡單講一下 Anko 介紹 (資料來源為 Anko 的 github 官方介紹):

**Anko Layouts:**

Anko Layout是使用DSL(Domain-Specific Language)的方式刻Android Layout, 以下是一個使用

Anko DSL 簡單的 Layout
```
verticalLayout {
    val name = editText()
    button("Say Hello") {
        onClick { toast("Hello, ${name.text}!") }
    }
}
```
比起xml來說, 這樣看起來比較整潔, 也很方便

verticalLayout , 其實就是Linear Layout, orientation 設定為 "vertical"

(其他的介紹就擺在Anko_Layout中)



