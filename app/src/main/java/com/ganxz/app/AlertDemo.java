package com.ganxz.app;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.WindowManager;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class AlertDemo extends AppCompatActivity {

    private static final String TAG = "AlertDemo";

    private static final int SHOW_DIALOG = 1;
    private Handler handler = new Handler(){

        public void handleMessage(Message msg){
            switch (msg.what){
                case SHOW_DIALOG:
                    showDialog();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_demo);

        // 延时调用
        setTimeOutCall();
    }

    private void setTimeOutCall(){
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(5000); // 休眠1秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                showDialog();
                Message msg = new Message();
                msg.what = SHOW_DIALOG;
                handler.sendMessage(msg);
            }
        }).start();
    }

    private void showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("This is Dialog");
        builder.setMessage("This is message");
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.d(TAG, "onClick: ok");
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.d(TAG, "onClick: cancel");
            }
        });
        AlertDialog alertDialog;
        alertDialog = builder.create();
        alertDialog.setCancelable(false);
        alertDialog.setCanceledOnTouchOutside(false);
        alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
        alertDialog.show();
    }
}
