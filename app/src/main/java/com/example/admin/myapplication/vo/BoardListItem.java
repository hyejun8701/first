package com.example.admin.myapplication.vo;

/**
 * Created by Admin on 2017-11-15.
 */

public class BoardListItem {
    int seq;
    String title;
    String contents;
    int resId;

    public BoardListItem(int seq, String title, String contents, int resId) {
        this.seq = seq;
        this.title = title;
        this.contents = contents;
        this.resId = resId;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    @Override
    public String toString() {
        return "BoardListItem{" +
                "seq=" + seq +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", resId=" + resId +
                '}';
    }
}