// 
// Decompiled by Procyon v0.5.36
// 

package androidx.vectordrawable.graphics.drawable;

import android.graphics.PathMeasure;
import android.graphics.Path;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.XmlResourceParser;
import android.content.res.Resources$NotFoundException;
import android.animation.AnimatorInflater;
import android.os.Build$VERSION;
import androidx.annotation.b;
import android.util.TypedValue;
import android.animation.TypeEvaluator;
import android.view.InflateException;
import androidx.core.graphics.o;
import android.util.Log;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.content.res.TypedArray;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.core.content.res.i;
import android.animation.ValueAnimator;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.animation.AnimatorSet;
import android.util.Xml;
import android.animation.Animator;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.Context;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class e
{
    private static final String a = "AnimatorInflater";
    private static final int b = 0;
    private static final int c = 100;
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 3;
    private static final int h = 4;
    private static final boolean i = false;
    
    private e() {
    }
    
    private static Animator a(final Context context, final Resources resources, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser, final float n) throws XmlPullParserException, IOException {
        return b(context, resources, resources$Theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, n);
    }
    
    private static Animator b(final Context context, final Resources resources, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser, final AttributeSet set, final AnimatorSet set2, final int n, final float n2) throws XmlPullParserException, IOException {
        final int depth = xmlPullParser.getDepth();
        Object o = null;
        ArrayList<ValueAnimator> list = null;
        while (true) {
            final int next = xmlPullParser.next();
            final int n3 = 0;
            boolean b = false;
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                if (set2 != null && list != null) {
                    final Animator[] array = new Animator[list.size()];
                    final Iterator<ValueAnimator> iterator = list.iterator();
                    int n4 = n3;
                    while (iterator.hasNext()) {
                        array[n4] = (Animator)iterator.next();
                        ++n4;
                    }
                    if (n == 0) {
                        set2.playTogether(array);
                    }
                    else {
                        set2.playSequentially(array);
                    }
                }
                return (Animator)o;
            }
            if (next != 2) {
                continue;
            }
            final String name = xmlPullParser.getName();
            Object e;
            if (name.equals("objectAnimator")) {
                e = o(context, resources, resources$Theme, set, n2, xmlPullParser);
            }
            else if (name.equals("animator")) {
                e = m(context, resources, resources$Theme, set, null, n2, xmlPullParser);
            }
            else if (name.equals("set")) {
                e = new AnimatorSet();
                final TypedArray s = androidx.core.content.res.i.s(resources, resources$Theme, set, androidx.vectordrawable.graphics.drawable.a.a0);
                b(context, resources, resources$Theme, xmlPullParser, set, (AnimatorSet)e, androidx.core.content.res.i.k(s, xmlPullParser, "ordering", 0, 0), n2);
                s.recycle();
            }
            else {
                if (!name.equals("propertyValuesHolder")) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown animator name: ");
                    sb.append(xmlPullParser.getName());
                    throw new RuntimeException(sb.toString());
                }
                final PropertyValuesHolder[] q = q(context, resources, resources$Theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                if (q != null && o instanceof ValueAnimator) {
                    ((ValueAnimator)o).setValues(q);
                }
                b = true;
                e = o;
            }
            o = e;
            if (set2 == null) {
                continue;
            }
            o = e;
            if (b) {
                continue;
            }
            ArrayList<ValueAnimator> list2;
            if ((list2 = list) == null) {
                list2 = new ArrayList<ValueAnimator>();
            }
            list2.add((ValueAnimator)e);
            o = e;
            list = list2;
        }
    }
    
    private static Keyframe c(Keyframe keyframe, final float n) {
        if (keyframe.getType() == Float.TYPE) {
            keyframe = Keyframe.ofFloat(n);
        }
        else if (keyframe.getType() == Integer.TYPE) {
            keyframe = Keyframe.ofInt(n);
        }
        else {
            keyframe = Keyframe.ofObject(n);
        }
        return keyframe;
    }
    
    private static void d(final Keyframe[] array, float n, int i, final int n2) {
        n /= n2 - i + 2;
        while (i <= n2) {
            array[i].setFraction(array[i - 1].getFraction() + n);
            ++i;
        }
    }
    
    private static void e(final Object[] array, String s) {
        if (array != null) {
            if (array.length != 0) {
                Log.d("AnimatorInflater", s);
                for (int length = array.length, i = 0; i < length; ++i) {
                    final Keyframe keyframe = (Keyframe)array[i];
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Keyframe ");
                    sb.append(i);
                    sb.append(": fraction ");
                    final float fraction = keyframe.getFraction();
                    final String s2 = "null";
                    if (fraction < 0.0f) {
                        s = "null";
                    }
                    else {
                        s = (String)Float.valueOf(keyframe.getFraction());
                    }
                    sb.append((Object)s);
                    sb.append(", , value : ");
                    s = s2;
                    if (keyframe.hasValue()) {
                        s = (String)keyframe.getValue();
                    }
                    sb.append((Object)s);
                    Log.d("AnimatorInflater", sb.toString());
                }
            }
        }
    }
    
    private static PropertyValuesHolder f(final TypedArray typedArray, int n, int n2, final int n3, final String s) {
        final TypedValue peekValue = typedArray.peekValue(n2);
        final boolean b = peekValue != null;
        int type;
        if (b) {
            type = peekValue.type;
        }
        else {
            type = 0;
        }
        final TypedValue peekValue2 = typedArray.peekValue(n3);
        final boolean b2 = peekValue2 != null;
        int type2;
        if (b2) {
            type2 = peekValue2.type;
        }
        else {
            type2 = 0;
        }
        int n4 = n;
        if (n == 4) {
            if ((b && i(type)) || (b2 && i(type2))) {
                n4 = 3;
            }
            else {
                n4 = 0;
            }
        }
        if (n4 == 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        final PropertyValuesHolder propertyValuesHolder = null;
        final PropertyValuesHolder propertyValuesHolder2 = null;
        PropertyValuesHolder propertyValuesHolder3;
        if (n4 == 2) {
            final String string = typedArray.getString(n2);
            final String string2 = typedArray.getString(n3);
            final o.b[] d = o.d(string);
            final o.b[] d2 = o.d(string2);
            if (d == null) {
                propertyValuesHolder3 = propertyValuesHolder;
                if (d2 == null) {
                    return propertyValuesHolder3;
                }
            }
            if (d != null) {
                final a a = new a();
                if (d2 != null) {
                    if (!o.b(d, d2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(" Can't morph from ");
                        sb.append(string);
                        sb.append(" to ");
                        sb.append(string2);
                        throw new InflateException(sb.toString());
                    }
                    propertyValuesHolder3 = PropertyValuesHolder.ofObject(s, (TypeEvaluator)a, new Object[] { d, d2 });
                }
                else {
                    propertyValuesHolder3 = PropertyValuesHolder.ofObject(s, (TypeEvaluator)a, new Object[] { d });
                }
            }
            else {
                propertyValuesHolder3 = propertyValuesHolder;
                if (d2 != null) {
                    propertyValuesHolder3 = PropertyValuesHolder.ofObject(s, (TypeEvaluator)new a(), new Object[] { d2 });
                }
            }
        }
        else {
            Object a2;
            if (n4 == 3) {
                a2 = androidx.vectordrawable.graphics.drawable.f.a();
            }
            else {
                a2 = null;
            }
            PropertyValuesHolder propertyValuesHolder5;
            if (n != 0) {
                PropertyValuesHolder propertyValuesHolder4;
                if (b) {
                    float n5;
                    if (type == 5) {
                        n5 = typedArray.getDimension(n2, 0.0f);
                    }
                    else {
                        n5 = typedArray.getFloat(n2, 0.0f);
                    }
                    if (b2) {
                        float n6;
                        if (type2 == 5) {
                            n6 = typedArray.getDimension(n3, 0.0f);
                        }
                        else {
                            n6 = typedArray.getFloat(n3, 0.0f);
                        }
                        propertyValuesHolder4 = PropertyValuesHolder.ofFloat(s, new float[] { n5, n6 });
                    }
                    else {
                        propertyValuesHolder4 = PropertyValuesHolder.ofFloat(s, new float[] { n5 });
                    }
                }
                else {
                    float n7;
                    if (type2 == 5) {
                        n7 = typedArray.getDimension(n3, 0.0f);
                    }
                    else {
                        n7 = typedArray.getFloat(n3, 0.0f);
                    }
                    propertyValuesHolder4 = PropertyValuesHolder.ofFloat(s, new float[] { n7 });
                }
                propertyValuesHolder5 = propertyValuesHolder4;
            }
            else if (b) {
                if (type == 5) {
                    n = (int)typedArray.getDimension(n2, 0.0f);
                }
                else if (i(type)) {
                    n = typedArray.getColor(n2, 0);
                }
                else {
                    n = typedArray.getInt(n2, 0);
                }
                if (b2) {
                    if (type2 == 5) {
                        n2 = (int)typedArray.getDimension(n3, 0.0f);
                    }
                    else if (i(type2)) {
                        n2 = typedArray.getColor(n3, 0);
                    }
                    else {
                        n2 = typedArray.getInt(n3, 0);
                    }
                    propertyValuesHolder5 = PropertyValuesHolder.ofInt(s, new int[] { n, n2 });
                }
                else {
                    propertyValuesHolder5 = PropertyValuesHolder.ofInt(s, new int[] { n });
                }
            }
            else {
                propertyValuesHolder5 = propertyValuesHolder2;
                if (b2) {
                    if (type2 == 5) {
                        n = (int)typedArray.getDimension(n3, 0.0f);
                    }
                    else if (i(type2)) {
                        n = typedArray.getColor(n3, 0);
                    }
                    else {
                        n = typedArray.getInt(n3, 0);
                    }
                    propertyValuesHolder5 = PropertyValuesHolder.ofInt(s, new int[] { n });
                }
            }
            if ((propertyValuesHolder3 = propertyValuesHolder5) != null) {
                propertyValuesHolder3 = propertyValuesHolder5;
                if (a2 != null) {
                    propertyValuesHolder5.setEvaluator((TypeEvaluator)a2);
                    propertyValuesHolder3 = propertyValuesHolder5;
                }
            }
        }
        return propertyValuesHolder3;
    }
    
    private static int g(final TypedArray typedArray, int n, int n2) {
        final TypedValue peekValue = typedArray.peekValue(n);
        final int n3 = 1;
        final int n4 = 0;
        if (peekValue != null) {
            n = 1;
        }
        else {
            n = 0;
        }
        int type;
        if (n != 0) {
            type = peekValue.type;
        }
        else {
            type = 0;
        }
        final TypedValue peekValue2 = typedArray.peekValue(n2);
        if (peekValue2 != null) {
            n2 = n3;
        }
        else {
            n2 = 0;
        }
        int type2;
        if (n2 != 0) {
            type2 = peekValue2.type;
        }
        else {
            type2 = 0;
        }
        if (n == 0 || !i(type)) {
            n = n4;
            if (n2 == 0) {
                return n;
            }
            n = n4;
            if (!i(type2)) {
                return n;
            }
        }
        n = 3;
        return n;
    }
    
    private static int h(final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final XmlPullParser xmlPullParser) {
        final TypedArray s = androidx.core.content.res.i.s(resources, resources$Theme, set, androidx.vectordrawable.graphics.drawable.a.h0);
        final boolean b = false;
        final TypedValue t = androidx.core.content.res.i.t(s, xmlPullParser, "value", 0);
        final boolean b2 = t != null;
        int n = b ? 1 : 0;
        if (b2) {
            n = (b ? 1 : 0);
            if (i(t.type)) {
                n = 3;
            }
        }
        s.recycle();
        return n;
    }
    
    private static boolean i(final int n) {
        return n >= 28 && n <= 31;
    }
    
    public static Animator j(final Context context, @b final int n) throws Resources$NotFoundException {
        Animator animator;
        if (Build$VERSION.SDK_INT >= 24) {
            animator = AnimatorInflater.loadAnimator(context, n);
        }
        else {
            animator = k(context, context.getResources(), context.getTheme(), n);
        }
        return animator;
    }
    
    public static Animator k(final Context context, final Resources resources, final Resources$Theme resources$Theme, @b final int n) throws Resources$NotFoundException {
        return l(context, resources, resources$Theme, n, 1.0f);
    }
    
    public static Animator l(final Context context, final Resources resources, final Resources$Theme resources$Theme, @b final int n, final float n2) throws Resources$NotFoundException {
        XmlResourceParser animation = null;
        try {
            try {
                final XmlResourceParser xmlResourceParser = animation = resources.getAnimation(n);
                final Animator a = a(context, resources, resources$Theme, (XmlPullParser)xmlResourceParser, n2);
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
                return a;
            }
            finally {
                if (animation != null) {
                    animation.close();
                }
            }
        }
        catch (IOException ex) {}
        catch (XmlPullParserException ex2) {}
    }
    
    private static ValueAnimator m(final Context context, final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final ValueAnimator valueAnimator, final float n, final XmlPullParser xmlPullParser) throws Resources$NotFoundException {
        final TypedArray s = androidx.core.content.res.i.s(resources, resources$Theme, set, androidx.vectordrawable.graphics.drawable.a.R);
        final TypedArray s2 = androidx.core.content.res.i.s(resources, resources$Theme, set, androidx.vectordrawable.graphics.drawable.a.m0);
        ValueAnimator valueAnimator2 = valueAnimator;
        if (valueAnimator == null) {
            valueAnimator2 = new ValueAnimator();
        }
        r(valueAnimator2, s, s2, n, xmlPullParser);
        final int l = androidx.core.content.res.i.l(s, xmlPullParser, "interpolator", 0, 0);
        if (l > 0) {
            valueAnimator2.setInterpolator((TimeInterpolator)androidx.vectordrawable.graphics.drawable.d.b(context, l));
        }
        s.recycle();
        if (s2 != null) {
            s2.recycle();
        }
        return valueAnimator2;
    }
    
    private static Keyframe n(final Context context, final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, int l, final XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        final TypedArray s = androidx.core.content.res.i.s(resources, resources$Theme, set, androidx.vectordrawable.graphics.drawable.a.h0);
        final float j = androidx.core.content.res.i.j(s, xmlPullParser, "fraction", 3, -1.0f);
        final TypedValue t = androidx.core.content.res.i.t(s, xmlPullParser, "value", 0);
        final boolean b = t != null;
        int n = l;
        if (l == 4) {
            if (b && i(t.type)) {
                n = 3;
            }
            else {
                n = 0;
            }
        }
        Keyframe keyframe;
        if (b) {
            if (n != 0) {
                if (n != 1 && n != 3) {
                    keyframe = null;
                }
                else {
                    keyframe = Keyframe.ofInt(j, androidx.core.content.res.i.k(s, xmlPullParser, "value", 0, 0));
                }
            }
            else {
                keyframe = Keyframe.ofFloat(j, androidx.core.content.res.i.j(s, xmlPullParser, "value", 0, 0.0f));
            }
        }
        else if (n == 0) {
            keyframe = Keyframe.ofFloat(j);
        }
        else {
            keyframe = Keyframe.ofInt(j);
        }
        l = androidx.core.content.res.i.l(s, xmlPullParser, "interpolator", 1, 0);
        if (l > 0) {
            keyframe.setInterpolator((TimeInterpolator)androidx.vectordrawable.graphics.drawable.d.b(context, l));
        }
        s.recycle();
        return keyframe;
    }
    
    private static ObjectAnimator o(final Context context, final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final float n, final XmlPullParser xmlPullParser) throws Resources$NotFoundException {
        final ObjectAnimator objectAnimator = new ObjectAnimator();
        m(context, resources, resources$Theme, set, (ValueAnimator)objectAnimator, n, xmlPullParser);
        return objectAnimator;
    }
    
    private static PropertyValuesHolder p(final Context context, final Resources resources, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser, final String s, int i) throws XmlPullParserException, IOException {
        final PropertyValuesHolder propertyValuesHolder = null;
        ArrayList<Keyframe> list = null;
        int n = i;
        while (true) {
            i = xmlPullParser.next();
            if (i == 3 || i == 1) {
                break;
            }
            if (!xmlPullParser.getName().equals("keyframe")) {
                continue;
            }
            if ((i = n) == 4) {
                i = h(resources, resources$Theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
            }
            final Keyframe n2 = n(context, resources, resources$Theme, Xml.asAttributeSet(xmlPullParser), i, xmlPullParser);
            ArrayList<Keyframe> list2 = list;
            if (n2 != null) {
                if ((list2 = list) == null) {
                    list2 = new ArrayList<Keyframe>();
                }
                list2.add(n2);
            }
            xmlPullParser.next();
            list = list2;
            n = i;
        }
        PropertyValuesHolder ofKeyframe = propertyValuesHolder;
        if (list != null) {
            final int size = list.size();
            ofKeyframe = propertyValuesHolder;
            if (size > 0) {
                final int n3 = 0;
                final Keyframe keyframe = list.get(0);
                final Keyframe keyframe2 = list.get(size - 1);
                final float fraction = keyframe2.getFraction();
                i = size;
                if (fraction < 1.0f) {
                    if (fraction < 0.0f) {
                        keyframe2.setFraction(1.0f);
                        i = size;
                    }
                    else {
                        list.add(list.size(), c(keyframe2, 1.0f));
                        i = size + 1;
                    }
                }
                final float fraction2 = keyframe.getFraction();
                int n4 = i;
                if (fraction2 != 0.0f) {
                    if (fraction2 < 0.0f) {
                        keyframe.setFraction(0.0f);
                        n4 = i;
                    }
                    else {
                        list.add(0, c(keyframe, 0.0f));
                        n4 = i + 1;
                    }
                }
                final Keyframe[] a = new Keyframe[n4];
                list.toArray(a);
                Keyframe keyframe3;
                int n5;
                int n6;
                int n7;
                for (i = n3; i < n4; ++i) {
                    keyframe3 = a[i];
                    if (keyframe3.getFraction() < 0.0f) {
                        if (i == 0) {
                            keyframe3.setFraction(0.0f);
                        }
                        else {
                            n5 = n4 - 1;
                            if (i == n5) {
                                keyframe3.setFraction(1.0f);
                            }
                            else {
                                n6 = i + 1;
                                n7 = i;
                                while (n6 < n5 && a[n6].getFraction() < 0.0f) {
                                    n7 = n6;
                                    ++n6;
                                }
                                d(a, a[n7 + 1].getFraction() - a[i - 1].getFraction(), i, n7);
                            }
                        }
                    }
                }
                final PropertyValuesHolder propertyValuesHolder2 = ofKeyframe = PropertyValuesHolder.ofKeyframe(s, a);
                if (n == 3) {
                    propertyValuesHolder2.setEvaluator((TypeEvaluator)androidx.vectordrawable.graphics.drawable.f.a());
                    ofKeyframe = propertyValuesHolder2;
                }
            }
        }
        return ofKeyframe;
    }
    
    private static PropertyValuesHolder[] q(final Context context, final Resources resources, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser, final AttributeSet set) throws XmlPullParserException, IOException {
        final PropertyValuesHolder[] array = null;
        ArrayList<PropertyValuesHolder> list = null;
        int index;
        while (true) {
            final int eventType = xmlPullParser.getEventType();
            index = 0;
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    final TypedArray s = androidx.core.content.res.i.s(resources, resources$Theme, set, androidx.vectordrawable.graphics.drawable.a.c0);
                    final String m = androidx.core.content.res.i.m(s, xmlPullParser, "propertyName", 3);
                    final int k = androidx.core.content.res.i.k(s, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder e;
                    if ((e = p(context, resources, resources$Theme, xmlPullParser, m, k)) == null) {
                        e = f(s, k, 0, 1, m);
                    }
                    ArrayList<PropertyValuesHolder> list2 = list;
                    if (e != null) {
                        if ((list2 = list) == null) {
                            list2 = new ArrayList<PropertyValuesHolder>();
                        }
                        list2.add(e);
                    }
                    s.recycle();
                    list = list2;
                }
            }
            xmlPullParser.next();
        }
        PropertyValuesHolder[] array2 = array;
        if (list != null) {
            final int size = list.size();
            final PropertyValuesHolder[] array3 = new PropertyValuesHolder[size];
            while (true) {
                array2 = array3;
                if (index >= size) {
                    break;
                }
                array3[index] = list.get(index);
                ++index;
            }
        }
        return array2;
    }
    
    private static void r(final ValueAnimator valueAnimator, final TypedArray typedArray, final TypedArray typedArray2, final float n, final XmlPullParser xmlPullParser) {
        final long duration = androidx.core.content.res.i.k(typedArray, xmlPullParser, "duration", 1, 300);
        final long startDelay = androidx.core.content.res.i.k(typedArray, xmlPullParser, "startOffset", 2, 0);
        int k;
        final int n2 = k = androidx.core.content.res.i.k(typedArray, xmlPullParser, "valueType", 7, 4);
        if (androidx.core.content.res.i.r(xmlPullParser, "valueFrom")) {
            k = n2;
            if (androidx.core.content.res.i.r(xmlPullParser, "valueTo")) {
                int g;
                if ((g = n2) == 4) {
                    g = g(typedArray, 5, 6);
                }
                final PropertyValuesHolder f = f(typedArray, g, 5, 6, "");
                k = g;
                if (f != null) {
                    valueAnimator.setValues(new PropertyValuesHolder[] { f });
                    k = g;
                }
            }
        }
        valueAnimator.setDuration(duration);
        valueAnimator.setStartDelay(startDelay);
        valueAnimator.setRepeatCount(androidx.core.content.res.i.k(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(androidx.core.content.res.i.k(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            s(valueAnimator, typedArray2, k, n, xmlPullParser);
        }
    }
    
    private static void s(final ValueAnimator valueAnimator, final TypedArray typedArray, final int n, final float n2, final XmlPullParser xmlPullParser) {
        final ObjectAnimator objectAnimator = (ObjectAnimator)valueAnimator;
        final String m = androidx.core.content.res.i.m(typedArray, xmlPullParser, "pathData", 1);
        if (m != null) {
            final String i = androidx.core.content.res.i.m(typedArray, xmlPullParser, "propertyXName", 2);
            final String j = androidx.core.content.res.i.m(typedArray, xmlPullParser, "propertyYName", 3);
            if (n != 2) {}
            if (i == null && j == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(typedArray.getPositionDescription());
                sb.append(" propertyXName or propertyYName is needed for PathData");
                throw new InflateException(sb.toString());
            }
            t(o.e(m), objectAnimator, n2 * 0.5f, i, j);
        }
        else {
            objectAnimator.setPropertyName(androidx.core.content.res.i.m(typedArray, xmlPullParser, "propertyName", 0));
        }
    }
    
    private static void t(final Path path, final ObjectAnimator objectAnimator, float n, final String s, final String s2) {
        final PathMeasure pathMeasure = new PathMeasure(path, false);
        final ArrayList<Float> list = new ArrayList<Float>();
        final float n2 = 0.0f;
        list.add(0.0f);
        float n3 = 0.0f;
        float f;
        do {
            f = n3 + pathMeasure.getLength();
            list.add(f);
            n3 = f;
        } while (pathMeasure.nextContour());
        final PathMeasure pathMeasure2 = new PathMeasure(path, false);
        final int min = Math.min(100, (int)(f / n) + 1);
        final float[] array = new float[min];
        final float[] array2 = new float[min];
        final float[] array3 = new float[2];
        final float n4 = f / (min - 1);
        int n5 = 0;
        int index = 0;
        n = n2;
        PropertyValuesHolder propertyValuesHolder;
        while (true) {
            propertyValuesHolder = null;
            if (n5 >= min) {
                break;
            }
            pathMeasure2.getPosTan(n - list.get(index), array3, (float[])null);
            array[n5] = array3[0];
            array2[n5] = array3[1];
            n += n4;
            final int index2 = index + 1;
            int n6 = index;
            if (index2 < list.size()) {
                n6 = index;
                if (n > list.get(index2)) {
                    pathMeasure2.nextContour();
                    n6 = index2;
                }
            }
            ++n5;
            index = n6;
        }
        PropertyValuesHolder ofFloat;
        if (s != null) {
            ofFloat = PropertyValuesHolder.ofFloat(s, array);
        }
        else {
            ofFloat = null;
        }
        PropertyValuesHolder ofFloat2 = propertyValuesHolder;
        if (s2 != null) {
            ofFloat2 = PropertyValuesHolder.ofFloat(s2, array2);
        }
        if (ofFloat == null) {
            objectAnimator.setValues(new PropertyValuesHolder[] { ofFloat2 });
        }
        else if (ofFloat2 == null) {
            objectAnimator.setValues(new PropertyValuesHolder[] { ofFloat });
        }
        else {
            objectAnimator.setValues(new PropertyValuesHolder[] { ofFloat, ofFloat2 });
        }
    }
    
    private static class a implements TypeEvaluator<o.b[]>
    {
        private o.b[] a;
        
        a() {
        }
        
        a(final o.b[] a) {
            this.a = a;
        }
        
        public o.b[] a(final float n, final o.b[] array, final o.b[] array2) {
            if (o.b(array, array2)) {
                if (!o.b(this.a, array)) {
                    this.a = o.f(array);
                }
                for (int i = 0; i < array.length; ++i) {
                    this.a[i].d(array[i], array2[i], n);
                }
                return this.a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }
}
