package com.example.doma.presentation  // Altere para o seu pacote real

import android.content.Context
import android.media.AudioDeviceInfo
import android.media.AudioManager
import android.content.pm.PackageManager
import android.content.Intent
import android.provider.Settings


private fun openBluetoothSettings() {
    val intent = Intent(Settings.ACTION_BLUETOOTH_SETTINGS).apply {
        addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        putExtra("EXTRA_CONNECTION_ONLY", true)
        putExtra("EXTRA_CLOSE_ON_CONNECT", true)
    }

}
