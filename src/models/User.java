package models;

public class User {

  private String name;
  private String id;

  public User(String name, String id){
    this.name = name;
    this.id = id;
  }

  public String getName(){
    return name;
  }

  public String getId(){
    return id;
  }

  @Override
  public String toString(){
    return "User{" +
           "name='" + name + '\'' +
           ", id='" + id + '\'' +
           '}';
    }
}