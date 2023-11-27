public class InventoryItem {

    private String _name = "";
    private String _actionMessage = "";
    private String _examineMessage = "";
    private int _numberOfUses = 0;

    public InventoryItem(
            String name,
            String actionMessage,
            String examineMessage,
            int numberOfUses
    ) {
        _name = name;
        _actionMessage = actionMessage;
        _examineMessage = examineMessage;
        _numberOfUses = numberOfUses;
    }

    public String getName() {
        return _name;
    }

    public int getNumberOfUses() {
        return _numberOfUses;
    }

    



}
