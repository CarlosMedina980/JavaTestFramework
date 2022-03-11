package com.personal.framework.controls.elements;

import com.personal.framework.controls.api.ImplementedBy;
import com.personal.framework.controls.internals.Control;

@ImplementedBy(ButtonBase.class)
public interface Button extends Control {
    void PerformClick();

    String GetButtonText();

}
