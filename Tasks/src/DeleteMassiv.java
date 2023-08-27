import java.util.Arrays;

public class DeleteMassiv {
    public static void  main(String[] args) {
        /*Дан массив целых чисел и еще одно целое число.
        удалите все вхождения этого числа из массива(
        пропусков быть не должно)
         */

  int testArray[]={0,1,2,2,3,0,4,2};
  int testArray2[]= {1,2,3,1,1,2,0,2,0};

        System.out.println(Arrays.toString(removeElement(testArray,2)));
        System.out.println(Arrays.toString(removeElement(testArray2,1)));
    }



    
     public static int[] removeElement(int[] nums, int val){
        int offset = 0;
        for(int i=0;i< nums.length;i++){
            if(nums[i] == val){
                offset++;
            }else{
                nums[i - offset] = nums[i];
            }
        }
        return Arrays.copyOf(nums,nums.length - offset);
}
}
