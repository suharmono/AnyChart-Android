package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the context.
 */
public class SmaContext extends JsObject  {

    
    private Double dequeuedValue;
    private Double period;
    private Double prevResult;
    private CycledQueue queue;

    
    public SmaContext(Double dequeuedValue, Double period, Double prevResult, CycledQueue queue) {
        this.dequeuedValue = dequeuedValue;
        this.period = period;
        this.prevResult = prevResult;
        this.queue = queue;

        js.append(String.format(Locale.US, "{dequeuedValue: %f,period: %f,prevResult: %f,queue: %s}",  dequeuedValue, period, prevResult, ((queue != null) ? queue.generateJs() : "null")));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}