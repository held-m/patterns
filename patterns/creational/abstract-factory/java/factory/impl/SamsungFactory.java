package factory.impl;

import factory.AbstractFactory;
import model.Keyboard;
import model.Mouse;
import model.Printer;
import model.samsung.SamsungKeyboard;
import model.samsung.SamsungMouse;
import model.samsung.SamsungPrinter;

public class SamsungFactory extends AbstractFactory {
    @Override
    public Mouse createMouse() {
        return new SamsungMouse();
    }

    @Override
    public Printer createPrinter() {
        return new SamsungPrinter();
    }

    @Override
    public Keyboard createKeyboard() {
        return new SamsungKeyboard();
    }
}
