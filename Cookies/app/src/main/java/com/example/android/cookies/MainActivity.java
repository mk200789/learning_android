package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view){
        ImageView eatingImage = (ImageView) findViewById(R.id.cookie_img_view);
        eatingImage.setImageResource(R.drawable.after_cookie);

        TextView eatingText = (TextView) findViewById(R.id.stment_text_view);
        eatingText.setText("I'm so full");
    }

}
