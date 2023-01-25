package com.example.ask;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

public class PopupDialog {

    private Activity activity;
    private AlertDialog dialog;

    public PopupDialog(Activity myActivity) {
        activity = myActivity;
    }

    void startPage1Dialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.custom_page1_dialog, null));
        builder.setCancelable(true);

        dialog = builder.create();
        dialog.show();
    }
    void startQ1Dialog1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.custom_question1_dialog1, null));
        builder.setCancelable(false);

        dialog = builder.create();
        dialog.show();
    }

    void startQ1Dialog2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.custom_question1_dialog2, null));
        builder.setCancelable(false);

        dialog = builder.create();
        dialog.show();
    }

    void startQ1Dialog3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.custom_question1_dialog3, null));
        builder.setCancelable(false);

        dialog = builder.create();
        dialog.show();
    }

    void startQ1Dialog4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.custom_question1_dialog4, null));
        builder.setCancelable(false);

        dialog = builder.create();
        dialog.show();
    }

    void dismissDialog(){
        dialog.dismiss();
    }
}
