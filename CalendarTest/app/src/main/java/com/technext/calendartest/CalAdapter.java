package com.technext.calendartest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CalAdapter extends RecyclerView.Adapter<CalAdapter.MyViewHolder> {

    Context context;
    private LayoutInflater inflater;

    public CalAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.calview, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 1000;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView bg;
        public MyViewHolder(View itemView) {
            super(itemView);
            bg = (TextView) itemView.findViewById(R.id.icon);
        }
    }
}
