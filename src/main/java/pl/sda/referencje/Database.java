package pl.sda.referencje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jarek Czaplicki
 */
public class Database {
    private List<String> stringList = new ArrayList<>();

    public Database(){
        stringList.addAll(Arrays.asList("Jeden", "Dwa"));
    }

    public List<String> getStringList() {
        return stringList;
    }
}
