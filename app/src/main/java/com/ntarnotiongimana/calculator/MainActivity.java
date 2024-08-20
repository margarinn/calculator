package com.ntarnotiongimana.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView solution, result;
    MaterialButton clear, button_bracket_open, button_bracket_close, button_add, button_minus, button_divide, button_equal, button_multiply, button_back;
    MaterialButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, button_dot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);

        solution = findViewById(R.id.solution);
        result = findViewById(R.id.result);
        assignId(clear,R.id.button_clear);
        assignId(button_bracket_open,R.id.button_bracket_open);
        assignId(button_bracket_close,R.id.button_bracket_close);
        assignId(button_add,R.id.button_add);
        assignId(button_minus,R.id.button_minus);
        assignId(button_divide,R.id.button_divide);
        assignId(button_equal,R.id.button_equal);
        assignId(button_multiply,R.id.button_multiply);
        assignId(button_back,R.id.button_back);
        assignId(button0,R.id.button0);
        assignId(button1,R.id.button1);
        assignId(button2,R.id.button2);
        assignId(button3,R.id.button3);
        assignId(button4,R.id.button4);
        assignId(button5,R.id.button5);
        assignId(button6,R.id.button6);
        assignId(button7,R.id.button7);
        assignId(button8,R.id.button8);
        assignId(button9,R.id.button9);
        assignId(button_dot,R.id.button_dot);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    void assignId(MaterialButton btn, int id){
        btn = findViewById(id);
        if (btn != null) {
            btn.setOnClickListener(this);
        }
    }
    @Override
    public void onClick(View view) {
        MaterialButton button =(MaterialButton) view;
        String buttonText = button.getText().toString();
        solution.setText(buttonText);

    }
}