package max.min.avg;
    public class Vector2 {
        public static void main(String[] args) {


        }

        // Три приватных поля
        private double x;
        private double y;
        private double z;

        // С тремя параметрами
        public Vector2(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        // Длина вектора. Корень из суммы квадратов
        public double length() {
            return Math.sqrt(x * x + y * y + z * z);
        }

        // метод, вычисляющий скалярное произведение
        public double scalarProduct(Vector2 vector) {
            return x * vector.x + y * vector.y + z * vector.z;
        }

        // метод, вычисляющий векторное произведение
        public Vector2 crossProduct(Vector2 vector) {
            return new Vector2(
                    y * vector.z - z * vector.y,
                    z * vector.x - x * vector.z,
                    x * vector.y - y * vector.x);
        }

        // Косинус между двумя векторами
        public double cos(Vector2 vector) {
            // Для вычисления длины и произведения используются
            //методы multiply и length
            return scalarProduct(vector) / (length() * vector.length());
        }

        public Vector2 add(Vector2 vector) {
            return new Vector2(
                    x + vector.x,
                    y + vector.y,
                    z + vector.z
            );
        }

        public Vector2 subtract(Vector2 vector) {
            return new Vector2(
                    x - vector.x,
                    y - vector.y,
                    z - vector.z
            );
        }

        public static Vector2[] generate(int n){
            Vector2[] vectors = new Vector2[n];
            for(int i =0; i < n; i++){
                vectors[i] = new Vector2(Math.random(), Math.random(), Math.random());
            }
            return vectors;
        }

        @Override
        public String toString() {
            return "Vector{" +
                    "x=" + x +
                    ", y=" + y +
                    ", z=" + z +
                    '}';
        }
    }

