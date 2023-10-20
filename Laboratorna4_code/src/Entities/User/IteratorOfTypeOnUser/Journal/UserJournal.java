package Entities.User.IteratorOfTypeOnUser.Journal;

import Entities.User.IteratorOfTypeOnUser.User.User;
import Entities.User.IteratorOfTypeOnUser.UserIterators.IteratorOfTypeOfUsersOfJournal;
import Entities.User.IteratorOfTypeOnUser.UserIterators.UserIterator;
import java.util.ArrayList;
import java.util.List;

public class UserJournal implements UserJournalInterface {
    private List<User> users;

    public UserJournal(List<User> cache) {
        if (cache != null) {
            this.users = cache;
        } else {
            this.users = new ArrayList<>();
        }
    }

    public User requestUserFromUserJournal(String userName) {

        simulateNetworkLatency();
        System.out.println("User journal: Loading user '" + userName + "' over the journal...");

        return findUser(userName);
    }


    public List<String> requestUserFriendsFromUserJournal(String userName, String contactType) {
        simulateNetworkLatency();
        System.out.println("User journal: Loading '" + contactType + "' list of '" + userName + "' over the journal...");

        User user = findUser(userName);
        if (user != null) {
            return user.getContacts(contactType);
        }
        return null;
    }



    private User findUser(String userName) {
        for (User user : users) {
            if (user.getName().equals(userName)) {
                return user;
            }
        }
        return null;
    }


    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public UserIterator createFriendsIterator(String userName) {
        return new IteratorOfTypeOfUsersOfJournal(this, "friends", userName);
    }

    @Override
    public UserIterator createCoworkersIterator(String userName) {
        return new IteratorOfTypeOfUsersOfJournal(this, "coworkers", userName);
    }
}
