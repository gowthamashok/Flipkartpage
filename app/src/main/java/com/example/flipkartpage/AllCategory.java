package com.example.flipkartpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class AllCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_category);

        mobile_in_all_cat1();

        off_in_all_cat01();

        fas_in_all_cat01();

        eleo_in_all_cat01();
    }

    public void mobile_in_all_cat1()
    {
        LinearLayout mobile_in_all_cat2 = (LinearLayout)findViewById(R.id.mobile_in_all_cat);
        mobile_in_all_cat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AllCategory.this,Mobiles.class);
                startActivity(intent);
            }
        });
    }

    public void off_in_all_cat01()
    {
        LinearLayout off_in_all_cat02 = (LinearLayout)findViewById(R.id.off_in_all_cat);
        off_in_all_cat02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent= new Intent(AllCategory.this,OfferZone.class);
                 startActivity(intent);

                }

        });
    }


    public void fas_in_all_cat01()
    {
        LinearLayout fas_in_all_cat02 = (LinearLayout)findViewById(R.id.fas_in_all_cat);
        fas_in_all_cat02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AllCategory.this,Fashion.class);
                startActivity(intent);

            }

        });
    }

    public void eleo_in_all_cat01()
    {
        LinearLayout eleo_in_all_cat02 = (LinearLayout) findViewById(R.id.eleo_in_all_cat);
        eleo_in_all_cat02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AllCategory.this,Electronics.class);
                startActivity(intent);
            }
        });
    }


}
