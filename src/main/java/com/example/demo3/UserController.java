package com.example.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService us;

    @ResponseBody
    @GetMapping("/user")
    public List<User> List(){
        return this.us.List();
    }

    @GetMapping("user/view/{id}")
    public User view(@PathVariable String id){
        return this.us.view(id);
    }

    @PostMapping("user/abc")
    @ResponseBody
    public boolean add(@RequestBody User user){
        return this.us.add(user);
    }

    @PutMapping("/user/put")
    @ResponseBody
    public User update(@RequestBody User user){
        return this.us.update(user);
    }

    @DeleteMapping("user/delete/{id}")
    @ResponseBody
    public boolean delete(@PathVariable String id){
        return this.us.delete(id);
    }
}
