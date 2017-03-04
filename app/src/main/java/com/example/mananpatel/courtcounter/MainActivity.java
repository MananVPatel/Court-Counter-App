package com.example.mananpatel.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA;
    public void addThreeForTeamA(View view)
    {
        scoreA +=3;
        displayForTeamA(scoreA);
    }

    public void addTwoForTeamA(View view)
    {
        scoreA +=2;
        displayForTeamA(scoreA);
    }

    public void addOneForTeamA(View view)
    {
        scoreA +=1;
        displayForTeamA(scoreA);

    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    int scoreB;
    public void addThreeForTeamB(View view)
    {
        scoreB +=3;
        displayForTeamB(scoreB);
    }

    public void addTwoForTeamB(View view)
    {
        scoreB +=2;
        displayForTeamB(scoreB);
    }

    public void addOneForTeamB(View view)
    {
        scoreB +=1;
        displayForTeamB(scoreB);

    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View view)
    {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);

    }
}
