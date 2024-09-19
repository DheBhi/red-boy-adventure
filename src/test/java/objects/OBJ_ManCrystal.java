package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_ManCrystal extends SuperObjects{

    public OBJ_ManCrystal() {

        name = "Diamond";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/Objects/manacrystal_full.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
