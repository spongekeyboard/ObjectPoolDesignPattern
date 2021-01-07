public class ObjectPool {

    private static ObjectPool objectPoolInstance;

    public ObjectPool() {
        if (objectPoolInstance != null) {
            return;
        }

        objectPoolInstance = this;
    }

    public static ObjectPool getInstance() {
        return objectPoolInstance;
    }

    public static void adquire() {

    }
}
