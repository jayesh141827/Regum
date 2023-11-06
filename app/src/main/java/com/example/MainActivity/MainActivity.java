package com.example.MainActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.opengl.EGL15;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.regum.R;


public class MainActivity extends AppCompatActivity {

    EditText txtname,txtaddress, txtdate, txtemail,txtcontect, txtdegree, txtcollege,txtyear,txtpr, txthobby1,txthobby2,txthobby3,txtskill1, txtskill2,txtskill3,txtobjectiv;


    Button buttonSumbit;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtname = findViewById(R.id.txtname);
        txtaddress = findViewById(R.id.txtadress);
        txtdate = findViewById(R.id.txtbirth);
        txtemail = findViewById(R.id.txtemail);
        txtcontect= findViewById(R.id.txtcontact);
        txtdegree = findViewById(R.id.txtdegree);
        txtcollege = findViewById(R.id.txtcollage);
        txtyear = findViewById(R.id.txtyear);
        txtpr = findViewById(R.id.txtpassing);
        txthobby1 = findViewById(R.id.txthobby1);
        txthobby2 = findViewById(R.id.txthobby2);
        txthobby3 = findViewById(R.id.txthobby3);
        txtskill1 = findViewById(R.id.txtskil1);
        txtskill2 = findViewById(R.id.txtskil2);
        txtskill3 = findViewById(R.id.txtskil3);
        txtobjectiv = findViewById(R.id.txtobjective);
        buttonSumbit = findViewById(R.id.txtbtn);

        buttonSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = txtname.getText().toString();
                String address = txtaddress.getText().toString();
                String date = txtdate.getText().toString();
                String email = txtemail.getText().toString();
                String contect = txtcontect.getText().toString();
                String degree = txtdegree.getText().toString();
                String college = txtcollege.getText().toString();
                String year = txtyear.getText().toString();
                String pr = txtpr .getText().toString();
                String hobby1 = txthobby1.getText().toString();
                String hobby2 = txthobby2.getText().toString();
                String hobby3 = txthobby3.getText().toString();
                String skill1 = txtskill1.getText().toString();
                String skill2 = txtskill2.getText().toString();
                String skill3 = txtskill3.getText().toString();
                String objectiv = txtobjectiv.getText().toString();
                String Sumbit = buttonSumbit.getText().toString();

                Intent i = new Intent(MainActivity.this,MainActivity.class);
                i.putExtra("name",name);
                i.putExtra("address",address);
                i.putExtra("date",date);
                i.putExtra("email",email);
                i.putExtra("contect",contect);
                i.putExtra("degree",degree);
                i.putExtra("college",college);
                i.putExtra("year",year);
                i.putExtra("pr",pr);
                i.putExtra("hobby1",hobby1);
                i.putExtra("hobby2",hobby2);
                i.putExtra("hobby3",hobby3);
                i.putExtra("skill1",skill1);
                i.putExtra("skill2",skill2);
                i.putExtra("skill3",skill3);
                i.putExtra("objectiv",objectiv);
                i.putExtra("Sumbit",Sumbit);


            }



        });




    }
}