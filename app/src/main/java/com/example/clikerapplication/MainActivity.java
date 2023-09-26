package com.example.clikerapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int clickCount = 0;
    private Button clickButton;
    private Button resetButton;
    private TextView clickCountText;
    private Switch pointSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            clickButton = findViewById(R.id.clickButton);
            clickCountText = findViewById(R.id.clickCountText);
            resetButton = findViewById(R.id.resetButton);
            pointSwitch = findViewById(R.id.pointSwitch);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pointSwitch.isChecked()) {
                    clickCount--;
                } else {
                    clickCount++;
                }
                clickCountText.setText("Liczba punktów: " + clickCount);
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount = 0;
                clickCountText.setText("Liczba punktów: " + clickCount);
            }
        });
    }
}
