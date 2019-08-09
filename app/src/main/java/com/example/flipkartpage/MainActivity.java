package com.example.flipkartpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout all_category01;
    LinearLayout mobiles01;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setAll_category();

        mobile_in_hori_view();

        view_mobile();

        offer_zone();

        view_off_zone01();

        view_fas01();

        fas_in_hori_view01();

        ele_in_hori_view01();

        view_eleo01();


    }

    public void view_mobile()
    {
        Button mobil_view1 = (Button)findViewById(R.id.mobil_view);
        mobil_view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Mobiles.class);
                startActivity(intent);
            }
        });

    }

    public void mobile_in_hori_view()
    {
        mobiles01 = (LinearLayout)findViewById(R.id.mobiles);
        mobiles01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Mobiles.class);
                startActivity(intent);
            }
        });

    }

    public void setAll_category()
    {
        all_category01 = (LinearLayout)findViewById(R.id.all_category);
        all_category01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AllCategory.class);
                startActivity(intent);

            }
        });

    }

    public void offer_zone()
    {
        LinearLayout off_in_hori01 = (LinearLayout)findViewById(R.id.off_in_hori_view);
        off_in_hori01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,OfferZone.class);
                startActivity(intent);
            }
        });
    }

    public void view_off_zone01()
    {
        Button view_off_zone02 = (Button) findViewById(R.id.view_off_zone);
        view_off_zone02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,OfferZone.class);
                startActivity(intent);
            }
        });
    }

    public void view_fas01()
    {
        Button view_fas02 = (Button) findViewById(R.id.view_fas);
        view_fas02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Fashion.class);
                startActivity(intent);
            }
        });
    }

    public void fas_in_hori_view01()
    {
        LinearLayout fas_in_hori_view02 = (LinearLayout) findViewById(R.id.fas_in_hori_view);
        fas_in_hori_view02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Fashion.class);
                startActivity(intent);
            }
        });
    }

    public void ele_in_hori_view01()
    {
        LinearLayout ele_in_hori_view02 = (LinearLayout) findViewById(R.id.ele_in_hori_view);
        ele_in_hori_view02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Electronics.class);
                startActivity(intent);
            }
        });
    }

    public void view_eleo01()
    {
        Button view_eleo02 = (Button) findViewById(R.id.view_eleo);
        view_eleo02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Electronics.class);
                startActivity(intent);
            }
        });
    }







}
