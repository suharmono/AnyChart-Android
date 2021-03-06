package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Range Picker (only for stock chart).
 */
public class RangePicker extends JsObject {

    public RangePicker() {
        js.setLength(0);
        js.append("var rangePicker").append(++variableIndex).append(" = anychart.ui.rangePicker();");
        jsBase = "rangePicker" + variableIndex;
    }

    protected RangePicker(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected RangePicker(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Element decorate;

    /**
     * Decorates the container for the range picker.
     */
    public void decorate(Element decorate) {
        if (jsBase == null) {
            this.decorate = decorate;
        } else {
            this.decorate = decorate;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(decorate.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".decorate(%s);",  ((decorate != null) ? decorate.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".decorate(%s);", ((decorate != null) ? decorate.getJsBase() : "null")));
                js.setLength(0);
            }
        }
    }

    private String format;

    /**
     * Setter for the input and output date time format.
     */
    public void setFormat(String format) {
        if (jsBase == null) {
            this.format = format;
        } else {
            this.format = format;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".format(%s);", wrapQuotes(format)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".format(%s);", wrapQuotes(format)));
                js.setLength(0);
            }
        }
    }

    private String fromLabelText;

    /**
     * Setter for the text for 'from'-label.
     */
    public RangePicker setFromLabelText(String fromLabelText) {
        if (jsBase == null) {
            this.fromLabelText = fromLabelText;
        } else {
            this.fromLabelText = fromLabelText;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fromLabelText(%s)", wrapQuotes(fromLabelText)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fromLabelText(%s);", wrapQuotes(fromLabelText)));
                js.setLength(0);
            }
        }
        return this;
    }

    private ChartsStock parentElement;
    private Element parentElement1;

    /**
     * Renders the range picker.
     */
    public void render(ChartsStock parentElement) {
        if (jsBase == null) {
            this.parentElement = null;
            this.parentElement1 = null;
            
            this.parentElement = parentElement;
        } else {
            this.parentElement = parentElement;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(parentElement.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".render(%s);",  ((parentElement != null) ? parentElement.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".render(%s);", ((parentElement != null) ? parentElement.getJsBase() : "null")));
                js.setLength(0);
            }
        }
    }


    /**
     * Renders the range picker.
     */
    public void render(Element parentElement1) {
        if (jsBase == null) {
            this.parentElement = null;
            this.parentElement1 = null;
            
            this.parentElement1 = parentElement1;
        } else {
            this.parentElement1 = parentElement1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(parentElement1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".render(%s);",  ((parentElement1 != null) ? parentElement1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".render(%s);", ((parentElement1 != null) ? parentElement1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
    }

    private ChartsStock chart;

    /**
     * Sets stock chart for range picker.
     */
    public void setTarget(ChartsStock chart) {
        if (jsBase == null) {
            this.chart = chart;
        } else {
            this.chart = chart;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(chart.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".target(%s);",  ((chart != null) ? chart.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".target(%s);", ((chart != null) ? chart.getJsBase() : "null")));
                js.setLength(0);
            }
        }
    }

    private String toLabelText;

    /**
     * Setter for the text for 'to'-label.
     */
    public RangePicker setToLabelText(String toLabelText) {
        if (jsBase == null) {
            this.toLabelText = toLabelText;
        } else {
            this.toLabelText = toLabelText;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".toLabelText(%s)", wrapQuotes(toLabelText)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toLabelText(%s);", wrapQuotes(toLabelText)));
                js.setLength(0);
            }
        }
        return this;
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}