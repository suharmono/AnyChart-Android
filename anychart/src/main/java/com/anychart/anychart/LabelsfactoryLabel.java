package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Class for a creation of sets of similar labels and management of such sets.
Any individual label can be changed after all labels are displayed.
 */
public class LabelsfactoryLabel extends CoreText {

    public LabelsfactoryLabel() {
        js.setLength(0);
        js.append("var labelsfactoryLabel").append(++variableIndex).append(" = anychart.core.ui.LabelsFactory.label();");
        jsBase = "labelsfactoryLabel" + variableIndex;
    }

    protected LabelsfactoryLabel(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected LabelsfactoryLabel(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean adjustByWidth;
    private Boolean adjustByHeight;

    /**
     * Setter for the adjusting font size by two parameters width and height.
     */
    public LabelsfactoryLabel setAdjustFontSize(Boolean adjustByWidth, Boolean adjustByHeight) {
        if (jsBase == null) {
            this.adjustByWidth = adjustByWidth;
            this.adjustByHeight = adjustByHeight;
        } else {
            this.adjustByWidth = adjustByWidth;
            this.adjustByHeight = adjustByHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".adjustFontSize(%b, %b)", adjustByWidth, adjustByHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adjustFontSize(%b, %b);", adjustByWidth, adjustByHeight));
                js.setLength(0);
            }
        }
        return this;
    }

    private String adjustFontSize;
    private Boolean[] adjustFontSize1;
    private Boolean adjustFontSize2;

    /**
     * Setter for the adjusting font size by one parameter.
     */
    public LabelsfactoryLabel setAdjustFontSize(String adjustFontSize) {
        if (jsBase == null) {
            this.adjustFontSize = null;
            this.adjustFontSize1 = null;
            this.adjustFontSize2 = null;
            
            this.adjustFontSize = adjustFontSize;
        } else {
            this.adjustFontSize = adjustFontSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".adjustFontSize(%s)", wrapQuotes(adjustFontSize)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adjustFontSize(%s);", wrapQuotes(adjustFontSize)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the adjusting font size by one parameter.
     */
    public LabelsfactoryLabel setAdjustFontSize(Boolean[] adjustFontSize1) {
        if (jsBase == null) {
            this.adjustFontSize = null;
            this.adjustFontSize1 = null;
            this.adjustFontSize2 = null;
            
            this.adjustFontSize1 = adjustFontSize1;
        } else {
            this.adjustFontSize1 = adjustFontSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".adjustFontSize(%s)", Arrays.toString(adjustFontSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adjustFontSize(%s);", Arrays.toString(adjustFontSize1)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the adjusting font size by one parameter.
     */
    public LabelsfactoryLabel setAdjustFontSize(Boolean adjustFontSize2) {
        if (jsBase == null) {
            this.adjustFontSize = null;
            this.adjustFontSize1 = null;
            this.adjustFontSize2 = null;
            
            this.adjustFontSize2 = adjustFontSize2;
        } else {
            this.adjustFontSize2 = adjustFontSize2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".adjustFontSize(%b)", adjustFontSize2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adjustFontSize(%b);", adjustFontSize2));
                js.setLength(0);
            }
        }
        return this;
    }

    private EnumsAnchor anchor;
    private String anchor1;

    /**
     * Setter for the label anchor settings.
     */
    public void setAnchor(EnumsAnchor anchor) {
        if (jsBase == null) {
            this.anchor = null;
            this.anchor1 = null;
            
            this.anchor = anchor;
        } else {
            this.anchor = anchor;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".anchor(%s);", ((anchor != null) ? anchor.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".anchor(%s);", ((anchor != null) ? anchor.generateJs() : "null")));
                js.setLength(0);
            }
        }
    }


    /**
     * Setter for the label anchor settings.
     */
    public void setAnchor(String anchor1) {
        if (jsBase == null) {
            this.anchor = null;
            this.anchor1 = null;
            
            this.anchor1 = anchor1;
        } else {
            this.anchor1 = anchor1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".anchor(%s);", wrapQuotes(anchor1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".anchor(%s);", wrapQuotes(anchor1)));
                js.setLength(0);
            }
        }
    }

    private UiBackground getBackground;

    /**
     * Getter for label background settings.
     */
    public UiBackground getBackground() {
        if (getBackground == null)
            getBackground = new UiBackground(jsBase + ".background()");

        return getBackground;
    }

    private String background;
    private String background1;
    private Boolean background2;

    /**
     * Setter for label background settings.
     */
    public LabelsfactoryLabel setBackground(String background) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background = background;
        } else {
            this.background = background;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".background(%s)", wrapQuotes(background)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".background(%s);", wrapQuotes(background)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for label background settings.
     */
    public LabelsfactoryLabel setBackground(Boolean background2) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background2 = background2;
        } else {
            this.background2 = background2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".background(%b)", background2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".background(%b);", background2));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double height;
    private String height1;

    /**
     * Setter for the label height.
     */
    public LabelsfactoryLabel setHeight(Double height) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.height = height;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".height(%f)", height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%f);", height));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the label height.
     */
    public LabelsfactoryLabel setHeight(String height1) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.height1 = height1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".height(%s)", wrapQuotes(height1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(height1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double maxFontSize;
    private String maxFontSize1;

    /**
     * Setter for maximum font size settings for adjust text to.
     */
    public LabelsfactoryLabel setMaxFontSize(Double maxFontSize) {
        if (jsBase == null) {
            this.maxFontSize = null;
            this.maxFontSize1 = null;
            
            this.maxFontSize = maxFontSize;
        } else {
            this.maxFontSize = maxFontSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxFontSize(%f)", maxFontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxFontSize(%f);", maxFontSize));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for maximum font size settings for adjust text to.
     */
    public LabelsfactoryLabel setMaxFontSize(String maxFontSize1) {
        if (jsBase == null) {
            this.maxFontSize = null;
            this.maxFontSize1 = null;
            
            this.maxFontSize1 = maxFontSize1;
        } else {
            this.maxFontSize1 = maxFontSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxFontSize(%s)", wrapQuotes(maxFontSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxFontSize(%s);", wrapQuotes(maxFontSize1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double minFontSize;
    private String minFontSize1;

    /**
     * Setter for minimum font size settings for adjust text from.
     */
    public LabelsfactoryLabel setMinFontSize(Double minFontSize) {
        if (jsBase == null) {
            this.minFontSize = null;
            this.minFontSize1 = null;
            
            this.minFontSize = minFontSize;
        } else {
            this.minFontSize = minFontSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minFontSize(%f)", minFontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minFontSize(%f);", minFontSize));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for minimum font size settings for adjust text from.
     */
    public LabelsfactoryLabel setMinFontSize(String minFontSize1) {
        if (jsBase == null) {
            this.minFontSize = null;
            this.minFontSize1 = null;
            
            this.minFontSize1 = minFontSize1;
        } else {
            this.minFontSize1 = minFontSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minFontSize(%s)", wrapQuotes(minFontSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minFontSize(%s);", wrapQuotes(minFontSize1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double offsetX;
    private String offsetX1;

    /**
     * Setter for label offsetX settings.
     */
    public LabelsfactoryLabel setOffsetX(Double offsetX) {
        if (jsBase == null) {
            this.offsetX = null;
            this.offsetX1 = null;
            
            this.offsetX = offsetX;
        } else {
            this.offsetX = offsetX;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".offsetX(%f)", offsetX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".offsetX(%f);", offsetX));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for label offsetX settings.
     */
    public LabelsfactoryLabel setOffsetX(String offsetX1) {
        if (jsBase == null) {
            this.offsetX = null;
            this.offsetX1 = null;
            
            this.offsetX1 = offsetX1;
        } else {
            this.offsetX1 = offsetX1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".offsetX(%s)", wrapQuotes(offsetX1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".offsetX(%s);", wrapQuotes(offsetX1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double offsetY;
    private String offsetY1;

    /**
     * Setter for label offsetY settings.
     */
    public LabelsfactoryLabel setOffsetY(Double offsetY) {
        if (jsBase == null) {
            this.offsetY = null;
            this.offsetY1 = null;
            
            this.offsetY = offsetY;
        } else {
            this.offsetY = offsetY;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".offsetY(%f)", offsetY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".offsetY(%f);", offsetY));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for label offsetY settings.
     */
    public LabelsfactoryLabel setOffsetY(String offsetY1) {
        if (jsBase == null) {
            this.offsetY = null;
            this.offsetY1 = null;
            
            this.offsetY1 = offsetY1;
        } else {
            this.offsetY1 = offsetY1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".offsetY(%s)", wrapQuotes(offsetY1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".offsetY(%s);", wrapQuotes(offsetY1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private UtilsPadding getPadding;

    /**
     * Getter for the label padding.
     */
    public UtilsPadding getPadding() {
        if (getPadding == null)
            getPadding = new UtilsPadding(jsBase + ".padding()");

        return getPadding;
    }

    private Double[] padding;
    private String[] padding1;
    private String padding2;
    private Double padding3;
    private String padding4;

    /**
     * Setter for label padding in pixels using a single value.
     */
    public LabelsfactoryLabel setPadding(Double[] padding) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            this.padding3 = null;
            this.padding4 = null;
            
            this.padding = padding;
        } else {
            this.padding = padding;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%s)", Arrays.toString(padding)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for label padding in pixels using a single value.
     */
    public LabelsfactoryLabel setPadding(String[] padding1) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            this.padding3 = null;
            this.padding4 = null;
            
            this.padding1 = padding1;
        } else {
            this.padding1 = padding1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%s)", arrayToStringWrapQuotes(padding1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", arrayToStringWrapQuotes(padding1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;

    /**
     * Setter for label padding setting in pixels using a several value.
     */
    public LabelsfactoryLabel setPadding(String value, String value2, String value4, String value6) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value = value;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
        } else {
            this.value = value;
            this.value2 = value2;
            this.value4 = value4;
            this.value6 = value6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for label padding setting in pixels using a several value.
     */
    public LabelsfactoryLabel setPadding(Double value1, Double value3, Double value5, Double value7) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value1 = value1;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
        } else {
            this.value1 = value1;
            this.value3 = value3;
            this.value5 = value5;
            this.value7 = value7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%f, %f, %f, %f)", value1, value3, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %f, %f, %f);", value1, value3, value5, value7));
                js.setLength(0);
            }
        }
        return this;
    }

    private String position;

    /**
     * Setter for the label position settings.
     */
    public LabelsfactoryLabel setPosition(String position) {
        if (jsBase == null) {
            this.position = position;
        } else {
            this.position = position;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".position(%s)", wrapQuotes(position)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".position(%s);", wrapQuotes(position)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double rotation;

    /**
     * Setter for the rotate a label around an anchor.
     */
    public LabelsfactoryLabel setRotation(Double rotation) {
        if (jsBase == null) {
            this.rotation = rotation;
        } else {
            this.rotation = rotation;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rotation(%f)", rotation));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rotation(%f);", rotation));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double width;
    private String width1;

    /**
     * Setter for the label width.
     */
    public LabelsfactoryLabel setWidth(Double width) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width = width;
        } else {
            this.width = width;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".width(%f)", width));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%f);", width));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the label width.
     */
    public LabelsfactoryLabel setWidth(String width1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
        } else {
            this.width1 = width1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".width(%s)", wrapQuotes(width1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(width1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetBackground() {
        if (getBackground != null) {
            return getBackground.generateJs();
        }
        return "";
    }

    private String generateJSgetPadding() {
        if (getPadding != null) {
            return getPadding.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetBackground());
        jsGetters.append(generateJSgetPadding());

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