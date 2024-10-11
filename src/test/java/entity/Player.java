package entity;

import Main.GamePanel;
import Main.KeyHandler;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends Entity {
    KeyHandler keyH;
    public int screenX;
    public int screenY;
    int standCounter = 0;
    boolean moving = false;
    int pixelCounter = 0;

    public Player(GamePanel gp, KeyHandler keyH) {

        super(gp);

        this.keyH = keyH;
        int bodyParts = 3;

        screenX = gp.screenWidth / 2 - (gp.tileSize / 2);//Final Variables for fixed screen
        screenY = gp.screenHeight / 2 - (gp.tileSize / 2);//Final Variables for fixed screen

        int partX[] = new int[bodyParts];
        int partY[] = new int[bodyParts];

        solidArea = new Rectangle();
        solidArea.x = 1;
        solidArea.y = 1;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width = 46;
        solidArea.height = 46;


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
        up1 = setup("/player/boy_up_1");
        up2 = setup("/player/boy_up_2");
        down1 = setup("/player/boy_down_1");
        down2 = setup("/player/boy_down_2");
        left1 = setup("/player/boy_left_1");
        left2 = setup("/player/boy_left_2");
        right1 = setup("/player/boy_right_1");
        right2 = setup("/player/boy_right_2");
    }

    public void update() {

        if (!moving) {
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
                moving = true;

                //CHECK TILE COLLISION
                collisionOn = false;
                gp.cChecker.checkTile(this);

                //CHECK OBJECT COLLISION
                int objIndex = gp.cChecker.checkObject(this, true);
                pickUpObject(objIndex);

                //CHECK NPC COLLISION
                int npcIndex = gp.cChecker.checkEntity(this, gp.npc);
                interactNPC(npcIndex);

            } else {
                spriteCounter++;

                if (spriteCounter == 20) {
                    spriteNumber = 1;
                    spriteCounter = 0;
                }
            }
        }

        if (moving == true) {

            //IF COLLISION IS FALSE, PLAYER CAN MOVE
            if (collisionOn == false) {

                switch (direction) {
                    case "up":
                        worldY -= speed; break;
                    case "down":
                        worldY += speed; break;
                    case "left":
                        worldX -= speed; break;
                    case "right":
                        worldX += speed; break;
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
            pixelCounter += speed;
            if (pixelCounter == 48) {
                moving = false;
                pixelCounter = 0;
            }

        }
    }


    public void pickUpObject(int i) {

        if (i != 999) {//Index is 999, we didn't touch any object else, we have touched an object

        }
    }
    public void interactNPC(int i ) {
        if (i != 999) {

            if (gp.keyH.enterPressed) {
                gp.gameState = gp.dialogueState;
                gp.npc[i].speak();
            }
        }
        gp.keyH.enterPressed = false;
    }


    public void draw(Graphics2D g2) {

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

//        g2.drawImage(Image, screenX, screenY, gp.tileSize, gp.tileSize, null);
        g2.drawImage(Image, screenX, screenY,null);


        }
    }


