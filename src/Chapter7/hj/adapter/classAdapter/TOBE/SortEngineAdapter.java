package Chapter7.hj.adapter.classAdapter.TOBE;

import Chapter7.hj.adapter.objectAdapter.SortAEngine;
import Chapter7.hj.adapter.objectAdapter.SortEngine;

public class SortEngineAdapter extends SortBEngine implements SortEngine {
    SortAEngine engineA;

    SortEngineAdapter(SortAEngine engineA) {
        this.engineA = engineA;
    }

    @Override
    public void sort() {
        sorting(true);
    }

    @Override
    public void reverseSort() {
        sorting(false);
    }

    @Override
    public void toPrettyPrint() {
        engineA.toPrettyPrint();
    }
}
