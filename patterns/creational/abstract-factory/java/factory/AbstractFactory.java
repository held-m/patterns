package factory;

import model.Keyboard;
import model.Mouse;
import model.Printer;

public abstract class AbstractFactory {

    public abstract Mouse createMouse();

    public abstract Printer createPrinter();

    public abstract Keyboard createKeyboard();
}
