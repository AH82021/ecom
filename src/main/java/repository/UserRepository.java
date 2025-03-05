package repository;

import entity.User;
import exceptions.DuplicateUserException;
import exceptions.UserNotFoundException;


//Define  operations for User data (entity)
public interface UserRepository {
    void addUser(User user) throws DuplicateUserException;

    User  getUserByUsername(String username) throws UserNotFoundException;

}
