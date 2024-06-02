package design.patterns.factory.os;

import design.patterns.factory.platform.Platform;
import design.patterns.factory.uicomponent.AndroidUIComponentFactory;
import design.patterns.factory.uicomponent.UIComponentFactory;

public class Android implements Platform {
    @Override
    public UIComponentFactory createUIComponent() {
        return new AndroidUIComponentFactory();
    }
}
