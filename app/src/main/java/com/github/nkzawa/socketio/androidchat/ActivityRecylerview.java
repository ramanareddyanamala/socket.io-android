package com.github.nkzawa.socketio.androidchat;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by apple on 4/10/18.
 */

public class ActivityRecylerview extends AppCompatActivity {

   /* RecyclerView recyclerView;
    ActivityTableView activityTableView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

    }
    public void setResultRecyclerViewData(View view){
        recyclerView =(RecyclerView)view.findViewById(R.id.users);
        //activityTableView = new activityTableView();
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(horizontalLayoutManager);
        recyclerView.setAdapter(activityTableView);
        recyclerView.setHasFixedSize(true);
        activityTableView.notifyDataSetChanged();
    }

    @Override
    public void bringBackString(String stringSentBack) {
        Log.e("sent",""+stringSentBack);
    }

    public class ActivityTableView extends RecyclerView.Adapter<ActivityTableView.ViewHolder>  {

        Context ctx;

       // ArrayList<> arrayList=new ArrayList<>();
        String nowTestDateString="";


       public ActivityTableView(Context ctx,ArrayList<> stringArrayList) {
            this.ctx = ctx;
            this.arrayList=stringArrayList;

        }
        public class ViewHolder extends RecyclerView.ViewHolder {
            Context ctx;
            TextView username;

            public ViewHolder(View itemView, Context ctx) {
                super(itemView);
                this.ctx = ctx;

                username=(TextView)itemView.findViewById(R.id.name);

            }
        }
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_text, parent, false);
            ViewHolder contactViewHolder = new ViewHolder(itemView, ctx);

            return contactViewHolder;
        }
        @Override
        public int getItemCount() {
            Log.e("array",""+arrayList.size());

            return arrayList.size();
        }
        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {
            Log.e("onBindViewHolder", "called");


            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }*/
}
