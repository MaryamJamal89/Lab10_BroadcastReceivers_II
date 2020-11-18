package com.example.lab10_broadcastreceivers_ii;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String result = intent.getStringExtra("msg");
        Toast.makeText(context, "Msg: "+ result, Toast.LENGTH_SHORT).show();

    }
}
