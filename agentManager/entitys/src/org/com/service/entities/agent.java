package org.com.service.entities;

import java.util.Date;
import java.util.List;

public class agent  {

    private int agent_Id;
    private  String agent_Name;
    private String agent_Phone;
    private String agent_Pwd;
    private int agent_City;
    private String agent_Address;
    private int agent_Parent_Id;
    private Date agent_CreateDate;
    private String agent_Img;
    private city parentCity;
    private List<student> childStus;

    public city getParentCity() {
        return parentCity;
    }

    public void setParentCity(city parentCity) {
        this.parentCity = parentCity;
    }

    public int getAgent_Id() {
        return agent_Id;
    }

    public void setAgent_Id(int agent_Id) {
        this.agent_Id = agent_Id;
    }

    public String getAgent_Name() {
        return agent_Name;
    }

    public void setAgent_Name(String agent_Name) {
        this.agent_Name = agent_Name;
    }

    public String getAgent_Phone() {
        return agent_Phone;
    }

    public void setAgent_Phone(String agent_Phone) {
        this.agent_Phone = agent_Phone;
    }

    public String getAgent_Pwd() {
        return agent_Pwd;
    }

    public void setAgent_Pwd(String agent_Pwd) {
        this.agent_Pwd = agent_Pwd;
    }

    public int getAgent_City() {
        return agent_City;
    }

    public void setAgent_City(int agent_City) {
        this.agent_City = agent_City;
    }

    public String getAgent_Address() {
        return agent_Address;
    }

    public void setAgent_Address(String agent_Address) {
        this.agent_Address = agent_Address;
    }

    public int getAgent_Parent_Id() {
        return agent_Parent_Id;
    }

    public void setAgent_Parent_Id(int agent_Parent_Id) {
        this.agent_Parent_Id = agent_Parent_Id;
    }

    public Date getAgent_CreateDate() {
        return agent_CreateDate;
    }

    public void setAgent_CreateDate(Date agent_CreateDate) {
        this.agent_CreateDate = agent_CreateDate;
    }

    public String getAgent_Img() {
        return agent_Img;
    }

    public void setAgent_Img(String agent_Img) {
        this.agent_Img = agent_Img;
    }

    public List<student> getChildStus() {
        return childStus;
    }

    public void setChildStus(List<student> childStus) {
        this.childStus = childStus;
    }
}
