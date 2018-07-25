package com.example.abdurahman.ecommerseapp;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MakeBusiness extends AppCompatActivity {

EditText etname;
    EditText etitem;
    EditText etquantity;
    EditText etamount;
    EditText etdate;
    EditText etlocation;
    EditText etcontact;
    EditText etcomment;
    EditText etpaymentmode;

    String name;
    String amount;
    String item;
    String date;
    String location;
    String contact;
    String comment;
    String quantity;
    String paymentmode;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_business);


        etname = findViewById(R.id.edtname);
        etitem = findViewById(R.id.etitem);
        etquantity = findViewById(R.id.etquantity);
        etamount = findViewById(R.id.etamount);
        etdate = findViewById(R.id.etdate);
        etlocation = findViewById(R.id.etlocation);
        etcomment = findViewById(R.id.etcomment);
        etcontact = findViewById(R.id.etcontact);



    }
    public void makeorder(View makeorderButton){
        item = etitem.getText().toString();
        name = etname.getText().toString();
        amount = etamount.getText().toString();
        quantity = etquantity.getText().toString();
        date = etdate.getText().toString();
        contact = etcontact.getText().toString();
        location = etlocation.getText().toString();
        comment = etcomment.getText().toString();
    }


    public void getGender(View radioButton) {
        int radioButtonId = radioButton.getId();
        if (radioButtonId == R.id.rbcreaditcard) {
            paymentmode = "creadit card";

        } else if (radioButtonId == R.id.rbmobilemoney) {

            paymentmode = "mobile money";

        }



    }

    private AppDataBase getDb() {
        String dataName = "room_db";
        AppDataBase db = Room.databaseBuilder(getApplicationContext(), AppDataBase.class, dataName).allowMainThreadQueries().build();
        return db;
    }
}
