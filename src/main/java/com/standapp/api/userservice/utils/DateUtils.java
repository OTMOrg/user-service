package com.standapp.api.userservice.utils;

import org.aspectj.apache.bcel.generic.FieldOrMethod;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static final String STANDARD_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static String getDateString(Date date, String format) {
        Format formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

}
