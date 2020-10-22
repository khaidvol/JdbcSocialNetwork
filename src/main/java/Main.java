import dao.ReadDao;
import dao.TableDao;
import dao.WriteDao;

public class Main {
    public static void main(String[] args) {

        // Drop/Create database
        TableDao.dropAllTables();
        TableDao.createAllTables();

        // Write data to the database
        WriteDao.populateData();

        // Read required data from the database
        // "names (only distinct) of users who has more than 100 friends and 100 likes in March 2025"
        ReadDao.readData();
    }
}
