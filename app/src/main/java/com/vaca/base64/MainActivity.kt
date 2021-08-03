package com.vaca.base64

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.nio.charset.StandardCharsets
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val decoder: Base64.Decoder = Base64.getDecoder()
        val encoder: Base64.Encoder = Base64.getEncoder()
        val text = "字串文字"
        val textByte = text.toByteArray(charset("UTF-8"))
//编码
//编码
        val encodedText: String = encoder.encodeToString(textByte)
        println(encodedText)
//解码
//解码
        println(String(decoder.decode(encodedText), StandardCharsets.UTF_8))
    }
}