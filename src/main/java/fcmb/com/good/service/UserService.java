package fcmb.com.good.service;

import fcmb.com.good.model.User;

public interface UserService {

    public User getUserById(int id);

    public User saveUser(User user);

}


