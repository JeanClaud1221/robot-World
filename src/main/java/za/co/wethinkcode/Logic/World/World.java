package za.co.wethinkcode.Logic.World;

import za.co.wethinkcode.Logic.Position;
import za.co.wethinkcode.Logic.World.Obstacle.Obstacle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class World {
    private int WIDTH=5;
    private int HEIGHT=5;
//    Remember to change object to Robot once the robot has been implemented
    private HashMap<String,Object> listOfRobots=new HashMap<>();
    private HashMap<Position,Obstacle> listOfObstacle=new HashMap<>();

    public void addRobot(String name,Object robot){
        listOfRobots.put(name,robot);
    }

    private boolean isInWorld(Position pos){
        return (pos.getX()>=0&&pos.getX()<=WIDTH)&&(pos.getY()>=0&&pos.getY()<=HEIGHT);
    }
}
