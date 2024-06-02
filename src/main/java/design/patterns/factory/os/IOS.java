package design.patterns.factory.os;

import design.patterns.factory.platform.Platform;
import design.patterns.factory.uicomponent.IOSUIComponentFactory;
import design.patterns.factory.uicomponent.UIComponentFactory;

public class IOS implements Platform {
    @Override
    public UIComponentFactory createUIComponent() {
        return new IOSUIComponentFactory();
    }
}
