// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.widget;

import android.graphics.Color;
import androidx.constraintlayout.motion.widget.c;
import java.lang.reflect.Method;
import android.util.Log;
import android.graphics.drawable.Drawable;
import java.io.Serializable;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;
import java.util.Iterator;
import java.lang.reflect.InvocationTargetException;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import java.util.HashMap;

public class a
{
    private static final String i = "TransitionLayout";
    private boolean a;
    String b;
    private b c;
    private int d;
    private float e;
    private String f;
    boolean g;
    private int h;
    
    public a(final a a, final Object o) {
        this.a = false;
        this.b = a.b;
        this.c = a.c;
        this.q(o);
    }
    
    public a(final String b, final b c) {
        this.a = false;
        this.b = b;
        this.c = c;
    }
    
    public a(final String b, final b c, final Object o, final boolean a) {
        this.a = false;
        this.b = b;
        this.c = c;
        this.a = a;
        this.q(o);
    }
    
    private static int b(int n) {
        n = (n & ~(n >> 31)) - 255;
        return (n & n >> 31) + 255;
    }
    
    public static HashMap<String, a> d(final HashMap<String, a> hashMap, final View obj) {
        final HashMap<String, a> hashMap2 = new HashMap<String, a>();
        final Class<? extends View> class1 = obj.getClass();
        for (final String key : hashMap.keySet()) {
            final a a = hashMap.get(key);
            try {
                a value;
                if (key.equals("BackgroundColor")) {
                    value = new a(a, ((ColorDrawable)obj.getBackground()).getColor());
                }
                else {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("getMap");
                    sb.append(key);
                    value = new a(a, class1.getMethod(sb.toString(), (Class<?>[])new Class[0]).invoke(obj, new Object[0]));
                }
                hashMap2.put(key, value);
                continue;
            }
            catch (InvocationTargetException ex) {
                ex.printStackTrace();
                continue;
            }
            catch (IllegalAccessException ex2) {
                ex2.printStackTrace();
                continue;
            }
            catch (NoSuchMethodException ex3) {
                ex3.printStackTrace();
                continue;
            }
            break;
        }
        return hashMap2;
    }
    
