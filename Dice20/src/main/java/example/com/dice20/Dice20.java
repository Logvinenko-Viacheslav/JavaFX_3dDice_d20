package example.com.dice20;

import javafx.scene.AmbientLight;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;

public class Dice20 extends SmartGroup {

    public void create(){
        //(100, ..)
        IcosahedronMesh mesh = new IcosahedronMesh(100, 1);
        IcosahedronMesh meshBorder = new IcosahedronMesh(100, 2);
        this.getChildren().add(new AmbientLight());
        this.getChildren().add(mesh);
        this.getChildren().add(meshBorder);
        Text text = new Text("1234567890");
        //..., 25));
        text.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
        text.setFill(Color.BLUE);
        this.getChildren().add(text);

        for (int faceIndex = 0; faceIndex < mesh.getTriangleMesh().getFaces().size() / 6; faceIndex++) {
            int baseIndex = faceIndex * 6;
            float x = (mesh.getTriangleMesh().getPoints().get(mesh.getTriangleMesh().getFaces().get(baseIndex) * 3) +
                    mesh.getTriangleMesh().getPoints().get(mesh.getTriangleMesh().getFaces().get(baseIndex + 1) * 3)) / 2;
            float y = (mesh.getTriangleMesh().getPoints().get(mesh.getTriangleMesh().getFaces().get(baseIndex) * 3 + 1) +
                    mesh.getTriangleMesh().getPoints().get(mesh.getTriangleMesh().getFaces().get(baseIndex + 1) * 3 + 1)) / 2;
            float z = (mesh.getTriangleMesh().getPoints().get(mesh.getTriangleMesh().getFaces().get(baseIndex) * 3 + 2) +
                    mesh.getTriangleMesh().getPoints().get(mesh.getTriangleMesh().getFaces().get(baseIndex + 1) * 3 + 2)) / 2;
            Text tmp = new Text(String.valueOf(faceIndex + 1));
            double xRot=0, yRot=0, zRot=0;
            switch(faceIndex){
                case 0:
//                    xRot = -0.262866f;
//                    yRot = 0.809017f;
//                    zRot = -0.425325f;
                    xRot=54.74;
                    yRot=54.74;
                    zRot=54.74;
                    break;
                case 9:
                    xRot = -35;
                    yRot = -10;
                    zRot = 15;
                    break;
                case 16:
                    xRot = 0;
                    yRot = 0;
                    zRot = 0;
                    tmp.setScaleX(tmp.getScaleX()*(-1));
                    break;
            }
            Rotate rotateX = new Rotate(xRot, Rotate.X_AXIS);
            Rotate rotateY = new Rotate(yRot, Rotate.Y_AXIS);
            Rotate rotateZ = new Rotate(zRot, Rotate.Z_AXIS);
            tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
            tmp.setTranslateX(x*mesh.getScale());
            tmp.setTranslateY(y*mesh.getScale());
            tmp.setTranslateZ(z*mesh.getScale());
            tmp.getTransforms().addAll(rotateX, rotateY, rotateZ);
            this.getChildren().add(tmp);
        }





    }
}
