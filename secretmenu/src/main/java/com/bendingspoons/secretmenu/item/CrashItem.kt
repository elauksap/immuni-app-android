package com.bendingspoons.secretmenu.item

import android.widget.Toast
import com.bendingspoons.base.utils.DeviceUtils
import com.bendingspoons.secretmenu.SecretMenuItem
import com.bendingspoons.secretmenu.ui.ExitActivity

class CrashItem: SecretMenuItem(
    "\uD83C\uDF86 Crash app",
    { context, config ->
        ExitActivity.exitApplication(context)
        val nullValue: String? = null
        val crash = nullValue!!.toLowerCase()
    }
)