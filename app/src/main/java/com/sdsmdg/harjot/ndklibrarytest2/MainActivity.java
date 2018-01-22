package com.sdsmdg.harjot.ndklibrarytest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.sdsmdg.harjot.ndklibrary2.TestClass2;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    TestClass2 testClass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        testClass2 = new TestClass2();

        tv.setText(testClass2.stringFromJNI());


    }
}
