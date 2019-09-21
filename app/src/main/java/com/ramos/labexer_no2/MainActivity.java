package com.ramos.labexer_no2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText school1, school2, school3, school4 ,school5,
    school6, school7, school8;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        school1 = findViewById(R.id.school1);
        school2 = findViewById(R.id.school2);
        school3 = findViewById(R.id.school3);
        school4 = findViewById(R.id.school4);
        school5 = findViewById(R.id.school5);
        school6 = findViewById(R.id.school6);
        school7 = findViewById(R.id.school7);
        school8 = findViewById(R.id.school8);

    }

    public void save(View v) {
        sp = getSharedPreferences("data1", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String sch1 = school1.getText().toString();
        String sch2 = school2.getText().toString();
        String sch3 = school3.getText().toString();
        String sch4 = school4.getText().toString();
        String sch5 = school5.getText().toString();
        String sch6 = school6.getText().toString();
        String sch7 = school7.getText().toString();
        String sch8 = school8.getText().toString();
        editor.putString("sch1", sch1);
        editor.putString("sch2", sch2);
        editor.putString("sch3", sch3);
        editor.putString("sch4", sch4);
        editor.putString("sch5", sch5);
        editor.putString("sch6", sch6);
        editor.putString("sch7", sch7);
        editor.putString("sch8", sch8);
        editor.commit();
        Toast.makeText(this, "data saved in the local disk...", Toast.LENGTH_SHORT).show();
    }

    public void next(View view)
    {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
}
