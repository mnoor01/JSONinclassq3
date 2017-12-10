package com.example.c4q.myjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView fellowsRecyclerView= findViewById(R.id.fellowRecyclerView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());//context of where the app is currently


        try {
            JSONObject fellows= new JSONObject(Constants.value);
            JSONArray names= fellows.getJSONArray("myFellows");
            List<String> fellowNames= new ArrayList<>();
            List<FellowsModel> fellowsModelsList = new ArrayList<>();

            for (int i = 0; i < names.length(); i++) {
                String colloegues=names.get(i).toString();
                fellowNames.add(colloegues);
            }

            for (String name : fellowNames) {
                FellowsModel fellowsModel= new FellowsModel();
                fellowsModel.setName(name);
                fellowsModelsList.add(fellowsModel);

            }
            FellowsAdapter adapter= new FellowsAdapter(fellowsModelsList);
            fellowsRecyclerView.setLayoutManager(linearLayoutManager);
            fellowsRecyclerView.setAdapter(adapter);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}