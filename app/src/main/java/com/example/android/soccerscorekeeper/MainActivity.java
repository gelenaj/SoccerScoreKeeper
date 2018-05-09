package com.example.android.soccerscorekeeper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goalScoreHomeTeam = 0;
    int goalScoreVisitorTeam = 0;
    int foulScoreHomeTeam = 0;
    int foulScoreVisitorTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
    }
     //Displays Goals for Home Team.
    public void displayForHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goalScore);
        scoreView.setText(String.valueOf(score));
    }
    //Displays Foals for Home Team.
    public void displayFoulsForHomeTeam(int hFoals){
        TextView hFoalScore = (TextView) findViewById(R.id.foalsScore);
        hFoalScore.setText(String.valueOf(hFoals));
    }
    //Displays Foals for Visitor Team.
    public void displayFoulsForVisitorTeam(int vFoals){
        TextView vFscore = (TextView) findViewById(R.id.vFoalsScore);
        vFscore.setText(String.valueOf(vFoals));
    }
    //Displays the given score for Visitor Team.
    public void displayForVisitorTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.vGoalScore);
        scoreView.setText(String.valueOf(score));
    }
    //Increases point total by 1 for Home Team.
    public void addOneGoalForHomeTeam(View v){
        goalScoreHomeTeam += 1;
        displayForHomeTeam(goalScoreHomeTeam);
    }
    //Increases foul point total by 1 for Home Team.
    public void addFoulForHomeTeam(View v){
        foulScoreHomeTeam = foulScoreHomeTeam + 1;
        displayFoulsForHomeTeam(foulScoreHomeTeam);
    }
    //Increases Goal point total by 1 for visitor team.
    public void addOneForVisitorTeam(View v){
        goalScoreVisitorTeam += 1;
        displayForVisitorTeam(goalScoreVisitorTeam);
    }
    //Increases foul point for visitor team.
    public void addFoulVisitorTeam(View v){
        foulScoreVisitorTeam = foulScoreVisitorTeam + 1;
        displayFoulsForVisitorTeam(foulScoreVisitorTeam);
    }
    //Reset scores.
    public void reset(View v){
        goalScoreHomeTeam = 0;
        goalScoreVisitorTeam = 0;
        foulScoreHomeTeam = 0;
        foulScoreVisitorTeam = 0;

        displayForHomeTeam(goalScoreHomeTeam);
        displayFoulsForHomeTeam(foulScoreHomeTeam);
        displayForVisitorTeam(goalScoreVisitorTeam);
        displayFoulsForVisitorTeam(foulScoreVisitorTeam);
    }
}