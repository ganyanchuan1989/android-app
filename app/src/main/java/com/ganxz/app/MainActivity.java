package com.ganxz.app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.ganxz.app.vo.ActivityDemoVO;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<ActivityDemoVO> demoList = new ArrayList<ActivityDemoVO>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initActivityDemos();
        
    }

    private void initActivityDemos(){
        demoList.add(new ActivityDemoVO("FirstActivity", FirstActivity.class));
    }
}
