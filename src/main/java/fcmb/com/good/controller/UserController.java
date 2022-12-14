package fcmb.com.good.controller;


import fcmb.com.good.model.User;
import fcmb.com.good.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;



    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id){
    return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);

    }


    @PostMapping("/user")
    public ResponseEntity<User> saveUser(User user){
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }


}
