package com.isbsoft.lolmate.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.isbsoft.lolmate.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by emre on 10/31/2017.
 */

public class RecyclerRecentMatchesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

    public CircleImageView ivProfile;
    public CardView cardView;
    public TextView txtResult, txtPlatform, txtTimeAgo, txtScore, txtCreep, txtKda;
    public ImageView ivItem1, ivItem2, ivItem3, ivItem4, ivItem5, ivItem6, ivItem7;
    public TextView txtTotalTime, txtGameDate, txtPlacedTotem;

    public RecyclerRecentMatchesViewHolder(View itemView) {
        super(itemView);

        ivProfile = itemView.findViewById(R.id.card_view_ivProfile);
        txtResult = itemView.findViewById(R.id.card_view_txt_result);
        txtPlatform = itemView.findViewById(R.id.card_view_txt_platform);
        txtTimeAgo = itemView.findViewById(R.id.card_view_txt_time_ago);
        txtCreep = itemView.findViewById(R.id.card_view_txt_creep);
        txtScore = itemView.findViewById(R.id.card_view_txt_score);
        txtKda = itemView.findViewById(R.id.card_view_txt_kda);

        ivItem1 = itemView.findViewById(R.id.iv_item1);
        ivItem2 = itemView.findViewById(R.id.iv_item2);
        ivItem3 = itemView.findViewById(R.id.iv_item3);
        ivItem4 = itemView.findViewById(R.id.iv_item4);
        ivItem5 = itemView.findViewById(R.id.iv_item5);
        ivItem6 = itemView.findViewById(R.id.iv_item6);
        ivItem7 = itemView.findViewById(R.id.iv_item7);

        txtTotalTime = itemView.findViewById(R.id.txt_total_time);
        txtGameDate = itemView.findViewById(R.id.txt_game_date);
        txtPlacedTotem = itemView.findViewById(R.id.txt_placed_totem);

        cardView = itemView.findViewById(R.id.card_view);
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public boolean onLongClick(View view) {
        return false;
    }
}
