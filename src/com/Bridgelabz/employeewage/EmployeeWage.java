package com.Bridgelabz.employeewage;

public class EmployeeWage {
    static final int IS_FULL_TIME = 2;

    static final int IS_PART_TIME = 1;

    public static int computeEmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
              totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + "Emp Hr: " +empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wage For Company: " + company +" is : "+ totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        computeEmployeeWage("Infosis", 20,4,20);
        computeEmployeeWage("Reliance",30,5,34);
    }


}



    


