package example.com.staff;

import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.TriangleMesh;

public class IcosahedronMesh extends MeshView {
    private TriangleMesh triangleMesh;
    private double scale = 1.0;

    public IcosahedronMesh(double scale, int drawMo) {
        this.scale = scale;
        setMesh(createIcosahedron());
        if(drawMo == 2){
            setMaterial(createMaterial(false));
            setDrawMode(DrawMode.LINE);
        }
        else{
            setMaterial(createMaterial(true));

        }
        updateScale();
    }

    private TriangleMesh createIcosahedron() {
        triangleMesh = new TriangleMesh();
        setMaterial(createMaterial(true));

        // POINTS
        for(int i=0; i<12; i++){
            triangleMesh.getPoints().addAll(MyData.getEdge(i,0), MyData.getEdge(i,1), MyData.getEdge(i,2));
        }

        // TEXTURES
        triangleMesh.getTexCoords().addAll(1.f,1.f);

        // FACES
        for(int i=0; i<20; i++){
            triangleMesh.getFaces().addAll(MyData.getEdgeFaceIndex(i,0), 0,
                    MyData.getEdgeFaceIndex(i,1), 0,
                    MyData.getEdgeFaceIndex(i,2), 0);
        }
        return triangleMesh;
    }
    private void updateScale(){
        setScaleX(scale);
        setScaleY(scale);
        setScaleZ(scale);
    }

    private PhongMaterial createMaterial(boolean isFilled) {
        PhongMaterial mat = new PhongMaterial();
        if(isFilled){
            mat.setDiffuseColor(Color.BLUE);
            mat.setSpecularColor(Color.WHITE);
            mat.setSpecularPower(16);
            mat.setDiffuseMap(mat.getDiffuseMap());
        }
        else {
            mat.setDiffuseColor(Color.YELLOW);
        }
        return mat;
    }
}