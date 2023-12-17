package Chapter7.hj.adapter.objectAdapter.TOBE;


import Chapter7.hj.adapter.objectAdapter.SortAEngine;
import Chapter7.hj.adapter.objectAdapter.SortEngine;

/**
 *
 * 성능이 향상된 SortEngine 제공
 *
 *  class B_SortEngine {
 *      public void sorting(boolean isReverse) {} // 정렬 / 역순 정렬 알고리즘 (파라미터로 순서 결정)
 *  }
 *
 *
 * B_sortEngine에서 구현되어있지 않은 메서드들은 새로 구현해야하나??
 * - 기존에 활용했었던 toPrettyPrint 메서드도 사용하고 싶고,
 * - 새로 구현한다면, 이에 따른 테스트도 필요한텐ㄷ...ㅔ
 *
 *
 * 사용자들도 기존에 제공되던 인터페이스가 아닌 다른인터페이스가 제공된다면 헷갈리지 않을까?
 *
 */
public abstract class Client implements SortEngine {
    public static void main(String[] args) {
        SortEngine engine = new SortEngineAdapter(new SortAEngine(), new SortBEngine());

        engine.sort();
        engine.reverseSort();
        engine.toPrettyPrint();
    }
}
