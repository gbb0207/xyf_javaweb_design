package com.xyf.demo.service;

import com.xyf.demo.bean.Admin;

public interface AdminService {

    Admin adminLogin(String AdminId, String AdminPass);
}
