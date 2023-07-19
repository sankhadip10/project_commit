package collections;

public class ex1 {
    public static void main(String[] args) {
        final int[] x = {10};

        Runnable r =new Runnable() {
            @Override
            public void run() {
                x[0]++;
            }
        };
        r.run();
    }
}
