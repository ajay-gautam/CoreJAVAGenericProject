/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.smartcoding.Inherit;

/**
 *
 * @author Ajay
 */
public class Student extends Person{
    private int studentId;
    
    public int getStudentId(){
        return studentId;
    }
    
    public void setStudentId(int studentId){
        this.studentId=studentId;
    }

    @Override
    public String getDetail() {
        return studentId+" "+super.getDetail(); //To change body of generated methods, choose Tools | Templates.
    }
    
 
    
}
