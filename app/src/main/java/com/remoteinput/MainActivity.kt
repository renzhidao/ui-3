// header
package com.remoteinput

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
setContentView(R.layout.activity_main)
    findViewById<TextView>(R.id.tvTitle).text = getString(R.string.app_name)

    findViewById<Button>(R.id.btnSender).setOnClickListener {
        startActivity(Intent(this, InputSenderActivity::class.java))
    }
    findViewById<Button>(R.id.btnImeGuide).setOnClickListener {
        startActivity(Intent(this, ImeGuideActivity::class.java))
    }
    findViewById<Button>(R.id.btnKeyboardPreview).setOnClickListener {
        startActivity(Intent(this, KeyboardPreviewActivity::class.java))
    }
    findViewById<Button>(R.id.btnDiagnostics).setOnClickListener {
        startActivity(Intent(this, DiagnosticsActivity::class.java))
    }
    findViewById<Button>(R.id.btnSettings).setOnClickListener {
        startActivity(Intent(this, SettingsActivity::class.java))
    }
    findViewById<Button>(R.id.btnAbout).setOnClickListener {
        startActivity(Intent(this, AboutActivity::class.java))
    }
}
}