package example.com.dice20;

import javafx.scene.AmbientLight;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;

public class MyStaff extends SmartGroup {

    public void create(){
//        (100, ..)
        IcosahedronMesh mesh = new IcosahedronMesh(1, 1);
        IcosahedronMesh meshBorder = new IcosahedronMesh(1, 2);

        Cylinder stick = new Cylinder(0.5,30);
        Cylinder plate1 = new Cylinder(1.5,0.2);
        Cylinder plate2 = new Cylinder(1.2,0.2);
        Cylinder plate3 = new Cylinder(0.9,0.2);
        Cylinder stickBottom1 = new Cylinder(0.4, 0.3);
        Cylinder stickBottom2 = new Cylinder(0.3, 0.3);
        Cylinder stickBottom3 = new Cylinder(0.2, 0.3);
        Cylinder stickBottom4 = new Cylinder(0.1, 0.3);
        Cylinder stickBottom5 = new Cylinder(0.6, 0.5);

        Cylinder stickHandle1 = new Cylinder(0.55, 0.6);
        Cylinder stickHandle2 = new Cylinder(0.55, 0.6);
        Cylinder stickHandle3 = new Cylinder(0.55, 0.6);
        Cylinder stickHandle4 = new Cylinder(0.55, 0.6);
        Cylinder stickHandle5 = new Cylinder(0.55, 0.6);
        Cylinder stickHandle6 = new Cylinder(0.55, 0.6);
        Cylinder stickHandle7 = new Cylinder(0.55, 0.6);
        Cylinder stickHandle8 = new Cylinder(0.55, 0.6);
        Cylinder stickHandle9 = new Cylinder(0.55, 0.6);
        Cylinder stickHandle10 = new Cylinder(0.55, 0.6);

        plate1.setTranslateY(-15);
        plate2.setTranslateY(-14.5);
        plate3.setTranslateY(-14);
        mesh.setTranslateY(-15.7);
        meshBorder.setTranslateY(-15.75);
        stickBottom1.setTranslateY(15);
        stickBottom2.setTranslateY(15.3);
        stickBottom3.setTranslateY(15.6);
        stickBottom4.setTranslateY(15.9);
        stickBottom5.setTranslateY(14.8);

        stickHandle1.setTranslateY(3.0);
        stickHandle2.setTranslateY(2.3);
        stickHandle3.setTranslateY(1.6);
        stickHandle4.setTranslateY(0.9);
        stickHandle5.setTranslateY(0.2);
        stickHandle6.setTranslateY(-0.5);
        stickHandle7.setTranslateY(-1.2);
        stickHandle8.setTranslateY(-1.9);
        stickHandle9.setTranslateY(-2.6);
        stickHandle10.setTranslateY(-3.3);

        PhongMaterial stickMat = new PhongMaterial();
        stickMat.setDiffuseMap(new Image(getClass().getResourceAsStream("wood.jpg")));
        stick.setMaterial(stickMat);

        PhongMaterial handleMat = new PhongMaterial();
        handleMat.setDiffuseColor(Color.DARKGREEN);
        stickHandle1.setMaterial(handleMat);
        stickHandle2.setMaterial(handleMat);
        stickHandle3.setMaterial(handleMat);
        stickHandle4.setMaterial(handleMat);
        stickHandle5.setMaterial(handleMat);
        stickHandle6.setMaterial(handleMat);
        stickHandle7.setMaterial(handleMat);
        stickHandle8.setMaterial(handleMat);
        stickHandle9.setMaterial(handleMat);
        stickHandle10.setMaterial(handleMat);

        PhongMaterial additionalMat = new PhongMaterial();
        additionalMat.setDiffuseColor(Color.DARKRED);
        plate1.setMaterial(additionalMat);
        plate2.setMaterial(additionalMat);
        plate3.setMaterial(additionalMat);

        PhongMaterial stickBotMat = new PhongMaterial();
        stickBotMat.setDiffuseColor(Color.STEELBLUE);
        stickBottom1.setMaterial(stickBotMat);
        stickBottom2.setMaterial(stickBotMat);
        stickBottom3.setMaterial(stickBotMat);
        stickBottom4.setMaterial(stickBotMat);
        stickBottom5.setMaterial(stickBotMat);


//        IcosahedronMesh mesh = new IcosahedronMesh(100, 2);
        this.getChildren().add(new AmbientLight());
        this.getChildren().add(mesh);
        this.getChildren().add(meshBorder);
        this.getChildren().add(stick);

        this.getChildren().add(plate1);
        this.getChildren().add(plate2);
        this.getChildren().add(plate3);

        this.getChildren().add(stickBottom1);
        this.getChildren().add(stickBottom2);
        this.getChildren().add(stickBottom3);
        this.getChildren().add(stickBottom4);
        this.getChildren().add(stickBottom5);

        this.getChildren().add(stickHandle1);
        this.getChildren().add(stickHandle2);
        this.getChildren().add(stickHandle3);
        this.getChildren().add(stickHandle4);
        this.getChildren().add(stickHandle5);
        this.getChildren().add(stickHandle6);
        this.getChildren().add(stickHandle7);
        this.getChildren().add(stickHandle8);
        this.getChildren().add(stickHandle9);
        this.getChildren().add(stickHandle10);
        Text text = new Text("Мій посох");
        //..., 25));
        text.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
        text.setFill(Color.NAVY);
        text.setTranslateX(-100);
        text.setTranslateY(0);
        text.setTranslateZ(+200);
        this.getChildren().add(text);
//        for (int faceIndex = 0; faceIndex < 20; faceIndex++) {
//            float x = (MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex,0),0) +
//                    MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex,1),0) +
//                    MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex,2),0)) / 3.f;
//
//            float y = (MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 0),1) +
//                    MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 1),1) +
//                    MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 2),1)) / 3.f;
//
//            float z = (MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 0),2) +
//                    MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 1),2) +
//                    MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 2),2)) / 3.f;
//
//            Vector3D vector1 = new Vector3D(
//                    MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex,1),0)-
//                                MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex,0),0),
//                    MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 1),1) -
//                            MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 0),1),
//                    MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 1),2) -
//                            MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 0),2));
//
//            Vector3D vector2=  new Vector3D(
//                    MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex,2),0)-
//                            MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex,0),0),
//                    MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 2),1) -
//                            MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 0),1),
//                    MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 2),2) -
//                            MyData.getEdge(MyData.getEdgeFaceIndex(faceIndex, 0),2));
//
//            Vector3D normali = vector2.crossProduct(vector1);
//            double alpha = Math.toDegrees(Math.atan(normali.getX() / (Math.sqrt(normali.getY()* normali.getY()+ normali.getZ()* normali.getZ()))));
//            double betta = Math.toDegrees(Math.atan(normali.getY() / (Math.sqrt(normali.getX()* normali.getX()+ normali.getZ()* normali.getZ()))));
//            double gamma = Math.toDegrees(Math.atan(normali.getZ() / (Math.sqrt(normali.getY()* normali.getY()+ normali.getX()* normali.getX()))));
//
//
////            float x=0, y=0, z=0;
//            Text tmp = new Text(String.valueOf(faceIndex + 1));
//            if(faceIndex == 5 || faceIndex == 8) tmp.setText(tmp.getText() + ".");
//            tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
//            double scalee = 1;
//            switch(faceIndex){
//                case 0:
////                    tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
////                    alpha = 0+45;
////                    betta = 0;
////                    gamma = 0-20-50;
////                    alpha = -40+4;
////                    betta = -10-2-40-30+60;
////                    gamma = 0+50+20+10;
//                    alpha = -40+4;
//                    betta = -10-2;
//                    gamma = 0+50+25+180;
//                    scalee = -1;
////
////                    scalee=-1;
//                    //tmp.setScaleY(-1.0);
////                    yRot = 0;
////                    zRot = 0;
//                    tmp.setFill(Color.FUCHSIA);
//                    break;
//                case 1:
//                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
//                    tmp.setFill(Color.SILVER);
//                    break;
//                case 2:
//                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
//                    tmp.setFill(Color.ALICEBLUE);
//                    break;
//                case 3:
//                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
//                    tmp.setFill(Color.CHOCOLATE);
//                    break;
//                case 4:
//                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
//                    tmp.setFill(Color.CORAL);
//                    break;
//                case 5:
//                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
//                    tmp.setFill(Color.YELLOW);
//                    alpha = -35;
//                    betta = -10;
//                    gamma = 15;
//                    break;
//                case 6:
//                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
//                    tmp.setFill(Color.TOMATO);
//                    break;
//                case 7:
//                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
//                    tmp.setFill(Color.TAN);
//                    break;
//                case 8:
//                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
//                    tmp.setFill(Color.SKYBLUE);
//                    break;
//                case 9:
////                    alpha = -35;
////                    betta = -10;
////                    gamma= 15;
//                    break;
//                case 10:
//                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
//                    tmp.setFill(Color.PURPLE);
//                    break;
//                case 11:
//                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
//                    tmp.setFill(Color.VIOLET);
//                    break;
//                case 12:
//                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
//                    tmp.setFill(Color.MAROON);
//                    break;
//                case 13:
//                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
//                    tmp.setFill(Color.GOLD);
//                    break;
//                case 14:
//                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
//                    tmp.setFill(Color.HOTPINK);
//                    break;
//                case 15:
//                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
//                    tmp.setFill(Color.CRIMSON);
//                    break;
//                case 16:
////                    //tmp.setScaleY(tmp.getScaleY()*(-1));
////                    xRot = 0;
////                    yRot = -40;
////                    zRot = 210;
//                    break;
//                case 17:
//                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
//                    tmp.setFill(Color.IVORY);
//                    break;
//                case 18:
//                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
//                    tmp.setFill(Color.INDIGO);
////                    xRot = 0;
////                    yRot = 32;
////                    zRot = 0;
//                    break;
//                case 19:
//                    //tmp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 150));
//                    tmp.setFill(Color.KHAKI);
//                    break;
//
//            }
//
//            Rotate rotateX = new Rotate(alpha, Rotate.X_AXIS);
//            Rotate rotateY = new Rotate(betta, Rotate.Y_AXIS);
//            Rotate rotateZ = new Rotate(gamma, Rotate.Z_AXIS);
////            tmp.getTransforms().removeAll();
//            tmp.setTranslateX(x*mesh.getScale());
//            tmp.setTranslateY(y*mesh.getScale());
//            tmp.setTranslateZ(z*mesh.getScale());
//            tmp.getTransforms().addAll(rotateX, rotateY, rotateZ);// rotateY, rotateZ);
//            tmp.setScaleY(scalee);
//            this.getChildren().add(tmp);
//        }

    }

}
