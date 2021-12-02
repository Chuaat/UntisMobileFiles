// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android;

import java.util.Iterator;
import java.util.Map;
import com.facebook.stetho.inspector.elements.Descriptor;
import com.facebook.stetho.common.ExceptionUtil;
import java.lang.reflect.InvocationTargetException;
import com.facebook.stetho.inspector.elements.StyleRuleNameAccumulator;
import com.facebook.stetho.common.StringUtil;
import com.facebook.stetho.inspector.elements.ComputedStyleAccumulator;
import com.facebook.stetho.inspector.elements.AttributeAccumulator;
import android.graphics.Rect;
import android.view.ViewDebug$IntToString;
import android.view.ViewDebug$FlagToString;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.lang.reflect.Field;
import com.facebook.stetho.common.LogUtil;
import java.lang.reflect.Modifier;
import com.facebook.stetho.inspector.helper.IntegerFormatter;
import com.facebook.stetho.inspector.elements.StyleAccumulator;
import com.facebook.stetho.common.android.ResourcesUtil;
import android.view.ViewDebug$ExportedProperty;
import com.facebook.stetho.common.ReflectionUtil;
import java.util.regex.Pattern;
import d6.a;
import c6.h;
import java.util.List;
import android.view.View;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;

final class ViewDescriptor extends AbstractChainedDescriptor<View> implements HighlightableDescriptor<View>
{
    private static final String ACCESSIBILITY_STYLE_RULE_NAME = "Accessibility Properties";
    private static final String ID_NAME = "id";
    private static final String NONE_MAPPING = "<no mapping>";
    private static final String NONE_VALUE = "(none)";
    private static final String VIEW_STYLE_RULE_NAME = "<this_view>";
    private static final boolean sHasSupportNodeInfo;
    private final MethodInvoker mMethodInvoker;
    @h
    @a("this")
    private volatile List<ViewCSSProperty> mViewProperties;
    @h
    private Pattern mWordBoundaryPattern;
    
    static {
        sHasSupportNodeInfo = (ReflectionUtil.tryGetClassForName("androidx.core.view.accessibility.AccessibilityNodeInfoCompat") != null);
    }
    
    public ViewDescriptor() {
        this(new MethodInvoker());
    }
    
    public ViewDescriptor(final MethodInvoker mMethodInvoker) {
        this.mMethodInvoker = mMethodInvoker;
    }
    
    private static boolean canFlagsBeMappedToString(@h final ViewDebug$ExportedProperty viewDebug$ExportedProperty) {
        return viewDebug$ExportedProperty != null && viewDebug$ExportedProperty.flagMapping() != null && viewDebug$ExportedProperty.flagMapping().length > 0;
    }
    
    private static boolean canIntBeMappedToString(@h final ViewDebug$ExportedProperty viewDebug$ExportedProperty) {
        return viewDebug$ExportedProperty != null && viewDebug$ExportedProperty.mapping() != null && viewDebug$ExportedProperty.mapping().length > 0;
    }
    
    private static String capitalize(final String str) {
        String string = str;
        if (str != null) {
            string = str;
            if (str.length() != 0) {
                if (Character.isTitleCase(str.charAt(0))) {
                    string = str;
                }
                else {
                    final StringBuilder sb = new StringBuilder(str);
                    sb.setCharAt(0, Character.toTitleCase(sb.charAt(0)));
                    string = sb.toString();
                }
            }
        }
        return string;
    }
    
