package com.example.demo.Controller;

import com.example.demo.Service.ICompanyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Resource
    private ICompanyService  companyService;

    @RequestMapping("/getCompanies")
    public List<company2> getCompanies(){
        return  companyService.getCompanies();
    }
}
