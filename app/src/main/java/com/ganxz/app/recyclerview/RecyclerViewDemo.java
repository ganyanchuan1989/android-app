package com.ganxz.app.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.ganxz.app.R;
import com.ganxz.app.listview.AnimalVo;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_demo);

        complexListView();
    }

    private void complexListView() {
        List<AnimalVo> animalList = fillAnimalList();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.simple_recycle_view);
        // 增加分割线
//        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        // 设置方向
//        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList);
        recyclerView.setAdapter(animalAdapter);

    }

    private List<AnimalVo> fillAnimalList() {
        List<AnimalVo> animalList = new ArrayList<AnimalVo>();
        AnimalVo bianfu = new AnimalVo("bianfubianfubianfubianfubianfubianfu", R.drawable.bianfu);
        animalList.add(bianfu);

        AnimalVo daxiang = new AnimalVo("daxiangdaxiangdaxiangdaxiangdaxiangdaxiang", R.drawable.daxiang);
        animalList.add(daxiang);

        AnimalVo gou = new AnimalVo("gougougougougou", R.drawable.gou);
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
