package com.genericslab.medpro;

import com.orm.SugarRecord;

/**
 * Created by Zim on 9/10/2016.
 */
public class patient extends SugarRecord {
    String name,sex,phone,history;

    public patient(){

    }
    public patient(String name, String sex, String phone, String history){

        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.history = history;
    }
}
