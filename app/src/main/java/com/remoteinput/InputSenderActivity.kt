// header
package com.remoteinput

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class InputSenderActivity : AppCompatActivity() {
private var connected = false
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_input_sender)
    title = getString(R.string.mode_sender)

    val etServerIp = findViewById<EditText>(R.id.etServerIp)
    val btnConnect = findViewById<Button>(R.id.btnConnect)
    val tvStatus = findViewById<TextView>(R.id.tvConnectionStatus)
    val etInput = findViewById<EditText>(R.id.etInput)

    tvStatus.text = getString(R.string.status_waiting)
    btnConnect.setOnClickListener {
        connected = !connected
        if (connected) {
            tvStatus.text = getString(R.string.status_connected)
            btnConnect.text = getString(R.string.disconnect)
            Toast.makeText(this, "演示：已连接（仅 UI）", Toast.LENGTH_SHORT).show()
        } else {
            tvStatus.text = getString(R.string.status_waiting)
            btnConnect.text = getString(R.string.connect)
            Toast.makeText(this, "演示：已断开（仅 UI）", Toast.LENGTH_SHORT).show()
        }
    }

    etServerIp.hint = "目标 IP（演示）"
    etInput.hint = getString(R.string.input_hint)
}
}