package Chapter7.hj.adapter.objectAdapter;


import java.util.List;

/**
 * 프로그램의 엔진을 교체하고 호환시키기
 * 우리 회사에서는 A 회사에서 개발한 Sort엔진 솔루션을 구매해서 우리 회사의 Sort머신에 탑재하여 사용하고 있어왔고 한다.
 */
public class Client {

    public static void main(String[] args) {
        SortEngine sortEngineA = new SortAEngine();

        sortEngineA.sort();
        sortEngineA.reverseSort();
        sortEngineA.toPrettyPrint();
    }
}