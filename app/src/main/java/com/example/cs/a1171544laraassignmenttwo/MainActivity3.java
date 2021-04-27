package com.example.cs.a1171544laraassignmenttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import informationpackage.Information;


public class MainActivity3 extends AppCompatActivity {

    private EditText edtFullName;
    private EditText edtEmail;
    private EditText editDateOB;
    private EditText edtPhone;
    private EditText edtNationality;
    private EditText edtAddress;
    private EditText edtHobbies;
    private RadioGroup radiochoose;
    private EditText edtSkills;
    private EditText edtWorkExp;
    private EditText edtEducation;
    private EditText edtProfessional;
    private Spinner gndrspin;
    private CheckBox chk;
    String fullname ;
    String email ;
    String dateofbirth ;
    String gnder ;
    String phone ;
    String nationality;
    String addr;
    String hobbies;
    String skills;
    String work;
    String educ;
    String prof;
    String radiochose;
    Boolean chek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        fullname = intent.getStringExtra("NAME");
        email = intent.getStringExtra("EMAIL");
        dateofbirth = intent.getStringExtra("DATEOFBIRTH");
        gnder = intent.getStringExtra("GENDER");
        phone = intent.getStringExtra("PHONE");
        nationality = intent.getStringExtra("NATIONALITY");
        addr = intent.getStringExtra("ADDRESS");
        hobbies = intent.getStringExtra("HOBBIES");
        skills = intent.getStringExtra("SKILLS");
        work = intent.getStringExtra("WORK");
        educ = intent.getStringExtra("EDUCATION");
        prof = intent.getStringExtra("PROFESSIONAL");
        radiochose= intent.getStringExtra("RADIOCHOOSE");
        chek = intent.getBooleanExtra("REMEMBER",true);
        storedata();
        setupViews();
    }

    private void setupViews() {
        edtFullName = findViewById(R.id.edtFullName);
        edtEmail = findViewById(R.id.edtEmail);
        editDateOB = findViewById(R.id.editDateOB);
        edtPhone = findViewById(R.id.edtPhone);
        edtNationality = findViewById(R.id.edtNationality);
        edtAddress = findViewById(R.id.edtAddress);
        edtHobbies = findViewById(R.id.edtHobbies);
        radiochoose = findViewById(R.id.languagesradio);
        edtSkills = findViewById(R.id.edtSkills);
        edtWorkExp = findViewById(R.id.edtWorkExp);
        edtEducation = findViewById(R.id.edtEducation);
        edtProfessional = findViewById(R.id.edtProfessional);
        gndrspin = findViewById(R.id.Genderspin);
        chk = findViewById(R.id.chk);
    }



    private void storedata() {
        TextView result = findViewById(R.id.txtinfosummary);
        result.setText("Hi "+ fullname + " This is a summary for your CV information " +
                "You are "+gnder+ " and your Email address "+ email + " You born in "+ dateofbirth+ " and you are "+nationality+ ", your live in "+addr+ " and we can contact with you in the following number "+phone+
                " You hobbies are in "+hobbies+" ,and you know "+radiochose+" languages , your professional summary is "+prof+" and your skills are "+skills+
                " and your education was "+educ+" and finally your work experience was "+work);
    }

    public void savebtn_OnClick(View view) {
        Information[] data = new Information[1];
        data[0] = new Information(fullname,email,dateofbirth,gnder,phone,nationality,addr,hobbies,radiochose,skills,work,educ,prof);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String dataString = gson.toJson(data);
        editor.putString("DATA", dataString);
        editor.commit();
        Toast.makeText(this, "CV Information Saved: \n" + dataString,
                Toast.LENGTH_SHORT).show();


  }

    public void Loadbtn_OnClick(View view) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        Gson gson = new Gson();
        String str = prefs.getString("DATA", "");
        Information[] info = gson.fromJson(str, Information[].class);

        Toast.makeText(this, "Number of data is " + info.length
                , Toast.LENGTH_SHORT).show();
    }
}