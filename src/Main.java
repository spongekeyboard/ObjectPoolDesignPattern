public class Main {

    public static void main(String[] args) {
        ObjectPool.getInstance().adquire(new String("Leandro Jesus"), 1);
        System.out.println(ObjectPool.getInstance().dispose(1));
    }

}