    private String convertViewPropertyNameToCSSName(final String input) {
        final String[] split = this.getWordBoundaryPattern().split(input);
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; ++i) {
            if (!split[i].equals("get")) {
                if (!split[i].equals("m")) {
                    sb.append(split[i].toLowerCase());
                    if (i < split.length - 1) {
                        sb.append('-');
                    }
                }
            }
        }
        return sb.toString();
    }
    
    @h
    private static String getIdAttribute(final View view) {
        final int id = view.getId();
        if (id == -1) {
            return null;
        }
        return ResourcesUtil.getIdStringQuietly(view, view.getResources(), id);
    }
    
    private void getIdStyle(final View view, final StyleAccumulator styleAccumulator) {
        String idAttribute;
        if ((idAttribute = getIdAttribute(view)) == null) {
            idAttribute = "(none)";
        }
        styleAccumulator.store("id", idAttribute, false);
    }
    
    private void getStyleFromInteger(final String s, final Integer n, @h final ViewDebug$ExportedProperty viewDebug$ExportedProperty, final StyleAccumulator styleAccumulator) {
        final String format = IntegerFormatter.getInstance().format(n, viewDebug$ExportedProperty);
        String str;
        StringBuilder sb2;
        if (canIntBeMappedToString(viewDebug$ExportedProperty)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(format);
            sb.append(" (");
            str = mapIntToStringUsingAnnotation(n, viewDebug$ExportedProperty);
            sb2 = sb;
        }
        else {
            if (!canFlagsBeMappedToString(viewDebug$ExportedProperty)) {
                final Boolean true = Boolean.TRUE;
                Boolean false = null;
                Label_0163: {
                    if (n == 0 && !canFlagsBeMappedToString(viewDebug$ExportedProperty)) {
                        false = true;
                        if (!canIntBeMappedToString(viewDebug$ExportedProperty)) {
                            break Label_0163;
                        }
                    }
                    false = Boolean.FALSE;
                }
                styleAccumulator.store(s, format, false);
                return;
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(format);
            sb3.append(" (");
            str = mapFlagsToStringUsingAnnotation(n, viewDebug$ExportedProperty);
            sb2 = sb3;
        }
        sb2.append(str);
        sb2.append(")");
        styleAccumulator.store(s, sb2.toString(), false);
    }
    
    private void getStyleFromValue(final View view, final String s, final Object o, @h final ViewDebug$ExportedProperty viewDebug$ExportedProperty, final StyleAccumulator styleAccumulator) {
        if (s.equals("id")) {
            this.getIdStyle(view, styleAccumulator);
        }
        else if (o instanceof Integer) {
            this.getStyleFromInteger(s, (Integer)o, viewDebug$ExportedProperty, styleAccumulator);
        }
        else {
            final boolean b = o instanceof Float;
            boolean b2 = true;
            String s2 = null;
            Label_0086: {
                if (b) {
                    s2 = String.valueOf(o);
                    if ((float)o == 0.0f) {
                        s2 = s2;
                        break Label_0086;
                    }
                }
                else {
                    if (o instanceof Boolean) {
                        styleAccumulator.store(s, String.valueOf(o), false);
                        return;
                    }
                    if (o instanceof Short) {
                        final String s3 = s2 = String.valueOf(o);
                        if ((short)o == 0) {
                            s2 = s3;
                            break Label_0086;
                        }
                    }
                    else if (o instanceof Long) {
                        final String s4 = s2 = String.valueOf(o);
                        if ((long)o == 0L) {
                            s2 = s4;
                            break Label_0086;
                        }
                    }
                    else if (o instanceof Double) {
                        final String s5 = s2 = String.valueOf(o);
                        if ((double)o == 0.0) {
                            s2 = s5;
                            break Label_0086;
                        }
                    }
                    else if (o instanceof Byte) {
                        final String s6 = s2 = String.valueOf(o);
                        if ((byte)o == 0) {
                            s2 = s6;
                            break Label_0086;
                        }
                    }
                    else if (o instanceof Character) {
                        final String s7 = s2 = String.valueOf(o);
                        if ((char)o == '\0') {
                            s2 = s7;
                            break Label_0086;
                        }
                    }
                    else {
                        if (!(o instanceof CharSequence)) {
                            this.getStylesFromObject(view, s, o, viewDebug$ExportedProperty, styleAccumulator);
                            return;
                        }
                        final String s8 = s2 = String.valueOf(o);
                        if (((CharSequence)o).length() == 0) {
                            s2 = s8;
                            break Label_0086;
                        }
                    }
                }
                b2 = false;
            }
            styleAccumulator.store(s, s2, b2);
        }
    }
    
    private void getStylesFromObject(final View view, final String str, final Object o, @h final ViewDebug$ExportedProperty viewDebug$ExportedProperty, final StyleAccumulator styleAccumulator) {
        if (viewDebug$ExportedProperty != null && viewDebug$ExportedProperty.deepExport() && o != null) {
            final Field[] fields = o.getClass().getFields();
            final int length = fields.length;
            int i = 0;
            while (i < length) {
                final Field field = fields[i];
                Label_0365: {
                    if (Modifier.isStatic(field.getModifiers())) {
                        break Label_0365;
                    }
                    int n = 1;
                    try {
                        field.setAccessible(true);
                        final Object value = field.get(o);
                        String str2 = field.getName();
                        str2.hashCode();
                        Label_0221: {
                            switch (str2) {
                                case "bottomMargin": {
                                    n = 3;
                                    break Label_0221;
                                }
                                case "leftMargin": {
                                    n = 2;
                                    break Label_0221;
                                }
                                case "topMargin": {
                                    break Label_0221;
                                }
                                case "rightMargin": {
                                    n = 0;
                                    break Label_0221;
                                }
                                default:
                                    break;
                            }
                            n = -1;
                        }
                        String convertViewPropertyNameToCSSName = null;
                        switch (n) {
                            default: {
                                final String prefix = viewDebug$ExportedProperty.prefix();
                                if (prefix != null) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append(prefix);
                                    sb.append(str2);
                                    str2 = sb.toString();
                                }
                                convertViewPropertyNameToCSSName = this.convertViewPropertyNameToCSSName(str2);
                                break;
                            }
                            case 3: {
                                convertViewPropertyNameToCSSName = "margin-bottom";
                                break;
                            }
                            case 2: {
                                convertViewPropertyNameToCSSName = "margin-left";
                                break;
                            }
                            case 1: {
                                convertViewPropertyNameToCSSName = "margin-top";
                                break;
                            }
                            case 0: {
                                convertViewPropertyNameToCSSName = "margin-right";
                                break;
                            }
                        }
                        this.getStyleFromValue(view, convertViewPropertyNameToCSSName, value, field.getAnnotation(ViewDebug$ExportedProperty.class), styleAccumulator);
                        ++i;
                        continue;
                    }
                    catch (IllegalAccessException ex) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("failed to get property of name: \"");
                        sb2.append(str);
                        sb2.append("\" of object: ");
                        sb2.append(String.valueOf(o));
                        LogUtil.e(ex, sb2.toString());
                        return;
                    }
                }
                break;
            }
        }
    }
    
    private List<ViewCSSProperty> getViewProperties() {
        if (this.mViewProperties == null) {
            synchronized (this) {
                if (this.mViewProperties == null) {
                    final ArrayList<ViewCSSProperty> list = new ArrayList<ViewCSSProperty>();
                    final Method[] declaredMethods = View.class.getDeclaredMethods();
                    final int length = declaredMethods.length;
                    final int n = 0;
                    for (final Method method : declaredMethods) {
                        final ViewDebug$ExportedProperty viewDebug$ExportedProperty = method.getAnnotation(ViewDebug$ExportedProperty.class);
                        if (viewDebug$ExportedProperty != null) {
                            list.add(new MethodBackedCSSProperty(method, this.convertViewPropertyNameToCSSName(method.getName()), viewDebug$ExportedProperty));
                        }
                    }
                    final Field[] declaredFields = View.class.getDeclaredFields();
                    for (int length2 = declaredFields.length, j = n; j < length2; ++j) {
                        final Field field = declaredFields[j];
                        final ViewDebug$ExportedProperty viewDebug$ExportedProperty2 = field.getAnnotation(ViewDebug$ExportedProperty.class);
                        if (viewDebug$ExportedProperty2 != null) {
                            list.add((ViewCSSProperty)new FieldBackedCSSProperty(field, this.convertViewPropertyNameToCSSName(field.getName()), viewDebug$ExportedProperty2));
                        }
                    }
                    Collections.sort((List<Object>)list, (Comparator<? super Object>)new Comparator<ViewCSSProperty>() {
                        @Override
                        public int compare(final ViewCSSProperty viewCSSProperty, final ViewCSSProperty viewCSSProperty2) {
                            return viewCSSProperty.getCSSName().compareTo(viewCSSProperty2.getCSSName());
                        }
                    });
                    this.mViewProperties = (List<ViewCSSProperty>)Collections.unmodifiableList((List<?>)list);
                }
            }
        }
        return this.mViewProperties;
    }
    
    private Pattern getWordBoundaryPattern() {
        if (this.mWordBoundaryPattern == null) {
            this.mWordBoundaryPattern = Pattern.compile("(?<=\\p{Lower})(?=\\p{Upper})");
        }
        return this.mWordBoundaryPattern;
    }
    
    private static String mapFlagsToStringUsingAnnotation(final int n, @h final ViewDebug$ExportedProperty viewDebug$ExportedProperty) {
        if (!canFlagsBeMappedToString(viewDebug$ExportedProperty)) {
            throw new IllegalStateException("Cannot map using this annotation");
        }
        final StringBuilder sb = null;
        final ViewDebug$FlagToString[] flagMapping = viewDebug$ExportedProperty.flagMapping();
        final int length = flagMapping.length;
        int i = 0;
        int n2 = 0;
        StringBuilder sb2 = sb;
        while (i < length) {
            final ViewDebug$FlagToString viewDebug$FlagToString = flagMapping[i];
            final boolean outputIf = viewDebug$FlagToString.outputIf();
            final boolean b = (viewDebug$FlagToString.mask() & n) == viewDebug$FlagToString.equals();
            StringBuilder sb3 = sb2;
            int n3 = n2;
            if (outputIf == b) {
                if ((sb3 = sb2) == null) {
                    sb3 = new StringBuilder();
                }
                if (n2 != 0) {
                    sb3.append(" | ");
                }
                sb3.append(viewDebug$FlagToString.name());
                n3 = 1;
            }
            ++i;
            sb2 = sb3;
            n2 = n3;
        }
        if (n2 != 0) {
            return sb2.toString();
        }
        return "<no mapping>";
    }
    
    private static String mapIntToStringUsingAnnotation(final int n, @h final ViewDebug$ExportedProperty viewDebug$ExportedProperty) {
        if (canIntBeMappedToString(viewDebug$ExportedProperty)) {
            for (final ViewDebug$IntToString viewDebug$IntToString : viewDebug$ExportedProperty.mapping()) {
                if (viewDebug$IntToString.from() == n) {
                    return viewDebug$IntToString.to();
                }
            }
            return "<no mapping>";
        }
        throw new IllegalStateException("Cannot map using this annotation");
    }
    
    @h
    @Override
    public Object getElementToHighlightAtPosition(final View view, final int n, final int n2, final Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        return view;
    }
    
    @h
    @Override
    public View getViewAndBoundsForHighlighting(final View view, final Rect rect) {
        return view;
    }
    
    @Override
    protected void onGetAttributes(final View view, final AttributeAccumulator attributeAccumulator) {
        final String idAttribute = getIdAttribute(view);
        if (idAttribute != null) {
            attributeAccumulator.store("id", idAttribute);
        }
    }
    
    @Override
    protected void onGetComputedStyles(final View view, final ComputedStyleAccumulator computedStyleAccumulator) {
        computedStyleAccumulator.store("left", Integer.toString(view.getLeft()));
        computedStyleAccumulator.store("top", Integer.toString(view.getTop()));
        computedStyleAccumulator.store("right", Integer.toString(view.getRight()));
        computedStyleAccumulator.store("bottom", Integer.toString(view.getBottom()));
    }
    
    @Override
    protected String onGetNodeName(final View view) {
        final String name = view.getClass().getName();
        return StringUtil.removePrefix(name, "android.view.", StringUtil.removePrefix(name, "android.widget."));
    }
    
    @Override
    protected void onGetStyleRuleNames(final View view, final StyleRuleNameAccumulator styleRuleNameAccumulator) {
        styleRuleNameAccumulator.store("<this_view>", false);
        if (ViewDescriptor.sHasSupportNodeInfo) {
            styleRuleNameAccumulator.store("Accessibility Properties", false);
        }
    }
    
    @Override
    protected void onGetStyles(final View view, String viewProperties, final StyleAccumulator styleAccumulator) {
        if ("<this_view>".equals(viewProperties)) {
            viewProperties = (String)this.getViewProperties();
            for (int i = 0; i < ((List)viewProperties).size(); ++i) {
                final ViewCSSProperty viewCSSProperty = ((List<ViewCSSProperty>)viewProperties).get(i);
                try {
                    this.getStyleFromValue(view, viewCSSProperty.getCSSName(), viewCSSProperty.getValue(view), viewCSSProperty.getAnnotation(), styleAccumulator);
                }
                catch (Exception ex) {
                    if (!(ex instanceof IllegalAccessException) && !(ex instanceof InvocationTargetException)) {
                        throw ExceptionUtil.propagate(ex);
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("failed to get style property ");
                    sb.append(viewCSSProperty.getCSSName());
                    sb.append(" of element= ");
                    sb.append(view.toString());
                    LogUtil.e(ex, sb.toString());
                }
            }
        }
        else if ("Accessibility Properties".equals(viewProperties) && ViewDescriptor.sHasSupportNodeInfo) {
            final boolean ignored = AccessibilityNodeInfoWrapper.getIgnored(view);
            this.getStyleFromValue(view, "ignored", ignored, null, styleAccumulator);
            if (ignored) {
                this.getStyleFromValue(view, "ignored-reasons", AccessibilityNodeInfoWrapper.getIgnoredReasons(view), null, styleAccumulator);
            }
            this.getStyleFromValue(view, "focusable", ignored ^ true, null, styleAccumulator);
            if (!ignored) {
                this.getStyleFromValue(view, "focusable-reasons", AccessibilityNodeInfoWrapper.getFocusableReasons(view), null, styleAccumulator);
                this.getStyleFromValue(view, "focused", AccessibilityNodeInfoWrapper.getIsAccessibilityFocused(view), null, styleAccumulator);
                this.getStyleFromValue(view, "description", AccessibilityNodeInfoWrapper.getDescription(view), null, styleAccumulator);
                this.getStyleFromValue(view, "actions", AccessibilityNodeInfoWrapper.getActions(view), null, styleAccumulator);
            }
        }
    }
    
    @Override
    protected void onSetAttributesAsText(final View view, final String s) {
        for (final Map.Entry<String, String> entry : Descriptor.parseSetAttributesAsTextArg(s).entrySet()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("set");
            sb.append(capitalize(entry.getKey()));
            this.mMethodInvoker.invoke(view, sb.toString(), entry.getValue());
        }
    }
    
    private final class FieldBackedCSSProperty extends ViewCSSProperty
    {
        private final Field mField;
        
        public FieldBackedCSSProperty(final Field mField, @h final String s, final ViewDebug$ExportedProperty viewDebug$ExportedProperty) {
            super(s, viewDebug$ExportedProperty);
            (this.mField = mField).setAccessible(true);
        }
        
        @Override
        public Object getValue(final View obj) throws InvocationTargetException, IllegalAccessException {
            return this.mField.get(obj);
        }
    }
    
    private final class MethodBackedCSSProperty extends ViewCSSProperty
    {
        private final Method mMethod;
        
        public MethodBackedCSSProperty(final Method mMethod, @h final String s, final ViewDebug$ExportedProperty viewDebug$ExportedProperty) {
            super(s, viewDebug$ExportedProperty);
            (this.mMethod = mMethod).setAccessible(true);
        }
        
        @Override
        public Object getValue(final View obj) throws InvocationTargetException, IllegalAccessException {
            return this.mMethod.invoke(obj, new Object[0]);
        }
    }
    
    private abstract class ViewCSSProperty
    {
        private final ViewDebug$ExportedProperty mAnnotation;
        private final String mCSSName;
        
        public ViewCSSProperty(@h final String mcssName, final ViewDebug$ExportedProperty mAnnotation) {
            this.mCSSName = mcssName;
            this.mAnnotation = mAnnotation;
        }
        
        @h
        public final ViewDebug$ExportedProperty getAnnotation() {
            return this.mAnnotation;
        }
        
        public final String getCSSName() {
            return this.mCSSName;
        }
        
        public abstract Object getValue(final View p0) throws InvocationTargetException, IllegalAccessException;
    }
}
