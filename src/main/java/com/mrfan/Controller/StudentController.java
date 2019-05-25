package com.mrfan.Controller;

import com.mrfan.Dao.impl.StudentManager;
import com.mrfan.Entity.Stduent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class StudentController {

    private StudentManager studentManager;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String getReg(Model model, Stduent stduent) {
        System.out.println(stduent.getName());
        studentManager.addStud(stduent);
        return "result";
    }
}
