package example.com.dice20;

public class Vector3D {
    private float x, y, z;

    // Constructor
    public Vector3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Cross product method
    public Vector3D crossProduct(Vector3D other) {
        float resultX = this.y * other.z - this.z * other.y;
        float resultY = this.z * other.x - this.x * other.z;
        float resultZ = this.x * other.y - this.y * other.x;

        return new Vector3D(resultX, resultY, resultZ);
    }

    public float getX() {return x;}
    public float getY() {return y;}
    public float getZ() {return z;}
}