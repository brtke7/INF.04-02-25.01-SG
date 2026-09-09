package com.example.mobilna;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btn_submit;
    private EditText program_number;
    private TextView program_number_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn_submit          = findViewById(R.id.button_washingmachine);
        program_number      = findViewById(R.id.edit_text_washingmaschine);
        program_number_text = findViewById(R.id.program_number);

        btn_submit.setOnClickListener(v -> set_program_number());
    }

    public void set_program_number() {
        int program_value = Integer.parseInt(this.program_number.getText().toString());

        if ( program_value >= 1 && program_value <= 12 )
        {
            program_number_text.setText("Numer prania: " + program_value);
        }
    }
}