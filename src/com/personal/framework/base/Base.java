package com.personal.framework.base;

import com.personal.framework.controls.api.ControlFactory;

public class Base {

    public static BasePage CurrentPage;

    public static <TPage extends BasePage> TPage getInstance(Class<TPage> page) {
        //Object obj = PageFactory.initElements(DriverContext.Driver, page);
        Object obj = ControlFactory.initElements(DriverContext.Driver, page);
        return page.cast(obj);
    }
}
