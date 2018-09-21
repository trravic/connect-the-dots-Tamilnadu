package com.example.thiyagu22.connect_the_dots_tamilnadu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by thiyagu22 on 19-09-2018.
 */

public class district_activity extends AppCompatActivity {

    private TextView tv_dist_title , tv_dist_desc;
    private ImageView img_dist_photo;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.district_activity);


        tv_dist_title = (TextView)findViewById(R.id.dist_name);
        tv_dist_desc = (TextView)findViewById(R.id.dist_description);

        img_dist_photo =(ImageView)findViewById(R.id.district_activity_image);

        Intent intent = getIntent();
        String title = intent.getExtras().getString("district_name");
        String desc = intent.getExtras().getString("Description");
        int img = intent.getExtras().getInt("district_photo");

        tv_dist_title . setText(title);
        tv_dist_desc.setText(desc);
        img_dist_photo.setImageResource(img);

    }


}
