package example.com.dice20;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Camera;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class MyViewer extends Application {

    private static final float WIDTH = 1400;
    private static final float HEIGHT = 700;

    private double anchorX, anchorY;
    private double anchorAngleX = 0;
    private double anchorAngleY = 0;
    private final DoubleProperty angleX = new SimpleDoubleProperty(0);
    private final DoubleProperty angleY = new SimpleDoubleProperty(0);
    private final PointLight pointLight = new PointLight();

    @Override
    public void start(Stage primaryStage) {
        //Box box = prepareBox();
//        IcosahedronMesh mesh = new IcosahedronMesh(100, 1);
//        IcosahedronMesh meshBorder = new IcosahedronMesh(100, 2);
        //mesh.setCullFace(CullFace.FRONT);
        //meshBorder.setCullFace(CullFace.FRONT);

        MyStaff shape = new MyStaff();
        shape.create();
        //group.getChildren().add(box);
        //group.getChildren().add(prepareSecondBox());
//        shape.getChildren().add(new AmbientLight());
//        shape.getChildren().add(mesh);
//        shape.getChildren().add(meshBorder);

        Camera camera = new PerspectiveCamera(true);
        camera.setNearClip(0.1);
        camera.setFarClip(10000.0);
        camera.translateZProperty().set(-200);

        Scene scene = new Scene(shape, WIDTH, HEIGHT, true);
        scene.setFill(Color.SILVER);
        scene.setCamera(camera);

        shape.translateXProperty().set(0);
        shape.translateYProperty().set(0);
        shape.translateZProperty().set(0);

        initMouseControl(shape, scene, primaryStage);

        primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            switch (event.getCode()) {
                case W:
                    shape.translateZProperty().set(shape.getTranslateZ() + 10);
                    break;
                case S:
                    shape.translateZProperty().set(shape.getTranslateZ() - 10);
                    break;
                case A:
                    shape.translateXProperty().set(shape.getTranslateX() + 10);
                    break;
                case D:
                    shape.translateXProperty().set(shape.getTranslateX() - 10);
                    break;
                case Q:
                    shape.translateYProperty().set(shape.getTranslateY() + 10);
                    break;
                case E:
                    shape.translateYProperty().set(shape.getTranslateY() - 10);
                    break;
                case NUMPAD8:
                    shape.rotateByX(10);
                    break;
                case NUMPAD2:
                    shape.rotateByX(-10);
                    break;
                case NUMPAD6:
                    shape.rotateByY(10);
                    break;
                case NUMPAD4:
                    shape.rotateByY(-10);
                    break;
                case NUMPAD7:
                    shape.rotateByZ(10);
                    break;
                case NUMPAD9:
                    shape.rotateByZ(-10);
                    break;
            }
        });

        primaryStage.setTitle("My shape");
        primaryStage.setScene(scene);
        primaryStage.show();

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                pointLight.setRotate(pointLight.getRotate() + 1);
            }
        };
        timer.start();
    }

    private Node prepareSecondBox() {
        PhongMaterial material = new PhongMaterial();
       // material.setDiffuseMap(new Image(getClass().getResourceAsStream("/resources/wood.jpg")));
        Box box = new Box(20, 100, 100);
        box.setMaterial(material);
        return box;
    }

    private Box prepareBox() {
        PhongMaterial material = new PhongMaterial();
        //material.setDiffuseMap(new Image(getClass().getResourceAsStream("/resources/wood.jpg")));
        Box box = new Box(100, 20, 50);
        box.setMaterial(material);
        return box;
    }

    private void initMouseControl(SmartGroup group, Scene scene, Stage stage) {
        Rotate xRotate;
        Rotate yRotate;
        group.getTransforms().addAll(
                xRotate = new Rotate(0, Rotate.X_AXIS),
                yRotate = new Rotate(0, Rotate.Y_AXIS)
        );
        xRotate.angleProperty().bind(angleX);
        yRotate.angleProperty().bind(angleY);

        scene.setOnMousePressed(event -> {
            anchorX = event.getSceneX();
            anchorY = event.getSceneY();
            anchorAngleX = angleX.get();
            anchorAngleY = angleY.get();
        });

        scene.setOnMouseDragged(event -> {
            angleX.set(anchorAngleX - (anchorY - event.getSceneY()));
            angleY.set(anchorAngleY + anchorX - event.getSceneX());
        });

        stage.addEventHandler(ScrollEvent.SCROLL, event -> {
            double delta = event.getDeltaY();
            group.translateZProperty().set(group.getTranslateZ() + delta);
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}