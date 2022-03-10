package com.personal.framework.controls.elements;

import com.personal.framework.controls.internals.ControlBase;
import org.openqa.selenium.WebElement;

public class ButtonBase extends ControlBase implements Button {
    public ButtonBase(WebElement element) {
        super(element);
    }

    @Override
    public void PérformClick() {
        getWrappedElement().click();
    }

    @Override
    public String GetButtonText() {
        return getWrappedElement().getText();
    }
}
