package com.mrfan.Controller;

import com.mrfan.Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @ModelAttribute
    public void getModel(String loginname, String password, Model model) {
        User user = new User();
        user.setLoginName(loginname);
        user.setPassword(password);
        model.addAttribute("user", user);
    }
@RequestMapping(value = "/login1new")
    public String getResult(Model model) {
        User user= (User) model.asMap().get("user");
        System.out.println(user);
        user.setUsername("测试");
        return "result";
    }
}
