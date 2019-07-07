package com.ganxz.app.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.ganxz.app.R;
import com.ganxz.app.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;


public class ListViewDemo extends AppCompatActivity {

    private static final String TAG = "ListViewDemo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_demo);
        // 简单ListView
        simpleListView();

        // 复杂ListView
        complexListView();

    }

    private void simpleListView() {
        final List<String> data2 = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            data2.add("item" + i);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListViewDemo.this, R.layout.support_simple_spinner_dropdown_item, data2);
        ListView listView = (ListView) findViewById(R.id.simple_list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(TAG, "onItemClick: "+i+","+l);
                // Toast.makeText(ListViewDemo.this, "你点了："+ data2.get(i), Toast.LENGTH_SHORT).show();
                ToastUtils.show(ListViewDemo.this, "你点了："+ data2.get(i));
            }
        });
    }

    private void complexListView() {
        List<AnimalVo> animalList = fillAnimalList();
        AnimalAdapter adapter = new AnimalAdapter(ListViewDemo.this, R.layout.complex_list_view_item, animalList);
        ListView listView = (ListView) findViewById(R.id.complex_list_view);
        listView.setAdapter(adapter);
    }

    private List<AnimalVo> fillAnimalList() {
        List<AnimalVo> animalList = new ArrayList<AnimalVo>();
        AnimalVo bianfu = new AnimalVo("bianfu", R.drawable.bianfu);
        animalList.add(bianfu);

        AnimalVo daxiang = new AnimalVo("daxiang", R.drawable.daxiang);
        animalList.add(daxiang);

        AnimalVo gou = new AnimalVo("gou", R.drawable.gou);
        animalList.add(gou);

        AnimalVo xiezi = new AnimalVo("xiezi", R.drawable.xiezi);
        animalList.add(xiezi);

        AnimalVo yu = new AnimalVo("yu", R.drawable.yu);
        animalList.add(yu);
        for (int i = 0; i < 10; i++) {
            AnimalVo yu2 = new AnimalVo("yu", R.drawable.yu);
            animalList.add(yu2);
        }

        return animalList;
    }

}
