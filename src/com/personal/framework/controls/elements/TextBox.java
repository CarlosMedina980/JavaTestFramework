package com.personal.framework.controls.elements;

import com.personal.framework.controls.api.ImplementedBy;
import com.personal.framework.controls.internals.Control;

@ImplementedBy(TextBoxBase.class)
public interface TextBox extends Control {
    void enterText(String text);

    String getTextValue();
}
