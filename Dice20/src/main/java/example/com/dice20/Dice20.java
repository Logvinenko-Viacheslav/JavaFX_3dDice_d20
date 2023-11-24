package example.com.dice20;

import javafx.scene.AmbientLight;

public class Dice20 extends SmartGroup {

    public void create(){
        IcosahedronMesh mesh = new IcosahedronMesh(100, 1);
        IcosahedronMesh meshBorder = new IcosahedronMesh(100, 2);
        this.getChildren().add(new AmbientLight());
        this.getChildren().add(mesh);
        this.getChildren().add(meshBorder);
    }
}
