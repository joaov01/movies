package com.example.movies.commons

import android.app.Activity
import androidx.appcompat.app.AlertDialog

fun setError(error: String, activity: Activity) {
        var dialogBuilder = AlertDialog.Builder(activity)
        dialogBuilder.setMessage(error)
        dialogBuilder.setPositiveButton("OK"){ _, _ -> activity.finish()}
        val dialog = dialogBuilder.create()
        dialog.show()
    }
