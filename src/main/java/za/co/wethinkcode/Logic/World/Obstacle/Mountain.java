package za.co.wethinkcode.Logic.World.Obstacle;

import za.co.wethinkcode.Logic.Position;

public class Mountain extends Obstacle{
    public Mountain(Position pos){
        super(obstacleType.MOUNTAIN,pos);

    }
    public Mountain(int x,int y){
        super(obstacleType.MOUNTAIN,new Position(x,y));
    }


}
