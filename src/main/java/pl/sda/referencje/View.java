package pl.sda.referencje;

import javax.xml.crypto.Data;

/**
 * @author Jarek Czaplicki
 */
public class View {

    private Database database;
    private LCDView lcdView;

    public View(Database database, LCDView lcdView) {
        this.database = database;
        this.lcdView = lcdView;
    }

    public void printFromLCD(){
        lcdView.setView(this);
        lcdView.printData();
    }
    public void printAllData(){
        System.out.println(database.getStringList());
    }

    public Database getDatabase() {
        return database;
    }
}
