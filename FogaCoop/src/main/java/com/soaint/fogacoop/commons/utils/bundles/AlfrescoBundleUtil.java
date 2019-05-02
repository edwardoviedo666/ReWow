package com.soaint.fogacoop.commons.utils.bundles;

import lombok.Builder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ResourceBundle;

@Builder
public class AlfrescoBundleUtil {

        private static Logger LOGGER = LogManager.getLogger(AlfrescoBundleUtil.class.getName());
        private static ResourceBundle bundle;

        private AlfrescoBundleUtil() {
        }

        public static String getProperty(final String key) {


            return bundle.getString(key);
        }

        static {
            try {
                bundle = ResourceBundle.getBundle("sic-config");
            } catch (Exception var1) {
                LOGGER.error("Bundle Util - a system error has occurred", var1);
                throw new RuntimeException(var1);
            }
        }

}
