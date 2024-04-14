import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle{

    int id; // either 1 or 2 for player 1 or 2
    int yVelocity; // how fast paddle is moving
    int speed = 10;
    


    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id){
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = id;

    }
    public void keyPressed(KeyEvent e){
        switch(id){
            case 1: 
                if(e.getKeyCode() == KeyEvent.VK_W){ // if someone types in w on their key board it will execute this block of code
                    setYDirection(-speed); // move up on yaxis
                    move();
                }
                if(e.getKeyCode() == KeyEvent.VK_S){ // if someone types in w on their key board it will execute this block of code
                    setYDirection(speed); // move up on yaxis
                    move();
                }
                break;
                case 2: 
                if(e.getKeyCode() == KeyEvent.VK_UP){ // if someone types in w on their key board it will execute this block of code
                    setYDirection(-speed); // move up on yaxis
                    move();
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN){ // if someone types in w on their key board it will execute this block of code
                    setYDirection(speed); // move up on yaxis
                    move();
                }
                break;
        }
    }
    public void keyReleased(KeyEvent e){
        switch(id){
            case 1: 
                if(e.getKeyCode() == KeyEvent.VK_W){ // if someone types in w on their key board it will execute this block of code
                    setYDirection(0); // move up on yaxis
                    move();
                }
                if(e.getKeyCode() == KeyEvent.VK_S){ // if someone types in w on their key board it will execute this block of code
                    setYDirection(0); // move up on yaxis
                    move();
                }
                break;
                case 2: 
                if(e.getKeyCode() == KeyEvent.VK_UP){ // if someone types in w on their key board it will execute this block of code
                    setYDirection(0); // move up on yaxis
                    move();
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN){ // if someone types in w on their key board it will execute this block of code
                    setYDirection(0); // move up on yaxis
                    move();
                }
                break;
        }
    }

    public void setYDirection(int yDirection){
        yVelocity = yDirection;
    }
    public void move(){
        y = y + yVelocity;
    }
    public void draw(Graphics g){
        if(id == 1) //player 1
            g.setColor(Color.blue);
        else
            g.setColor(Color.red);
        g.fillRect(x, y, width, height);
        }
    }


