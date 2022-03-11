package com.personal.framework.base;

public class BasePage extends Base {

    public <TPage extends BasePage> TPage AS(Class<TPage> pageInstance) {
        try {
            return (TPage) this;

        } catch (Exception e) {
            e.getStackTrace();
        }
        return null;
    }
}
