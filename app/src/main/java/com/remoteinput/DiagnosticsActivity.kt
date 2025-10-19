// header
package com.remoteinput

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DiagnosticsActivity : AppCompatActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
setContentView(R.layout.activity_diagnostics)
title = "诊断（UI）"
}
}