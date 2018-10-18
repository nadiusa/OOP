package com.company;

import java.util.Date;

public class Patient extends Person {
    String id;
    FullName name;
    Gender gender;
    Date bithdate;
    int age;
    Date accepted;
    History sickness;
    String prescription;
    String allergies;
    String specialRegs;
    operationStaff operationStaff;
}
