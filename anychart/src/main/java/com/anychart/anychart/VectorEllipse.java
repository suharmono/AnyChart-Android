package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Ellipse Class.<br>
<b>Do not invoke constructor directly.</b> Use {@link anychart.graphics.vector.Stage#ellipse} or
{@link anychart.graphics.vector.Layer#ellipse} to make stage or layer bound ellipse.
<br/> Use {@link anychart.graphics#ellipse} to create an unbound ellipse.<br/>
See also:<br/>
{@link anychart.graphics.vector.Stage#ellipse},<br/>
{@link anychart.graphics.vector.Layer#ellipse},<br/>
{@link anychart.graphics#ellipse}
 */
public class VectorEllipse extends Shape {

    public VectorEllipse() {
        js.setLength(0);
        js.append("var vectorEllipse").append(++variableIndex).append(" = anychart.graphics.vector.ellipse();");
        jsBase = "vectorEllipse" + variableIndex;
    }

    protected VectorEllipse(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected VectorEllipse(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Coordinate center;

    /**
     * Sets center coordinates.
     */
    public VectorEllipse setCenter(Coordinate center) {
        if (jsBase == null) {
            this.center = center;
        } else {
            this.center = center;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".center(%s)", ((center != null) ? center.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".center(%s);", ((center != null) ? center.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double centerX;

    /**
     * Sets a center X.
     */
    public VectorEllipse setCenterX(Double centerX) {
        if (jsBase == null) {
            this.centerX = centerX;
        } else {
            this.centerX = centerX;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".centerX(%f)", centerX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".centerX(%f);", centerX));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double centerY;

    /**
     * Sets a center Y.
     */
    public VectorEllipse setCenterY(Double centerY) {
        if (jsBase == null) {
            this.centerY = centerY;
        } else {
            this.centerY = centerY;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".centerY(%f)", centerY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".centerY(%f);", centerY));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double radiusX;

    /**
     * Sets a X radius.
     */
    public VectorEllipse setRadiusX(Double radiusX) {
        if (jsBase == null) {
            this.radiusX = radiusX;
        } else {
            this.radiusX = radiusX;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".radiusX(%f)", radiusX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".radiusX(%f);", radiusX));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double radiusY;

    /**
     * Sets a Y radius.
     */
    public VectorEllipse setRadiusY(Double radiusY) {
        if (jsBase == null) {
            this.radiusY = radiusY;
        } else {
            this.radiusY = radiusY;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".radiusY(%f)", radiusY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".radiusY(%f);", radiusY));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double rx;
    private Double ry;

    /**
     * Sets radius.
     */
    public VectorEllipse setSetRadius(Double rx, Double ry) {
        if (jsBase == null) {
            this.rx = rx;
            this.ry = ry;
        } else {
            this.rx = rx;
            this.ry = ry;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setRadius(%f, %f)", rx, ry));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setRadius(%f, %f);", rx, ry));
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