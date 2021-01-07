public class ObjectPool {

    private static ObjectPool objectPoolInstance;

    private Object[] objects;
    private final int MAX_OBJECTS = 10;
    private final int MIN_OBJECTS = 0;

    public ObjectPool() {
        if (objectPoolInstance != null) {
            return;
        }

        objects = new Object[MAX_OBJECTS];
        objectPoolInstance = this;
    }

    public static ObjectPool getInstance() {
        return objectPoolInstance;
    }

    public static void adquire(Object obj, int index) {
        objectPoolInstance.objects[index] = obj;
    }

    public static Object dispose(int index) {
        Object obj = objectPoolInstance.objects[index];
        objectPoolInstance.objects[index] = null;
        return obj;
    }
}
