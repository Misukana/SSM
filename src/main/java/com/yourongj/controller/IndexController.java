package com.yourongj.controller;

import com.yourongj.model.Employ;
import com.yourongj.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(value="/delete",method= RequestMethod.POST)
    public String getOneStudent(@RequestParam("id")int id, Model model){

            empService.delete(id);
            model.addAttribute("message",id+"删除成功！");

        return "delete";

    }
    @RequestMapping(value="/update",method=RequestMethod.POST)
    public String update(@ModelAttribute("employ")Employ employ, Model model){
        System.out.println(employ);
        empService.update(employ);
            model.addAttribute("message",employ.getId()+"修改成功！");

        return "update";
    }

}
