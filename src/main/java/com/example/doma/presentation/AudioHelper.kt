package com.example.doma.presentation

import android.content.Context
import android.content.Intent
import android.media.AudioDeviceInfo
import android.media.AudioManager
import android.content.pm.PackageManager
import android.provider.Settings

class AudioHelper(private val context: Context) {
    private val audioManager: AudioManager = context.getSystemService(Context.AUDIO_SERVICE) as AudioManager

    fun audioOutputAvailable(type: Int): Boolean {
        if (!context.packageManager.hasSystemFeature(PackageManager.FEATURE_AUDIO_OUTPUT)) {
            return false
        }

        return audioManager.getDevices(AudioManager.GET_DEVICES_OUTPUTS).any { it.type == type }
    }

    fun openBluetoothSettings() {
        val intent = Intent(Settings.ACTION_BLUETOOTH_SETTINGS)
        context.startActivity(intent)
    }
}
