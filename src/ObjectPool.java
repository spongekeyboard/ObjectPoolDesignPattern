public class ObjectPool {

    private static ObjectPool objectPoolInstance;

    public ObjectPool() {
        if (objectPoolInstance != null) {
            return;
        }

        objectPoolInstance = this;
    }
}
