package com.xyf.demo.service.impl;

import com.xyf.demo.bean.Admin;
import com.xyf.demo.mapper.AdminMapper;
import com.xyf.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin adminLogin(String AdminId, String AdminPass) {
        return adminMapper.selectAdminByIdAndPass(AdminId, AdminPass);
    }
}
