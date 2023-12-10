package Chapter7.hj.adapter.objectAdapter;

import java.util.List;

public class SortAEngine implements SortEngine {
    @Override
    public void sort() {
        System.out.println("engine A - Sorting");
    }

    @Override
    public void reverseSort() {
        System.out.println("engine A - reverse sorting");
    }

    @Override
    public void toPrettyPrint() {
        System.out.println("engine A - toPrettyPrint");
    }
}
