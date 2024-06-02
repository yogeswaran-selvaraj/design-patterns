package design.patterns.factory.platform;

import design.patterns.factory.uicomponent.UIComponentFactory;

public interface Platform {
    UIComponentFactory createUIComponent();
}
