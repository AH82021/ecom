package impl;

import entity.User;
import exceptions.DuplicateUserException;
import exceptions.UserNotFoundException;
import repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {
    private static final int MAX_USERS = 100;
    User[] users = new User[MAX_USERS];
    private int userCount = 0;
    @Override
    public void addUser(User user) throws DuplicateUserException {


        for(int i=0;i<userCount;i++){
            if (users[i].getUsername().equals(user.getUsername())) {
                throw new DuplicateUserException("User already exists with username "+user.getUsername());

            }
        }

        if(userCount<MAX_USERS){
            users[userCount]=user;
            userCount++;
            System.out.println("User "+user.getUsername()+" added successfully");
        } else {
            throw new ArrayIndexOutOfBoundsException("User storage is full "+MAX_USERS);
        }


    }

    @Override
    public User getUserByUsername(String username) throws UserNotFoundException {

        for (int i = 0; i <userCount ; i++) {
            if(users[i].getUsername().equals(username)){
                return users[i];
            }
        }

        throw new UserNotFoundException("User not found with username "+username);
    }
}
