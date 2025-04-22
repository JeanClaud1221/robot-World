package za.co.wethinkcode;

import org.junit.jupiter.api.Test;
import za.co.wethinkcode.Logic.User;
import za.co.wethinkcode.Logic.UserList;

public class UserListTest {
    @Test
    void testOneUser(){
        User user1=new User("jc");
        UserList ls=new UserList();
        ls.addUser(user1);
        ls.displayUsers();
    }
    @Test
    void testTwoUsers(){
        User user1=new User("jc");
        User user2=new User("jz");
        UserList ls=new UserList();
        ls.addUser(user1);
        ls.addUser(user2);
        ls.displayUsers();

    }
}
