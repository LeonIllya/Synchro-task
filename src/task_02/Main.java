package task_02;


public class Main {

    static String name;
    static ClientA clientA;
    static ClientB clientB;

    public static void main(String[] args)  {
        DataSet dataSet = new DataSet();

        name = "ClientA";
        clientA = new ClientA(dataSet);
        clientA.setName(name);
        clientA.start();

        name = "ClientB";
        clientB = new ClientB(dataSet);
        clientB.setName(name);
        clientB.start();

    }
}
