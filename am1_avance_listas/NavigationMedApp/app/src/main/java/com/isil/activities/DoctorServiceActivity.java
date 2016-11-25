package com.isil.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Pablo on 11/5/2016.
 */

public class DoctorServiceActivity extends Activity {
    private static final String TAG ="DoctorServiceActivity" ;
    private Button btnCita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_services);

        btnCita= (Button)findViewById(R.id.btnCita);

        btnCita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoService();
            }
        });
    }

    private void gotoService() {
        Intent intent = new Intent(DoctorServiceActivity.this,
                DoctorBookingActivity.class);
        startActivity(intent);
        finish();
    }
}
