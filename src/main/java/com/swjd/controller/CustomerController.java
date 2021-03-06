package com.swjd.controller;

import com.swjd.bean.Customer;
import com.swjd.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/CC")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    //能够跳转到主页面，并且带数据
    @RequestMapping("/toMain")
    public String toMain(Model model){
        List<Customer> list=new ArrayList<>();
        Customer customer=new Customer();
        list=customerService.getAll();
        model.addAttribute("customer",customer);
        model.addAttribute("list",list);

        return "main";
    }

}
