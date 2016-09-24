package com.genericslab.medpro;

import com.orm.SugarRecord;

/**
 * Created by Zim on 9/24/2016.
 */
public class Doctor extends SugarRecord {
    public String name,usrname,passwd;

    public Doctor(){

    }
    public Doctor(String name,String Username,String Password){
        this.name=name;
        this.usrname= Username;
        this.passwd=Password;
    }

}
