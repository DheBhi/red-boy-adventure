package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJKey extends SuperObjects{
    public OBJKey() {

        name = "Key";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/Objects/key.png"));

        } catch(IOException e) {
                e.printStackTrace();
            }


        }
    }

