package task_01;

class ClientA extends Thread {

    DataSet dataSet;

    ClientA(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    public void run() {
        dataSet.printData();
    }

}