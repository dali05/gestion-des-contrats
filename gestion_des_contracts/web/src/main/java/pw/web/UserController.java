package pw.web;

import business.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import user.reposetory.UserReposetory;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserReposetory userReposetory;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> getUser(){

        return this.userReposetory.findAll();
    }
}
