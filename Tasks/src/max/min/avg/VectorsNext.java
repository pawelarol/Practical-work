package max.min.avg;

public class VectorsNext {
    private double values[];

    public VectorsNext(double[] values) {
        this.values = values;
    }

    public double lenght(){
        double sum = 0;
        for(int i = 0;i<values.length; i++){
            sum+= values[i]*values[i];
        }
        return Math.sqrt(sum);
    }

    public double scalarProduct(VectorsNext vector){
        double res= 0;

        for(int i = 0;i<values.length; i++){
            res += values[i] * vector.values[i];
        }
        return  res;
    }

    public double cos(VectorsNext vector){
        return scalarProduct(vector) / (lenght()* vector.lenght());
    }

    public VectorsNext add(VectorsNext vector){
        double [] another = new double[values.length];
        for (int i = 0; i< values.length; i++){
            another[i] = values[i] + vector.values[i];
        }
        return new VectorsNext(another);
    }

    public VectorsNext subtract(VectorsNext vector){
        double [] another = new double[values.length];

        for (int i = 0; i < values.length; i++){
            another[i] = values[i] - vector.values[i];
        }
        return new VectorsNext(another);
    }

    private static double[] generateRandomArray( int length){
        double[] array = new double[length];
        for(int i = 0; i < array.length; i++){
            array[i] = Math.random();
        }
        return array;
    }

    public static Vector[] generate(int n, int disemsion){
        Vector[] vectors = new Vector[n];
        for( int i = 0; i <n; i++){
            vectors[i] = new Vector(generateRandomArray(disemsion));
        }
        return vectors;
    }
}
