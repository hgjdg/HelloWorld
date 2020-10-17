package com.example.demo.dao;

import com.example.demo.entity.User_Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IUser_AccountDao {
    List<User_Account> getAccounts(User_Account user_account);
//    User_Account getAccountById(int id);
    User_Account getAccountByUserCode(String user_code);
//
//    int insert(User_Account account);
//    int delete(String id);
//    int update(User_Account account);
}
