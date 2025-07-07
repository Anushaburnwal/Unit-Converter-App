package com.example.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        btn = findViewById(R.id.btn);
        textView = findViewById(R.id.textview);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the user input in kilos
                String inputText = editText.getText().toString();
                //converting the string in double
                double kilos = Double.parseDouble(inputText);
                //converting kilos into pounds
                double pounds = makeConversion(kilos);
                //displaying the conversion result
                textView.setText(""+pounds);

            }
        });

    }

    public double makeConversion(double kilos)
    {
        //1 kilos = 2.20462 pounds
        return kilos * 2.20462;
    }
}