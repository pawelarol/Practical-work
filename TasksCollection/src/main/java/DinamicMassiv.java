import HeavyBoxes.HeavyBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DinamicMassiv {
    public static void main(String[] args) {

        List<HeavyBox> test = new ArrayList<>();
        test.add(new HeavyBox(1, 25, 20));
        test.add(new HeavyBox(2, 20, 19));
        test.add(new HeavyBox(3, 30, 32));
        test.add(new HeavyBox(4, 40, 14));
        test.add(new HeavyBox(5, 2, 4));
        if (!test.isEmpty()) for (HeavyBox o : test) {
              System.out.println("Object: " + o.getNumber() + ", Longer: " + o.getLonger() + ", Age: " + o.getAge());
            //System.out.println(o.getAge() + o.getLonger() + o.getNumber());
        }

        HeavyBox firstBox = test.get(0);
        firstBox.setNumber(firstBox.getNumber() + 1);
        firstBox.setAge(firstBox.getAge() + 1);
        firstBox.setLonger(firstBox.getLonger() + 1);

       test.remove(4);

          HeavyBox[] array = test.toArray(new HeavyBox[0]);
        System.out.println(Arrays.toString(array));

        HeavyBox[] array2 = test.toArray(new HeavyBox[test.size()]);
        System.out.println(Arrays.toString(array2));

       HeavyBox[] array3 = new HeavyBox[test.size()];
       for(int i = 0; i< test.size(); i++){
           array3[i] = test.get(i);
           System.out.println(Arrays.toString(array3));
       }

       HeavyBox[] array4 = Arrays.copyOf(test.toArray(), test.size(), HeavyBox[].class);
        System.out.println(Arrays.toString(array4));

        test.clear();

        if (test.isEmpty()){
            System.out.println("Collection is delete.");
        } else {
            System.out.println("Collection is activated");

        }

    }

}