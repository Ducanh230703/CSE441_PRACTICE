package net.nemisolv.readnews;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyAdapter extends ArrayAdapter<News> {
    private Activity context;
    private List<News> newsList;
    public MyAdapter(Activity context, List<News> newsList) {
        super(context, R.layout.list_item, newsList);
        this.context = context;
        this.newsList = newsList;
    }

    @NonNull

}
