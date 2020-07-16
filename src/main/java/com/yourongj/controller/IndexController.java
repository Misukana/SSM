package com.yourongj.controller;

import com.yourongj.model.Employ;
import com.yourongj.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/employ")
public class IndexController {
    @Autowired
    EmpService empService;
    @RequestMapping("/find")
    public String findAll(Model model){
        System.out.println("查询全部员工");
        List<Employ> list = empService.findAll();
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/save")
    public void save(Employ employ, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        empService.saveEmploy(employ);
        httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/employ/find");
    }

}
