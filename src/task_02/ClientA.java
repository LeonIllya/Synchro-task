package task_02;

class ClientA extends Thread {

    DataSet dataSet;

    public ClientA(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public void run() {
        dataSet.getData();
    }
}
