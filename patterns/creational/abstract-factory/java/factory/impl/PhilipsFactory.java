package factory.impl;

import factory.AbstractFactory;
import model.Keyboard;
import model.Mouse;
import model.Printer;
import model.philips.PhilipsKeyboard;
import model.philips.PhilipsMouse;
import model.philips.PhilipsPrinter;

public class PhilipsFactory extends AbstractFactory {
    @Override
    public Mouse createMouse() {
        return new PhilipsMouse();
    }

    @Override
    public Printer createPrinter() {
        return new PhilipsPrinter();
    }

    @Override
    public Keyboard createKeyboard() {
        return new PhilipsKeyboard();
    }
}
