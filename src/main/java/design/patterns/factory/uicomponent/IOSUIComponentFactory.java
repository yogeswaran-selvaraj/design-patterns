package design.patterns.factory.uicomponent;

import design.patterns.factory.button.Button;
import design.patterns.factory.button.IOSButton;
import design.patterns.factory.menu.IOSMenu;
import design.patterns.factory.menu.Menu;

public class IOSUIComponentFactory implements UIComponentFactory{

    @Override
    public Menu createMenu() {

        return new IOSMenu();
    }

    @Override
    public Button createButton() {

        return new IOSButton();
    }
}
