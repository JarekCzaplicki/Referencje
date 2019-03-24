package pl.sda.referencje;

import javax.xml.crypto.Data;

/**
 * @author Jarek Czaplicki
 */
public class View {

    private Database database;

    public View(Database database) {
        this.database = database;
    }
    public void printAllData(){
        System.out.println(database.getStringList());
    }

    public Database getDatabase() {
        return database;
    }
}
