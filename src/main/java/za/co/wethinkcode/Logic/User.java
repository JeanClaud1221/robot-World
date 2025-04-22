package za.co.wethinkcode.Logic;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String name;
    private int id=0;
    private static int idCounter=0;


    public User(String name) {
        this.name = name;
        idCounter++;
        id=idCounter;
    }
    @Override
    public String toString(){
        return "[Name:"+name+"\n" + "Id:" + String.valueOf(id)+"]";
    }

}
