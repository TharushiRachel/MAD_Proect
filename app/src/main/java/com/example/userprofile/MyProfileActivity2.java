package com.example.userprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyProfileActivity2 extends AppCompatActivity {

    private TextView myprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile2);

        myprofile =(TextView)findViewById(R.id.textView2);

        myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MyProfileActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}