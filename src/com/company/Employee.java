package com.company;
/**
 * @author Ece Özaydın
 * @date 7.10.2022
 * */
public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    // Constructor would initialize data members
    // With the values of passed arguments while
    // Object of that class created
    Employee(String name, int salary,int workHours,int hireYear)
    {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }
    /**
     * Calculates tax, if users salary is higher than 1000 lira.
     * */
    //calculates tax, if users salary is higher than 1000 lira.
    public double tax(int salary) {
        double tax = 0;
        if (salary < 1000) {
            System.out.println("No tax needed.");
        } else {
            tax = salary *(0.03);
        }
        return tax;
    }
    /**
     * If employee's working hours is bigger than 40 hour,
     * company gives bonus as 30 lira for every hour.
     * */
    public int bonus(int workHours){
        int bonus=0;
        if (workHours>40){
            bonus=(workHours-40)*30;
        }
        else{
            System.out.println("Employee doesn't have bonus.");

        }
        return bonus;
    }

    /**
     * Raising amount calculates on the current salary of the employee.
     * Current salary is calculated with tax and bonus which have
     * affects on the current amount of the salary.
     * */
    public double raiseSalary(int hireYear, int salary, int workHours){
        double currentSalary=salary-tax(salary)+bonus(workHours);
        int currentYear=2021;
        int workingYear=currentYear - hireYear;
        double raisingAmount=0;

        if(workingYear<10){
            raisingAmount=currentSalary*(0.05);
        }
        else if(workingYear>9 && workingYear<20){

            raisingAmount=currentSalary*(0.10);
        }
        else{
            raisingAmount=currentSalary*(0.15);
        }
        return raisingAmount;
    }

    public String toString(){//overriding the toString() method
        return "Employee full-name is "+name+ ". It's monthly salary is "+salary+ ". It's hired in "+hireYear+
                ". It works "+workHours+ " hours in a week."+ " Thus bonus amount is "+bonus(workHours)+
                ". Tax amount is "+tax(salary)+". Raising amount of the salary is "+raiseSalary(hireYear,salary,workHours)+"."
                ;
    }


}
