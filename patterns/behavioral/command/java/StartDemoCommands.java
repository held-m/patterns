import bazooka.Bazooka;

public class StartDemoCommands {
    public static void main(String[] args) {
        Bazooka bazooka = new Bazooka();
        for (int i = 0; i < 8; i++) {
            if (bazooka.getCartridgeCount() == 0) bazooka.recharge();
            bazooka.fire();
        }
        bazooka.showHistoryCartridges();

    }
}
