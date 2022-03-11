package com.personal.framework.config;

import com.personal.framework.base.BrowserTypes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    public static void PopulateSettings() throws IOException {
        ConfigReader reader = new ConfigReader();
        reader.ReadProperty();
    }

    private void ReadProperty() throws IOException {
        Properties p = new Properties();
        InputStream inputStream = new FileInputStream("src/main/java/com/personal/framework/config/GlobalConfig.properties");
        p.load(inputStream);
        Settings.AUTConnectionString = p.getProperty("AUTConnectionString");
        Settings.LogPath = p.getProperty("LogPath");
        Settings.ExcelSheetPath = p.getProperty("ExcelSheetPath");
        Settings.DriverType = p.getProperty("DriverType");
        Settings.AUT = p.getProperty("AUT");
        Settings.Browser = BrowserTypes.valueOf(p.getProperty("Browser"));
    }
}
