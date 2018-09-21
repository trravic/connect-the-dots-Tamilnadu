package com.example.thiyagu22.connect_the_dots_tamilnadu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<districts> district_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        district_info = new ArrayList<>();

        district_info.add(new districts("TRICHY",R.drawable.trichy,"DESCRIPTION"));

        district_info.add(new districts("COIMBATORE",R.drawable.coimbatore,"DESCRIPTION"));


        district_info.add(new districts("MADURAI",R.drawable.madurai,"DESCRIPTION"));


        district_info.add(new districts("CHENNAI",R.drawable.chenna,"DESCRIPTION"));


        RecyclerView objrv = (RecyclerView)findViewById(R.id.recycler_view);

        recycler_adapter adapterobj = new recycler_adapter(this,district_info);
        objrv.setLayoutManager(new GridLayoutManager(this,2));
        objrv.setAdapter(adapterobj);
    }
}
