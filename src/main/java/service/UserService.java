package service;

import entity.User;
import exceptions.UserNotFoundException;
import impl.UserRepositoryImpl;
import repository.UserRepository;
//SOLID
public class UserService {

    // UserService depends on UserRepository
    private final UserRepository userRepository;

//    public UserService(){
//        userRepository = new UserRepositoryImpl();
//    }
//
    // Dependency Injection
    //tight coupling (bad practice)
//   public UserService(){
//        userRepository = new UserRepositoryImpl();
//   }

    //loose coupling (good practice)
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void addUser(User user){
      userRepository.addUser(user);
    }

   public User loginUser(String username,String password){
        User user = userRepository.getUserByUsername(username);

        if(user.getPassword().equals(password)){
            System.out.println("Welcome back "+username+"! ");
            return user;
        } else {
            throw  new UserNotFoundException("Invalid username or password");
        }
   }
}
