package com.soaint.fogacoop.commons.utils.bundles;

import lombok.Builder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ResourceBundle;

/**
 * Created by jrodriguez on 21/12/2017.
 */

@Builder
public class MessageUtil {
    private static Logger LOGGER = LogManager.getLogger(MessageUtil.class.getName());
    private static ResourceBundle bundle;
 
    private MessageUtil() {
    }

    public static String getMessage(String key) {
        return bundle.getString(key);
    }

    static {
        try {
            bundle = ResourceBundle.getBundle("messages");
        } catch (Exception var1) {
            LOGGER.error("Message Util - a system error has occurred", var1);
            throw new RuntimeException(var1);
        }
    }
}