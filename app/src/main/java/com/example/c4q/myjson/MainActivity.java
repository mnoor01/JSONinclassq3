package com.example.c4q.myjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        try {
            JSONObject fellows= new JSONObject(Constants.value);
            JSONArray names= fellows.getJSONArray("myFellows");
            List<String> fellowNames= new ArrayList<>();

            for (int i = 0; i < names.length(); i++) {
                String colloegues=names.get(i).toString();
                fellowNames.add(colloegues);
            }
            for (int i = 0; i < names.length(); i++) {
                Log.d("onCreate",fellowNames.get(i));
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}