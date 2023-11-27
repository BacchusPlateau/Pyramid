import java.util.ArrayList;

public class Room {

    private String _name = "";
    private String _description = "";
    public ArrayList<InventoryItem> InventoryItems = new ArrayList<InventoryItem>();
    public ArrayList<Room> ConnectedRooms = new ArrayList<Room>();

    public String getName() {
        return _name;
    }

    public String getDescription() {
        return _description;
    }

    public Room(
            String name,
            String description
    ) {
        _name = name;
        _description = description;
    }


}
