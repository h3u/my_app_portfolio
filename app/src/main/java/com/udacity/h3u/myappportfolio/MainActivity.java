package com.udacity.h3u.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
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

    /**
     * Click callback for all buttons in main_activity.
     * Creates toast message for each button filled with button text.
     *
     * @param view view that has been clicked
     */
    public void sendToast(View view)
    {
        String text = "";
        switch (view.getId()) {
            case R.id.button1:
                text = String.valueOf(getString(R.string.main_button1_text));
                break;
            case R.id.button2:
                text = String.valueOf(getString(R.string.main_button2_text));
                break;
            case R.id.button3:
                text = String.valueOf(getString(R.string.main_button3_text));
                break;
            case R.id.button4:
                text = String.valueOf(getString(R.string.main_button4_text));
                break;
            case R.id.button5:
                text = String.valueOf(getString(R.string.main_button5_text));
                break;
            case R.id.button6:
                text = String.valueOf(getString(R.string.main_button6_text));
                break;
        }
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);
        toast.show();
    }
}
