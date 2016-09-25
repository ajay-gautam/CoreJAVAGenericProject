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
public class Person {
     String firstName, lastName;
    
    public Person(){
        
    }
    
    public Person(String firstName,String lastName){//overloaded constructor
this.firstName=firstName;
this.lastName=lastName;
    }
    public String getFirstName(){
    return firstName;
}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;}
    
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    
    public String getFullName(){
        return firstName+" "+lastName;
    }
    public String getDetail(){
        return firstName+" "+lastName;
    }
    }
    