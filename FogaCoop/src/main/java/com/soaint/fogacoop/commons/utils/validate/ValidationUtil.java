package com.soaint.fogacoop.commons.utils.validate;

import com.soaint.fogacoop.commons.utils.date.DateUtil;

public class ValidationUtil {

    public static boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static boolean isLong(String value) {
        try {
            Long.parseLong(value);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static boolean isDateDDMMYYYY(String value) {
        try {
            return DateUtil.getDateFromString(value, "dd/MM/yyyy") != null;
        } catch (Exception ex) {
            return false;
        }
    }


}
