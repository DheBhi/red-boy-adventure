public class comments {
    //    public void run() {
//
//        double drawInterval = 1000000000 / FPS;
//        double nextDrawTime = System.nanoTime() + drawInterval;
//
//        while (gameThread != null) {
//
//            //1 UPDATE: update the information such as character positions
//            update();
//
//            //2 DRAW: draw the screen with the update information
//            repaint();
//
//
//            try {
//                double remainingTime = nextDrawTime - System.nanoTime();
//                remainingTime = remainingTime / 1000000;
//
//                if (remainingTime < 0) {
//                    remainingTime = 0;
//                }
//                Thread.sleep((long) remainingTime);
//
//                nextDrawTime += drawInterval;
//
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }
//
//    }


    //        if (keyH.upPressed == true){
//            playerY -= playerSpeed;
//        }else if (keyH.DownPressed == true) {
//            playerY += playerSpeed;
//        } else if (keyH.leftPressed == true) {
//            playerX -= playerSpeed;
//        } else if (keyH.rightPressed == true) {
//            playerX += playerSpeed;
//        }


    //                    System.out.println("here 1 row: %d col:: %d " + row);
//                    System.out.println("here 1 col: " + col);
//                    System.out.println("here 1: " + line);

    //                String line = br.readLine();

    //                    System.out.println("here 2:: " + Arrays.toString(numbers));

    //            System.out.println("here lines:: " + lines);


    ////        g2.drawImage(tile[1].image, 0, 0, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[1].image, 48, 0, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[1].image, 96, 0, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[1].image, 144, 0, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[1].image, 192, 0, gp.tileSize, gp.tileSize, null);
////
////        g2.drawImage(tile[1].image, 0, 48, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[0].image, 48, 48, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[0].image, 96, 48, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[0].image, 144, 48, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[1].image, 192, 48, gp.tileSize, gp.tileSize, null);
////
////        g2.drawImage(tile[1].image, 0, 96, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[0].image, 48, 96, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[0].image, 96, 96, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[0].image, 144, 96, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[0].image, 192, 96, gp.tileSize, gp.tileSize, null);
////
////        g2.drawImage(tile[1].image, 0, 144, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[0].image, 0, 144, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[0].image, 0, 144, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[0].image, 0, 144, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[1].image, 0, 144, gp.tileSize, gp.tileSize, null);
////
////        g2.drawImage(tile[1].image, 0, 192, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[2].image, 0, 192, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[2].image, 0, 192, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[2].image, 0, 192, gp.tileSize, gp.tileSize, null);
////        g2.drawImage(tile[1].image, 0, 192, gp.tileSize, gp.tileSize, null);


//            x += gp.tileSize;
//
//            if (col == gp.maxScreenCol) {
//                col = 0;
//                x = 0;
//                row++;
//                y += gp.tileSize;
//            }
//        }


//            g2.setColor(Color.white);
//        g2.fillRect(x, y, gp.tileSize, gp.tileSize);

    //        System.out.println("Image loading started");

    //            while (col < gp.maxWorldCol && row < gp.maxWorldRow) {

//
//                while (col < gp.maxWorldCol) {
//                    String numbers[] = line.split(" ");
//
//                    int num = Integer.parseInt(numbers[col]);
//
//                    mapTileNum[col][row] = num;
//                    col++;
//                }
//                if (col == gp.maxWorldCol) {
//                    col = 0;
//                    row++;
//                }
//            }

    //        try {
//
//            tile[0] = new Tile();
//            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/grass.png"));
//
////            tile[0] = new Tile();
////            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/grass2.png"));
//
//            tile[1] = new Tile();
//            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/wall.png"));
//            tile[1].collision = true;
//
////            tile[2] = new Tile();
////            tile[2].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/water.png"));
////            tile[2].collision = true;
//
//            tile[2] = new Tile();
//            tile[2].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/water2.png"));
//            tile[2].collision = true;
//
//            tile[3] = new Tile();
//            tile[3].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/earth.png"));
//
////            tile[4] = new Tile();
////            tile[4].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/star01.png"));
////            tile[4].collision = true;
//
//            tile[4] = new Tile();
//            tile[4].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/tree.png"));
//            tile[4].collision = true;
//
////            tile[4] = new Tile();
////            tile[4].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/tree2.png"));
////            tile[4].collision = true;
//
//            tile[5] = new Tile();
//            tile[5].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/sand.png"));
//
//            tile[6] = new Tile();
//            tile[6].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/bushes02.png"));
//            tile[6].collision = true;
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



//            try

//    {
//
//            tile[0] = new Tile();
//            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/grass.png"));
//
////            tile[0] = new Tile();
////            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/grass2.png"));
//
//            tile[1] = new Tile();
//            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/wall.png"));
//            tile[1].collision = true;
//
//            tile[2] = new Tile();
//            tile[2].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/water.png"));
//            tile[2].collision = true;
//
//
//            tile[3] = new Tile();
//            tile[3].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/earth.png"));
//
////            tile[4] = new Tile();
////            tile[4].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/star01.png"));
////            tile[4].collision = true;
//
//            tile[4] = new Tile();
//            tile[4].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/tree.png"));
//            tile[4].collision = true;
//
//
//            tile[5] = new Tile();
//            tile[5].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/sand.png"));
//
////            tile[6] = new Tile();
////            tile[6].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/bushes02.png"));
////            tile[6].collision = true;
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            down1 = ImageIO.read(getClass().getResourceAsStream("/player/boy_down_1.png"));
//            down2 = ImageIO.read(getClass().getResourceAsStream("/player/boy_down_2.png"));
//            up1 = ImageIO.read(getClass().getResourceAsStream("/player/boy_up_1.png"));
//            up2 = ImageIO.read(getClass().getResourceAsStream("/player/boy_up_2.png"));
//            left1 = ImageIO.read(getClass().getResourceAsStream("/player/boy_left_1.png"));
//            left2 = ImageIO.read(getClass().getResourceAsStream("/player/boy_left_2.png"));
//            right1 = ImageIO.read(getClass().getResourceAsStream("/player/boy_right_1.png"));
//            right2 = ImageIO.read(getClass().getResourceAsStream("/player/boy_right_2.png"));
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
}
