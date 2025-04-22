package za.co.wethinkcode.Logic.World.Obstacle;

import za.co.wethinkcode.Logic.Position;

public class Lake extends Obstacle{
    public Lake(Position pos){
        super(obstacleType.LAKE,pos);
    }
    public Lake(int x, int y){
        super(obstacleType.LAKE,new Position(x,y));
    }
}
