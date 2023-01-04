package task_02;

public class DataSet {

    public synchronized void getData() {

        System.out.println("Gets data for " +
                Thread.currentThread().getName());

        for (String fruit : getFruits()) {
            System.out.println(fruit);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }

    }

    private String[] getFruits() {
        return new String[] {"orange", "apple", "plum"};
    }
}
