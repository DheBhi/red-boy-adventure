package Main;

import objects.*;
import tile.Tile;

import javax.imageio.ImageIO;

public class AssetSetter {

    GamePanel gp;
    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }
    public void setObject() {

        //KEY TREASURE LOCATION
        gp.obj[0] = new OBJKey();
        gp.obj[0].worldX = 23 * gp.tileSize; //COLUMN
        gp.obj[0].worldY = 7 * gp.tileSize; //ROW

        gp.obj[1] = new OBJKey();
        gp.obj[1].worldX = 23 * gp.tileSize; //COLUMN
        gp.obj[1].worldY = 40 * gp.tileSize; //ROW

        gp.obj[2] = new OBJKey();
        gp.obj[2].worldX = 38 * gp.tileSize; //COLUMN
        gp.obj[2].worldY = 8 * gp.tileSize; //ROW

        //DOOR TREASURE LOCATION
        gp.obj[3] = new OBJ_Door();
        gp.obj[3].worldX = 10 * gp.tileSize; //COLUMN
        gp.obj[3].worldY = 11 * gp.tileSize; //ROW

        gp.obj[4] = new OBJ_Door();
        gp.obj[4].worldX = 8 * gp.tileSize; //COLUMN
        gp.obj[4].worldY = 28 * gp.tileSize; //ROW

        gp.obj[5] = new OBJ_Door();
        gp.obj[5].worldX = 12 * gp.tileSize; //COLUMN
        gp.obj[5].worldY = 22 * gp.tileSize; //ROW
        gp.obj[5].collision=true;

        //CHEST TREASURE LOCATION
        gp.obj[6] = new OBJ_Chest();
        gp.obj[6].worldX = 10 * gp.tileSize; //COLUMN
        gp.obj[6].worldY = 7 * gp.tileSize;  //ROW

        //BOOTS TREASURE LOCATION
        gp.obj[7] = new OBJ_Boots();
        gp.obj[7].worldX = 37 * gp.tileSize; //COLUMN
        gp.obj[7].worldY = 42 * gp.tileSize;  //ROW

//        gp.obj[8] = new OBJ_Diamond();
//        gp.obj[8].worldX = 24 * gp.tileSize; //COLUMN
//        gp.obj[8].worldY = 36 * gp.tileSize;  //ROW
//
//        gp.obj[9] = new OBJ_ManCrystal();
//        gp.obj[9].worldX = 23 * gp.tileSize; //COLUMN
//        gp.obj[9].worldY = 22 * gp.tileSize;  //ROW
//
//        gp.obj[10] = new OBJ_ManCrystal();
//        gp.obj[10].worldX = 23 * gp.tileSize; //COLUMN
//        gp.obj[10].worldY = 23 * gp.tileSize;  //ROW
//
//        gp.obj[11] = new OBJ_ManCrystal();
//        gp.obj[11].worldX = 23 * gp.tileSize; //COLUMN
//        gp.obj[11].worldY = 24 * gp.tileSize;  //ROW
//
//        gp.obj[12] = new OBJ_ManCrystal();
//        gp.obj[12].worldX = 23 * gp.tileSize; //COLUMN
//        gp.obj[12].worldY = 25 * gp.tileSize;  //ROW
//
//        gp.obj[13] = new OBJ_ManCrystal();
//        gp.obj[13].worldX = 23 * gp.tileSize; //COLUMN
//        gp.obj[13].worldY = 26 * gp.tileSize;  //ROW
//
//        gp.obj[14] = new OBJ_ManCrystal();
//        gp.obj[14].worldX = 23 * gp.tileSize; //COLUMN
//        gp.obj[14].worldY = 27 * gp.tileSize;  //ROW
//
//        gp.obj[15] = new OBJ_ManCrystal();
//        gp.obj[15].worldX = 23 * gp.tileSize; //COLUMN
//        gp.obj[15].worldY = 28 * gp.tileSize;  //ROW

    }
}
