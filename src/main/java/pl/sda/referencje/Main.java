package pl.sda.referencje;

/**
 * @author Jarek Czaplicki
 */
public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Database database1 = new Database(); // ponieważ przekazujemy do klasy View tylko
        // referencje do database a nie do database1 to nie wydrukujemy zawartosći drugiej listy


        View view = new View(database, new LCDView());
        view.printAllData(); // wydrukuje Raz Dwa
        database1.getStringList().add("Trzy"); //nie drukuje bo nie ma w view referencji do obiektu database1
        view.printAllData(); // Wyrdukuje Raz Dwa
        view.printFromLCD(); // ponieważ referencja do VIEW posiada referencje do database to
        // zostanie wydrukowane równiez Jeden Dwa
    }

}
