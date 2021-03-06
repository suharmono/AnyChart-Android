package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * <b>Abstract</b> class for all vector elements, such as groups and primitives.<br/>
Due to the fact that this class is a child of from goog.events.EventTarget
all its childs can work with events.<br/>
<b>Never call a constructor directly!</b>
 */
public class Element extends JsObject {

    public Element() {
        js.setLength(0);
        js.append("var element").append(++variableIndex).append(" = anychart.graphics.vector.element();");
        jsBase = "element" + variableIndex;
    }

    protected Element(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Element(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double m;
    private Double m1;
    private Double m2;
    private Double m3;
    private Double m4;
    private Double m5;

    /**
     * Combines the current transformation with the given transformation matrix.
     */
    public Element appendTransformationMatrix(Double m, Double m1, Double m2, Double m3, Double m4, Double m5) {
        if (jsBase == null) {
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            
            this.m = m;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            
            this.m1 = m1;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            
            this.m2 = m2;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            
            this.m3 = m3;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            
            this.m4 = m4;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            
            this.m5 = m5;
        } else {
            this.m = m;
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
            this.m4 = m4;
            this.m5 = m5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".appendTransformationMatrix(%f, %f, %f, %f, %f, %f)", m, m1, m2, m3, m4, m5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".appendTransformationMatrix(%f, %f, %f, %f, %f, %f);", m, m1, m2, m3, m4, m5));
                js.setLength(0);
            }
        }
        return this;
    }

    private String key;

    /**
     * Setter for the attribute.
     */
    public Element setAttr(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".attr(%s)", wrapQuotes(key)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".attr(%s);", wrapQuotes(key)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GraphicsMathRect getClip;

    /**
     * Gets the current clipping rectangle.
     */
    public GraphicsMathRect getClip() {
        if (getClip == null)
            getClip = new GraphicsMathRect(jsBase + ".clip()");

        return getClip;
    }

    private GraphicsMathRect clip;
    private String clip1;

    /**
     * Sets the clipping rectangle.
     */
    public Element setClip(GraphicsMathRect clip) {
        if (jsBase == null) {
            this.clip = null;
            this.clip1 = null;
            
            this.clip = clip;
        } else {
            this.clip = clip;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(clip.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".clip(%s);",  ((clip != null) ? clip.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".clip(%s);", ((clip != null) ? clip.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Sets the clipping rectangle.
     */
    public Element setClip(String clip1) {
        if (jsBase == null) {
            this.clip = null;
            this.clip1 = null;
            
            this.clip1 = clip1;
        } else {
            this.clip1 = clip1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".clip(%s)", wrapQuotes(clip1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".clip(%s);", wrapQuotes(clip1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private VectorCursor cursor;

    /**
     * Setter for the cursor type.
     */
    public Element setCursor(VectorCursor cursor) {
        if (jsBase == null) {
            this.cursor = cursor;
        } else {
            this.cursor = cursor;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".cursor(%s)", ((cursor != null) ? cursor.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cursor(%s);", ((cursor != null) ? cursor.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String desc;

    /**
     * Setter for the element description value.
     */
    public Element setDesc(String desc) {
        if (jsBase == null) {
            this.desc = desc;
        } else {
            this.desc = desc;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".desc(%s)", wrapQuotes(desc)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".desc(%s);", wrapQuotes(desc)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean disablePointerEvents;

    /**
     * Disables the pointer events.
     */
    public Element disablePointerEvents(Boolean disablePointerEvents) {
        if (jsBase == null) {
            this.disablePointerEvents = disablePointerEvents;
        } else {
            this.disablePointerEvents = disablePointerEvents;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".disablePointerEvents(%b)", disablePointerEvents));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".disablePointerEvents(%b);", disablePointerEvents));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean disableStrokeScaling;

    /**
     * Setter for the element's vector effect property.<br/>
Learn more by <a href="https://www.w3.org/TR/2004/WD-SVG12-20041027/vectoreffects.html#vector-effect-prop">link</a>.
     */
    public Element setDisableStrokeScaling(Boolean disableStrokeScaling) {
        if (jsBase == null) {
            this.disableStrokeScaling = disableStrokeScaling;
        } else {
            this.disableStrokeScaling = disableStrokeScaling;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".disableStrokeScaling(%b)", disableStrokeScaling));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".disableStrokeScaling(%b);", disableStrokeScaling));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean drag;
    private GraphicsMathRect drag1;

    /**
     * Turns off/on dragging (moving) of an element.
     */
    public Element drag(Boolean drag) {
        if (jsBase == null) {
            this.drag = null;
            this.drag1 = null;
            
            this.drag = drag;
        } else {
            this.drag = drag;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".drag(%b)", drag));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".drag(%b);", drag));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Turns off/on dragging (moving) of an element.
     */
    public Element drag(GraphicsMathRect drag1) {
        if (jsBase == null) {
            this.drag = null;
            this.drag1 = null;
            
            this.drag1 = drag1;
        } else {
            this.drag1 = drag1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(drag1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".drag(%s);",  ((drag1 != null) ? drag1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".drag(%s);", ((drag1 != null) ? drag1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private GraphicsMathRect getGetAbsoluteBounds;

    /**
     * Gets element bounds in absolute coordinates (root element coordinate system).
     */
    public GraphicsMathRect getGetAbsoluteBounds() {
        if (getGetAbsoluteBounds == null)
            getGetAbsoluteBounds = new GraphicsMathRect(jsBase + ".getAbsoluteBounds()");

        return getGetAbsoluteBounds;
    }

    private String id;

    /**
     * Sets the element identifier.
     */
    public Element setId(String id) {
        if (jsBase == null) {
            this.id = id;
        } else {
            this.id = id;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".id(%s)", wrapQuotes(id)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".id(%s);", wrapQuotes(id)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Layer parent;
    private Stage parent1;

    /**
     * Adds element to the given layer.
     */
    public Element parent(Layer parent) {
        if (jsBase == null) {
            this.parent = null;
            this.parent1 = null;
            
            this.parent = parent;
        } else {
            this.parent = parent;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(parent.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".parent(%s);",  ((parent != null) ? parent.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".parent(%s);", ((parent != null) ? parent.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Adds element to the given layer.
     */
    public Element parent(Stage parent1) {
        if (jsBase == null) {
            this.parent = null;
            this.parent1 = null;
            
            this.parent1 = parent1;
        } else {
            this.parent1 = parent1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(parent1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".parent(%s);",  ((parent1 != null) ? parent1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".parent(%s);", ((parent1 != null) ? parent1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double degrees;
    private Double cx;
    private Double cy;

    /**
     * Rotates a shape around the given rotation point.
     */
    public Element rotate(Double degrees, Double cx, Double cy) {
        if (jsBase == null) {
            this.degrees = degrees;
            this.cx = cx;
            this.cy = cy;
        } else {
            this.degrees = degrees;
            this.cx = cx;
            this.cy = cy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rotate(%f, %f, %f)", degrees, cx, cy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rotate(%f, %f, %f);", degrees, cx, cy));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double degrees1;
    private VectorAnchor anchor;
    private String anchor1;

    /**
     * Rotates a shape around the given anchor.
     */
    public Element rotateByAnchor(Double degrees1, VectorAnchor anchor) {
        if (jsBase == null) {
            this.degrees = null;
            this.degrees1 = null;
            
            this.degrees1 = degrees1;
            this.anchor = null;
            this.anchor1 = null;
            
            this.anchor = anchor;
        } else {
            this.degrees1 = degrees1;
            this.anchor = anchor;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rotateByAnchor(%f, %s)", degrees1, ((anchor != null) ? anchor.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rotateByAnchor(%f, %s);", degrees1, ((anchor != null) ? anchor.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Rotates a shape around the given anchor.
     */
    public Element rotateByAnchor(Double degrees1, String anchor1) {
        if (jsBase == null) {
            this.degrees = null;
            this.degrees1 = null;
            
            this.degrees1 = degrees1;
            this.anchor = null;
            this.anchor1 = null;
            
            this.anchor1 = anchor1;
        } else {
            this.degrees1 = degrees1;
            this.anchor1 = anchor1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rotateByAnchor(%f, %s)", degrees1, wrapQuotes(anchor1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rotateByAnchor(%f, %s);", degrees1, wrapQuotes(anchor1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double sx;
    private Double sy;
    private Double cx1;
    private Double cy1;

    /**
     * Scales a shape. Scaling center is set in the coordinate system of the parent.
     */
    public Element scale(Double sx, Double sy, Double cx1, Double cy1) {
        if (jsBase == null) {
            this.sx = sx;
            this.sy = sy;
            this.cx = null;
            this.cx1 = null;
            
            this.cx1 = cx1;
            this.cy = null;
            this.cy1 = null;
            
            this.cy1 = cy1;
        } else {
            this.sx = sx;
            this.sy = sy;
            this.cx1 = cx1;
            this.cy1 = cy1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".scale(%f, %f, %f, %f)", sx, sy, cx1, cy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%f, %f, %f, %f);", sx, sy, cx1, cy1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double sx1;
    private Double sy1;
    private VectorAnchor anchor2;
    private String anchor3;

    /**
     * Scales a shape by anchor. Scaling center is set as an anchor.
     */
    public Element scaleByAnchor(Double sx1, Double sy1, VectorAnchor anchor2) {
        if (jsBase == null) {
            this.sx = null;
            this.sx1 = null;
            
            this.sx1 = sx1;
            this.sy = null;
            this.sy1 = null;
            
            this.sy1 = sy1;
            this.anchor = null;
            this.anchor1 = null;
            this.anchor2 = null;
            this.anchor3 = null;
            
            this.anchor2 = anchor2;
        } else {
            this.sx1 = sx1;
            this.sy1 = sy1;
            this.anchor2 = anchor2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".scaleByAnchor(%f, %f, %s)", sx1, sy1, ((anchor2 != null) ? anchor2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scaleByAnchor(%f, %f, %s);", sx1, sy1, ((anchor2 != null) ? anchor2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Scales a shape by anchor. Scaling center is set as an anchor.
     */
    public Element scaleByAnchor(Double sx1, Double sy1, String anchor3) {
        if (jsBase == null) {
            this.sx = null;
            this.sx1 = null;
            
            this.sx1 = sx1;
            this.sy = null;
            this.sy1 = null;
            
            this.sy1 = sy1;
            this.anchor = null;
            this.anchor1 = null;
            this.anchor2 = null;
            this.anchor3 = null;
            
            this.anchor3 = anchor3;
        } else {
            this.sx1 = sx1;
            this.sy1 = sy1;
            this.anchor3 = anchor3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".scaleByAnchor(%f, %f, %s)", sx1, sy1, wrapQuotes(anchor3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scaleByAnchor(%f, %f, %s);", sx1, sy1, wrapQuotes(anchor3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double x;
    private Double y;

    /**
     * Sets top left corner of a shape (transformation taken into account) in the coordinate system of the parent.
     */
    public Element setSetPosition(Double x, Double y) {
        if (jsBase == null) {
            this.x = x;
            this.y = y;
        } else {
            this.x = x;
            this.y = y;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setPosition(%f, %f)", x, y));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setPosition(%f, %f);", x, y));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double degrees2;
    private Double cx2;
    private Double cy2;

    /**
     * Rotates a shape around the given point.
     */
    public Element setRotation(Double degrees2, Double cx2, Double cy2) {
        if (jsBase == null) {
            this.degrees = null;
            this.degrees1 = null;
            this.degrees2 = null;
            
            this.degrees2 = degrees2;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            
            this.cx2 = cx2;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            
            this.cy2 = cy2;
        } else {
            this.degrees2 = degrees2;
            this.cx2 = cx2;
            this.cy2 = cy2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setRotation(%f, %f, %f)", degrees2, cx2, cy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setRotation(%f, %f, %f);", degrees2, cx2, cy2));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double degrees3;
    private VectorAnchor anchor4;
    private String anchor5;

    /**
     * Rotates a shape around the given anchor.
     */
    public Element setRotationByAnchor(Double degrees3, VectorAnchor anchor4) {
        if (jsBase == null) {
            this.degrees = null;
            this.degrees1 = null;
            this.degrees2 = null;
            this.degrees3 = null;
            
            this.degrees3 = degrees3;
            this.anchor = null;
            this.anchor1 = null;
            this.anchor2 = null;
            this.anchor3 = null;
            this.anchor4 = null;
            this.anchor5 = null;
            
            this.anchor4 = anchor4;
        } else {
            this.degrees3 = degrees3;
            this.anchor4 = anchor4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setRotationByAnchor(%f, %s)", degrees3, ((anchor4 != null) ? anchor4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setRotationByAnchor(%f, %s);", degrees3, ((anchor4 != null) ? anchor4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Rotates a shape around the given anchor.
     */
    public Element setRotationByAnchor(Double degrees3, String anchor5) {
        if (jsBase == null) {
            this.degrees = null;
            this.degrees1 = null;
            this.degrees2 = null;
            this.degrees3 = null;
            
            this.degrees3 = degrees3;
            this.anchor = null;
            this.anchor1 = null;
            this.anchor2 = null;
            this.anchor3 = null;
            this.anchor4 = null;
            this.anchor5 = null;
            
            this.anchor5 = anchor5;
        } else {
            this.degrees3 = degrees3;
            this.anchor5 = anchor5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setRotationByAnchor(%f, %s)", degrees3, wrapQuotes(anchor5)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setRotationByAnchor(%f, %s);", degrees3, wrapQuotes(anchor5)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double m6;
    private Double m7;
    private Double m8;
    private Double m9;
    private Double m10;
    private Double m11;

    /**
     * Sets the transformation matrix.
     */
    public Element setSetTransformationMatrix(Double m6, Double m7, Double m8, Double m9, Double m10, Double m11) {
        if (jsBase == null) {
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            this.m6 = null;
            this.m7 = null;
            this.m8 = null;
            this.m9 = null;
            this.m10 = null;
            this.m11 = null;
            
            this.m6 = m6;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            this.m6 = null;
            this.m7 = null;
            this.m8 = null;
            this.m9 = null;
            this.m10 = null;
            this.m11 = null;
            
            this.m7 = m7;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            this.m6 = null;
            this.m7 = null;
            this.m8 = null;
            this.m9 = null;
            this.m10 = null;
            this.m11 = null;
            
            this.m8 = m8;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            this.m6 = null;
            this.m7 = null;
            this.m8 = null;
            this.m9 = null;
            this.m10 = null;
            this.m11 = null;
            
            this.m9 = m9;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            this.m6 = null;
            this.m7 = null;
            this.m8 = null;
            this.m9 = null;
            this.m10 = null;
            this.m11 = null;
            
            this.m10 = m10;
            this.m = null;
            this.m1 = null;
            this.m2 = null;
            this.m3 = null;
            this.m4 = null;
            this.m5 = null;
            this.m6 = null;
            this.m7 = null;
            this.m8 = null;
            this.m9 = null;
            this.m10 = null;
            this.m11 = null;
            
            this.m11 = m11;
        } else {
            this.m6 = m6;
            this.m7 = m7;
            this.m8 = m8;
            this.m9 = m9;
            this.m10 = m10;
            this.m11 = m11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setTransformationMatrix(%f, %f, %f, %f, %f, %f)", m6, m7, m8, m9, m10, m11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setTransformationMatrix(%f, %f, %f, %f, %f, %f);", m6, m7, m8, m9, m10, m11));
                js.setLength(0);
            }
        }
        return this;
    }

    private String title;

    /**
     * Setter for the element title value.
     */
    public Element setTitle(String title) {
        if (jsBase == null) {
            this.title = title;
        } else {
            this.title = title;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".title(%s)", wrapQuotes(title)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(title)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double tx;
    private Double ty;

    /**
     * Moves a shape taking an account the current transformation.
     */
    public Element translate(Double tx, Double ty) {
        if (jsBase == null) {
            this.tx = tx;
            this.ty = ty;
        } else {
            this.tx = tx;
            this.ty = ty;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".translate(%f, %f)", tx, ty));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".translate(%f, %f);", tx, ty));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean isVisible;

    /**
     * Hides or shows an element.
     */
    public Element visible(Boolean isVisible) {
        if (jsBase == null) {
            this.isVisible = isVisible;
        } else {
            this.isVisible = isVisible;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".visible(%b)", isVisible));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".visible(%b);", isVisible));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double zIndex;

    /**
     * Sets the element's zIndex.
     */
    public Element setZIndex(Double zIndex) {
        if (jsBase == null) {
            this.zIndex = zIndex;
        } else {
            this.zIndex = zIndex;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".zIndex(%f)", zIndex));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".zIndex(%f);", zIndex));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetClip() {
        if (getClip != null) {
            return getClip.generateJs();
        }
        return "";
    }

    private String generateJSgetGetAbsoluteBounds() {
        if (getGetAbsoluteBounds != null) {
            return getGetAbsoluteBounds.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetClip());
        jsGetters.append(generateJSgetGetAbsoluteBounds());

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