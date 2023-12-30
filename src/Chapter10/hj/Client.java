package Chapter10.hj;

public class Client {

    public static void main(String[] args) {
        GumballMachineContext gm = new GumballMachineContext(3);
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
