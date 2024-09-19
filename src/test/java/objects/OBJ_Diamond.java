package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Diamond extends SuperObjects {

    public OBJ_Diamond() {

        name = "Diamond";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/Objects/blueheart.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
