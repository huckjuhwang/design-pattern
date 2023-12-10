package Chapter7.hj.adapter.classAdapter;

import java.util.List;

public interface SortEngine {
    public void setList(List list); // 정렬할 리스트

    public void sort(); // 정렬 알고리즘
    public void reverseSort(); // 역순 정렬 알고리즘

    public void toPrettyPrint(); // 정렬된 리스트를 예쁘게 출력
}