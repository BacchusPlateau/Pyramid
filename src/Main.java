import java.util.*;

public class Main {

    public static Room room;
    public static Inventory inventory;
    public static int score = 0;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String cmd;

        showSplash();
        //showInstructions();
        init();


        while (true) {


            showRoomDescription();
            cmd = getCmd();
            if (cmd.equals("quit") || cmd.equals("exit")) {
                System.out.println("Score: " + score);
                break;
            } else if (parse(cmd)) {
                break;
            }
        }

        sc.close();

    }


    public static boolean parse(String cmd) {

        boolean gameOver = false;



        return gameOver;

    }


    public static String getCmd() {

        String cmd;


        System.out.print("> ");
        cmd = sc.nextLine();
        cmd = cmd.toLowerCase();
        cmd = cmd.trim();
        return cmd;

    }

    public static void showRoomDescription() {
        System.out.println(room.getDescription());
        if(!room.InventoryItems.isEmpty()) {
            System.out.println("You see the following in the room:");
            for (InventoryItem item : room.InventoryItems) {
                System.out.println("\t" + item.getName());
            }
        }
    }

    public static void init() {

        inventory = new Inventory();

        InventoryItem torch = new InventoryItem(
                "Torch",
                "You strike the torch along the ground like a giant match and it blazes into a sizeable flame.",
                "The wooden stick resembles a giant matchstick about two feet in length.  Was this invented by the ancients or have people been here before?",
                1
        );

        room = new Room(
                "Entry",
                "You find yourself in a dimly lit room with strange paintings on the walls.  There is " +
                    "a single exit that leads off to the north through an open doorway."
        );
        room.InventoryItems.add(torch);

        Room longCorridor = new Room(
             "Long Corridor",
             "Walking through this corridor, it never seems to end, yet you pass by a door to the east every " +
                "thousand feet or so that has the same marking above it."
        );

        room.ConnectedRooms.add(longCorridor);

    }

    public static void showSplash() {
        System.out.println("***********************************************************************************");
        System.out.println("*                                                                                 *");
        System.out.println("*    *******  **   **  *******  *******  **   **  *******  *****                  *");
        System.out.println("*    **   **  **   **  **   **  **   **  *******  *******  **   *                 *");
        System.out.println("*    *******  *******  *******  *******  ** * **    ***    **    *                *");
        System.out.println("*    **         ***    ** **    **   **  **   **    ***    **    *                *");
        System.out.println("*    **         ***    **  **   **   **  **   **  *******  **   *                 *");
        System.out.println("*    **         ***    **   **  **   **  **   **  *******  *****                  *");
        System.out.println("*                                                                                 *");
        System.out.println("***********************************************************************************");
    }

}