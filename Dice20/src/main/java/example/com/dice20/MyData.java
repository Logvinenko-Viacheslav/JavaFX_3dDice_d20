package example.com.dice20;

public class MyData {

    private final static float edges[][] =  {
            // Point 1
            {0f, 0f, -0.951057f},
            // Point 2
            {0f, 0f, 0.951057f},
            // Point 3
            {-0.850651f, 0f, -0.425325f},
            // Point 4
            {0.850651f, 0f, 0.425325f},
            // Point 5
            {0.688191f, -0.5f, -0.425325f},
            // Point 6
            {0.688191f, 0.5f, -0.425325f},
            // Point 7
            {-0.688191f, -0.5f, 0.425325f},
            // Point 8
            {-0.688191f, 0.5f, 0.425325f},
            // Point 9
            {-0.262866f, -0.809017f, -0.425325f},
            // Point 10
            {-0.262866f, 0.809017f, -0.425325f},
            // Point 11
            {0.262866f, -0.809017f, 0.425325f},
            // Point 12
            {0.262866f, 0.809017f, 0.425325f}
        };

    private final static int indexOfEdgesForFaces[][] =  {
            // Face 1
            {1, 11, 7},
            // Face 2
            {1, 7, 6},
            // Face 3
            {1, 6, 10},
            // Face 4
            {1, 10, 3},
            // Face 5
            {1, 3, 11},
            // Face 6
            {4, 8, 0},
            // Face 7
            {5, 4, 0},
            // Face 8
            {9, 5, 0},
            // Face 9
            {2, 9, 0},
            // Face 10
            {8, 2, 0},
            // Face 11
            {11, 9, 7},
            // Face 12
            {7, 2, 6},
            // Face 13
            {6, 8, 10},
            // Face 14
            {10, 4, 3},
            // Face 15
            {3, 5, 11},
            // Face 16
            {4, 10, 8},
            // Face 17
            {5, 3, 4},
            // Face 18
            {9, 11, 5},
            // Face 19
            {2, 7, 9},
            // Face 20
            {8, 6, 2}
    };

    public static float getEdge(int edgeNumb, int directionXYZ){
        return edges[edgeNumb][directionXYZ];
    }

    public static int getEdgeFaceIndex(int faceNumb, int edgeNumber){
        return indexOfEdgesForFaces[faceNumb][edgeNumber];
    }
}
