package za.co.wethinkcode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import za.co.wethinkcode.Logic.Position;

public class PositionTest {
    @Test
    void testNewPos(){
        Position test=new Position(0,0);
        assertEquals(0,test.getX());
        assertEquals(0,test.getY());
    }
    @Test
    void updatePos(){
        Position test=new Position(0,0);
        Position res=test.updatePosition(1,1);

        assertEquals(1,res.getX());
        assertEquals(1,res.getY());
        res=test.updatePosition(4,4);
        assertEquals(4,res.getX());
        assertEquals(4,res.getY());

    }
}
