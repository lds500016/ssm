package org.com.service;


import org.com.dao.IAdminDao;
import org.com.entities.admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminService {

    @Resource
    private IAdminDao ad;

    public void setAd(IAdminDao ad) {
        this.ad = ad;
    }

    public admin Login(admin a){
        return ad.Login(a);
    }
}
