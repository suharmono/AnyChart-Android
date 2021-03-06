package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Date scale with calendar support.
 */
public class DateTimeWithCalendar extends ScatterBase {

    public DateTimeWithCalendar() {
        js.setLength(0);
        js.append("var dateTimeWithCalendar").append(++variableIndex).append(" = anychart.scales.dateTimeWithCalendar();");
        jsBase = "dateTimeWithCalendar" + variableIndex;
    }

    protected DateTimeWithCalendar(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected DateTimeWithCalendar(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Calendar getCalendar;

    /**
     * Getter for the scale calendar.
     */
    public Calendar getCalendar() {
        if (getCalendar == null)
            getCalendar = new Calendar(jsBase + ".calendar()");

        return getCalendar;
    }

    private Double count;

    /**
     * Setter for the unit count.
     */
    public DateTimeWithCalendar setCount(Double count) {
        if (jsBase == null) {
            this.count = count;
        } else {
            this.count = count;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".count(%f)", count));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".count(%f);", count));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double date;

    /**
     * Transforms date to pixels.
     */
    public void dateToPix(Double date) {
        if (jsBase == null) {
            this.date = date;
        } else {
            this.date = date;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".dateToPix(%f);", date));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dateToPix(%f);", date));
                js.setLength(0);
            }
        }
    }

    private Double fromPix;
    private Double toPix;
    private Interval unit;
    private String unit1;
    private Double count1;

    /**
     * Returns ticks array (even indexes are left borders, odd indexes are right borders of the tick)
with passed interval. Ticks fill space from the fromPix pixel to the toPix pixel (if available).
     */
    public void getTicks(Double fromPix, Double toPix, Interval unit, Double count1) {
        if (jsBase == null) {
            this.fromPix = fromPix;
            this.toPix = toPix;
            this.unit = null;
            this.unit1 = null;
            
            this.unit = unit;
            this.count = null;
            this.count1 = null;
            
            this.count1 = count1;
        } else {
            this.fromPix = fromPix;
            this.toPix = toPix;
            this.unit = unit;
            this.count1 = count1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getTicks(%f, %f, %s, %f);", fromPix, toPix, ((unit != null) ? unit.generateJs() : "null"), count1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getTicks(%f, %f, %s, %f);", fromPix, toPix, ((unit != null) ? unit.generateJs() : "null"), count1));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns ticks array (even indexes are left borders, odd indexes are right borders of the tick)
