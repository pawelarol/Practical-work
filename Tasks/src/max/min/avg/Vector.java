package max.min.avg;
import java.util.Random;

public class Vector {
        private double x;
        private double y;
        private double z;

        public Vector(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

    public Vector(double[] generateRandomArray) {
    }

    public static void main(String[] args) {
            Vector1[] vectors = VectorGenerator.generate(5);

            // Пример использования методов
            Vector1 vector1 = vectors[0];
            Vector1 vector2 = vectors[1];

            Vector1 sumVector = vector1.add(vector2);
            Vector1 diffVector = vector1.subtract(vector2);

            System.out.println("Сумма векторов: " + sumVector);
            System.out.println("Разность векторов: " + diffVector);
        }

        public Vector1 add(Vector1 other) {
            double sumX = this.x + other.x;
            double sumY = this.y + other.y;
            double sumZ = this.z + other.z;
            return new Vector1(sumX, sumY, sumZ);
        }

        public Vector1 subtract(Vector1 other) {
            double diffX = this.x - other.x;
            double diffY = this.y - other.y;
            double diffZ = this.z - other.z;
            return new Vector1(diffX, diffY, diffZ);
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ", " + z + ")";
        }

        static class VectorGenerator {
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
    }

