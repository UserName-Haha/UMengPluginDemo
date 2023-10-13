package com.example.myapplication

import android.app.Application
import com.umeng.commonsdk.UMConfigure

/**
 * @author zhe.chen
 * @date 2023/10/13 11:07
 * Des:
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        UMConfigure.setLogEnabled(true)
        UMConfigure.init(
            this,
            "6455be6d7dddcc5bad434f1e",
            "Test",
            UMConfigure.DEVICE_TYPE_PHONE,
            null
        )
    }
}