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
//        IcosahedronMesh mesh = new IcosahedronMesh(100, 1);
//        IcosahedronMesh meshBorder = new IcosahedronMesh(100, 2);
        IcosahedronMesh mesh = new IcosahedronMesh(100, 2);
        this.getChildren().add(new AmbientLight());
        this.getChildren().add(mesh);
//        this.getChildren().add(meshBorder);
        Text text = new Text("1234567890");
        //..., 25));
        text.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
        text.setFill(Color.BLUE);
        this.getChildren().add(text);

        for (int faceIndex = 0; faceIndex < 20; faceIndex++) {
            float x = (MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex,0),0) +
                    MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex,1),0) +
                    MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex,2),0)) / 3.f;

            float y = (MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 0),1) +
                    MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 1),1) +
                    MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 2),1)) / 3.f;

            float z = (MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 0),2) +
                    MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 1),2) +
                    MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 2),2)) / 3.f;

//            float x=0, y=0, z=0;
            Text tmp = new Text(String.valueOf(faceIndex + 1));
            tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
            double xRot=0, yRot=0, zRot=0;
            switch(faceIndex){
                case 0:
//                    tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
//                    xRot = 45;
//                    yRot = 0;
//                    zRot = 0;
                    tmp.setFill(Color.FUCHSIA);
                    break;
                case 1:
                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
                    tmp.setFill(Color.SILVER);
                    break;
                case 2:
                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
                    tmp.setFill(Color.ALICEBLUE);
                    break;
                case 3:
                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
                    tmp.setFill(Color.CHOCOLATE);
                    break;
                case 4:
                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
                    tmp.setFill(Color.CORAL);
                    break;
                case 5:
                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
                    tmp.setFill(Color.YELLOW);
                    break;
                case 6:
                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
                    tmp.setFill(Color.TOMATO);
                    break;
                case 7:
                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
                    tmp.setFill(Color.TAN);
                    break;
                case 8:
                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
                    tmp.setFill(Color.SKYBLUE);
                    break;
                case 9:
//                    xRot = -35;
//                    yRot = -10;
//                    zRot = 15;
                    break;
                case 10:
                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
                    tmp.setFill(Color.PURPLE);
                    break;
                case 11:
                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
                    tmp.setFill(Color.VIOLET);
                    break;
                case 12:
                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
                    tmp.setFill(Color.MAROON);
                    break;
                case 13:
                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
                    tmp.setFill(Color.GOLD);
                    break;
                case 14:
                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
                    tmp.setFill(Color.HOTPINK);
                    break;
                case 15:
                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
                    tmp.setFill(Color.CRIMSON);
                    break;
                case 16:
//                    //tmp.setScaleY(tmp.getScaleY()*(-1));
//                    xRot = 0;
//                    yRot = -40;
//                    zRot = 210;
                    break;
                case 17:
                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
                    tmp.setFill(Color.IVORY);
                    break;
                case 18:
                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
                    tmp.setFill(Color.INDIGO);
//                    xRot = 0;
//                    yRot = 32;
//                    zRot = 0;
                    break;
                case 19:
                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
                    tmp.setFill(Color.KHAKI);
                    break;

            }
            Rotate rotateX = new Rotate(xRot, Rotate.X_AXIS);
            Rotate rotateY = new Rotate(yRot, Rotate.Y_AXIS);
            Rotate rotateZ = new Rotate(zRot, Rotate.Z_AXIS);
            tmp.setTranslateX(x*mesh.getScale());
            tmp.setTranslateY(y*mesh.getScale());
            tmp.setTranslateZ(z*mesh.getScale());
            tmp.getTransforms().addAll(rotateX, rotateY, rotateZ);
            this.getChildren().add(tmp);
        }





    }
}