    public static void j(final Context context, final XmlPullParser xmlPullParser, final HashMap<String, a> hashMap) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.m.id);
        final int indexCount = obtainStyledAttributes.getIndexCount();
        String key = null;
        b b;
        Serializable s = b = null;
        int i = 0;
        int n = 0;
        while (i < indexCount) {
            final int index = obtainStyledAttributes.getIndex(i);
            String s3 = null;
            Serializable s4 = null;
            b l = null;
            int n2 = 0;
            Label_0485: {
                if (index == j.m.jd) {
                    final String s2 = s3 = obtainStyledAttributes.getString(index);
                    s4 = s;
                    l = b;
                    n2 = n;
                    if (s2 != null) {
                        s3 = s2;
                        s4 = s;
                        l = b;
                        n2 = n;
                        if (s2.length() > 0) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(Character.toUpperCase(s2.charAt(0)));
                            sb.append(s2.substring(1));
                            s3 = sb.toString();
                            s4 = s;
                            l = b;
                            n2 = n;
                        }
                    }
                }
                else if (index == j.m.td) {
                    s3 = obtainStyledAttributes.getString(index);
                    n2 = 1;
                    s4 = s;
                    l = b;
                }
                else if (index == j.m.kd) {
                    s4 = obtainStyledAttributes.getBoolean(index, false);
                    l = a.b.L;
                    s3 = key;
                    n2 = n;
                }
                else {
                    b b2 = null;
                    Label_0253: {
                        int j = 0;
                        Label_0246: {
                            if (index == androidx.constraintlayout.widget.j.m.md) {
                                b2 = a.b.I;
                            }
                            else {
                                if (index != androidx.constraintlayout.widget.j.m.ld) {
                                    float f;
                                    if (index == androidx.constraintlayout.widget.j.m.qd) {
                                        b2 = a.b.M;
                                        f = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                                    }
                                    else if (index == androidx.constraintlayout.widget.j.m.nd) {
                                        b2 = a.b.M;
                                        f = obtainStyledAttributes.getDimension(index, 0.0f);
                                    }
                                    else if (index == androidx.constraintlayout.widget.j.m.od) {
                                        b2 = a.b.H;
                                        f = obtainStyledAttributes.getFloat(index, Float.NaN);
                                    }
                                    else {
                                        if (index == androidx.constraintlayout.widget.j.m.pd) {
                                            b2 = a.b.G;
                                            j = obtainStyledAttributes.getInteger(index, -1);
                                            break Label_0246;
                                        }
                                        if (index == androidx.constraintlayout.widget.j.m.sd) {
                                            b2 = a.b.K;
                                            s4 = obtainStyledAttributes.getString(index);
                                            break Label_0253;
                                        }
                                        s3 = key;
                                        s4 = s;
                                        l = b;
                                        n2 = n;
                                        if (index != androidx.constraintlayout.widget.j.m.rd) {
                                            break Label_0485;
                                        }
                                        final b n3 = a.b.N;
                                        final int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        b2 = n3;
                                        if ((j = resourceId) == -1) {
                                            j = obtainStyledAttributes.getInt(index, -1);
                                            b2 = n3;
                                        }
                                        break Label_0246;
                                    }
                                    s4 = f;
                                    break Label_0253;
                                }
                                b2 = a.b.J;
                            }
                            j = obtainStyledAttributes.getColor(index, 0);
                        }
                        s4 = j;
                    }
                    l = b2;
                    s3 = key;
                    n2 = n;
                }
            }
            ++i;
            key = s3;
            s = s4;
            b = l;
            n = n2;
        }
        if (key != null && s != null) {
            hashMap.put(key, new a(key, b, s, (boolean)(n != 0)));
        }
        obtainStyledAttributes.recycle();
    }
    
    public static void k(final View view, final HashMap<String, a> hashMap) {
        final Class<? extends View> class1 = view.getClass();
        for (final String str : hashMap.keySet()) {
            final a a = hashMap.get(str);
            String string;
            if (!a.a) {
                final StringBuilder sb = new StringBuilder();
                sb.append("set");
                sb.append(str);
                string = sb.toString();
            }
            else {
                string = str;
            }
            try {
                switch (a$a.a[a.c.ordinal()]) {
                    default: {
                        continue;
                    }
                    case 8: {
                        class1.getMethod(string, Float.TYPE).invoke(view, a.e);
                        continue;
                    }
                    case 7: {
                        class1.getMethod(string, Float.TYPE).invoke(view, a.e);
                        continue;
                    }
                    case 6: {
                        class1.getMethod(string, Integer.TYPE).invoke(view, a.d);
                        continue;
                    }
                    case 5: {
                        final Method method = class1.getMethod(string, Drawable.class);
                        final ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(a.h);
                        method.invoke(view, colorDrawable);
                        continue;
                    }
                    case 4: {
                        class1.getMethod(string, Integer.TYPE).invoke(view, a.h);
                        continue;
                    }
                    case 3: {
                        class1.getMethod(string, CharSequence.class).invoke(view, a.f);
                        continue;
                    }
                    case 2: {
                        class1.getMethod(string, Boolean.TYPE).invoke(view, a.g);
                        continue;
                    }
                    case 1: {
                        class1.getMethod(string, Integer.TYPE).invoke(view, a.d);
                        continue;
                    }
                }
            }
            catch (InvocationTargetException ex) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(" Custom Attribute \"");
                sb2.append(str);
                sb2.append("\" not found on ");
                sb2.append(class1.getName());
                Log.e("TransitionLayout", sb2.toString());
                ex.printStackTrace();
            }
            catch (IllegalAccessException ex2) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(" Custom Attribute \"");
                sb3.append(str);
                sb3.append("\" not found on ");
                sb3.append(class1.getName());
                Log.e("TransitionLayout", sb3.toString());
                ex2.printStackTrace();
            }
            catch (NoSuchMethodException ex3) {
                Log.e("TransitionLayout", ex3.getMessage());
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(" Custom Attribute \"");
                sb4.append(str);
                sb4.append("\" not found on ");
                sb4.append(class1.getName());
                Log.e("TransitionLayout", sb4.toString());
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(class1.getName());
                sb5.append(" must have a method ");
                sb5.append(string);
                Log.e("TransitionLayout", sb5.toString());
            }
        }
    }
    
    public void a(final View obj) {
        final Class<? extends View> class1 = obj.getClass();
        final String b = this.b;
        String string;
        if (!this.a) {
            final StringBuilder sb = new StringBuilder();
            sb.append("set");
            sb.append(b);
            string = sb.toString();
        }
        else {
            string = b;
        }
        try {
            switch (a$a.a[this.c.ordinal()]) {
                case 8: {
                    class1.getMethod(string, Float.TYPE).invoke(obj, this.e);
                    break;
                }
                case 7: {
                    class1.getMethod(string, Float.TYPE).invoke(obj, this.e);
                    break;
                }
                case 5: {
                    final Method method = class1.getMethod(string, Drawable.class);
                    final ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.h);
                    method.invoke(obj, colorDrawable);
                    break;
                }
                case 4: {
                    class1.getMethod(string, Integer.TYPE).invoke(obj, this.h);
                    break;
                }
                case 3: {
                    class1.getMethod(string, CharSequence.class).invoke(obj, this.f);
                    break;
                }
                case 2: {
                    class1.getMethod(string, Boolean.TYPE).invoke(obj, this.g);
                    break;
                }
                case 1:
                case 6: {
                    class1.getMethod(string, Integer.TYPE).invoke(obj, this.d);
                    break;
                }
            }
        }
        catch (InvocationTargetException ex) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(" Custom Attribute \"");
            sb2.append(b);
            sb2.append("\" not found on ");
            sb2.append(class1.getName());
            Log.e("TransitionLayout", sb2.toString());
            ex.printStackTrace();
        }
        catch (IllegalAccessException ex2) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(" Custom Attribute \"");
            sb3.append(b);
            sb3.append("\" not found on ");
            sb3.append(class1.getName());
            Log.e("TransitionLayout", sb3.toString());
            ex2.printStackTrace();
        }
        catch (NoSuchMethodException ex3) {
            Log.e("TransitionLayout", ex3.getMessage());
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(" Custom Attribute \"");
            sb4.append(b);
            sb4.append("\" not found on ");
            sb4.append(class1.getName());
            Log.e("TransitionLayout", sb4.toString());
            final StringBuilder sb5 = new StringBuilder();
            sb5.append(class1.getName());
            sb5.append(" must have a method ");
            sb5.append(string);
            Log.e("TransitionLayout", sb5.toString());
        }
    }
    
    public boolean c(final a a) {
        final boolean b = false;
        final boolean b2 = false;
        final boolean b3 = false;
        final boolean b4 = false;
        final boolean b5 = false;
        final boolean b6 = false;
        boolean b7 = b5;
        if (a != null) {
            final b c = this.c;
            if (c != a.c) {
                b7 = b5;
            }
            else {
                switch (a$a.a[c.ordinal()]) {
                    default: {
                        return false;
                    }
                    case 8: {
                        boolean b8 = b6;
                        if (this.e == a.e) {
                            b8 = true;
                        }
                        return b8;
                    }
                    case 7: {
                        boolean b9 = b;
                        if (this.e == a.e) {
                            b9 = true;
                        }
                        return b9;
                    }
                    case 4:
                    case 5: {
                        boolean b10 = b2;
                        if (this.h == a.h) {
                            b10 = true;
                        }
                        return b10;
                    }
                    case 3: {
                        boolean b11 = b3;
                        if (this.d == a.d) {
                            b11 = true;
                        }
                        return b11;
                    }
                    case 2: {
                        boolean b12 = b4;
                        if (this.g == a.g) {
                            b12 = true;
                        }
                        return b12;
                    }
                    case 1:
                    case 6: {
                        b7 = b5;
                        if (this.d == a.d) {
                            b7 = true;
                            break;
                        }
                        break;
                    }
                }
            }
        }
        return b7;
    }
    
    public b e() {
        return this.c;
    }
    
    public float f() {
        switch (a$a.a[this.c.ordinal()]) {
            default: {
                return Float.NaN;
            }
            case 8: {
                return this.e;
            }
            case 7: {
                return this.e;
            }
            case 6: {
                return (float)this.d;
            }
            case 4:
            case 5: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 3: {
                throw new RuntimeException("Cannot interpolate String");
            }
            case 2: {
                float n;
                if (this.g) {
                    n = 1.0f;
                }
                else {
                    n = 0.0f;
                }
                return n;
            }
        }
    }
    
    public void g(final float[] array) {
        switch (a$a.a[this.c.ordinal()]) {
            case 8: {
                array[0] = this.e;
                break;
            }
            case 7: {
                array[0] = this.e;
                break;
            }
            case 6: {
                array[0] = (float)this.d;
                break;
            }
            case 4:
            case 5: {
                final int h = this.h;
                final float n = (float)Math.pow((h >> 16 & 0xFF) / 255.0f, 2.2);
                final float n2 = (float)Math.pow((h >> 8 & 0xFF) / 255.0f, 2.2);
                final float n3 = (float)Math.pow((h & 0xFF) / 255.0f, 2.2);
                array[0] = n;
                array[1] = n2;
                array[2] = n3;
                array[3] = (h >> 24 & 0xFF) / 255.0f;
                break;
            }
            case 3: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 2: {
                float n4;
                if (this.g) {
                    n4 = 1.0f;
                }
                else {
                    n4 = 0.0f;
                }
                array[0] = n4;
                break;
            }
        }
    }
    
    public boolean h() {
        final int n = a$a.a[this.c.ordinal()];
        return n != 1 && n != 2 && n != 3;
    }
    
    public int i() {
        final int n = a$a.a[this.c.ordinal()];
        if (n != 4 && n != 5) {
            return 1;
        }
        return 4;
    }
    
    public void l(final int h) {
        this.h = h;
    }
    
    public void m(final float e) {
        this.e = e;
    }
    
    public void n(final int d) {
        this.d = d;
    }
    
    public void o(final View view, final float[] array) {
        final Class<? extends View> class1 = view.getClass();
        final StringBuilder sb = new StringBuilder();
        sb.append("set");
        sb.append(this.b);
        final String string = sb.toString();
        try {
            switch (a$a.a[this.c.ordinal()]) {
                case 8: {
                    class1.getMethod(string, Float.TYPE).invoke(view, array[0]);
                    break;
                }
                case 7: {
                    class1.getMethod(string, Float.TYPE).invoke(view, array[0]);
                    break;
                }
                case 6: {
                    class1.getMethod(string, Integer.TYPE).invoke(view, (int)array[0]);
                    break;
                }
                case 5: {
                    final Method method = class1.getMethod(string, Drawable.class);
                    final int b = b((int)((float)Math.pow(array[0], 0.45454545454545453) * 255.0f));
                    final int b2 = b((int)((float)Math.pow(array[1], 0.45454545454545453) * 255.0f));
                    final int b3 = b((int)((float)Math.pow(array[2], 0.45454545454545453) * 255.0f));
                    final int b4 = b((int)(array[3] * 255.0f));
                    final ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(b << 16 | b4 << 24 | b2 << 8 | b3);
                    method.invoke(view, colorDrawable);
                    break;
                }
                case 4: {
                    class1.getMethod(string, Integer.TYPE).invoke(view, b((int)((float)Math.pow(array[0], 0.45454545454545453) * 255.0f)) << 16 | b((int)(array[3] * 255.0f)) << 24 | b((int)((float)Math.pow(array[1], 0.45454545454545453) * 255.0f)) << 8 | b((int)((float)Math.pow(array[2], 0.45454545454545453) * 255.0f)));
                    break;
                }
                case 3: {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("unable to interpolate strings ");
                    sb2.append(this.b);
                    throw new RuntimeException(sb2.toString());
                }
                case 2: {
                    class1.getMethod(string, Boolean.TYPE).invoke(view, array[0] > 0.5f);
                    break;
                }
            }
        }
        catch (InvocationTargetException ex) {
            ex.printStackTrace();
        }
        catch (IllegalAccessException ex2) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("cannot access method ");
            sb3.append(string);
            sb3.append(" on View \"");
            sb3.append(androidx.constraintlayout.motion.widget.c.k(view));
            sb3.append("\"");
            Log.e("TransitionLayout", sb3.toString());
            ex2.printStackTrace();
        }
        catch (NoSuchMethodException ex3) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("no method ");
            sb4.append(string);
            sb4.append(" on View \"");
            sb4.append(androidx.constraintlayout.motion.widget.c.k(view));
            sb4.append("\"");
            Log.e("TransitionLayout", sb4.toString());
            ex3.printStackTrace();
        }
    }
    
    public void p(final String f) {
        this.f = f;
    }
    
    public void q(final Object o) {
        switch (a$a.a[this.c.ordinal()]) {
            case 7:
            case 8: {
                this.e = (float)o;
                break;
            }
            case 4:
            case 5: {
                this.h = (int)o;
                break;
            }
            case 3: {
                this.f = (String)o;
                break;
            }
            case 2: {
                this.g = (boolean)o;
                break;
            }
            case 1:
            case 6: {
                this.d = (int)o;
                break;
            }
        }
    }
    
    public void r(final float[] array) {
        final int n = a$a.a[this.c.ordinal()];
        boolean g = false;
        float e = 0.0f;
        switch (n) {
            default: {
                return;
            }
            case 8: {
                e = array[0];
                break;
            }
            case 7: {
                e = array[0];
                break;
            }
            case 4:
            case 5: {
                final int hsvToColor = Color.HSVToColor(array);
                this.h = hsvToColor;
                this.h = (b((int)(array[3] * 255.0f)) << 24 | (hsvToColor & 0xFFFFFF));
                return;
            }
            case 3: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 2: {
                if (array[0] > 0.5) {
                    g = true;
                }
                this.g = g;
                return;
            }
            case 1:
            case 6: {
                this.d = (int)array[0];
                return;
            }
        }
        this.e = e;
    }
    
    public enum b
    {
        G, 
        H, 
        I, 
        J, 
        K, 
        L, 
        M, 
        N;
    }
}
