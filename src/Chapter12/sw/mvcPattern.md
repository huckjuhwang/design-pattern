## mvc 패턴
소프트웨어 애플리케이션을 구성하는 세 가지 주요 구성 요소를 분리하고 관리함으로써
애플리케이션의 유지보수와 확장을 쉽게 할 수있는 패턴입니다.

### 1. mvc 패턴을 사용하는 이유
코드의 구조화와 관리를 용이하게 하며, 소프트웨어 개발 프로세스를 더 효율적으로 만들기 때문입니다.

### 2. mvc 패턴의 주요 구성요소
* Model
모델은 애플리케이션의 데이터와 비즈니스 로직을 나타냅니다.
데이터베이스에서 정보를 가져오거나, 데이터를 처리하고 조작하는 역할을 합니다.
모델은 데이터를 관리하고 업데이트하는 메서드를 제공하며, 데이터가 변경될때 관련된 뷰(View)와 컨트롤러(Controller)에 알리는 역할을 합니다.

* View
뷰는 사용자 인터페이스(UI)를 나타내며, 모델에서 가져온 데이터를 시각적으로 표현합니다.
사용자에게 정보를 표시하고 사용자 입력을 받는 역할을 합니다.
뷰는 모델의 데이터 변경을 감지하고, 변경된 데이터를 업데이트하는 역할을 합니다.
뷰는 주로 화면에 표시되는 부분을 나타내며, 여러 개의 뷰가 하나의 모델과 연결될 수 있습니다.

* Controller
컨트롤러는 사용자의 입력을 받아 모델을 업데이트하거나 모델로부터 데이터를 가져와 뷰를 업데이트하는 역할을 합니다.
사용자와 애플리케이션의 중간 매개체 역할을 하며, 사용자가 뷰와 상호작용할 때 이를 처리하고 적절한 동작을 수행합니다.
컨트롤러는 뷰와 모델 간의 통신을 관리하고 데이터 흐름을 제어합니다.

### 3. mvc 패턴 구현

모델 클래스
```java
class Student {
    private String name;
    private int age;

    // Getter와 Setter 메서드

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

뷰 클래스
```java
class StudentView {
    public void printStudentDetails(String studentName, int studentAge) {
        System.out.println("학생 정보 - 이름: " + studentName + ", 나이: " + studentAge);
    }
}
```

컨트롤러 클래스
```java
class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void updateStudentView() {
        view.printStudentDetails(model.getName(), model.getAge());
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public void setStudentAge(int age) {
        model.setAge(age);
    }
}
```

클라이언트
```java
public class MVCPatternExample {
    public static void main(String[] args) {
        // 모델, 뷰, 컨트롤러 생성
        Student model = new Student();
        model.setName("Alice");
        model.setAge(20);

        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        // 모델 업데이트 및 뷰 업데이트
        controller.updateStudentView();

        // 모델 업데이트 후 뷰 업데이트
        controller.setStudentName("Bob");
        controller.setStudentAge(25);
        controller.updateStudentView();
    }
}
```




