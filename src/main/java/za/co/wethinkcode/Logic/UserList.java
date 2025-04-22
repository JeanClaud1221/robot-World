package za.co.wethinkcode.Logic;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    private List<User> listOfUsers=new ArrayList<>();
    public void addUser(User user){
        listOfUsers.add(user);
    }
    public List<User> getUsers(){
        return listOfUsers;
    }
    public void displayUsers(){
        for(User i :listOfUsers){
            System.out.println(i);
        }
    }
}
