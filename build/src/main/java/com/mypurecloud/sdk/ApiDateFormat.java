package com.mypurecloud.sdk;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


public class ApiDateFormat extends DateFormat {
    // Use RFC3339 format for date and datetime.
    // See http://xml2rfc.ietf.org/public/rfc/html/rfc3339.html#anchor14
    static final String format1 = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
    // In cases where the milliseconds = 000, the API excludes it
    // from the string returned in the JSON message.  This format
    // is to handle that case
    static final String format2 = "yyyy-MM-dd'T'HH:mm:ssXXX";

    SimpleDateFormat sdf1;
    SimpleDateFormat sdf2;

    public ApiDateFormat() {
        sdf1 = new SimpleDateFormat(format1);
        sdf2 = new SimpleDateFormat(format2);
        // Use UTC as the default time zone.
        sdf1.setTimeZone(TimeZone.getTimeZone("UTC"));
        sdf2.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override
    public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
        return sdf1.format(date, toAppendTo, fieldPosition);
    }

    @Override
    public Date parse(String source, ParsePosition pos) {
        if (source.length() > 20) {
            return sdf1.parse(source, pos);
        } else {
            return sdf2.parse(source, pos);
        }
    }
}
