package com.Bridgelabz.employeewage;

/**
 * UC3: Add Part Time Employee And Wage ie. part time hour 8
 */

public class EmployeeWage {

    static final  int WAGE_PER_HOUR = 20;

    static final int FULL_TIME_HOUR = 8;

    static final int PART_TIME_HOUR = 4;

    public static void main(String[] args) {

        int employeeAttendence = (int)Math.floor(Math.random() * 10) % 3;
        System.out.println(employeeAttendence);

        int dailyWage = 0;

        if (employeeAttendence == 1){

            System.out.println("Employee is Present");
            dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;

        } else if (employeeAttendence == 2) {

            System.out.println("Employee is Part Time");
            dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;

        } else{

            System.out.println("Employee is Absent");
        }
        System.out.println("Daily Wage = "+dailyWage);
    }

}
