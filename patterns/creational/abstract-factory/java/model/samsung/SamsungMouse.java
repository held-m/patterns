package model.samsung;

import model.Mouse;

public class SamsungMouse extends Mouse {
    @Override
    public void click() {
        System.out.println("Samsung mouse clicks without some noise...");
    }
}
