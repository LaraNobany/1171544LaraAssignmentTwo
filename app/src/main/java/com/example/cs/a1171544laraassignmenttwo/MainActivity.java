package com.example.cs.a1171544laraassignmenttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public EditText FullName;
    private EditText Email;
    private EditText DOF;
    Spinner spinner;
    private EditText Phone;
    private EditText Nationality;
    private EditText Address;
    private EditText Hobbies;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.Genderspin);
        populatedspinner();
        definevar();
    }

    private void definevar() {
        FullName = findViewById(R.id.edtFullName);
        Email = findViewById(R.id.edtEmail);
        DOF = findViewById(R.id.editDateOB);
        Phone = findViewById(R.id.edtPhone);
        Nationality = findViewById(R.id.edtNationality);
        Address = findViewById(R.id.edtAddress);
        Hobbies = findViewById(R.id.edtHobbies);
    }

    private void populatedspinner() {
        ArrayList<String> gndr = new ArrayList<>();
        gndr.add("Male");
        gndr.add("Female");
        ArrayAdapter<String> adapter = new ArrayAdapter <>(this, android.R.layout.simple_spinner_item, gndr);
        spinner.setAdapter(adapter);
    }

    public void nextPage_OnClick(View view) {
        InputMethodManager m = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        m.hideSoftInputFromWindow(view.getWindowToken(),0);
        Intent intent = new Intent(this, MainActivity2.class);
        String fullname = FullName.getText().toString();
        String email = Email.getText().toString();
        String dateofbirth = DOF.getText().toString();
        String gnder = spinner.getSelectedItem().toString();
        String phone = Phone.getText().toString();
        String nationality = Nationality.getText().toString();
        String addr = Address.getText().toString();
        String hobbies = Hobbies.getText().toString();

        intent.putExtra("NAME", fullname);
        intent.putExtra("EMAIL", email);
        intent.putExtra("DATEOFBIRTH", dateofbirth);
        intent.putExtra("GENDER", gnder);
        intent.putExtra("PHONE", phone);
        intent.putExtra("NATIONALITY", nationality);
        intent.putExtra("ADDRESS", addr);
        intent.putExtra("HOBBIES", hobbies);
        startActivity(intent);

    }
}