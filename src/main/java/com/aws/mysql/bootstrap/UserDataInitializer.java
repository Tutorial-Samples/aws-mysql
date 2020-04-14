package com.aws.mysql.bootstrap;

import com.aws.mysql.domain.User;
import com.aws.mysql.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: UserDataInitializer
 * Inside the package - com.aws.mysql.bootstrap
 * Created Date: 4/12/2020
 * Created Time: 4:55 PM
 **/
@Component
public class UserDataInitializer implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("About to insert a user");
        loadUsers();
        System.out.println("After inserting a user");
    }

    private void loadUsers(){
        saveUser(createUser("Balaji Varadharajan"));
        saveUser(createUser("Pooja Mohanakrishnan"));
        saveUser(createUser("Jiana Balaji"));
        saveUser(createUser("Joy"));
    }

    private User createUser(String name){
        return User.builder().userName(name).build();
    }
    private void saveUser(User user){
        userRepository.save(user);
    }
}