with passed interval. Ticks fill space from the fromPix pixel to the toPix pixel (if available).
     */
    public void getTicks(Double fromPix, Double toPix, String unit1, Double count1) {
        if (jsBase == null) {
            this.fromPix = fromPix;
            this.toPix = toPix;
            this.unit = null;
            this.unit1 = null;
            
            this.unit1 = unit1;
            this.count = null;
            this.count1 = null;
            
            this.count1 = count1;
        } else {
            this.fromPix = fromPix;
            this.toPix = toPix;
            this.unit1 = unit1;
            this.count1 = count1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getTicks(%f, %f, %s, %f);", fromPix, toPix, wrapQuotes(unit1), count1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getTicks(%f, %f, %s, %f);", fromPix, toPix, wrapQuotes(unit1), count1));
                js.setLength(0);
            }
        }
    }

    private Double maximumGap;
    private List<DateTime> setMaximumGap = new ArrayList<>();

    /**
     * Setter for the scale maximum gap.
     */
    public DateTime setMaximumGap(Double maximumGap) {
        if (jsBase == null) {
            this.maximumGap = maximumGap;
        } else {
            this.maximumGap = maximumGap;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMaximumGap" + ++variableIndex + " = " + jsBase + ".maximumGap(%f);", maximumGap));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maximumGap(%f);", maximumGap));
                js.setLength(0);
            }
        }
        DateTime item = new DateTime("setMaximumGap" + variableIndex);
        setMaximumGap.add(item);
        return item;
    }
    private String generateJSsetMaximumGap() {
        if (!setMaximumGap.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DateTime item : setMaximumGap) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minimumGap;
    private List<DateTime> setMinimumGap = new ArrayList<>();

    /**
     * Setter for the scale minimum gap.
     */
    public DateTime setMinimumGap(Double minimumGap) {
        if (jsBase == null) {
            this.minimumGap = minimumGap;
        } else {
            this.minimumGap = minimumGap;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMinimumGap" + ++variableIndex + " = " + jsBase + ".minimumGap(%f);", minimumGap));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minimumGap(%f);", minimumGap));
                js.setLength(0);
            }
        }
        DateTime item = new DateTime("setMinimumGap" + variableIndex);
        setMinimumGap.add(item);
        return item;
    }
    private String generateJSsetMinimumGap() {
        if (!setMinimumGap.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DateTime item : setMinimumGap) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double pix;

    /**
     * Transforms pixels to date.
     */
    public void pixToDate(Double pix) {
        if (jsBase == null) {
            this.pix = pix;
        } else {
            this.pix = pix;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".pixToDate(%f);", pix));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".pixToDate(%f);", pix));
                js.setLength(0);
            }
        }
    }

    private Boolean skipHolidays;

    /**
     * Setter for skipping holidays.
     */
    public DateTimeWithCalendar setSkipHolidays(Boolean skipHolidays) {
        if (jsBase == null) {
            this.skipHolidays = skipHolidays;
        } else {
            this.skipHolidays = skipHolidays;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".skipHolidays(%b)", skipHolidays));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".skipHolidays(%b);", skipHolidays));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double softMaximum;
    private List<DateTime> setSoftMaximum = new ArrayList<>();

    /**
     * Setter for the soft maximum.
     */
    public DateTime setSoftMaximum(Double softMaximum) {
        if (jsBase == null) {
            this.softMaximum = softMaximum;
        } else {
            this.softMaximum = softMaximum;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSoftMaximum" + ++variableIndex + " = " + jsBase + ".softMaximum(%f);", softMaximum));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".softMaximum(%f);", softMaximum));
                js.setLength(0);
            }
        }
        DateTime item = new DateTime("setSoftMaximum" + variableIndex);
        setSoftMaximum.add(item);
        return item;
    }
    private String generateJSsetSoftMaximum() {
        if (!setSoftMaximum.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DateTime item : setSoftMaximum) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double softMinimum;
    private List<DateTime> setSoftMinimum = new ArrayList<>();

    /**
     * Setter for the soft minimum.
     */
    public DateTime setSoftMinimum(Double softMinimum) {
        if (jsBase == null) {
            this.softMinimum = softMinimum;
        } else {
            this.softMinimum = softMinimum;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSoftMinimum" + ++variableIndex + " = " + jsBase + ".softMinimum(%f);", softMinimum));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".softMinimum(%f);", softMinimum));
                js.setLength(0);
            }
        }
        DateTime item = new DateTime("setSoftMinimum" + variableIndex);
        setSoftMinimum.add(item);
        return item;
    }
    private String generateJSsetSoftMinimum() {
        if (!setSoftMinimum.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DateTime item : setSoftMinimum) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Interval unit2;
    private String unit3;

    /**
     * Setter for the unit interval.
     */
    public DateTimeWithCalendar setUnit(Interval unit2) {
        if (jsBase == null) {
            this.unit = null;
            this.unit1 = null;
            this.unit2 = null;
            this.unit3 = null;
            
            this.unit2 = unit2;
        } else {
            this.unit2 = unit2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".unit(%s)", ((unit2 != null) ? unit2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unit(%s);", ((unit2 != null) ? unit2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the unit interval.
     */
    public DateTimeWithCalendar setUnit(String unit3) {
        if (jsBase == null) {
            this.unit = null;
            this.unit1 = null;
            this.unit2 = null;
            this.unit3 = null;
            
            this.unit3 = unit3;
        } else {
            this.unit3 = unit3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".unit(%s)", wrapQuotes(unit3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unit(%s);", wrapQuotes(unit3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double unitPixSize;
    private String unitPixSize1;

    /**
     * Setter for unit size.
     */
    public DateTimeWithCalendar setUnitPixSize(Double unitPixSize) {
        if (jsBase == null) {
            this.unitPixSize = null;
            this.unitPixSize1 = null;
            
            this.unitPixSize = unitPixSize;
        } else {
            this.unitPixSize = unitPixSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".unitPixSize(%f)", unitPixSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unitPixSize(%f);", unitPixSize));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for unit size.
     */
    public DateTimeWithCalendar setUnitPixSize(String unitPixSize1) {
        if (jsBase == null) {
            this.unitPixSize = null;
            this.unitPixSize1 = null;
            
            this.unitPixSize1 = unitPixSize1;
        } else {
            this.unitPixSize1 = unitPixSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".unitPixSize(%s)", wrapQuotes(unitPixSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unitPixSize(%s);", wrapQuotes(unitPixSize1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetCalendar() {
        if (getCalendar != null) {
            return getCalendar.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetCalendar());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetMaximumGap());
        js.append(generateJSsetMinimumGap());
        js.append(generateJSsetSoftMaximum());
        js.append(generateJSsetSoftMinimum());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}