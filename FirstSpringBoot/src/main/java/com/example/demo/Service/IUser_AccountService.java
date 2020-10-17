package com.example.demo.Service;

import com.example.demo.entity.User_Account;

import java.util.List;

public interface IUser_AccountService {
    public List<User_Account> getAccounts(int pageCount,int pageSize);
    boolean Login(String userCode,String password);
}
