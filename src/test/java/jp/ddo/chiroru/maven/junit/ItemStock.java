package jp.ddo.chiroru.maven.junit;

import java.util.HashMap;
import java.util.Map;

public class ItemStock {

    private Map<String, Integer> itemBuffer;
    
    public ItemStock() {
        itemBuffer = new HashMap<String, Integer>();
    }
    
    public int size(String name) {
        // fake it!
        //return 0;
        if (contains(name)) {
            return Integer.parseInt(String.valueOf(itemBuffer.get(name)));
        } else {
            return 0;
        }
    }

    public boolean contains(String name) {
        // fake it!
        return itemBuffer.containsKey(name);
    }

    public void add(String name, int count) {
        itemBuffer.put(name, Integer.parseInt(String.valueOf(count)));
    }
}
