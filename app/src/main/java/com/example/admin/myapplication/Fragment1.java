package com.example.admin.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.example.admin.myapplication.vo.BoardListItem;

import java.util.ArrayList;

/**
 * Created by Admin on 2017-11-14.
 */

public class Fragment1 extends Fragment {
    GridView gridView;
    GridAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment1, container, false);

        gridView = (GridView) rootView.findViewById(R.id.gridView);

        adapter = new GridAdapter();

        for (int i = 0; i < 10; i++) {
            adapter.addItem(new BoardListItem((i + 1), "제목" + i,"내용", R.mipmap.ic_launcher_round));
        }

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                BoardListItem item = (BoardListItem) adapter.getItem(i);
                Toast.makeText(getContext(), item.getTitle(), Toast.LENGTH_LONG).show();
            }
        });

        return rootView;
    }

    class GridAdapter extends BaseAdapter {
        ArrayList<BoardListItem> items = new ArrayList<BoardListItem>();

        public void addItem(BoardListItem item) {
            items.add(item);
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int i) {
            return items.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ListItemView listItemView = null;
            if(view == null) {
                listItemView = new ListItemView(getContext());
            } else {
                listItemView = (ListItemView) view;
            }

            BoardListItem item = items.get(i);

            listItemView.setTitle(item.getTitle());
            listItemView.setContents(item.getContents());
            listItemView.setImage(item.getResId());

            return listItemView;
        }
    }
}
