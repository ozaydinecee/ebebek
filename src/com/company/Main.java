package com.company;
/**
 * @author Ece Özaydın
 * @date 7.10.2022
 * */
public class Main {

    public static void main(String[] args) {
        // object created
	Employee employee1= new Employee("ece özaydın", 2000,43,2020);
        int salary = employee1.salary;
        //to string function called to see all result as a string
        System.out.println(employee1.toString());

    }
}
