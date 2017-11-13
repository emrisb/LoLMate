package com.isbsoft.lolmate.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import com.isbsoft.lolmate.core.network.endpoints.champion.dto.Champion;
import com.isbsoft.lolmate.core.network.enums.RequestURL;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by emre on 11/10/2017.
 */

public class ChampionsGridAdapter extends BaseAdapter {

    private Context context;
    private List<Champion> championList;

    public ChampionsGridAdapter(Context context, List<Champion> championList) {
        this.context = context;
        this.championList = championList;
    }

    @Override
    public int getCount() {
        return championList.size();
    }

    @Override
    public Object getItem(int i) {
        return championList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        CircleImageView circleImageView;
        Champion champion = championList.get(i);

        if (view == null) {
            circleImageView = new CircleImageView(context);
            circleImageView.setLayoutParams(new GridView.LayoutParams(180, 180));
            circleImageView.setScaleType(CircleImageView.ScaleType.CENTER_CROP);
            circleImageView.setPadding(8, 16, 8, 8);
            circleImageView.setBorderColor(Color.parseColor("#FFD54F"));
            circleImageView.setBorderWidth(2);

        } else {
            circleImageView = (CircleImageView) view;
        }

        Picasso.with(context).load(RequestURL.ChampionURL.toString() + champion.getImageName()).into(circleImageView);
        return circleImageView;
    }
}
