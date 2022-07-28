package club.kwzw.controller;

import club.kwzw.bean.User;
import club.kwzw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("success");
        List<User> all = service.findAll();
        model.addAttribute("user",all);
        return "list";
    }
}
