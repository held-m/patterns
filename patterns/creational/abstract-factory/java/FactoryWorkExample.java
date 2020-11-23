import factory.AbstractFactory;
import factory.impl.LogitechFactory;
import factory.impl.PhilipsFactory;
import factory.impl.SamsungFactory;
import model.Keyboard;
import model.Mouse;
import model.Printer;

import java.util.ArrayList;
import java.util.List;

public class FactoryWorkExample {

    public static void main(String[] args) {

        List<Complex> complexes = new ArrayList<>() {{
            add(new Complex(new LogitechFactory()));
            add(new Complex(new SamsungFactory()));
            add(new Complex(new PhilipsFactory()));
        }};

        complexes.forEach(c -> {
            c.showWork();
            System.out.println();
        });

    }


    static class Complex {
        private final Mouse mouse;
        private final Printer printer;
        private final Keyboard keyboard;

        public Complex(AbstractFactory factory) {
            this.mouse = factory.createMouse();
            this.printer = factory.createPrinter();
            this.keyboard = factory.createKeyboard();
        }

        public void showWork() {
            mouse.click();
            printer.printSomething();
            keyboard.inputText();
        }
    }
}