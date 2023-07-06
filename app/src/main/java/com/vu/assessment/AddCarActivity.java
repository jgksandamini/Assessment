package com.vu.assessment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddCarActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAddCar, btnBack;
    EditText etBrand, etModel, etPrice;

    DBHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);

        btnAddCar = (Button) findViewById(R.id.btnAddCar);
        btnBack = (Button) findViewById(R.id.btnBack);

        etBrand = findViewById(R.id.etBrand);
        etModel = findViewById(R.id.etModel);
        etPrice = findViewById(R.id.etPrice);

        btnAddCar.setOnClickListener(this);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if(id == R.id.btnAddCar) {
            addCar();
        }
        if(id == R.id.btnBack) {
            goToMainPage();
        }
    }
    private void addCar() {
        String brand = etBrand.getText().toString();
        String model = etModel.getText().toString();
        String price = etPrice.getText().toString();

        boolean isInserted = databaseHelper
    }

    private void goToMainPage() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
