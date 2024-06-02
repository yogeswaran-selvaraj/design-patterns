package design.patterns.factory.uicomponent;

import design.patterns.factory.button.AndroidButton;
import design.patterns.factory.button.Button;
import design.patterns.factory.menu.AndroidMenu;
import design.patterns.factory.menu.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory{

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
