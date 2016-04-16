package com.example.android.lowhangingfruit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class page1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
    }

    public void goBack(View view){
        finish();
    }

    public void goToPageTwo(View view){
        Intent intent = new Intent(this, page2.class);
        startActivity(intent);
    }
}
