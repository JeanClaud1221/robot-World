package za.co.wethinkcode.Logic.World.Obstacle;

import za.co.wethinkcode.Logic.Position;

abstract public class Obstacle {

    obstacleType type;
    Position position;
    public Obstacle(obstacleType type,Position pos){
        this.type=type;
        this.position=pos;

    }
// Remember to change this method
    abstract public void robotCollision(Object robot);

    public Position getObstaclePosition() {
        return position;
    }
    public obstacleType getType() {
        return type;
    }
}
