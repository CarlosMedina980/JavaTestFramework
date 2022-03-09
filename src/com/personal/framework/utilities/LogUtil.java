package com.personal.framework.utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LogUtil {

    //File format for the log name
    ZonedDateTime date = ZonedDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHMMSS");
    String fileNameFormat = date.format(formatter);

    private BufferedWriter bufferedWriter = null;

    //Create log file
    public void CreateLogFile() {

        try {
            File dir = new File("D:\\JavaTestFramework\\JavaTestFramework\\Logs");
            if (!dir.exists())
                dir.mkdir();
            File logFile = new File(dir + "/" + fileNameFormat + ".log");

            FileWriter fileWriter = new FileWriter(logFile.getAbsoluteFile());
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (Exception e) {

        }
    }

    //Write some message on the log file
    public void Write(String message) {
        try {
            bufferedWriter.write(message);
            bufferedWriter.close();
        } catch (Exception e) {

        }
    }
}
