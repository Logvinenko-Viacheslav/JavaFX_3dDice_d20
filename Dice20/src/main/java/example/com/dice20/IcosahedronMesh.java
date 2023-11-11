package example.com.dice20;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.AmbientLight;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.stage.Stage;

public class IcosahedronMesh extends MeshView {
    private final static Color[] COLORS = {
            Color.RED,
            Color.GREEN,
            Color.BLUE,
            Color.YELLOW,
            Color.ORANGE,

            Color.AQUAMARINE,
            Color.GREENYELLOW,
            Color.BROWN,
    };

    public IcosahedronMesh() {
        setMesh(createCube());
    }

    private TriangleMesh createCube() {
        TriangleMesh m = new TriangleMesh();
        // coloring
        PhongMaterial mat = new PhongMaterial();
        WritableImage image = new WritableImage(COLORS.length, 1);
        PixelWriter writer = image.getPixelWriter();
        for (int i = 0; i < COLORS.length; i++)
            writer.setColor(i, 0, COLORS[i]);
        mat.setDiffuseMap(image);
        setMaterial(mat);
        // POINTS
        m.getPoints().addAll(
                // Point 1
                0f, 0f, -0.951057f,
                // Point 2
                0f, 0f, 0.951057f,
                // Point 3
                -0.850651f, 0f, -0.425325f,
                // Point 4
                0.850651f, 0f, 0.425325f,
                // Point 5
                0.688191f, -0.5f, -0.425325f,
                // Point 6
                0.688191f, 0.5f, -0.425325f,
                // Point 7
                -0.688191f, -0.5f, 0.425325f,
                // Point 8
                -0.688191f, 0.5f, 0.425325f,
                // Point 9
                -0.262866f, -0.809017f, -0.425325f,
                // Point 10
                -0.262866f, 0.809017f, -0.425325f,
                // Point 11
                0.262866f, -0.809017f, 0.425325f,
                // Point 12
                0.262866f, 0.809017f, 0.425325f);
        // TEXTURES
        m.getTexCoords().addAll(
                // 0 red
                0.1f, 0.5f,
                // 1 green
                0.3f, 0.5f,
                // 2 blue
                0.5f, 0.5f,
                // 3 yellow
                0.7f, 0.5f,
                // 4 orange
                0.9f, 0.5f
                );
        // FACES
        m.getFaces().addAll(
                // Face 1
                1, 0, 11, 0, 7, 0,
                // Face 2
                1, 4, 7, 4, 6, 4,
                // Face 3
                1, 4, 6, 4, 10, 4,
                // Face 4
                1, 2, 10, 2, 3, 2,
                // Face 5
                1, 2, 3, 2, 11, 2,
                // Face 6
                4, 3, 8, 3, 0, 3,
                // Face 7
                5, 3, 4, 3, 0, 3,
                // Face 8
                9, 1, 5, 1, 0, 1,
                // Face 9
                2, 1, 9, 1, 0, 1,
                // Face 10
                8, 0, 2, 0, 0, 0,
                // Face 11
                11, 3, 9, 3, 7, 3,
                // Face 12
                7, 1, 2, 1, 6, 1,
                // Face 13
                6, 1, 8, 1, 10, 1,
                // Face 14
                10, 0, 4, 0, 3, 0,
                // Face 15
                3, 0, 5, 0, 11, 0,
                // Face 16
                4, 4, 10, 4, 8, 4,
                // Face 17
                5, 4, 3, 4, 4, 4,
                // Face 18
                9, 2, 11, 2, 5, 2,
                // Face 19
                2, 2, 7, 2, 9, 2,
                // Face 20
                8, 3, 6, 3, 2, 3);
        return m;
    }
}