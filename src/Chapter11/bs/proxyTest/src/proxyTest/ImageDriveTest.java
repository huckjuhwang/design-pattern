package proxyTest;

public class ImageDriveTest {
	public static void main(String[] args) {
        Image image1 = new ProxyImage("test_1.jpg");
        Image image2 = new ProxyImage("test_2.jpg");

        // 이미지는 처음 display() 메소드가 호출될 때 로드됩니다.
        System.out.println("Image 1 호출");
        image1.display(); // 여기서 실제로 로딩됩니다.

        System.out.println("\nImage 1을 다시 호출");
        image1.display(); // 이미 로딩되었으므로, 빠르게 표시됩니다.

        System.out.println("\nImage 2 호출");
        image2.display(); // 여기서 실제로 로딩됩니다.
    }
}
