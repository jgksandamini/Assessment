package com.vu.assessment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAddCar, btnCheckCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddCar = (Button) findViewById(R.id.btnAddCar);
        btnCheckCar = (Button) findViewById(R.id.btnCheckCar);

        btnAddCar.setOnClickListener(this);
        btnCheckCar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.btnAddCar) {
            goToAddCar();
        }
        if(id == R.id.btnCheckCar) {
            goToCheckCar();
        }
    }
    private void goToAddCar() {
        Intent intent = new Intent(this, AddCarActivity.class);
        startActivity(intent);
    }

    private void goToCheckCar() {
        Intent intent = new Intent(this, CheckCarActivity.class);
        startActivity(intent);
    }
}