package com.newone.assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        EditText name,add,mob,email,qualification;
        Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.et_name);
        add = findViewById(R.id.et_add);
        mob = findViewById(R.id.et_phone);
        email = findViewById(R.id.et_email);
        qualification = findViewById(R.id.et_qualification);
        submit = findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sname,smob,smail,squali;
                sname = name.getText().toString();
                smob = mob.getText().toString();
                smail = email.getText().toString();
                squali = qualification.getText().toString();
                if (sname.equals("") || smob.equals("") || smail.equals("") || squali.equals("")) {
                    Toast.makeText(MainActivity.this, "Please Fill All Requirement Fields", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Sucessfully Submit", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
