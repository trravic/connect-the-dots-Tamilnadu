package com.example.thiyagu22.connect_the_dots_tamilnadu;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by thiyagu22 on 19-09-2018.
 */

public class recycler_adapter extends RecyclerView.Adapter<recycler_adapter.MyViewHolder>{

    private Context mcontext;
    private List<districts> mData;

    public recycler_adapter(Context mycontext , List<districts> mData){
        mcontext = mycontext;
       this.mData = mData;
    }


    @Override
    public recycler_adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mview;

        LayoutInflater mInflater = LayoutInflater.from(mcontext);
        mview = mInflater.inflate(R.layout.cardview_district,parent,false);

        return new recycler_adapter.MyViewHolder(mview);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.tv_district_title.setText(mData.get(position).getDistrict_name());
        holder.img_dist.setImageResource(mData.get(position).getDist_photo());
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcontext,district_activity.class);

                intent.putExtra("district_name",mData.get(position).getDistrict_name());
                intent.putExtra("Description",mData.get(position).getDescription());
                intent.putExtra("district_photo",mData.get(position).getDist_photo());
                mcontext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_district_title;
        ImageView img_dist;
        TextView tv_desc;
        CardView mCardView;
        public MyViewHolder(View itemView) {
            super(itemView);

            tv_district_title = (TextView)itemView.findViewById(R.id.district_text);
            tv_desc = (TextView)itemView.findViewById(R.id.dist_description);
            img_dist = (ImageView)itemView.findViewById(R.id.district_image);
            mCardView = (CardView)itemView.findViewById(R.id.cardview);

        }


    }
}
