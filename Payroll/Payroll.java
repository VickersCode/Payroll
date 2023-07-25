public class Payroll {

    // Attributes
    private String name; //Employee's name
    private int idNumber; // Employee's id number
    private double payRate; // hourly pay rate
    private double hours; // hours worked

    // Constructor
    public Payroll(String empName, int id) {
        name = empName;
        idNumber = id;
    }

    // Mutators
    public void setPayRate(double pay) {
        payRate = pay;
    }

    public void setHours(double payHours) {
        hours = payHours;
    }

    // Accessors
    public String getName() {
        return name;
    }

    public int getId() {
        return idNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHours() {
        return hours;
    }

    /**
     * Method returns the total gross pay by multiplying rate and time
     * 
     * @param rate - hourly pay
     * @param time - time worked
     * @return gross pay
     */
    public double grossPay(double rate, double time) {
        return rate * time;
    }
}
