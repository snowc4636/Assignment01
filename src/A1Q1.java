
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a city for the robot to live in
        City kw = new City();
        
        // make walls
        new Wall(kw,2, 1, Direction.SOUTH);
        new Wall(kw,2, 2, Direction.SOUTH);
        new Wall(kw,2, 2, Direction.EAST);
        new Wall(kw,1, 2, Direction.EAST);
        new Wall(kw,1, 2, Direction.NORTH);
        new Wall(kw,1, 1, Direction.NORTH);
        new Wall(kw,2, 1, Direction.WEST);
        new Wall(kw,1, 1, Direction.WEST);
        
        // Make the robot to live in the city
        Robot Jasper = new Robot(kw,0, 2, Direction.WEST);
        Jasper.move();
        Jasper.move();
        Jasper.turnLeft();
        Jasper.move();
        Jasper.move();
        Jasper.move();
        Jasper.turnLeft();
        Jasper.move();
        Jasper.move();
        Jasper.move();
        Jasper.turnLeft();
        Jasper.move();
        Jasper.move();
        Jasper.move();
        Jasper.turnLeft();
        Jasper.move();
        
        
        
        
        
        
        
        
        
        
        
        
        
     
        
    }
}
