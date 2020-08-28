package com.example.ydd.xf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab =findViewById(R.id.fb);

        //为悬浮按钮设置监听事件

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //这里需要指定MainActivity.this
                Toast.makeText(MainActivity.this,"点击了悬浮按钮",Toast.LENGTH_SHORT).show();;
            }

        });
    }
}