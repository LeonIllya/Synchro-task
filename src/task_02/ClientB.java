package task_02;

class ClientB extends Thread {

    DataSet dataSet;

    public ClientB(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public void run() {
        dataSet.getData();
    }
}
