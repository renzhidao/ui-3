// header
package com.remoteinput

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class KeyboardPreviewActivity : AppCompatActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
setContentView(R.layout.keyboard_view)
title = "键盘预览（UI）"
}
}