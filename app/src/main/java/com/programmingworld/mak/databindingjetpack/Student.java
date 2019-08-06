package com.programmingworld.mak.databindingjetpack;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class Student extends BaseObservable {
    private String email;

    public Student(String email, String name) {
        this.email = email;
        this.name = name;
    }
    public Student(){

    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);

    }

    private String name;

}
