package com.ramos.labexer_no2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText schoolVR, school1, school2, school3, school4 ,school5,
            school6, school7, school8;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        schoolVR = findViewById(R.id.schoolVR);
    }

    public void verify(View v) {

        sp = getSharedPreferences("data1", MODE_PRIVATE);
        String sch1SP = sp.getString("sch1", null);
        String sch2SP = sp.getString("sch2", null);
        String sch3SP = sp.getString("sch3", null);
        String sch4SP = sp.getString("sch4", null);
        String sch5SP = sp.getString("sch5", null);
        String sch6SP = sp.getString("sch6", null);
        String sch7SP = sp.getString("sch7", null);
        String sch8SP = sp.getString("sch8", null);
        String schVR = schoolVR.getText().toString();


        if (sch1SP.equals(schVR) || sch2SP.equals(schVR) || sch3SP.equals(schVR) ||
                sch4SP.equals(schVR) || sch5SP.equals(schVR) || sch6SP.equals(schVR) ||
                sch7SP.equals(schVR) || sch8SP.equals(schVR) ) {
            Toast.makeText(this, "this School is competing in UAAP...", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "this school not competing in the UAAP", Toast.LENGTH_SHORT).show();
        }
    }
}
