package bagpacker.commands;

import bagpacker.iohandler.Ui;
import bagpacker.packingfunc.PackingList;

public class ListCommand extends Command {
    public static final String HELP_MSG = "list : List all items and their total quantities packed in packing list.\n" +
            "\tExample: list";

    @Override
    public void execute(PackingList packingList) {

        if (packingList.size() == 0) {
            Ui.printLine();
            System.out.println("There are no items in your list. What would you like to add?");
            Ui.printLine();
            return;
        }

        Ui.printLine();
        System.out.println("Here are the items in your list");
        for (int i = 0; i < packingList.size(); i++) {
            System.out.print((i + 1) + ". ");
            System.out.println(PackingList.get(i));
        }
        Ui.printLine();
    }
}
