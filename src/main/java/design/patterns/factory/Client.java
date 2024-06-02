package design.patterns.factory;

import design.patterns.factory.button.Button;
import design.patterns.factory.menu.Menu;
import design.patterns.factory.os.IOS;
import design.patterns.factory.platform.Platform;
import design.patterns.factory.uicomponent.UIComponentFactory;

public class Client {

    public void test(){
        Platform platform = new IOS();
        UIComponentFactory uiComponentFactory =  platform.createUIComponent();
        Menu menu = uiComponentFactory.createMenu();
        Button button = uiComponentFactory.createButton();
    }
}
