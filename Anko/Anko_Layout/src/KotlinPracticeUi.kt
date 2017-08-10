package com.kayle.kotlinbcplayer.kotlin_practice

import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.*
import com.kayle.kotlinbcplayer.R
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * Created by Kayle on 2017/8/9.
 */
class KotlinPracticeUi(val ctx: Context) : AnkoComponent<Context> {
    lateinit var logoImg: ImageView
    lateinit var accountLayout: LinearLayout
    lateinit var pwdLayout: LinearLayout
    lateinit var loginBtn: Button
    lateinit var et_account: EditText
    lateinit var et_password: EditText
    lateinit var test: TextView

    override fun createView(ui: AnkoContext<Context>): View = with(ui) {
        //使用RelativeLayout, 如果有需要設定到id的話, 必須新建立一個id的xml檔案, 目前有點麻煩
        relativeLayout {
            backgroundColor = context.resources.getColor(android.R.color.white)
            gravity = Gravity.CENTER_HORIZONTAL
            logoImg = imageView(R.mipmap.ic_launcher){
                id = R.id.logo_img
            }
            .lparams {
                width = dip(100)
                height = dip(100)
            }
            accountLayout = linearLayout {
                gravity = Gravity.CENTER_VERTICAL
                orientation = LinearLayout.HORIZONTAL
                backgroundResource = R.drawable.bg_frame_corner
                id = R.id.account_layout
                imageView {
                    image = resources.getDrawable(R.mipmap.ic_launcher)
                }.lparams(width = wrapContent, height = wrapContent) {
                    leftMargin = dip(12)
                    rightMargin = dip(15)
                }
                et_account = editText {
                    hint = "登入"
                    hintTextColor = Color.parseColor("#666666")
                    textSize = 16f
                    background = null
                }
            }.lparams(width = dip(300), height = dip(40)) {
                topMargin = dip(45)
                below(logoImg)
            }

            pwdLayout = linearLayout {
                orientation = LinearLayout.HORIZONTAL
                backgroundResource = R.drawable.bg_frame_corner
                gravity = Gravity.CENTER_VERTICAL
                id = R.id.pwdLayout
                imageView {
                    image = resources.getDrawable(R.mipmap.ic_launcher)
                }.lparams {
                    leftMargin = dip(12)
                    rightMargin = dip(15)
                }
                et_password = editText {
                    hint = "輸入密碼"
                    hintTextColor = Color.parseColor("#666666")
                    textSize = 16f
                    background = null
                }
            }.lparams {
                width = dip(300)
                height = dip(40)
                topMargin = dip(10)
                below(accountLayout)
            }

            loginBtn = button("登录") {
                gravity = Gravity.CENTER
                background = resources.getDrawable(R.drawable.bg_login_btn)
                textColor = Color.parseColor("#ffffff")
                id = R.id.loginBtn
                onClick {
                    toast("登入Click")
                }
            }.lparams(width = dip(300), height = dip(44)) {
                topMargin = dip(18)
                below(pwdLayout)
            }
            linearLayout {
                orientation = LinearLayout.HORIZONTAL
                gravity = Gravity.CENTER_VERTICAL
                checkBox("記住密碼") {
                    textColor = Color.parseColor("#666666")
                    textSize = 16f
                    leftPadding = dip(5)
                }
                test = textView("aaa") {
                    textColor = Color.parseColor("#1783e3")
                    gravity = Gravity.RIGHT
                    textSize = 16f
                }.lparams(width = matchParent)
            }.lparams(width = dip(300)) {
                topMargin = dip(18)
                below(loginBtn)
            }
        }
    }

}