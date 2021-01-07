public class ObjectPool {

    private static ObjectPool objectPoolInstance;

    private static Object[] objects;
    private static final int MAX_OBJECTS = 10;
    private static int MIN_OBJECTS = 0;

    public ObjectPool() {
        objects = new Object[MAX_OBJECTS];
    }

    public static ObjectPool getInstance() {
        if (objectPoolInstance != null) {
            return objectPoolInstance;
        }

        objectPoolInstance = new ObjectPool();
        return objectPoolInstance;
    }

    public void adquire(Object obj, int index) {
        objects[index] = obj;
    }

    public Object dispose(int index) {
        Object obj = objects[index];
        return obj;
    }
}
