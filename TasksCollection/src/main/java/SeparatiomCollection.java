import HeavyBoxes.HeavyBox2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SeparatiomCollection {
  //  public static void main(String[] args)
  {
        List<HeavyBox2> test = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            test.add(new HeavyBox2(150 * (i + 2), 1 * (i + 1)));
        }
        List<HeavyBox2> destinationBoxes = new ArrayList<>();
        Iterator<HeavyBox2> iterator = test.iterator();
        while (iterator.hasNext()) {
            HeavyBox2 box = iterator.next();
            if (box.getWeight() > 300) {
                destinationBoxes.add(box);
            }
        }
        for (HeavyBox2 h : test) {
            System.out.println("Begin boxes: " + h.getId() + " " + h.getWeight());
        }
        for (HeavyBox2 h2 : destinationBoxes) {
            System.out.println("Finished boxes: " + h2.getId() + " " + h2.getWeight());
        }
    }
}




