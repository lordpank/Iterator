import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    private final int min;
    private final int diff;
    protected Random random;

    public Randoms(int min, int max) {
        this.min = min;
        diff = max - min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                random = new Random();
                return (random.nextInt(diff + 1) + min);
            }
        };
    }
}