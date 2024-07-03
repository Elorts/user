package com.visitormaker.user.repository;

import com.visitormaker.user.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public class UserRepository {
    public ArrayList getUserValues() {

        ArrayList listOfUsers = new ArrayList<>();

        User user1 = new User("john1", "1john123", "Amazon");
        User user2 = new User("john2", "2john123", "Yahoo");
        User user3 = new User("john3", "3john123", "Gmail");
        User user4 = new User("john4", "4john123", "Petco");
        User user5 = new User("john5", "5john123", "Ralphs");

        listOfUsers.add(user1);
        listOfUsers.add(user2);
        listOfUsers.add(user3);
        listOfUsers.add(user4);
        listOfUsers.add(user5);

        return listOfUsers;
    }
}
