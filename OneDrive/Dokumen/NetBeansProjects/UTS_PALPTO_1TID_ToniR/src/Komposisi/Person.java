/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komposisi;

/**
 *
 * @author ASUS
 */
public class Person {
    private Job job;
    
    public Person(){
        this.job=new Job();
        job.setSalary(1000L);
    }
    public long getSalary(){
        return job.getSalary();
    }
}

