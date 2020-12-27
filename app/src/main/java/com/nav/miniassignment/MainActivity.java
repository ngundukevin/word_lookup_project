package com.nav.miniassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button page1Btn,page2Btn,page3Btn;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        page1Btn=findViewById(R.id.page1Btn);
        page2Btn= findViewById(R.id.page2Btn);
        page3Btn=findViewById(R.id.page3Btn);

        page1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPage1Activity();
            }
        });

        page2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPage2Activity();
            }
        });

        page3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPage3Activity();
            }
        });
    }
    public void openPage1Activity(){
        Intent page1Intent= new Intent(this,Page1.class);
        startActivity(page1Intent);
    }
    public void openPage2Activity(){
        Intent page2Intent= new Intent(this,Page2.class);
    }
    public void openPage3Activity(){
        Intent page3Intent = new Intent(this,Page3.class);
    }
}
