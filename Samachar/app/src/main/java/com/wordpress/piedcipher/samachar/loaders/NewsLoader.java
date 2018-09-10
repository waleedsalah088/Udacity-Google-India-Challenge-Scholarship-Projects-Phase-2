package com.wordpress.piedcipher.samachar.loaders;

import android.content.AsyncTaskLoader;
import android.content.Context;

import com.wordpress.piedcipher.samachar.models.News;
import com.wordpress.piedcipher.samachar.utils.Utils;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    public NewsLoader(Context context) {
        super(context);
    }

    @Override
    public List<News> loadInBackground() {
        return Utils.fetchNewsFromApi();
    }
}