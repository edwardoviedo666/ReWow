package com.soaint.fogacoop.commons.utils.bundles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ResourceBundle;

public class PropertiesUtil {
    private static Logger LOGGER = LogManager.getLogger(PropertiesUtil.class.getName());
    private static ResourceBundle bundle;

    public PropertiesUtil() {
    }

    public static String getMessage(String key) {
        return bundle.getString(key);
    }

    static {
        try {
            bundle = ResourceBundle.getBundle("atributos");
        } catch (Exception var1) {
            LOGGER.error("Endpoint Util - a system error has occurred", var1);
            throw new RuntimeException(var1);
        }
    }

}
