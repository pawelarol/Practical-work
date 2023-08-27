package max.min.avg;

public class EX2 {
public static void main(String[] args){
    int[] a = {32,23,123,322,311,2,3,4,5,};
    checkAll(a);
    for(int i=0; i<a.length; i++){
        System.out.println(a[i] +" ");
    }
}
public static void checkAll(int[] a) {
    int n = a.length;
    for(int i=0; i<a.length;i++){
        for(int j = 0; j<n-i-1; j++){
            if(a[j] > a[j+1]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] =temp;
            }
        }
    }


}


}
