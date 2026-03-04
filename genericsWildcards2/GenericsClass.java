public class GenericsClass <T> {
    private T t;
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static boolean isEqual(GenericsClass gc1, GenericsClass gc2){
        return gc1.getT().equals(gc2.getT());
    }
}
