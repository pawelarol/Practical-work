import HeavyBoxes.HeavyBox;

import java.util.Set;
import java.util.TreeSet;

public class DinamicSet{
    public static void main(String[] args) {
        Set<HeavyBox> test = new TreeSet<>();
        test.add(new HeavyBox(1,2,3));
        test.add(new HeavyBox(0,1,2));
        test.add(new HeavyBox(4,3,5));
        test.add(new HeavyBox(2,0,1));
        for(HeavyBox o : test){
                System.out.println(o.getAge() + " " + o.getNumber() + " " + o.getLonger());
            }
        }
    }

