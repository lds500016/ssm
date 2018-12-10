package org.com.service.entities;

public class admin {

    private int admin_Id;
    private String admin_UserName;
    private String admin_Pwd;
    private int admin_Role;
    private int admin_City;
    private city parentCity;

    public city getParentCity() {
        return parentCity;
    }

    public void setParentCity(city parentCity) {
        this.parentCity = parentCity;
    }

    public int getAdmin_Id() {
        return admin_Id;
    }

    public void setAdmin_Id(int admin_Id) {
        this.admin_Id = admin_Id;
    }

    public String getAdmin_UserName() {
        return admin_UserName;
    }

    public void setAdmin_UserName(String admin_UserName) {
        this.admin_UserName = admin_UserName;
    }

    public String getAdmin_Pwd() {
        return admin_Pwd;
    }

    public void setAdmin_Pwd(String admin_Pwd) {
        this.admin_Pwd = admin_Pwd;
    }

    public int getAdmin_Role() {
        return admin_Role;
    }

    public void setAdmin_Role(int admin_Role) {
        this.admin_Role = admin_Role;
    }

    public int getAdmin_City() {
        return admin_City;
    }

    public void setAdmin_City(int admin_City) {
        this.admin_City = admin_City;
    }
}
