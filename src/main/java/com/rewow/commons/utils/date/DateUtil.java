package com.soaint.fogacoop.commons.utils.date;

import lombok.extern.log4j.Log4j2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Log4j2
public class DateUtil {

    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final String DATE_FORMAT1 = "yyyy/MM/dd";
    private static final String DATE_FORMAT2 = "yyyy-MM-dd";
    private static final String HOUR_FORMAT = "HH:mm";
    private static final SimpleDateFormat FORMAT_ISO = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    public static String getDateToString(Date date) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
        return formatter.format(date);
    }

    public static String getDateToString(Date date, String format) {
        if (date == null){
            return null;
        }
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

    public static Date getDateFromString(String date) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
            return formatter.parse(date);
        } catch (ParseException e) {
            log.error("Se ha generado un error en el metodo getDateFromString :", e);
        }
        return null;
    }

    public static Date getDateFromString(String date, String format) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            return formatter.parse(date);
        } catch (ParseException e) {
            log.error("Se ha generado un error en el metodo getDateFromString :", e);
        }
        return null;
    }

    public static Date getDateFromStringYYYmmDD(String date) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT1);
            return formatter.parse(date);
        } catch (ParseException e) {
            log.error("Se ha generado un error en el metodo getDateFromString :", e);
        }
        return null;
    }

    public static boolean checkDates(Date d1, Date d2, String format) {
        return getDateToString(d1, format).equals(getDateToString(d2, format));
    }

    public static boolean checkHoursOverlay(String horaInicio1, String horaFin1, String horaInicio2, String horaFin2) {
        int hInicio1 = Integer.parseInt(horaInicio1.substring(0,2).concat(horaInicio1.substring(3,5)));
        int hFin1 = Integer.parseInt(horaFin1.substring(0,2).concat(horaFin1.substring(3,5)));

        int hInicio2 = Integer.parseInt(horaInicio2.substring(0,2).concat(horaInicio2.substring(3,5)));
        int hFin2 = Integer.parseInt(horaFin2.substring(0,2).concat(horaFin2.substring(3,5)));

        return (hInicio1 < hInicio2 && hInicio2 < hFin1)
                || (hInicio1 < hFin2 && hFin2 < hFin1)
                || (hInicio2 < hInicio1 && hInicio1 < hFin2)
                || hInicio1 == hInicio2 || hFin1 == hFin2;
    }

    public static boolean checkHoursIntegrity(String horaInicio1, String horaFin1, String horaInicio2, String horaFin2) {
        int hInicio1 = Integer.parseInt(horaInicio1.substring(0,2).concat(horaInicio1.substring(3,5)));
        int hFin1 = Integer.parseInt(horaFin1.substring(0,2).concat(horaFin1.substring(3,5)));

        int hInicio2 = Integer.parseInt(horaInicio2.substring(0,2).concat(horaInicio2.substring(3,5)));
        int hFin2 = Integer.parseInt(horaFin2.substring(0,2).concat(horaFin2.substring(3,5)));

        return hInicio1 < hFin1 && hInicio1 >= hInicio2 || hFin1 <= hFin2;
    }

    public static String getTimeFromDate(Date date) {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm");
        return df.format(date);
    }

    public static String getDateToStringBPM(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT2);
        return formatter.format(date);

    }

    public static Date addYears(Date fecha, int years){
        Calendar c = Calendar.getInstance();
        c.setTime(fecha);
        c.add(Calendar.YEAR, years);
        return c.getTime();
    }

}
