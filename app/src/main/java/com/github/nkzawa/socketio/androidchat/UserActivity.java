package com.github.nkzawa.socketio.androidchat;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by apple on 4/10/18.
 */

public class UserActivity extends Activity {

    public static TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        textView = (TextView) findViewById(R.id.name);
        //textView.setText("ramana");
    }
}
