package service;

import entity.User;
import impl.UserRepositoryImpl;
import repository.UserRepository;
//SOLID
public class UserService {

    // UserService depends on UserRepository
    private UserRepository userRepository;

//    public UserService(){
//        userRepository = new UserRepositoryImpl();
//    }
//
    // Dependency Injection
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void addUser(User user){
      userRepository.addUser(user);
    }
}
