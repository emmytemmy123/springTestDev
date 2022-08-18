package fcmb.com.good.dto;


import fcmb.com.good.model.User;
import fcmb.com.good.repo.UserRepository;
import fcmb.com.good.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.*;

@Data
@RequiredArgsConstructor
public class TestData {

    private  final UserService userService;

    private static UserRepository userRepository;
    

    public static List<User> addUser() {

        User user = new User();

        user.setName("Adeniyi");
        user.setEmail("emmy@gmail.com");
        user.setGender("Male");
        user.setPhone("09089786756");

        user = new User();
        user.setName("eMMANUEL");
        user.setEmail("TEMMY@gmail.com");
        user.setGender("Female");
        user.setPhone("09089786756");


        return List.of(user);

    }



    public static List<User> getListOfUsers() {

        User user = new User();

        user.setId(1);
        user.setName("Adeniyi");
        user.setEmail("emmy@gmail.com");
        user.setGender("Male");
        user.setPhone("09089786756");

        user = new User();
        user.setId(2);
        user.setName("Emmanuel");
        user.setEmail("temmy@gmail.com");
        user.setGender("Male");
        user.setPhone("09089786756");

        user = new User();
        user.setId(3);
        user.setName("Abiodun");
        user.setEmail("addy@gmail.com");
        user.setGender("Male");
        user.setPhone("09089786756");

        return List.of(user);
    }


    public static String getContentType() {
        return "application/json";

    }

    public static  UserRequest getUseRequest () {
        UserRequest user = new UserRequest();
        user.setId(1);
        user.setName("Abiodun");
        user.setEmail("addy@gmail.com");
        user.setGender("Male");
        user.setPhone("09089786756");

        return user;
    }


}
