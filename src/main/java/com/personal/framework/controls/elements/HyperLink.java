package com.personal.framework.controls.elements;

import com.personal.framework.controls.api.ImplementedBy;
import com.personal.framework.controls.internals.Control;

@ImplementedBy(HyperLinkBase.class)
public interface HyperLink extends Control {

    void ClickLink();

    String GetUrlText();

    boolean CheckUrlTextContains(String containsText);
}