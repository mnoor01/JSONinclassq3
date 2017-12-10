package com.example.c4q.myjson;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by c4q on 12/10/17.
 */

public class FellowViewHolder extends RecyclerView.ViewHolder {
    private TextView namesTextView;
    public FellowViewHolder(View itemView) {
        super(itemView);
        namesTextView=itemView.findViewById(R.id.classmatenames);

    }

    public void onBind(FellowsModel fellowsModel){
        namesTextView.setText(fellowsModel.getName());

    }
}
