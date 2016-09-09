package com.genericslab.medpro;

import com.orm.SugarRecord;

/**
 * Created by Zim on 9/10/2016.
 */
public class patient extends SugarRecord {
    String name,sex,phone,history;
    int id;
    public patient(){

    }
    public patient(int id,String name, String sex, String phone, String history){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.history = history;
    }
}
