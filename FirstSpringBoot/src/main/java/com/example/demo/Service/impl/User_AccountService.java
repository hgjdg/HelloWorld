package com.example.demo.Service.impl;

import com.example.demo.Service.IUser_AccountService;
import com.example.demo.dao.IUser_AccountDao;
import com.example.demo.entity.User_Account;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class User_AccountService implements IUser_AccountService {
    @Resource
    private IUser_AccountDao accountDao;

    @Override
    public List<User_Account> getAccounts(int pageCount, int pageSize) {
       return accountDao.getAccounts(new User_Account());
    }

    @Override
    public boolean Login(String userCode, String password) {
        User_Account account=accountDao.getAccountByUserCode(userCode);
        return account!=null&&account.getUser_password()!=null&&account.getUser_password().equals(password);
    }
}
