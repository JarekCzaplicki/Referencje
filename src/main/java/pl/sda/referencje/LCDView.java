package pl.sda.referencje;

/**
 * @author Jarek Czaplicki
 */
public class LCDView {

    private View view;

    public LCDView(View view) {
        this.view = view;
    }

    private void printData(){
        System.out.println(view.getDatabase().getStringList());
    }
}
