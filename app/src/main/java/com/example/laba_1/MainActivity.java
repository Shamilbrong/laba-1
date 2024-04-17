package com.example.laba_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Нет необходимости в явном указании обработчиков событий для кнопок,
        // так как методы onButton1Click, onButton2Click, onButton3Click указаны в XML
    }

    public void onButton1Click(View view) {
        showSurnameOnButton("Леванян", (Button) view);
    }

    public void onButton2Click(View view) {
        showSurnameOnButton("Леванян", (Button) view);
    }

    public void onButton3Click(View view) {
        showSurnameOnButton("Леванян", (Button) view);
    }

    private void showSurnameOnButton(String surname, Button button) {
        // Выводим фамилию на кнопке
        button.setText(surname);


        // Можно также использовать Toast для отображения сообщения
        // Toast.makeText(this, surname, Toast.LENGTH_SHORT).show();
    }
}