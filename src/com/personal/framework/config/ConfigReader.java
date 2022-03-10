package com.personal.framework.config;

import com.personal.framework.base.BrowserTypes;

import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static void PopulateSettings() throws IOException {
        ConfigReader reader = new ConfigReader();
        reader.ReadProperty();
    }

    private void ReadProperty() throws IOException {
        Properties p = new Properties();
        p.load(getClass().getResourceAsStream("GlobalConfig.properties"));
        Settings.AUTConnectionString = p.getProperty("AUTConnectionString");
        Settings.LogPath = p.getProperty("LogPath");
        Settings.ExcelSheetPath = p.getProperty("ExcelSheetPath");
        Settings.DriverType = p.getProperty("DriverType");
        Settings.AUT = p.getProperty("AUT");
        Settings.Browser = BrowserTypes.valueOf(p.getProperty("Browser"));
    }
}
