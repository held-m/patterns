package command;

import bazooka.Bazooka;

public abstract class Command {

    protected Bazooka bazooka;

    public Command(Bazooka bazooka) {
        this.bazooka = bazooka;
    }

    public abstract void execute();

}