package org.com.entities;

import java.util.Date;

public class student {
    private int student_Id;
    private String student_Name;
    private Date student_Date;
    private int student_Major;
    private major parentMajor;
    private double student_Payment;
    private double student_Discount;
    private double student_BackAmount;
    private Date student_BackDate;
    private int student_AgentId;
    private agent parentAgent;
    private double student_BackAmount1;
    private Date student_Date1;
    private double student_BackAmount2;
    private Date student_Date2;

    public int getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(int student_Id) {
        this.student_Id = student_Id;
    }

    public String getStudent_Name() {
        return student_Name;
    }

    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }

    public Date getStudent_Date() {
        return student_Date;
    }

    public void setStudent_Date(Date student_Date) {
        this.student_Date = student_Date;
    }

    public int getStudent_Major() {
        return student_Major;
    }

    public void setStudent_Major(int student_Major) {
        this.student_Major = student_Major;
    }

    public major getParentMajor() {
        return parentMajor;
    }

    public void setParentMajor(major parentMajor) {
        this.parentMajor = parentMajor;
    }

    public double getStudent_Payment() {
        return student_Payment;
    }

    public void setStudent_Payment(double student_Payment) {
        this.student_Payment = student_Payment;
    }

    public double getStudent_Discount() {
        return student_Discount;
    }

    public void setStudent_Discount(double student_Discount) {
        this.student_Discount = student_Discount;
    }

    public double getStudent_BackAmount() {
        return student_BackAmount;
    }

    public void setStudent_BackAmount(double student_BackAmount) {
        this.student_BackAmount = student_BackAmount;
    }

    public Date getStudent_BackDate() {
        return student_BackDate;
    }

    public void setStudent_BackDate(Date student_BackDate) {
        this.student_BackDate = student_BackDate;
    }

    public int getStudent_AgentId() {
        return student_AgentId;
    }

    public void setStudent_AgentId(int student_AgentId) {
        this.student_AgentId = student_AgentId;
    }

    public agent getParentAgent() {
        return parentAgent;
    }

    public void setParentAgent(agent parentAgent) {
        this.parentAgent = parentAgent;
    }

    public double getStudent_BackAmount1() {
        return student_BackAmount1;
    }

    public void setStudent_BackAmount1(double student_BackAmount1) {
        this.student_BackAmount1 = student_BackAmount1;
    }

    public Date getStudent_Date1() {
        return student_Date1;
    }

    public void setStudent_Date1(Date student_Date1) {
        this.student_Date1 = student_Date1;
    }

    public double getStudent_BackAmount2() {
        return student_BackAmount2;
    }

    public void setStudent_BackAmount2(double student_BackAmount2) {
        this.student_BackAmount2 = student_BackAmount2;
    }

    public Date getStudent_Date2() {
        return student_Date2;
    }

    public void setStudent_Date2(Date student_Date2) {
        this.student_Date2 = student_Date2;
    }
}
