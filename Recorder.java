import java.util.*;
import java.io.*;

public class Recorder {
    HashMap map = new HashMap<String, String>();

    public void put(String key, String value) {
        map.put(key, value);
        System.out.println(key + "=" + value);
    }

    public void get(String key) {
        if (map.get(key) == null) {
            throw new IllegalArgumentException();
        } else {
            System.out.println(map.get(key));
        }
    }

    public void delete(String key) {
        if (map.get(key) != null) {
            map.remove(key);
            System.out.println("deleted:" + key);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void delete() {
        map.clear();
        System.out.println("deleted all");
    }

}