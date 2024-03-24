package edu.wuwang.opengl;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.annotation.Nullable;  
//import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by wuwang on 2016/10/30
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("OpenGL Demo");
    }

}
