package com.projects.rishabhkumartyagi.musicplayer;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class SongListAdapter extends RecyclerView.Adapter<SongListAdapter.SongViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<String> localSongList;
    public SongListAdapter(ArrayList<String> songList) {
        localSongList = songList;
    }


    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.song_row_item, parent, false);
        SongViewHolder holder = new SongViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(SongListAdapter.SongViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return localSongList.size();
    }


    public static class SongViewHolder extends RecyclerView.ViewHolder {
        TextView serial_number;

        public SongViewHolder(View itemView) {
            super(itemView);
            serial_number = (TextView)itemView.findViewById(R.id.songTitle);
        }
    }
}

