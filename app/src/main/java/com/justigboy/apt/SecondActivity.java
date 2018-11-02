package com.justigboy.apt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.justingboy.apt.annotation.BindView;
import com.justingboy.apt.library.BindViewTools;

/**
 * Created by wanglin on 2018/11/1.
 */
public class SecondActivity extends AppCompatActivity {

    @BindView(R.id.tv_haha)
    TextView tv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        BindViewTools.bind(this);
    }
}
