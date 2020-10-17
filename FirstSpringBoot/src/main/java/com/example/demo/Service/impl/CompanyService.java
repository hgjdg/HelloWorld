package com.example.demo.Service.impl;

import com.example.demo.Service.ICompanyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CompanyService implements ICompanyService {

    @Resource
    private company2Mapper company2Mapper;

    @Override
    public List<company2> getCompanies() {
        company2Example tmp=new company2Example();
        return company2Mapper.selectByExample(tmp);
    }
}
