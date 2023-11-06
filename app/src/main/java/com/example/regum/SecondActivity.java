package com.example.regum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    TextView textViewFullname,textViewAddress,textViewBirthdate,textViewEmail,textViewContect
            ,textViewDegree,textViewCollege,textViewPassingYear,textViewpr,textViewHobby1,textViewHobby2
            ,textViewHobby3,textViewSkill02,textViewSkill3,textViewObjectiv,;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewFullname = findViewById(R.id.Fullname);
        textViewAddress = findViewById(R.id.Address);
        textViewBirthdate = findViewById(R.id.Birthdate);
        textViewEmail = findViewById(R.id.Email);
        textViewContect = findViewById(R.id.Contect);
        textViewDegree = findViewById(R.id.Degree);
        textViewCollege = findViewById(R.id.College);
        textViewPassingYear = findViewById(R.id.PassingYear);
        textViewpr = findViewById(R.id.pr);
        textViewHobby1 = findViewById(R.id.Hobby1);
        textViewHobby2 = findViewById(R.id.Hobby2);
        textViewHobby3 = findViewById(R.id.Hobby3);
        textViewSkill02 = findViewById(R.id.Skill02);
        textViewSkill3 = findViewById(R.id.Skill3);
        textViewObjectiv = findViewById(R.id.Objectiv);


        Intent intent = getIntent();
        String Fullname = intent.getStringExtra("Fullname");
        String Address = intent.getStringExtra("Address");
        String Birthdate = intent.getStringExtra("Birthdate");
        String Email = intent.getStringExtra("Email");
        String Contect = intent.getStringExtra("Contect");
        String Degree = intent.getStringExtra("Degree");
        String College = intent.getStringExtra("College");
        String PassingYear = intent.getStringExtra("PassingYear");
        String pr = intent.getStringExtra("pr");
        String Hobby1 = intent.getStringExtra("Hobby1");
        String Hobby2 = intent.getStringExtra("Hobby2");
        String Hobby3 = intent.getStringExtra("Hobby3");
        String Skill02 = intent.getStringExtra("Skill02");
        String Skill3 = intent.getStringExtra("Skill3");
        String Objectiv = intent.getStringExtra("Objectiv");



        textViewFullname.setText(Fullname);
        textViewAddress.setText(Address);
        textViewAddress.setText(Address);
        textViewBirthdate.setText(Birthdate);
        textViewBirthdate.setText(Birthdate);
        textViewEmail.setText(Email);
        textViewContect.setText(Contect);
        textViewDegree.setText(Degree);
        textViewCollege.setText(College);
        textViewPassingYear.setText(PassingYear);
        textViewpr.setText(pr);
        textViewHobby1.setText(Hobby1);
        textViewHobby2.setText(Hobby2);
        textViewHobby3.setText(Hobby3);
        textViewSkill02.setText(Skill02);
        textViewSkill3.setText(Skill3);
        textViewObjectiv.setText(Objectiv);







    }
}