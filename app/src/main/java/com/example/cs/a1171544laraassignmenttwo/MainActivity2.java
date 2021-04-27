package com.example.cs.a1171544laraassignmenttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    public static final String NAME = "NAME";
    public static final String EMAIL = "EMAIL";
    public static final String DOF = "DOF";
    public static final String GENDER = "GENDER";
    public static final String PHONE = "PHONE";
    public static final String NATIONALITY = "NATIONALITY";
    public static final String ADDRESS = "ADDRESS";
    public static final String HOBBIES = "HOBBIES";
    public static final String LANGUAGES = "LANGUAGES";
    public static final String SKILLS = "SKILLS";
    public static final String WORK = "WORK";
    public static final String EDUCATION = "EDUCATION";
    public static final String PROFESSIONAL = "PROFESSIONAL";
    public static final String FLAG = "FLAG";
    private boolean flag = false;
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;

    private EditText edtFullName;
    private EditText edtEmail;
    private EditText editDateOB;
    private EditText edtPhone;
    private EditText edtNationality;
    private EditText edtAddress;
    private EditText edtHobbies;
    private Spinner gndrspin;

    private EditText Skills;
    private EditText workexp;
    private EditText education;
    private EditText proffsumm;
    private CheckBox chk;
    private RadioButton option1;
    private RadioButton option2;
    private RadioButton option3;
    private RadioGroup radiochoose;
    private String selectedoption;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        definevar();
        setupSharedPrefrences();
        checkPrefs();
    }
    private void setupSharedPrefrences() {
        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        editor = prefs.edit();
    }

    private void definevar() {
        Skills = findViewById(R.id.edtSkills);
        workexp = findViewById(R.id.edtWorkExp);
        education = findViewById(R.id.edtEducation);
        proffsumm = findViewById(R.id.edtProfessional);
        chk = findViewById(R.id.chk);
        option1 = findViewById(R.id.option1radio);
        option2 = findViewById(R.id.option2radio);
        option3 = findViewById(R.id.option3radio);
        radiochoose = findViewById(R.id.languagesradio);
        edtFullName = findViewById(R.id.edtFullName);
        edtEmail = findViewById(R.id.edtEmail);
        editDateOB = findViewById(R.id.editDateOB);
        edtPhone = findViewById(R.id.edtPhone);
        edtNationality = findViewById(R.id.edtNationality);
        edtAddress = findViewById(R.id.edtAddress);
        edtHobbies = findViewById(R.id.edtHobbies);
        gndrspin = findViewById(R.id.Genderspin);
    }

    private void checkPrefs() {
        flag = prefs.getBoolean(FLAG, false);

        if(flag){
            String name = prefs.getString(NAME, "");
            String email = prefs.getString(EMAIL, "");
            String dof = prefs.getString(DOF, "");
            String gender = prefs.getString(GENDER, "");
            String phone = prefs.getString(PHONE, "");
            String nationality = prefs.getString(NATIONALITY, "");
            String address = prefs.getString(ADDRESS, "");
            String hobbies = prefs.getString(HOBBIES, "");
            String language = prefs.getString(LANGUAGES, "");
            String skills = prefs.getString(SKILLS, "");
            String work = prefs.getString(WORK, "");
            String educ = prefs.getString(EDUCATION, "");
            String professional = prefs.getString(PROFESSIONAL, "");


//            edtFullName.setText(name);
//            edtEmail.setText(email);
//            editDateOB.setText(dof);
//            edtPhone.setText(phone);
//            edtNationality.setText(nationality);
////            gndrspin.setSelection(gender);
//            edtAddress.setText(address);
//            edtHobbies.setText(hobbies);
//            radiochoose.check(Integer.parseInt(language));

            Skills.setText(skills);
            workexp.setText(work);
            education.setText(educ);
            proffsumm.setText(professional);
            chk.setChecked(true);
        }
    }

    private void pref (){
//        String name = edtFullName.getText().toString();
//        String emaill = edtEmail.getText().toString();
//        String dof = editDateOB.getText().toString();
//        String phonenum = edtPhone.getText().toString();
//        String nati = edtNationality.getText().toString();
//        String gender = String.valueOf(gndrspin.getTextDirection());
//        String address = edtAddress.getText().toString();
//        String hobby = edtHobbies.getText().toString();
//        String choselanguage = String.valueOf(radiochoose.getCheckedRadioButtonId());
        String skill = Skills.getText().toString();
        String workk = workexp.getText().toString();
        String edu = education.getText().toString();
        String professtional = proffsumm.getText().toString();


        if(chk.isChecked()){
            if(!flag){
//                editor.putString(NAME, name);
//                editor.putString(EMAIL, emaill);
//                editor.putString(DOF, dof);
//                editor.putString(PHONE, phonenum);
//                editor.putString(NATIONALITY, nati);
//                editor.putString(GENDER, gender);
//                editor.putString(ADDRESS, address);
//                editor.putString(HOBBIES, hobby);
//                editor.putString(LANGUAGES, choselanguage);
                editor.putString(SKILLS, skill);
                editor.putString(WORK, workk);
                editor.putString(EDUCATION, edu);
                editor.putString(PROFESSIONAL, professtional);
                editor.putBoolean(FLAG, true);
                editor.commit();
            }
        }
    }
    public void secondpage_OnClick(View view) {

        InputMethodManager m = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        m.hideSoftInputFromWindow(view.getWindowToken(),0);
        Intent intent1 = getIntent();
        String fullname = intent1.getStringExtra("NAME");
        String email = intent1.getStringExtra("EMAIL");
        String dateofbirth = intent1.getStringExtra("DATEOFBIRTH");
        String gnder = intent1.getStringExtra("GENDER");
        String phone = intent1.getStringExtra("PHONE");
        String nationality = intent1.getStringExtra("NATIONALITY");
        String addr = intent1.getStringExtra("ADDRESS");
        String hobbies = intent1.getStringExtra("HOBBIES");

        Intent intent = new Intent(this, MainActivity3.class);
        String skills = Skills.getText().toString();
        String work = workexp.getText().toString();
        String educ = education.getText().toString();
        String professionalsumm = proffsumm.getText().toString();

        if (option1.isChecked()) {
            selectedoption = option1.getText().toString();
        } else if (option2.isChecked()) {
            selectedoption = option2.getText().toString();
        } else if (option3.isChecked()) {
            selectedoption = option3.getText().toString();
        }

        Boolean chek = chk.isChecked();

        intent.putExtra("NAME",fullname);
        intent.putExtra("EMAIL",email);
        intent.putExtra("DATEOFBIRTH",dateofbirth);
        intent.putExtra("GENDER",gnder);
        intent.putExtra("PHONE",phone);
        intent.putExtra("NATIONALITY",nationality);
        intent.putExtra("ADDRESS",addr);
        intent.putExtra("HOBBIES",hobbies);
        intent.putExtra("RADIOCHOOSE", selectedoption);
        intent.putExtra("SKILLS", skills);
        intent.putExtra("WORK", work);
        intent.putExtra("EDUCATION", educ);
        intent.putExtra("PROFESSIONAL", professionalsumm);
        intent.putExtra("REMEMBER",chek);
        pref();
        startActivity(intent);
    }
}