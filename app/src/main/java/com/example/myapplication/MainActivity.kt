package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val wsFutureDepth = WsFutureDepth()
        val wsSpotEtf = WsSpotEtf()
        val depth = wsFutureDepth.depth
        val etfNetValue = wsSpotEtf.etfNetValue

    }
}