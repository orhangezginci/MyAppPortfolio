package com.gezginci.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void showToast(String appName) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        String text = "This button will launch " + appName + "!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onSpotifyStreamer(View view) {
        showToast(getResources().getString(R.string.spotify_streamer));
    }

    public void onScoresApp(View view) {
        showToast(getResources().getString(R.string.scores_app));
    }

    public void onLibraryApp(View view) {
        showToast(getResources().getString(R.string.library_app));
    }

    public void onBuildItBigger(View view) {
        showToast(getResources().getString(R.string.build_it_bigger));
    }

    public void onXYZReader(View view) {
        showToast(getResources().getString(R.string.xyz_reader));
    }

    public void onCapstone(View view) {
        showToast(getResources().getString(R.string.my_capstone_project));
    }
}
