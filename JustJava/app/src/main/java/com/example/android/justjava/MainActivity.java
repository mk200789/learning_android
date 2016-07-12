package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
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
        int price = quantity * 5;

        CheckBox whippedCreamCheckbox = (CheckBox) findViewById(R.id.whipped_cream_topping);
        Boolean hasWhippedCream = whippedCreamCheckbox.isChecked();
        whippedCreamCheckbox.setChecked(false);
        
        TextView summaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        String summary = createOrderSummary(NumberFormat.getCurrencyInstance().format(price), hasWhippedCream);
        summaryTextView.setText(summary);


    }

    /*
     * This method updates the quantity value.
     */
    private void display(int number){
        TextView valueTextView = (TextView) findViewById(R.id.value_text_view);
        valueTextView.setText(""+ number);
    }

    /*
     * This method decrease the quantity value.
    */
    public void decreaseQuantity(View view){
        quantity = quantity - 1;
        display(quantity);
    }

    /*
     * This method increase the quantity value.
    */
    public void increaseQuantity(View view){
        quantity = quantity + 1;
        display(quantity);
    }

    /*
     * This method updates the price value on screen.
    */
    private String createOrderSummary(String total, Boolean topping){
        String name = "Name: Captain Kim.\n";
        String summary = name + "Total: " + total + "\n";
        summary += "Whipped cream included? " + topping + "\n";
        summary += "Thank you!";
        return summary;
    }

}
