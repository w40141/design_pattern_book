package framework;

import java.util.HashMap;
import java.util.Map;

public class Manager2 {
    private Map<String, Product2> showcase = new HashMap<>();

    public void register2(String name, Product2 prototype) {
        showcase.put(name, prototype);
    }

    public Product2 create(String prototypeName) {
        Product2 p = showcase.get(prototypeName);
        return p.createCopy();
    }
}
