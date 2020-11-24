@file:Suppress("DEPRECATION")

package co.appdev.boilerplate.mvpkotlin.util

import android.app.Dialog
import android.app.ProgressDialog
import android.content.Context
import androidx.annotation.StringRes
import androidx.appcompat.app.AlertDialog
import co.appdev.boilerplate.mvpkotlin.R


object DialogUtils {
    private fun createSimpleOkErrorDialog(
        context: Context?,
        title: String?,
        message: String?
    ): Dialog {
        val alertDialog: AlertDialog.Builder =
            AlertDialog.Builder(context!!)
                .setTitle(title)
                .setMessage(message)
                .setNeutralButton(R.string.dialog_action_ok, null)
        return alertDialog.create()
    }

    fun createSimpleOkErrorDialog(
        context: Context,
        @StringRes titleResource: Int,
        @StringRes messageResource: Int
    ): Dialog {
        return createSimpleOkErrorDialog(
            context,
            context.getString(titleResource),
            context.getString(messageResource)
        )
    }

    fun createGenericErrorDialog(
        context: Context,
        message: String?
    ): Dialog {
        val alertDialog: AlertDialog.Builder =
            AlertDialog.Builder(context)
                .setTitle(context.getString(R.string.dialog_error_title))
                .setMessage(message)
                .setNeutralButton(R.string.dialog_action_ok, null)
        return alertDialog.create()
    }

    fun createGenericErrorDialog(
        context: Context,
        @StringRes messageResource: Int
    ): Dialog {
        return createGenericErrorDialog(context, context.getString(messageResource))
    }

    private fun createProgressDialog(
        context: Context?,
        message: String?
    ): ProgressDialog {
        val progressDialog = ProgressDialog(context)
        progressDialog.setMessage(message)
        return progressDialog
    }

    fun createProgressDialog(
        context: Context,
        @StringRes messageResource: Int
    ): ProgressDialog {
        return createProgressDialog(context, context.getString(messageResource))
    }
}