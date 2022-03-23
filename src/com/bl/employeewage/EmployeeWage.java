package com.bl.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        int IS_Full_Time = 1;
        int IS_Part_Time = 2;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;

        int empCheck = (int)Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case 1 : IS_Full_Time :
            empHrs = 8;
                break;
            case 2 :IS_Part_Time :
            empHrs = 4;
                break;
            default :
                empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage : " + empWage);
    }
}
