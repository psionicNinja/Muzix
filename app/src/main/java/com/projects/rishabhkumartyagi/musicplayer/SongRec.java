package com.projects.rishabhkumartyagi.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SongRec extends AppCompatActivity  {

    TextView tempCon;
    ListView lv;
    ArrayList<String> sugList;
    ArrayAdapter<String> adapter;
    DataBaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_rec);
        tempCon = (TextView)findViewById(R.id.textView6);
        lv  = (ListView)findViewById(R.id.listView2);

         db= new DataBaseHelper(this);

         adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_selectable_list_item, sugList);

        lv.setAdapter(adapter);
    }



}
