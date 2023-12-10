package Chapter7.hj.adapter.objectAdapter.TOBE;

import Chapter7.hj.adapter.objectAdapter.SortAEngine;
import Chapter7.hj.adapter.objectAdapter.SortEngine;

public class SortEngineAdapter implements SortEngine {
    SortAEngine engineA;
    SortBEngine engineB;

    SortEngineAdapter(SortAEngine engineA, SortBEngine engineB) {
        this.engineA = engineA;
        this.engineB = engineB;
    }

    @Override
    public void sort() {

        engineB.sorting(true);
    }

    @Override
    public void reverseSort() {
        engineB.sorting(false);
    }

    @Override
    public void toPrettyPrint() {
        engineA.toPrettyPrint();
    }
}
