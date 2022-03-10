package com.personal.framework.controls.elements;

import com.personal.framework.controls.internals.Control;

public interface TextBox extends Control {
    void enterText(String text);

    String getTextValue();
}
