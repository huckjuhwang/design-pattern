## 컴파운드 패턴
여러개의 디자인 패턴을 조합하여 소프트웨어 아키텍처나 디자인을 구성하는 방법을 의미합니다. 

### 1. 컴파운드 패턴을 사용하는 이유
각 디자인 패턴의 특정 문제 해결에 최적화된 구조를 가지고 있고
다양한 디자인 패턴을 조합하여 각 패턴의 강점을 최대한 활용 할 수 있습니다.

### 2. 간단한 컴파운드 패턴 구현

싱글톤 패턴과 팩토리 메서드 패턴의 조합한 로깅 구현

싱글톤 패턴을 사용하여 로깅 서비스를 구현
```java
class Logger {
    private static Logger instance;

    private Logger() {}

    // 싱글톤 인스턴스를 반환하는 메서드
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // 로그 메시지를 출력하는 메서드
    public void log(String message) {
        System.out.println("로그: " + message);
    }
}
```

팩토리 메서드 패턴을 사용하여 로그 메시지를 생성하는 클래스를 구현
```java
class LoggerFactory {
    public static Logger getLogger(String type) {

        if (type.equals("console")) {
            return Logger.getInstance();
        }

        // 다른 로깅 타입에 대한 처리를 추가
        // 예를 들어 파일 로깅, 네트워크 로깅 등을 지원
        if (type.equals("file")) {
            return Logger.getInstance();
        }

        return null;
    }
}
```

클라이언트
```java
public class Main {
    public static void main(String[] args) {
        // 팩토리 메서드를 사용하여 콘솔 로그를 생성
        Logger consoleLogger = LoggerFactory.getLogger("console");

        // 로그 메시지 출력
        consoleLogger.log("애플리케이션 시작");

        // 다시 로그 메시지 출력
        consoleLogger.log("사용자 로그인");

        // 팩토리 메서드를 사용하여 다른 로그 타입을 생성
        Logger fileLogger = LoggerFactory.getLogger("file");

        fileLogger.log("파일 로그 출력");
    }
}
```




