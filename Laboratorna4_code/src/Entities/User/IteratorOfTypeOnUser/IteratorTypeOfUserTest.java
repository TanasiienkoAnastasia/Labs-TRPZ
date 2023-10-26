package Entities.User.IteratorOfTypeOnUser;

import Entities.User.IteratorOfTypeOnUser.User.User;
import Entities.User.IteratorOfTypeOnUser.Greeter.UserGreeter;
import Entities.User.IteratorOfTypeOnUser.Journal.UserJournalInterface;
import Entities.User.IteratorOfTypeOnUser.Journal.UserJournal;

import java.util.ArrayList;
import java.util.List;

public class IteratorTypeOfUserTest {

    public static void main(String[] args) {

        UserJournalInterface journal;
        journal = new UserJournal(createTestUsers());

        UserGreeter greeter = new UserGreeter(journal);
        greeter.sendGreetToFriends("Nastya", "Greetings, friend!!");
        greeter.sendGreetToCoworkers("Andriy", "Greetings, coworker!!");

        for (User person : createTestUsers()) {
            System.out.println("Name: " + person.getName() + ", Gender: " + person.getSex());
        }


    }

    public static List<User> createTestUsers() {
        List<User> data = new ArrayList<>();
        data.add(new User("Nastya", "1234Jop", "female", "friends:Andriy", "coworkers:ALina"));
        data.add(new User("Andriy", "09338Uty", "male","friends:Dina", "coworkers:Petro"));
        data.add(new User("Petro", "02933Yup", "male","friends:Helen", "coworkers:Petro"));
        data.add(new User("ALina", "89584Hop", "male","friends:Dina", "coworkers:Nastya"));
        data.add(new User("Dina", "9203Jut", "male","friends:Nastya", "coworkers:Helen"));
        data.add(new User("Helen", "9382Hew", "male","friends:Nastya", "coworkers:"));
        return data;
    }



}
