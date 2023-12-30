package Chapter10.hj;

public class Client {

    public static void main(String[] args) {
        GumballMachine gm = new GumballMachine(3);
        System.out.println(gm);

        gm.insertQuarter();
        gm.turnCrank();

        System.out.println(gm);

        gm.insertQuarter();
        gm.turnCrank();
        gm.insertQuarter();
        gm.turnCrank();

        System.out.println(gm);

    }
}
