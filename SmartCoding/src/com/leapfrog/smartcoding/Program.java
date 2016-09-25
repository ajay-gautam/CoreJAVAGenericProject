
package com.leapfrog.smartcoding;
import com.leapfrog.smartcoding.Inherit.Person;
import com.leapfrog.smartcoding.Inherit.Student;


public class Program {

    public static void main(String[] args) {
        Person s=new Person();
        s.setFirstName("Ajay");
        s.setLastName("Gautam");
        System.out.println(s.getDetail());
    }}