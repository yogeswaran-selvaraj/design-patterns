package design.patterns.factory.uicomponent;

import design.patterns.factory.button.Button;
import design.patterns.factory.menu.Menu;

public interface UIComponentFactory {
    Menu createMenu();
    Button createButton();
}
