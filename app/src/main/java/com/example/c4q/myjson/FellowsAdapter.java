package com.example.c4q.myjson;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c4q on 12/10/17.
 */

public class FellowsAdapter extends RecyclerView.Adapter<FellowViewHolder> {
    private List<FellowsModel> list;

    public FellowsAdapter(List<FellowsModel> list) {
        this.list = list;
    }

    @Override
    public FellowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View fellowView= LayoutInflater.from(parent.getContext()).inflate(R.layout.fellows_itemview,parent,false);
        return new FellowViewHolder(fellowView);
    }

    @Override
    public void onBindViewHolder(FellowViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
