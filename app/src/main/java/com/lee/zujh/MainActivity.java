package com.lee.zujh;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lee.componentlib.ServiceFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.gohome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ServiceFactory.getInstance().getHomeService().launch(MainActivity.this, "");
            }
        });

        findViewById(R.id.gomine).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ServiceFactory.getInstance().getMineInter().launch(MainActivity.this, 1);
            }
        });

        findViewById(R.id.getfragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                ServiceFactory.getInstance().getHomeService().getHomeFragmentInfo(getSupportFragmentManager(),
                        R.id.container, bundle);
            }
        });
    }
}
