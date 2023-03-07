package com.token.samplemerchantapp

import android.app.Application
import com.token.oderopay.odero.Environment
import com.token.oderopay.odero.OderoLibrary
import com.token.samplemerchantapp.util.Constant

class Application: Application() {

    override fun onCreate() {
        super.onCreate()

        OderoLibrary.initSDK(
            Constant.apiKey,
            Constant.secretKey,
            Environment.SANDBOX_TR
        )
    }

}