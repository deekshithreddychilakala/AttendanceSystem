package com.deekshithreddy.attendancesystem;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by DEEKSHITH REDDY on 04-01-2017.
 */
public class Dialog {

    private ProgressDialog progressDialog;

    public void showProgressDialog(Context context){

        if(progressDialog == null){
            progressDialog = new ProgressDialog(context);
            progressDialog.setMessage("Please Wait...");
            progressDialog.show();
        }
    }

    public void closeProgressDialog(Context context){

        if(progressDialog != null){
            progressDialog.dismiss();
        }
    }
}