package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class ConfigurationsReader {
    //We created this because we need to read our Configuration.properties file

    private static Properties configFile;
    static {
        try {
            FileInputStream fileInputStream = new FileInputStream("Configuration.properties");
            configFile = new Properties();
            configFile.load(fileInputStream);
            fileInputStream.close();
        }catch (Exception e){
            System.out.println("Failed to load the properties");
            e.printStackTrace();
        }
    }
    public static String getProperties(String key){
        return configFile.getProperty(key);
    }

}
