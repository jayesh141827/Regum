package com.example.MainActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.regum.R;


public class MainActivity extends AppCompatActivity {

    EditText E1,E2,
            E3, E4,E5,
            E6,
            E7,E8,E9, E10
            ,E11,E12,E13,
            E14,E15,E16,C1,C2,C3;


    Button buttonSumbit;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        E1= findViewById(R.id.E1);
        E2 = findViewById(R.id.E2);
        E3 = findViewById(R.id.E3);
        E4 = findViewById(R.id.E4);
        E5= findViewById(R.id.E5);
        E6 = findViewById(R.id.E6);
        E7 = findViewById(R.id.E7);
        E8 = findViewById(R.id.E8);
        E9 = findViewById(R.id.E9);
        E10 = findViewById(R.id.E10);
        E11 = findViewById(R.id.E11);
        E12 = findViewById(R.id.E12);
        E13 = findViewById(R.id.E13);
        E14 = findViewById(R.id.E14);
        E15 = findViewById(R.id.E15);
        E16 = findViewById(R.id.E16);
        C1 = findViewById(R.id.C1);
        C2 = findViewById(R.id.C2);
        C3 = findViewById(R.id.C3);
        buttonSumbit = findViewById(R.id.Sumbit);

        buttonSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String E1 = E1.getText().toString();
                String E1 = E1.getText().toString();
                String Birthdate = editTextBirthdate.getText().toString();
                String Email = editTextEmail.getText().toString();
                String Contect = editTextContect.getText().toString();
                String Degree = editTextDegree.getText().toString();
                String College = editTextCollege.getText().toString();
                String PassingYear = editTextPassingYear.getText().toString();
                String pr = editTextpr.getText().toString();
                String Hobby1 = editTextHobby1.getText().toString();
                String Hobby2 = editTextHobby2.getText().toString();
                String Hobby3 = editTextHobby3.getText().toString();
                String Skill01 = editTextSkill01.getText().toString();
                String Skill02 = editTextSkill02.getText().toString();
                String Skill3 = editTextSkill3.getText().toString();
                String Objectiv = editTextObjectiv.getText().toString();
                String Sumbit = buttonSumbit.getText().toString();

                Intent i = new Intent(MainActivity.this,MainActivity.class);
                i.putExtra("E1",E1);
                i.putExtra("E1",E1);
                i.putExtra("E1",E1);
                i.putExtra("E1",E1);
                i.putExtra("E1",E1);
                i.putExtra("E1",E1);
                i.putExtra("E1",E1);
                i.putExtra("E1",E1);
                i.putExtra("E1",E1);
                i.putExtra("E1",E1);
                i.putExtra("E1",E1);
                i.putExtra("E1",E1);
                i.putExtra("E1",E1);
                i.putExtra("E1",E1);
                i.putExtra("E1",E1);
                i.putExtra("E1",Objectiv);

                i.putExtra("Sumbit",Sumbit);
                startActivity(i );

            }



        });




    }
}