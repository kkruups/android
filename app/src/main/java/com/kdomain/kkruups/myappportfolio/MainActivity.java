package com.kdomain.kkruups.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import android.content.Context;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;

import static android.widget.Toast.*;
import static com.kdomain.kkruups.myappportfolio.R.id.toggleButton1;


public class MainActivity extends AppCompatActivity {

   

    private View tButton;
    Context context=null;

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

    public void launchApp(View tButton){
           this.tButton = tButton;


        int tBtn = this.tButton.getId();
        context = getApplicationContext();
        Toast toast;
        CharSequence text;
        switch(tBtn){

            case toggleButton1:
                text  = "Application 1";
                toast=Toast.makeText(context, text, LENGTH_LONG);
                toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 500);
                toast.show();
                break;
            case R.id.toggleButton2:
                text= "Application 2";
                toast=Toast.makeText(context, text, LENGTH_LONG);
                toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 500);
                toast.show();
                break;
            case R.id.toggleButton3:
                text= "Application Library";
                toast=Toast.makeText(context, text, LENGTH_LONG);
                toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 500);
                toast.show();
                break;
            case R.id.toggleButton4:
                text= "Application 3";
                toast=Toast.makeText(context, text, LENGTH_LONG);
                toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 500);
                toast.show();
                break;
            case R.id.toggleButton5:
                text= "Application 4";
                toast=Toast.makeText(context, text, LENGTH_LONG);
                toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 500);
                toast.show();
                break;
            default:
                text="something is not right";
                toast=Toast.makeText(context, text, LENGTH_LONG);
                toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 500);
                toast.show();
                break;

        }
    }


}
