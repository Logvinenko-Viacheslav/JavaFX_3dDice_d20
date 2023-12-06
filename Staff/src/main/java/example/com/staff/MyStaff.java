package example.com.staff;

import javafx.scene.AmbientLight;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class MyStaff extends SmartGroup {

    private Cylinder stick;
    private Cylinder plate1;
    private Cylinder plate2;
    private Cylinder plate3;
    private Cylinder stickBottom1;
    private Cylinder stickBottom2;
    private Cylinder stickBottom3;
    private Cylinder stickBottom4;
    private Cylinder stickBottom5;

    private Cylinder stickHandle1;
    private Cylinder stickHandle2;
    private Cylinder stickHandle3;
    private Cylinder stickHandle4;
    private Cylinder stickHandle5;
    private Cylinder stickHandle6;
    private Cylinder stickHandle7;
    private Cylinder stickHandle8;
    private Cylinder stickHandle9;
    private Cylinder stickHandle10;
    private IcosahedronMesh mesh;
    private IcosahedronMesh meshBorder;

    private boolean isVisible = true;

    public void create(){
        mesh = new IcosahedronMesh(1, 1);
        meshBorder = new IcosahedronMesh(1, 2);

        stick = new Cylinder(0.5,30);
        plate1 = new Cylinder(1.5,0.2);
        plate2 = new Cylinder(1.2,0.2);
        plate3 = new Cylinder(0.9,0.2);
        stickBottom1 = new Cylinder(0.4, 0.3);
        stickBottom2 = new Cylinder(0.3, 0.3);
        stickBottom3 = new Cylinder(0.2, 0.3);
        stickBottom4 = new Cylinder(0.1, 0.3);
        stickBottom5 = new Cylinder(0.6, 0.5);

        stickHandle1 = new Cylinder(0.55, 0.6);
        stickHandle2 = new Cylinder(0.55, 0.6);
        stickHandle3 = new Cylinder(0.55, 0.6);
        stickHandle4 = new Cylinder(0.55, 0.6);
        stickHandle5 = new Cylinder(0.55, 0.6);
        stickHandle6 = new Cylinder(0.55, 0.6);
        stickHandle7 = new Cylinder(0.55, 0.6);
        stickHandle8 = new Cylinder(0.55, 0.6);
        stickHandle9 = new Cylinder(0.55, 0.6);
        stickHandle10 = new Cylinder(0.55, 0.6);

        plate1.setTranslateY(-15);
        plate2.setTranslateY(-14.5);
        plate3.setTranslateY(-14);
        mesh.setTranslateY(-15.7);
        meshBorder.setTranslateY(-15.7);
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
        text.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
        text.setFill(Color.NAVY);
        text.setTranslateX(-100);
        text.setTranslateY(0);
        text.setTranslateZ(+200);
        this.getChildren().add(text);
    }

    public void switchVisibleMod(){
        if(isVisible) {
            stick.setDrawMode(DrawMode.FILL);
            plate1.setDrawMode(DrawMode.FILL);
            plate2.setDrawMode(DrawMode.FILL);
            plate3.setDrawMode(DrawMode.FILL);
            stickBottom1.setDrawMode(DrawMode.FILL);
            stickBottom2.setDrawMode(DrawMode.FILL);
            stickBottom3.setDrawMode(DrawMode.FILL);
            stickBottom4.setDrawMode(DrawMode.FILL);
            stickBottom5.setDrawMode(DrawMode.FILL);
            stickHandle1.setDrawMode(DrawMode.FILL);
            stickHandle2.setDrawMode(DrawMode.FILL);
            stickHandle3.setDrawMode(DrawMode.FILL);
            stickHandle4.setDrawMode(DrawMode.FILL);
            stickHandle5.setDrawMode(DrawMode.FILL);
            stickHandle6.setDrawMode(DrawMode.FILL);
            stickHandle7.setDrawMode(DrawMode.FILL);
            stickHandle8.setDrawMode(DrawMode.FILL);
            stickHandle9.setDrawMode(DrawMode.FILL);
            stickHandle10.setDrawMode(DrawMode.FILL);
            mesh.setDrawMode(DrawMode.FILL);
        }
        else if(!isVisible){
            stick.setDrawMode(DrawMode.LINE);
            plate1.setDrawMode(DrawMode.LINE);
            plate2.setDrawMode(DrawMode.LINE);
            plate3.setDrawMode(DrawMode.LINE);
            stickBottom1.setDrawMode(DrawMode.LINE);
            stickBottom2.setDrawMode(DrawMode.LINE);
            stickBottom3.setDrawMode(DrawMode.LINE);
            stickBottom4.setDrawMode(DrawMode.LINE);
            stickBottom5.setDrawMode(DrawMode.LINE);
            stickHandle1.setDrawMode(DrawMode.LINE);
            stickHandle2.setDrawMode(DrawMode.LINE);
            stickHandle3.setDrawMode(DrawMode.LINE);
            stickHandle4.setDrawMode(DrawMode.LINE);
            stickHandle5.setDrawMode(DrawMode.LINE);
            stickHandle6.setDrawMode(DrawMode.LINE);
            stickHandle7.setDrawMode(DrawMode.LINE);
            stickHandle8.setDrawMode(DrawMode.LINE);
            stickHandle9.setDrawMode(DrawMode.LINE);
            stickHandle10.setDrawMode(DrawMode.LINE);
            mesh.setDrawMode(DrawMode.LINE);
        }
        isVisible = !isVisible;
    }
}
