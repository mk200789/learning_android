package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


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
        int price = calculatePrice();
        //displayMessage("Total: "+ NumberFormat.getCurrencyInstance().format(price));
        String message = createOrderSummary(price);
        displayMessage(message);
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
    private void displayMessage(String message){
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

    /*
     * This method is to calculate the price of the order.
     *
     * @return total price
     */
    private int calculatePrice(){
        int price = quantity * 5;
        return price;
    }

    /*
     * This method is create an order Summary.
     *
     * @return order summary
     */
    private String createOrderSummary(int price){
        String message = "Name: Kaptain Kim \nQuantity: "+ quantity +"\nTotal: $"+ price +"\nThank you!";
        return message;
    }


}

