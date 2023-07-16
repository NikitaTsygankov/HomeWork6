import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class HomeWork6 {
    public static void main(String[] args) {
        MySet<Integer> newSet = new MySet();
        System.out.println(newSet.isEmpty());
        newSet.add(777);
        newSet.add(888);
        newSet.add(999);
        System.out.println(newSet.toString());
        Iterator<Integer> iter = newSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println(newSet.get(5));
    }
}
class MySet<T> {
    private HashMap<T, Object> map = new HashMap<>();
    private static final Object OBJ = new Object();

    public boolean add(T value) {
        return map.put(value, OBJ) == null;
    }

    public boolean remove(T value) {
        return map.remove(value) != null;
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public String toString() {
        return map.keySet().toString();
    }

    public Iterator<T> iterator() {
        return map.keySet().iterator();
    }
    public int get (Integer value) { // Реализация метода поиска по индекусу
        String [] values = map.keySet().toString().replaceAll("[\\[\\]]", "").split(",");
        int[] values2 = new int [values.length];
        for (int i = 0; i < values.length; i++){
            values2[i] = Integer.parseInt(values[i].trim());
        }
        if (value > values2.length) {
            return -1;
        };
        return values2[value];
    }
}