package com.bignerdranch.android.link;

/**
 * Created by CY on 2017. 7. 31..
 */

public class MyLink {
    int thumbnail;
    String title;
    String explanation;

    int getThumbnail() {
        return this.thumbnail;
    }
    String getTitle() {
        return this.title;
    }
    String getExplanation() {
        return this.explanation;
    }

    MyLink(int thumbnail, String title, String explanation) {
        this.thumbnail = thumbnail;
        this.title = title;
        this.explanation = explanation;
    }
}
