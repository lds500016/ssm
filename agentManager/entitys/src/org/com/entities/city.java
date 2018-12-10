package org.com.entities;

import java.util.List;

public class city {

    private int city_Id;
    private String city_Name;
    private String city_Parent_Id;
    private city parentCity;
    private List<city>  childCitys;
    private List<admin> childAdmins;
    private List<agent> childAgents;

    public List<agent> getChildAgents() {
        return childAgents;
    }

    public void setChildAgents(List<agent> childAgents) {
        this.childAgents = childAgents;
    }

    public int getCity_Id() {
        return city_Id;
    }

    public void setCity_Id(int city_Id) {
        this.city_Id = city_Id;
    }

    public String getCity_Name() {
        return city_Name;
    }

    public void setCity_Name(String city_Name) {
        this.city_Name = city_Name;
    }

    public String getCity_Parent_Id() {
        return city_Parent_Id;
    }

    public void setCity_Parent_Id(String city_Parent_Id) {
        this.city_Parent_Id = city_Parent_Id;
    }

    public city getParentCity() {
        return parentCity;
    }

    public void setParentCity(city parentCity) {
        this.parentCity = parentCity;
    }

    public List<city> getChildCitys() {
        return childCitys;
    }

    public void setChildCitys(List<city> childCitys) {
        this.childCitys = childCitys;
    }

    public List<admin> getChildAdmins() {
        return childAdmins;
    }

    public void setChildAdmins(List<admin> childAdmins) {
        this.childAdmins = childAdmins;
    }
}
