package pl.sda.referencje;

/**
 * @author Jarek Czaplicki
 */
public class LCDView {

    private View view;

//    public LCDView(View view) {
//        this.view = view;
//    }

    public void printData(){
        System.out.println(view.getDatabase().getStringList());
    }

    public void setView(View view) {
        this.view=view;
    }
}
