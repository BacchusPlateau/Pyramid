import java.util.ArrayList;

public class Inventory {
    public ArrayList<InventoryItem> Items = new ArrayList<InventoryItem>();

    public String use(InventoryItem item) {
        //reduce uses
        //check to see if the uses are zero
        //if zero, remove from inventory

        return "TBD";
    }

    //interactions
    //do i have an interactions matrix that allows you to <verb><item>{at, on, in}<noun>?
    //   e.g. "throw spear at mummy"
}
