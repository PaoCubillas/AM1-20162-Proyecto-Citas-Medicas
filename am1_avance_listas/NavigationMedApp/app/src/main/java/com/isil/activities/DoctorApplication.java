package com.isil.activities;

import android.app.Application;

import com.isil.activities.storage.DoctorRepository;

/**
 * Created by Pablo on 11/4/2016.
 */

public class DoctorApplication extends Application {

    private DoctorRepository doctorRepository;

    @Override
    public void onCreate() {
        super.onCreate();
        doctorRepository= new DoctorRepository();
        doctorRepository.mock();
    }

    public DoctorRepository getDoctorRepository() {
        return doctorRepository;
    }
}
