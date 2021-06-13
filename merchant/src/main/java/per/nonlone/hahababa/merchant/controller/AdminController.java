package per.nonlone.hahababa.merchant.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class AdminController {

    @PostMapping("/admin/register")
    public Object register(Object request){
        return null;
    }


    @PostMapping("/admin/login")
    public Object login(Object request){
        return null;
    }


    @PostMapping("/admin/logout")
    public Object logout(Object request){
        return null;
    }

    @PostMapping("/admin/index")
    public Object index(Object request){
        return null;
    }

    @PostMapping("/admin/menu")
    public Object menu(Object request){
        return null;
    }


    @PostMapping("/admin/user")
    public Object user(Object request){
        return null;
    }


}
