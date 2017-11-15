package com.example.admin.myapplication;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Admin on 2017-11-15.
 */

public class ListItemView extends LinearLayout {
    TextView textView;
    TextView textView2;
    ImageView imageView;

    public ListItemView(Context context) {
        super(context);

        init(context);
    }

    public ListItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.list_item, this, true);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void setTitle(String title) {
        textView.setText(title);
    }

    public void setContents(String contents) {
        textView2.setText(contents);
    }

    public void setImage(int resId) {
        imageView.setImageResource(resId);
    }
}
