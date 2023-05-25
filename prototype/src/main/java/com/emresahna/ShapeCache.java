package com.emresahna;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    static {
        shapeMap.put("square", new Square());
        shapeMap.put("rectangle", new Rectangle());
    }

    public static Shape getShape(String shapeName) {
        return (Shape) shapeMap.get(shapeName).clone();
    }
}
