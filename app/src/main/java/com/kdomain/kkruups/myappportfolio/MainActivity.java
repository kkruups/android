package com.kdomain.kkruups.myappportfolio;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Context;
import android.widget.Toast;


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
                text  = "Launches Spotify App";
                toast=Toast.makeText(context, text, LENGTH_LONG);
                toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 500);
                toast.show();
                break;
            case R.id.toggleButton2:
                text= "Launches Super Duo App";
                toast=Toast.makeText(context, text, LENGTH_LONG);
                toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 500);
                toast.show();
                break;
            case R.id.toggleButton3:
                text= "Launches SD Lib App";
                toast=Toast.makeText(context, text, LENGTH_LONG);
                toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 500);
                toast.show();
                break;
            case R.id.toggleButton4:
                text= "Launches Build it Bigger App";
                toast=Toast.makeText(context, text, LENGTH_LONG);
                toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 500);
                toast.show();
                break;
            case R.id.toggleButton5:
                text= "Launches XYZ Reader App";
                toast=Toast.makeText(context, text, LENGTH_LONG);
                toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 500);
                toast.show();
                break;
            case R.id.toggleButton6:
                text= "Launches Capstone: My App";
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
