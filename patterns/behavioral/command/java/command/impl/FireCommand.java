package command.impl;

import bazooka.Bazooka;
import command.Command;

public class FireCommand extends Command {

    public FireCommand(Bazooka bazooka) {
        super(bazooka);
    }

    @Override
    public void execute() {
        if (bazooka.getCartridgeCount() > 0) {
            bazooka.setCartridgeCount(bazooka.getCartridgeCount() - 1);
            System.out.println("Big bang!!!");
        }
        else System.out.println("Bazooka has not cartridges.");
    }
}
