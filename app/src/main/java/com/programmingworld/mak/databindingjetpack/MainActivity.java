package com.programmingworld.mak.databindingjetpack;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.programmingworld.mak.databindingjetpack.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    ClickHandler clickHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setStudent(setStudentDetail());
        clickHandler=new ClickHandler(this);
        activityMainBinding.setClickHandle(clickHandler);


    }

    public Student setStudentDetail(){
        Student student=new Student();
        student.setEmail("mohitpant9@gmial.com");
        student.setName("Mohit");
        return student;
    }

    public class ClickHandler{
        Context context;

        public ClickHandler(Context context){
            this.context=context;
        }

        public void button1Click(View view){
            Toast.makeText(context, "button 1 clicked", Toast.LENGTH_SHORT).show();
        }
        public void button2Click(View view){
            Toast.makeText(context, "button 2 clicked", Toast.LENGTH_SHORT).show();
        }
    }

}

