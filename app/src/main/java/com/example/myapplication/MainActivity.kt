package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //【注意】DepthBean、EtfNetValueBean这两个内部类是在导致编译失败的元凶！！！
        val wsFutureDepth = WsFutureDepth()
        val wsSpotEtf = WsSpotEtf()
        wsFutureDepth.depth = WsFutureDepth.DepthBean()
        wsSpotEtf.etfNetValue = WsSpotEtf.EtfNetValueBean()
        val depth = wsFutureDepth.depth
        val etfNetValue = wsSpotEtf.etfNetValue
    }


}