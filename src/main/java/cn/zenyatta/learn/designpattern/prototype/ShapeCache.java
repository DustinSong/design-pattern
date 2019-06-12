package cn.zenyatta.learn.designpattern.prototype;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author mingming.song
 */
class ShapeCache {
    private static Map<String, Shape> shapeMap = new ConcurrentHashMap<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShap = shapeMap.get(shapeId);
        return (Shape) cachedShap.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
