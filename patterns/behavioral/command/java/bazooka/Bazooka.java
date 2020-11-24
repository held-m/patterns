package bazooka;

import command.Command;
import command.impl.FireCommand;
import command.impl.RechargeCommand;

import java.util.ArrayList;
import java.util.List;

public class Bazooka {

    private int cartridgeCount;
    private List<Integer> historyCartridges;

    public Bazooka() {
        this.cartridgeCount = 5;
        historyCartridges = new ArrayList<>();
    }

    public void fire() {
        execute(new FireCommand(this));
    }

    public void recharge() {
        execute(new RechargeCommand(this));
    }

    public int getCartridgeCount() {
        return cartridgeCount;
    }

    public void setCartridgeCount(int cartridgeCount) {
        this.cartridgeCount = cartridgeCount;
    }

    private void execute(Command command) {
        command.execute();
        historyCartridges.add(cartridgeCount);
    }

    public void showHistoryCartridges() {
        System.out.print("History: ");
        historyCartridges.forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}
