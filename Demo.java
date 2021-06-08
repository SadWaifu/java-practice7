import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

public class Demo {
    private static final int arrSize = 25;

    public static void main(String[] args) {
        ArrayList<Integer> colList = new ArrayList<>(arrSize);

        for(int i = 0; i < arrSize; i++) {
            colList.add((int)(1 + Math.random() * 10));
        }
        System.out.println("List: " + colList);

        HashSet<Integer> colHashSet = new HashSet<>(colList);
        System.out.println("Set: " + colHashSet + " number of unique numbers: " + colHashSet.size());

        HashMap<Integer, Integer> colHashMap = new HashMap<>();
        Iterator<Integer> i = colHashSet.iterator();

        int tmpNum;
        while (i.hasNext()) {
            tmpNum = i.next();
            colHashMap.put(tmpNum, colList.indexOf(tmpNum));
        }
        System.out.println("Map: " + colHashMap);
    }
}
