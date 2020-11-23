package factory.impl;

import factory.AbstractFactory;
import model.Keyboard;
import model.Mouse;
import model.Printer;
import model.logitech.LogitechKeyboard;
import model.logitech.LogitechMouse;
import model.logitech.LogitechPrinter;

public class LogitechFactory extends AbstractFactory {
    @Override
    public Mouse createMouse() {
        return new LogitechMouse();
    }

    @Override
    public Printer createPrinter() {
        return new LogitechPrinter();
    }

    @Override
    public Keyboard createKeyboard() {
        return new LogitechKeyboard();
    }
}
