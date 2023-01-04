package task_01;

public class DataSet {

    void printData() {
        synchronized (this) {
            for (String fruit : getFruits()) {
                System.out.println(fruit);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    private String[] getFruits() {
        return new String[] {"orange", "apple", "plum"};
    }
}
