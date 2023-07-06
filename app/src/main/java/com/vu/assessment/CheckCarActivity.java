package com.vu.assessment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CheckCarActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCheck, btnBack;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_car);

        btnCheck = (Button) findViewById(R.id.btnCheckCar);
        btnBack = (Button) findViewById(R.id.btnBack);

        btnCheck.setOnClickListener(this);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if(id == R.id.btnCheckCar) {
            checkCar();
        }
        if(id == R.id.btnBack){
            goToMainPage();
        }
    }

    private void checkCar() {
    }

    private void goToMainPage() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
