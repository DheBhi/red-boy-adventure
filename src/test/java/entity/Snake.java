package entity;

import javax.swing.text.Segment;
import java.awt.*;
import java.util.LinkedList;

public class Snake extends Entity{
    LinkedList<Segment> body;
    int tileSize;
    Image headImage, bodyImage;

    public Snake(int x, int y, int tileSize, Image headImage,Image bodyImage){
        this.body = new LinkedList<>();
        this.body.add(new Segment(x, y));  // Head of the snake
        this.tileSize = tileSize;
        this.headImage = headImage;
        this.bodyImage = bodyImage;
    }
}
