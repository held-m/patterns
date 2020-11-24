package command.impl;

import bazooka.Bazooka;
import command.Command;

public class RechargeCommand extends Command {

    public RechargeCommand(Bazooka bazooka) {
        super(bazooka);
    }

    @Override
    public void execute() {
        bazooka.setCartridgeCount(5);
        System.out.println("Bazooka recharged! Cartridge count - " + bazooka.getCartridgeCount());
    }
}
