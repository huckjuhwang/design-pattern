package Chapter5.hj;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        // 2개의 인스턴스가 같은 객체로 반환되는지 검증한다.
        validationTwoInstanceEquals();


        // 직렬화 역직렬화 이슈 체크
        // 직렬화


        // 리플렉션 이슈 체크
        // 열거형은 리플렉션을 통해 newInstance() 를 실행하지 못하도록 막아놓았기 때문에 애초에 리플렉션 동작이 불가능하다.
        try {
            validationReflection();
        } catch (Exception e) {
            System.out.println("error message => " + e);
        }
    }

    private static void validationReflection() throws InstantiationException, IllegalAccessException, InvocationTargetException {
        /* Reflection API */
        // 1. Singleton Enum의 생성자는 숨겨져 있기 때문에 getDeclaredConstructors로 배열로 가져온다.
        Constructor<?>[] consructors = ChocolateBoiler.class.getDeclaredConstructors();

        // 2. 생성자 배열을 순회하여 인스턴스를 생성한다
        for(Constructor<?> constructor : consructors){
            constructor.setAccessible(true); // 생성자가 private 이기 때문에 외부에서 access 할 수 있도록 true 설정
            ChocolateBoiler singleton = (ChocolateBoiler) constructor.newInstance("INSTANCE");
        }
    }


    private static void validationTwoInstanceEquals() {
        ChocolateBoiler boiler1 = ChocolateBoiler.BOILER;
        ChocolateBoiler boiler2 = ChocolateBoiler.BOILER;

        System.out.println("boiler1 == boiler2 : " + (boiler1 == boiler2));
        System.out.println(boiler1.hashCode());
        System.out.println(boiler2.hashCode());
    }



}

