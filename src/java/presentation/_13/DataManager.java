package presentation._13;

public class DataManager {

    private final DataSorter dataSorter;

    public DataManager(DataSorter dataSorter) {
        this.dataSorter = dataSorter;
    }

    public void retrieveData() {
        dataSorter.sort(null);
    }

}
