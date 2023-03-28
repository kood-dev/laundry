
package com.laundry.laundrysample.common.constant;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatConstants {
    public final static String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
    public final static String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public final static DateTimeFormatter yyyyMMddHHmmss = DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME_FORMAT);
    public final static DateTimeFormatter yyyyMMdd = DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT);
    public final static DateTimeFormatter MMddE = DateTimeFormatter.ofPattern("MM월 dd일 E요일").withLocale(Locale.KOREA);
    public final static DateTimeFormatter ahhmm = DateTimeFormatter.ofPattern("a hh시 mm분").withLocale(Locale.KOREA);
}
