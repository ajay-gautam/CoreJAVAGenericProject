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
public class Employee extends Person{
    private int employeeId;
    
    public int getEmployeeId(){
        return employeeId;
    }
    
    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }

    @Override
    public String getDetail() {
        return employeeId+" "+super.getDetail(); //To change body of generated methods, choose Tools | Templates.
    }
    
 
    
}
