package com.example.rk_personal.LLD.designPatterns.creationalPatterns.prototypePattern;

import com.example.rk_personal.LLD.designPatterns.creationalPatterns.singletonPattern.DBConnection;
import lombok.Data;

@Data
public class Student implements ProtoTypeInterface{

    private String name;
    private String rollNumber;
    private String standard;

    @Override
    public ProtoTypeInterface clone() {
        Student clonedStudent = new Student();
        clonedStudent.setName(this.name);
        clonedStudent.setRollNumber(this.rollNumber);
        clonedStudent.setStandard(this.standard);
        return clonedStudent;
    }

    //imagine if we have private attributes which cant be accessed from outside
}
