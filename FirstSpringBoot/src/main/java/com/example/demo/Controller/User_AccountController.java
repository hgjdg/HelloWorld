package com.example.demo.Controller;

import com.example.demo.Service.IUser_AccountService;
import com.example.demo.Service.impl.User_AccountService;
import com.example.demo.entity.JsonResult;
import com.example.demo.entity.User_Account;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class User_AccountController {
    @Autowired
    private IUser_AccountService accountService;

    @RequestMapping("/getAccounts")
    public List<User_Account> getAccounts(@RequestParam("pageCount") int pageCount, @RequestParam("pageSize") int pageSize)
    {
        return accountService.getAccounts(pageCount,pageSize);
    }

    @PostMapping("/login")
    public JsonResult Login(@RequestParam("usercode") String usercode,@RequestParam("password") String password)
    {
        JsonResult result=new JsonResult();

        boolean bSuccess=accountService.Login(usercode,password);
        result.setCode(bSuccess?0:1);

        return  result;
    }
    @PostMapping("/login2")
    public JsonResult Login2(@RequestBody Map<Object,Object> entity)
    {
        JsonResult result=new JsonResult();

        boolean bSuccess=accountService.Login(entity.get("usercode").toString(),entity.get("password").toString());
        result.setCode(bSuccess?0:1);

        return  result;
    }
}
