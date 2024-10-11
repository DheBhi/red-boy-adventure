package entity;

import Main.GamePanel;
import Main.UtilityTool;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Entity {
    GamePanel gp;
    public  int worldX;
        public int worldY;
    public  int speed;

    public BufferedImage up1, up2, down1, down2, left1, left2, right1, right2;
    public  String direction;
    public int spriteCounter = 0;
    public int spriteNumber = 1;
    public Rectangle solidArea = new Rectangle(0, 0, 48, 48);
    public int solidAreaDefaultX, solidAreaDefaultY;
    public boolean collisionOn = false;
    public int actionLockCounter = 0;
    String dialogues[] = new String[20];
    int dialogueIndex = 0;

    public Entity(GamePanel gp){
        this.gp = gp;
    }
    public void setAction() {}
    public void speak(){}

    public void update() {
        setAction();

        collisionOn = false;
        gp.cChecker.checkTile(this);
        gp.cChecker.checkObject(this, false);
        gp.cChecker.checkPLayer(this);

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
    }

    public void draw(Graphics2D g2){

        BufferedImage Image = null;
        int screenX = worldX - gp.player.worldX + gp.player.screenX;
        int screenY = worldY - gp.player.worldY + gp.player.screenY;

        if (worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
                worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
                worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
                worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {

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
    public BufferedImage setup(String imagePath) {
        UtilityTool uTool = new UtilityTool();
        BufferedImage image = null;
        try {
            image = ImageIO.read(getClass().getResourceAsStream( imagePath + ".png"));
            image = uTool.scaleImage(image, gp.tileSize, gp.tileSize);

        }catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
}
