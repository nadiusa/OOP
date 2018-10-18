package com.company;


public class History{
    String sickNess;
    History(String sickNess){
        this.sickNess=sickNess;
    }

    public String getSickNess() {
        return sickNess;
    }
    public Boolean isSick(){
        return Boolean.valueOf(sickNess!=null);
    }
}

