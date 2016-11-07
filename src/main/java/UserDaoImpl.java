package main.java;

import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoImpl{

    @Autowired
    private UserService userService;
    
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
}
