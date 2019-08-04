package com.programmingworld.mak.databindingjetpack;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.programmingworld.mak.databindingjetpack.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setStudent(setStudentDetail());

    }

    public Student setStudentDetail(){
        Student student=new Student();
        student.setEmail("mohitpant9@gmial.com");
        student.setName("Mohit");
        return student;
    }
}
