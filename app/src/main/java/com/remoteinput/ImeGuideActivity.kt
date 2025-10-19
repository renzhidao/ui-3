// header
package com.remoteinput

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ImeGuideActivity : AppCompatActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
setContentView(R.layout.activity_ime_guide)
title = getString(R.string.mode_receiver)
}
}