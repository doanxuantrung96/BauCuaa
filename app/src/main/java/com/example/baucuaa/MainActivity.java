package com.example.baucuaa;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtTex1, txtTex2, txtTex3, txtTex4, txtTex5;
    Button btnRandom;
    EditText edtNum1, edtNum2;
    int Num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++Num;
                Random(btnRandom, txtTex1, txtTex2, txtTex3, txtTex4, txtTex5);
            }
        });

    }

    private void AnhXa() {

        txtTex1 = findViewById(R.id.txtTex1);
        txtTex2 = findViewById(R.id.txtTex2);
        txtTex3 = findViewById(R.id.txtTex3);
        txtTex4 = findViewById(R.id.txtTex4);
        txtTex5 = findViewById(R.id.txtTex5);

        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);

        btnRandom = findViewById(R.id.btnRandom);
    }

    public void Random(Button btnRandom, TextView txtTex1, TextView txtTex2, TextView txtTex3, TextView txtTex4, TextView txtTex5) {
        if (edtNum1.getText().toString().equals("") || edtNum2.getText().toString().equals("")) {
            Toast.makeText(this, "Kiểm tra và nhập lại!", Toast.LENGTH_SHORT).show();
            Num = 0;
        } else if (Integer.parseInt(edtNum1.getText().toString()) == 0 && Integer.parseInt(edtNum2.getText().toString()) == 0) {
            Toast.makeText(this, "Kiểm tra và nhập lại!", Toast.LENGTH_SHORT).show();
            Num = 0;
        } else if (Integer.parseInt(edtNum1.getText().toString()) > Integer.parseInt(edtNum2.getText().toString())) {
            Toast.makeText(this, "Số thứ nhât phải nhỏ hơn số thư hai!", Toast.LENGTH_SHORT).show();
            Num = 0;
        } else if (Integer.parseInt(edtNum1.getText().toString()) == Integer.parseInt(edtNum2.getText().toString())) {
            Toast.makeText(this, "Số thứ nhât phải nhỏ hơn số thư hai!", Toast.LENGTH_SHORT).show();
            Num = 0;
        } else if (Integer.parseInt(edtNum1.getText().toString()) < 0 || Integer.parseInt(edtNum2.getText().toString()) < 0) {
            Toast.makeText(this, "Số nhập phải lớn hơn 0", Toast.LENGTH_SHORT).show();
            Num = 0;
        } else {
            int min = Integer.parseInt(edtNum1.getText().toString());
            int max = Integer.parseInt(edtNum2.getText().toString());

            Random random = new Random();

            int x = random.nextInt((max - min + 1) + min);

            btnRandom.setText("Xúc xắc");

            if (Num == 1) {
                txtTex1.setText(x + "");
                btnRandom.setText(x + "");
                btnRandom.setTextColor(Color.parseColor("#fff000"));
                btnRandom.setTextSize(50);
            }
            if (Num == 2) {
                txtTex2.setText(x + "");
                btnRandom.setText(x + "");
                btnRandom.setTextColor(Color.parseColor("#E91E63"));
                btnRandom.setTextSize(50);
            }
            if (Num == 3) {
                txtTex3.setText(x + "");
                btnRandom.setText(x + "");
                btnRandom.setTextColor(Color.parseColor("#673AB7"));
                btnRandom.setTextSize(50);

            }
            if (Num == 4) {
                txtTex4.setText(x + "");
                btnRandom.setText(x + "");
                btnRandom.setTextColor(Color.parseColor("#FF5722"));
                btnRandom.setTextSize(50);
            }
            if (Num == 5) {
                txtTex5.setText(x + "");
                btnRandom.setText(x + "");
                btnRandom.setTextColor(Color.parseColor("#00BCD4"));
                btnRandom.setTextSize(50);
            }
            if (Num > 5) {
                txtTex1.setText("");
                txtTex2.setText("");
                txtTex3.setText("");
                txtTex4.setText("");
                txtTex5.setText("");

                btnRandom.setText("Tiếp tục");
                btnRandom.setTextSize(24);

                Num = 0;
            }
        }

    }

}
