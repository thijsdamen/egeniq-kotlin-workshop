package com.egeniq.kotlinworkshop.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * A to-do item that contains two non nullable and one nullable property
 * <p>
 * Created by ruben on 25/04/2017.
 */
public class ToDoItem {
    @NonNull
    private final String id;
    @NonNull
    private String title;
    @Nullable
    private String description;

    public ToDoItem(@NonNull String id, @NonNull String title, @Nullable String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    @NonNull
    public String getId() {
        return id;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@Nullable String description) {
        this.description = description;
    }
}