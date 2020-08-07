package com.example.esperantoexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.esperanto.esperanto.JSContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ctx = JSContext()
        val jsvalue = ctx.evaluate("""
            [
                'This value comes',
                'from JavaScript!'
            ].join(' ');
        """)
        this.textView.text = jsvalue.asString()
    }
}