package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for one schedule item.
 */
public class ScheduleItem extends JsObject  {

    
    private Double end;
    private Double start;
    private String workingTime;

    
    public ScheduleItem(Double end, Double start, String workingTime) {
        this.end = end;
        this.start = start;
        this.workingTime = workingTime;

        js.append(String.format(Locale.US, "{end: %f,start: %f,workingTime: %s}",  end, start, wrapQuotes(workingTime)));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}