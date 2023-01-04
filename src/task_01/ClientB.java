package task_01;

class ClientB extends Thread {

    DataSet dataSet;

    ClientB(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    public void run() {
        dataSet.printData();
    }
}
