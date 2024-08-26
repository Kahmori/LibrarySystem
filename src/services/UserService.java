package services;

import java.util.ArrayList;
import java.util.List;

import models.User;

public class UserService {

  private List<User> users;

  public UserService(){
    users = new ArrayList<>();
  }

  public void addUser(User user){
    users.add(user);
  }

  public void listUsers(){
    for (User user : users) {
      System.out.println(user);
      }
  }
}
