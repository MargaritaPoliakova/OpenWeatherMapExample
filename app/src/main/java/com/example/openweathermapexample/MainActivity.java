package com.example.openweathermapexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button weatherButton;
    EditText cityText;
    TextView tempText, windText, discrText;

    private final String ADRESS = "http://api.openweathermap.org/data/2.5/weather";
    private final String API_KEY = "6abdad5f081381149f25fe155d4db165";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherButton = findViewById(R.id.weather);
        cityText = findViewById(R.id.city);
        tempText = findViewById(R.id.temper);
        windText = findViewById(R.id.wind);
        discrText = findViewById(R.id.discrb);
    }
}
