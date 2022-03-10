package com.personal.framework.config;

import com.personal.framework.base.BrowserTypes;
import com.personal.framework.utilities.LogUtil;

import java.sql.Connection;

public class Settings {

    //Application backend connection
    public static Connection AUTConnection;
    public static String AUTConnectionString;
    //Log Path For Framework
    public static String LogPath;
    //DriverType for sql server connection
    public static String DriverType;

    public static String ExcelSheetPath;

    public static String AUT;
    public static BrowserTypes Browser;
    public static LogUtil Logs;
}
