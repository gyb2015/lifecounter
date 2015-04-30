package edu.washington.gyb2015.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    private static int playerACount;
    private static int playerBCount;
    private static int playerCCount;
    private static int playerDCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playerACount = 20;
        playerBCount = 20;
        playerCCount = 20;
        playerDCount = 20;
    }

    public void button(View v) {
        switch (v.getId()) {
            case R.id.playOnePlusOne:
                playerACount++;
                changeScore(findViewById(R.id.oneString), "Player A", playerACount);
                break;
            case R.id.playOneMinusOne:
                playerACount--;
                changeScore(findViewById(R.id.oneString), "Player A", playerACount);
                break;
            case R.id.playOnePlusFive:
                playerACount+= 5;
                changeScore(findViewById(R.id.oneString), "Player A", playerACount);
                break;
            case R.id.playOneMinusFive:
                playerACount-= 5;
                changeScore(findViewById(R.id.oneString), "Player A", playerACount);
                break;
            case R.id.playTwoPlusOne:
                playerBCount++;
                changeScore(findViewById(R.id.twoString), "Player B", playerBCount);
                break;
            case R.id.playTwoMinusOne:
                playerBCount--;
                changeScore(findViewById(R.id.twoString), "Player B", playerBCount);
                break;
            case R.id.playTwoPlusFive:
                playerBCount+= 5;
                changeScore(findViewById(R.id.twoString), "Player B", playerBCount);
                break;
            case R.id.playTwoMinusFive:
                playerBCount-= 5;
                changeScore(findViewById(R.id.twoString), "Player B", playerBCount);
                break;
            case R.id.playThreePlusOne:
                playerCCount++;
                changeScore(findViewById(R.id.threeString), "Player C", playerCCount);
                break;
            case R.id.playThreeMinusOne:
                playerCCount--;
                changeScore(findViewById(R.id.threeString), "Player C", playerCCount);
                break;
            case R.id.playThreePlusFive:
                playerCCount+= 5;
                changeScore(findViewById(R.id.threeString), "Player C", playerCCount);
                break;
            case R.id.playThreeMinusFive:
                playerCCount-= 5;
                changeScore(findViewById(R.id.threeString), "Player C", playerCCount);
                break;
            case R.id.playFourPlusOne:
                playerDCount++;
                changeScore(findViewById(R.id.fourString), "Player D", playerDCount);
                break;
            case R.id.playFourMinusOne:
                playerDCount--;
                changeScore(findViewById(R.id.fourString), "Player D", playerDCount);
                break;
            case R.id.playFourPlusFive:
                playerDCount+= 5;
                changeScore(findViewById(R.id.fourString), "Player D", playerDCount);
                break;
            case R.id.playFourMinusFive:
                playerDCount-= 5;
                changeScore(findViewById(R.id.fourString), "Player D", playerDCount);
                break;
        }
    }

    public void changeScore(View view, String player, int score) {
        TextView text = (TextView) view;
        text.setText(player + ": " + score + " Lives");
        if (score <= 0) {
            ((TextView) findViewById(R.id.loser)).setText(player + " Loses!");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
