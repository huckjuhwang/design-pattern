package Chapter7.hj.adapter.objectAdapter;

import java.util.List;

public interface SortEngine {
    public void sort(); // 정렬 알고리즘
    public void reverseSort(); // 역순 정렬 알고리즘

    public void toPrettyPrint(); // 정렬된 리스트를 예쁘게 출력
}