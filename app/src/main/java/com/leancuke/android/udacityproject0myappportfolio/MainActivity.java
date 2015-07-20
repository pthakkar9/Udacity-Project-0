package com.leancuke.android.udacityproject0myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    private Button btnSpotify;
    private Button btnScores;
    private Button btnLibrary;
    private Button btnBuild;
    private Button btnXyz;
    private Button btnCapstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    private void initialize(){
        btnSpotify = (Button) findViewById(R.id.activity_main_bt_spotify);
        btnScores = (Button) findViewById(R.id.activity_main_bt_scores);
        btnLibrary = (Button) findViewById(R.id.activity_main_bt_library);
        btnBuild = (Button) findViewById(R.id.activity_main_bt_build);
        btnXyz = (Button) findViewById(R.id.activity_main_bt_xyz);
        btnCapstone = (Button) findViewById(R.id.activity_main_bt_capstone);
    }

    public void respondToButtons(View view){

        switch (view.getId()) {
            case R.id.activity_main_bt_spotify:
                showStubToast("Spotify Streamer");
                break;
            case R.id.activity_main_bt_scores:
                showStubToast("Football Scores App");
                break;
            case R.id.activity_main_bt_library:
                showStubToast("Library");
                break;
            case R.id.activity_main_bt_build:
                showStubToast("Build It Bigger");
                break;
            case R.id.activity_main_bt_xyz:
                showStubToast("XYZ Reader");
                break;
            case R.id.activity_main_bt_capstone:
                showStubToast("Capstone");
                break;
        }

    }

    private void showStubToast(String s){
        Toast.makeText(this, "This button will launch my " + s + " app!", Toast.LENGTH_SHORT).show();
    }

}
