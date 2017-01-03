package com.deekshithreddy.attendancesystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button staff_login = (Button) findViewById(R.id.stafflogin);
        staff_login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, staff_login.class);
                startActivity(intent);
            }
        });

        Button student_login = (Button) findViewById(R.id.studentlogin);
        student_login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, student_login.class);
                startActivity(intent);
            }
        });

        Button parent_login = (Button) findViewById(R.id.parentlogin);
        parent_login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, parent_login.class);
                startActivity(intent);
            }
        });
    }
}
