package entity;

import Main.GamePanel;
import Main.KeyHandler;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Player extends Entity {
    GamePanel gp;
    KeyHandler keyH;
    public final int screenX;
    public final int screenY;
    public int hasKey = 0;//No of keys the player currently has
    public Player(GamePanel gp, KeyHandler keyH) {

        this.gp = gp;
        this.keyH = keyH;

        screenX = gp.screenWidth / 2 - (gp.tileSize / 2);//Final Variables for fixed screen
        screenY = gp.screenHeight / 2 - (gp.tileSize / 2);//Final Variables for fixed screen

        solidArea = new Rectangle();
        solidArea.x = 8;
        solidArea.y = 16;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width = 32;
        solidArea.height = 32;

        setDefaultValues();
        getPlayerImage();
    }

    public void setDefaultValues() {

        worldX = gp.tileSize * 23;
        worldY = gp.tileSize * 21;
        speed = 4;
        direction = "down";

    }

    public void getPlayerImage() {
        try {
//            down1 = ImageIO.read(getClass().getResourceAsStream("/player/redboydown1.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("/player/boy_down_1.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/player/boy_down_2.png"));
//            down2 = ImageIO.read(getClass().getResourceAsStream("/player/redboydown2.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/player/boy_left_1.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/player/boy_left_2.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/player/boy_right_1.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/player/boy_right_2.png"));
            up1 = ImageIO.read(getClass().getResourceAsStream("/player/boy_up_1.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/player/boy_up_2.png"));


////            up1 = ImageIO.read(getClass().getResourceAsStream("/player/ball1.png"));
////            up2 = ImageIO.read(getClass().getResourceAsStream("/player/ball1.png"));
////            down1 = ImageIO.read(getClass().getResourceAsStream("/player/ball2.png"));
////            down2 = ImageIO.read(getClass().getResourceAsStream("/player/ball2.png"));
////            left1 = ImageIO.read(getClass().getResourceAsStream("/player/ball3.png"));
////            left2 = ImageIO.read(getClass().getResourceAsStream("/player/ball3.png"));
////            right1 = ImageIO.read(getClass().getResourceAsStream("/player/ball4.png"));
////            right2 = ImageIO.read(getClass().getResourceAsStream("/player/ball4.png"));
//
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void update() {

        if (keyH.upPressed == true || keyH.DownPressed == true ||
                keyH.leftPressed == true || keyH.rightPressed == true) {

            if (keyH.upPressed == true) {
                direction = "up";
            } else if (keyH.DownPressed == true) {
                direction = "down";
            }
            if (keyH.leftPressed == true) {
                direction = "left";
            } else if (keyH.rightPressed == true) {
                direction = "right";
            }

            //CHECK TILE COLLISION
            collisionOn = false;
            gp.cChecker.checkTile(this);

            //CHECK OBJECT COLLISION
            int objIndex = gp.cChecker.checkObject(this, true);
            pickUpObject(objIndex);

            //IF COLLISION IS FALSE, PLAYER CAN MOVE
            if (collisionOn == false) {

                switch (direction) {
                    case "up":
                        worldY -= speed;
                        break;
                    case "down":
                        worldY += speed;
                        break;
                    case "left":
                        worldX -= speed;
                        break;
                    case "right":
                        worldX += speed;
                        break;
                }
            }

            spriteCounter++;

            if (spriteCounter > 15) {
                if (spriteNumber == 1) {
                    spriteNumber = 2;
                } else if (spriteNumber == 2) {
                    spriteNumber = 1;
                }
                spriteCounter = 0;
            }
        }
    }
    public void pickUpObject(int i) {

        if (i != 999) {//Index is 999, we didn't touch any object else, we have touched an object
            String objectName = gp.obj[i].name;

            switch (objectName) {
                case "Key":
                    gp.playSE(1);
                    hasKey++;
                    gp.obj[i] = null;
                    gp.ui.showMessage("You got a key!");
                    break;

                case "Door":
                    if (hasKey > 0) {
                        gp.playSE(3);
                        gp.obj[i] = null;
                        hasKey--;
                        gp.ui.showMessage("You opened the door");
                    } else {
                        gp.ui.showMessage("You need a key");
                    }
                    break;

                case "Boots":
                    gp.playSE(2);
                    speed += 1;
                    gp.obj[i] = null;
                    gp.ui.showMessage("speed up!");
                    break;

                case "Chest":
                    gp.ui.gameFinished = true;
                    gp.stopMusic();
                    gp.playSE(4);
                    break;
            }
        }
    }
//    public void move(){
//           for (int i=bodyParts; i>0; i--){
//        gp.x[i] = gp.x[i-1];
//        gp.y[i] = gp.y[i-1];
//    }
//
//           switch (direction){
//               case "U":
//                   gp.y[0] = gp.y[0]- gp.tileSize;
//                   break;
//
//               case "D":
//                   gp.y[0] = gp.y[0]+ gp.tileSize;
//                   break;
//
//               case "L":
//                   gp.x[0] = gp.x[0]- gp.tileSize;
//                   break;
//
//               case "R":
//                   gp.x[0] = gp.x[0]+ gp.tileSize;
//                   break;
//           }
//    }

    public void draw(Graphics2D g2) {
//        if (running){
//            for (int i= 0; i< bodyParts; i++){
//                if (i== 0){
//                    g2.setColor(Color.white);
//                    g2.fillOval(screenX, screenY, gp.tileSize, gp.tileSize);
//                }
//            else {
//                g2.setColor(new Color(6, 67, 175));
//                g2.fillOval(screenX, screenY,gp.tileSize, gp.tileSize);
//            }
//        }
//
//        }

        BufferedImage Image = null;

        switch (direction) {
            case "up":
                if (spriteNumber == 1) {
                    Image = up1;
                }
                if (spriteNumber == 2) {
                    Image = up2;
                }
                break;
            case "down":
                if (spriteNumber == 1) {
                    Image = down1;
                }
                if (spriteNumber == 2) {
                    Image = down2;
                }
                break;
            case "left":
                if (spriteNumber == 1) {
                    Image = left1;
                }
                if (spriteNumber == 2) {
                    Image = left2;
                }
                break;
            case "right":
                if (spriteNumber == 1) {
                    Image = right1;
                }
                if (spriteNumber == 2) {
                    Image = right2;
                }
                break;
        }

        g2.drawImage(Image, screenX, screenY, gp.tileSize, gp.tileSize, null);

    }

}

