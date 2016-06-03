package com.nercms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
    }

    public void doStart(View v) {
        String ip = editText.getText().toString();
        Intent intent = new Intent(this, VideoChatActivity.class);
        intent.putExtra("remote_ip", ip);
        intent.putExtra("remote_port", 19888);
        startActivity(intent);

    }


}
