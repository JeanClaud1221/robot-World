package za.co.wethinkcode.Logic;

import java.util.Objects;

public class Position {
    private int x;
    private int y;
    public Position(int x ,int y){
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Position updatePosition(Position pos){
        x=this.x+pos.getX();
        y=this.y+pos.getY();
        return new Position(x,y);
    }
    public Position updatePosition(int x,int y){
        return new Position(this.x+x,this.y+y);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
