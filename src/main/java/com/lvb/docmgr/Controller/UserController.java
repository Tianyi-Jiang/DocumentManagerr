package com.lvb.docmgr.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class UserController {
    @RequestMapping(path = "/user/check", method = RequestMethod.POST)
    @ResponseBody
    String checkUser(@RequestParam("username") String username) {
        User user = userService.getUserByUsername(username);
        if (user != null) {
            return "invalid";
        } else {
            return "valid";
        }
    }
}
