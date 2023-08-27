package max.min.avg;

import java.util.Random;

public class Vector1 {
    double x;
    double y;
    double z;

    public Vector1(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        Vector1[] vectors = VectorGenerator.generate(5);

        Vector1 vector1 = vectors[0];
        Vector1 vector2 = vectors[1];

        Vector1 sumVector = vector1.add(vector2);
        Vector1 diffVector = vector1.subtract(vector2);
        System.out.println("Sum vectors: " + sumVector);
        System.out.println("Difference vectors: " + diffVector);

    }

    Vector1 add(Vector1 other) {
        double sumX = this.x + other.x;
        double sumY = this.y + other.y;
        double sumZ = this.z + other.z;
        return new Vector1(sumX, sumY, sumZ);
    }


    public double getLenght() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double dotProduct(Vector1 other) {
        return x * other.x + y * other.y + z * other.z;
    }

    public Vector1 crossProduct(Vector1 other) {
        double rezultX = y * other.z - z * other.y;
        double rezultY = z * other.x - x * other.z;
        double rezultZ = x * other.y - y * other.x;
        return new Vector1(rezultX, rezultY, rezultZ);
    }

    public double cosineAngle(Vector1 other) {
        double dotProduct = x * other.x + y * other.y + z * other.z;
        double magnitudeProduct = Math.sqrt(x * x + y * y + z * z)
                * Math.sqrt(other.x * other.x + other.y * other.y + other.z * other.z);
        return dotProduct / magnitudeProduct;
    }

    public Vector1 subtract(Vector1 other) {
        double diffX = this.x - other.x;
        double diffY = this.y - other.y;
        double diffZ = this.z - other.z;
        return new Vector1(diffX, diffY, diffZ);
    }

    class VectorGenerator {
        public static Vector1[] generate(int N) {
            Vector1[] vectors = new Vector1[N];
            Random random = new Random();

            for (int i = 0; i < N; i++) {
                double x = random.nextDouble();
                double y = random.nextDouble();
                double z = random.nextDouble();
                vectors[i] = new Vector1(x, y, z);
            }

            return vectors;
        }
    }

    public void soutAll(){
        Vector1 vectors = new Vector1(10,12,2);
        System.out.println(vectors);

    }
}