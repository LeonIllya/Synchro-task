package task_01;

public class Main {

    static ClientA clientA;
    static ClientB clientB;

    public static void main(String[] args) {
        DataSet dataSet = new DataSet();

        clientA = getClientA(dataSet);
        clientB = getClientB(dataSet);

        clientA.start();
        clientB.start();
    }

    private static ClientA getClientA(DataSet dataSet) {
        return new ClientA(dataSet);
    }

    private static ClientB getClientB(DataSet dataSet) {
        return new ClientB(dataSet);
    }

}
