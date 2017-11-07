package com.isbsoft.lolmate.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.isbsoft.lolmate.R;
import com.isbsoft.lolmate.core.network.endpoints.match.dto.Match;
import com.isbsoft.lolmate.core.network.endpoints.match.dto.Participant;
import com.isbsoft.lolmate.core.network.endpoints.match.dto.Player;
import com.isbsoft.lolmate.core.network.enums.RequestURL;
import com.isbsoft.lolmate.ui.DashboardActivity;
import com.isbsoft.lolmate.util.RiotApiUtil;
import com.squareup.picasso.Picasso;

import org.json.JSONException;

import java.util.ArrayList;

/**
 * Created by emre on 10/31/2017.
 */

public class RecyclerRecentMatchesAdapter extends RecyclerView.Adapter<RecyclerRecentMatchesViewHolder> {
    private ArrayList<Match> matchList;
    private DashboardActivity dashboardActivity;
    private int accountId;

    public RecyclerRecentMatchesAdapter(ArrayList<Match> matchList, DashboardActivity dashboardActivity, int accountId) {
        this.matchList = matchList;
        this.dashboardActivity = dashboardActivity;
        this.accountId = accountId;
    }

    @Override
    public RecyclerRecentMatchesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recent_games_row, parent, false);

        return new RecyclerRecentMatchesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerRecentMatchesViewHolder holder, int position) {
        Match match = matchList.get(position);
        int winTeamId, failTeamId, participantId = 0;
        boolean isPlayerWin = false;
        int champId = 0;
        Long mathCreation, matchDuration;
        Integer[] items = new Integer[7];
        for (int i = 0; i < match.getTeams().size(); i++) {
            String win = match.getTeams().get(i).getWin();
            int teamId = match.getTeams().get(i).getTeamId();
            if (!win.isEmpty() && win.equalsIgnoreCase("Win")) {
                winTeamId = teamId;
            } else {
                failTeamId = teamId;
            }
        }

        for (int i = 0; i < match.getParticipantIdentities().size(); i++) {
            Player player = match.getParticipantIdentities().get(i).getPlayer();
            int pid = match.getParticipantIdentities().get(i).getParticipantId();
            if (player.getAccountId() == accountId) {
                participantId = pid;
            }
        }

        for (int i = 0; i < match.getParticipants().size(); i++) {
            Participant participant = match.getParticipants().get(i);
            if (participant.getParticipantId() == participantId) {
                champId = participant.getChampionId();
                isPlayerWin = participant.getStats().getWin();
                holder.txtKda.setText(new StringBuilder().append(participant.getStats().getKills()).append("/").append(participant.getStats().getDeaths()).append("/").append(participant.getStats().getAssists()).toString());
                holder.txtCreep.setText(String.valueOf(participant.getStats().getTotalMinionsKilled()));
                holder.txtScore.setText(new StringBuilder().append((int) (participant.getStats().getGoldEarned() / 1000.0)).append("K").toString());
                holder.txtPlacedTotem.setText(new StringBuilder().append(participant.getStats().getWardsPlaced()).append(" wards placed").toString());
                items[0] = participant.getStats().getItem0();
                if (items[0] != 0) {
                    Picasso.with(dashboardActivity).load(RequestURL.ItemsURL.toString() + items[0] + ".png ").error(R.drawable.empty).into(holder.ivItem1);
                } else {
                    Picasso.with(dashboardActivity).load(R.drawable.empty).into(holder.ivItem1);
                }

                items[1] = participant.getStats().getItem1();
                if (items[1] != 0) {
                    Picasso.with(dashboardActivity).load(RequestURL.ItemsURL.toString() + items[1] + ".png ").error(R.drawable.empty).into(holder.ivItem2);
                } else {
                    Picasso.with(dashboardActivity).load(R.drawable.empty).into(holder.ivItem2);
                }

                items[2] = participant.getStats().getItem2();
                if (items[2] != 0) {
                    Picasso.with(dashboardActivity).load(RequestURL.ItemsURL.toString() + items[2] + ".png ").error(R.drawable.empty).into(holder.ivItem3);
                } else {
                    Picasso.with(dashboardActivity).load(R.drawable.empty).into(holder.ivItem3);
                }

                items[3] = participant.getStats().getItem3();
                if (items[3] != 0) {
                    Picasso.with(dashboardActivity).load(RequestURL.ItemsURL.toString() + items[3] + ".png ").error(R.drawable.empty).into(holder.ivItem4);
                } else {
                    Picasso.with(dashboardActivity).load(R.drawable.empty).into(holder.ivItem4);
                }

                items[4] = participant.getStats().getItem4();
                if (items[4] != 0) {
                    Picasso.with(dashboardActivity).load(RequestURL.ItemsURL.toString() + items[4] + ".png ").error(R.drawable.empty).into(holder.ivItem5);
                } else {
                    Picasso.with(dashboardActivity).load(R.drawable.empty).into(holder.ivItem5);
                }

                items[5] = participant.getStats().getItem5();
                if (items[5] != 0) {
                    Picasso.with(dashboardActivity).load(RequestURL.ItemsURL.toString() + items[5] + ".png ").error(R.drawable.empty).into(holder.ivItem6);
                } else {
                    Picasso.with(dashboardActivity).load(R.drawable.empty).into(holder.ivItem6);
                }

                items[6] = participant.getStats().getItem6();
                if (items[6] != 0) {
                    Picasso.with(dashboardActivity).load(RequestURL.ItemsURL.toString() + items[6] + ".png ").error(R.drawable.empty).into(holder.ivItem7);
                } else {
                    Picasso.with(dashboardActivity).load(R.drawable.empty).into(holder.ivItem7);
                }
            }
        }
        if (isPlayerWin) {
            holder.txtResult.setText("Win");
        } else {
            holder.txtResult.setText("Lost");
        }
        holder.txtPlatform.setText(match.getPlatformId());

        mathCreation = match.getGameCreation();
        matchDuration = match.getGameDuration();
        holder.txtTotalTime.setText(RiotApiUtil.convertDuration(matchDuration));
        holder.txtGameDate.setText(RiotApiUtil.convertDate(mathCreation));
        holder.txtTimeAgo.setText(RiotApiUtil.convertTimeAgo(mathCreation));

        try {
            String champName = RiotApiUtil.getChampionName(champId, dashboardActivity);
            Picasso.with(dashboardActivity).load(RequestURL.ChampionURL.toString() + champName).into(holder.ivProfile);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        //holder.txtResult.setText(match.getParticipants().);

    }

    @Override
    public int getItemCount() {
        return matchList.size();
    }
}
