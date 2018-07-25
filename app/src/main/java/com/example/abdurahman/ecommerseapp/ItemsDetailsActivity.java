package com.example.abdurahman.ecommerseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by abdurahman on 16/07/2018.
 */

public class ItemsDetailsActivity extends AppCompatActivity{
    TextView itemdetails;
    TextView quantitydetails;
    TextView amountdetails;
    TextView datedetails;
    TextView locationdetails;
    TextView contactdetails;
    TextView paymentmodedetails;
    TextView namedetails;

    int itemId;

    @Override

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_details);

         itemdetails = findViewById(R.id.edtitem);
        quantitydetails = findViewById(R.id.edtquantity);
        amountdetails = findViewById(R.id.edtamount);
        datedetails = findViewById(R.id.edtdate);
         locationdetails = findViewById(R.id.edtlocation);
         contactdetails = findViewById(R.id.edtcontact);
         paymentmodedetails = findViewById(R.id.edtpaymentmode);
         namedetails = findViewById(R.id.edtname);

        Intent intent = getIntent();





    }

}
