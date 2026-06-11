package app.settings.access

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.provider.Settings
import android.util.Log

internal object SystemSettingsNavigator {
    private const val TAG = "SettingsAccess"
    private const val SYSTEM_SETTINGS_PACKAGE = "com.android.settings"

    fun open(context: Context): Boolean {
        val candidates = listOfNotNull(
            Intent(Settings.ACTION_SETTINGS).setPackage(SYSTEM_SETTINGS_PACKAGE),
            context.packageManager.getLaunchIntentForPackage(SYSTEM_SETTINGS_PACKAGE),
            Intent(Settings.ACTION_SETTINGS),
        )

        return candidates.any { candidate -> tryStart(context, candidate) }
    }

    private fun tryStart(context: Context, intent: Intent): Boolean {
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)

        return try {
            context.startActivity(intent)
            true
        } catch (error: ActivityNotFoundException) {
            Log.w(TAG, "No activity can handle the settings intent", error)
            false
        } catch (error: SecurityException) {
            Log.w(TAG, "The device blocked the settings intent", error)
            false
        }
    }
}
