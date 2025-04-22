package za.co.wethinkcode.Logic.World.Obstacle;

import za.co.wethinkcode.Logic.Position;

public class BottomLessPit extends Obstacle{
    public BottomLessPit(Position pos){
        super(obstacleType.BOTTOMLESSPIT,pos);
    }
    public BottomLessPit(int x,int y){
        super(obstacleType.BOTTOMLESSPIT,new Position(x,y));
    }
}
