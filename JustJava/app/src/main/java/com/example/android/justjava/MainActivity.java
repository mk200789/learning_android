package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    int quantity = 2; /* total number of coffees */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view){
        display(quantity);
        displayPrice(quantity * 5);
    }

    /*
     * This method displays the given quantity value on the screen.
     */
    private void display(int number){
        TextView valueTextView = (TextView) findViewById(R.id.value_text_view);
        valueTextView.setText(""+ number);
    }


    /*
     * This method displays the given quantity value on the screen.
     */
    private void displayPrice(int number){
        TextView priceTextView = (TextView) findViewById(R.id.pricevalue_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

   public void decreaseQuantity(View view){
       quantity = quantity - 1;
       display(quantity);
   }

    public void increaseQuantity(View view){
        quantity = quantity + 1;
        display(quantity);
    }
}

