// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion;

import java.lang.reflect.Method;
import androidx.constraintlayout.core.motion.utils.c0;
import java.util.Iterator;
import java.lang.reflect.InvocationTargetException;
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
    
    public static HashMap<String, a> d(final HashMap<String, a> hashMap, final Object obj) {
        final HashMap<String, a> hashMap2 = new HashMap<String, a>();
        final Class<?> class1 = obj.getClass();
        for (final String key : hashMap.keySet()) {
            final a a = hashMap.get(key);
            try {
                final StringBuilder sb = new StringBuilder();
                sb.append("getMap");
                sb.append(key);
                hashMap2.put(key, new a(a, class1.getMethod(sb.toString(), (Class<?>[])new Class[0]).invoke(obj, new Object[0])));
            }
            catch (InvocationTargetException ex) {
                ex.printStackTrace();
            }
            catch (IllegalAccessException ex2) {
                ex2.printStackTrace();
            }
            catch (NoSuchMethodException ex3) {
                ex3.printStackTrace();
            }
        }
        return hashMap2;
    }
    
    public static int h(float n, final float n2, float n3) {
        n *= 6.0f;
        final int n4 = (int)n;
        n -= n4;
        n3 *= 255.0f;
        final int n5 = (int)((1.0f - n2) * n3 + 0.5f);
        final int n6 = (int)((1.0f - n * n2) * n3 + 0.5f);
        final int n7 = (int)((1.0f - (1.0f - n) * n2) * n3 + 0.5f);
        final int n8 = (int)(n3 + 0.5f);
        if (n4 == 0) {
            return (n8 << 16) + (n7 << 8) + n5 | 0xFF000000;
        }
        if (n4 == 1) {
            return (n6 << 16) + (n8 << 8) + n5 | 0xFF000000;
        }
        if (n4 == 2) {
            return (n5 << 16) + (n8 << 8) + n7 | 0xFF000000;
        }
        if (n4 == 3) {
            return (n5 << 16) + (n6 << 8) + n8 | 0xFF000000;
        }
        if (n4 == 4) {
            return (n7 << 16) + (n5 << 8) + n8 | 0xFF000000;
        }
        if (n4 != 5) {
            return 0;
        }
        return (n8 << 16) + (n5 << 8) + n6 | 0xFF000000;
    }
    
    public static void k(final Object obj, final HashMap<String, a> hashMap) {
        final Class<?> class1 = obj.getClass();
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
                        class1.getMethod(string, Float.TYPE).invoke(obj, a.e);
                        continue;
                    }
                    case 7: {
                        class1.getMethod(string, Float.TYPE).invoke(obj, a.e);
                        continue;
                    }
                    case 6: {
                        class1.getMethod(string, Integer.TYPE).invoke(obj, a.d);
                        continue;
                    }
                    case 4: {
                        class1.getMethod(string, Integer.TYPE).invoke(obj, a.h);
                        continue;
                    }
                    case 3: {
                        class1.getMethod(string, CharSequence.class).invoke(obj, a.f);
                        continue;
                    }
                    case 2: {
                        class1.getMethod(string, Boolean.TYPE).invoke(obj, a.g);
                        continue;
                    }
                    case 1: {
                        class1.getMethod(string, Integer.TYPE).invoke(obj, a.d);
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
                c0.f("TransitionLayout", sb2.toString());
                ex.printStackTrace();
            }
            catch (IllegalAccessException ex2) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(" Custom Attribute \"");
                sb3.append(str);
                sb3.append("\" not found on ");
                sb3.append(class1.getName());
                c0.f("TransitionLayout", sb3.toString());
                ex2.printStackTrace();
            }
            catch (NoSuchMethodException ex3) {
                c0.f("TransitionLayout", ex3.getMessage());
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(" Custom Attribute \"");
                sb4.append(str);
                sb4.append("\" not found on ");
                sb4.append(class1.getName());
                c0.f("TransitionLayout", sb4.toString());
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(class1.getName());
                sb5.append(" must have a method ");
                sb5.append(string);
                c0.f("TransitionLayout", sb5.toString());
            }
        }
    }
    
    public void a(Object o) {
        final Class<?> class1 = o.getClass();
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
                    class1.getMethod(string, Float.TYPE).invoke(o, this.e);
                    break;
                }
                case 7: {
                    class1.getMethod(string, Float.TYPE).invoke(o, this.e);
                    break;
                }
                case 4: {
                    class1.getMethod(string, Integer.TYPE).invoke(o, this.h);
                    break;
                }
                case 3: {
                    class1.getMethod(string, CharSequence.class).invoke(o, this.f);
                    break;
                }
                case 2: {
                    class1.getMethod(string, Boolean.TYPE).invoke(o, this.g);
                    break;
                }
                case 1:
                case 6: {
                    class1.getMethod(string, Integer.TYPE).invoke(o, this.d);
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
            c0.f("TransitionLayout", sb2.toString());
            ex.printStackTrace();
        }
        catch (IllegalAccessException ex2) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(" Custom Attribute \"");
            sb3.append(b);
            sb3.append("\" not found on ");
            sb3.append(class1.getName());
            c0.f("TransitionLayout", sb3.toString());
            ex2.printStackTrace();
        }
        catch (NoSuchMethodException ex3) {
            c0.f("TransitionLayout", ex3.getMessage());
            o = new StringBuilder();
            ((StringBuilder)o).append(" Custom Attribute \"");
            ((StringBuilder)o).append(b);
            ((StringBuilder)o).append("\" not found on ");
            ((StringBuilder)o).append(class1.getName());
            c0.f("TransitionLayout", ((StringBuilder)o).toString());
            o = new StringBuilder();
            ((StringBuilder)o).append(class1.getName());
            ((StringBuilder)o).append(" must have a method ");
            ((StringBuilder)o).append(string);
            c0.f("TransitionLayout", ((StringBuilder)o).toString());
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
    
    public boolean i() {
        final int n = a$a.a[this.c.ordinal()];
        return n != 1 && n != 2 && n != 3;
    }
    
    public int j() {
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
    
    public void o(final Object obj, final float[] array) {
        final Class<?> class1 = obj.getClass();
        final StringBuilder sb = new StringBuilder();
        sb.append("set");
        sb.append(this.b);
        final String string = sb.toString();
        try {
            final int n = a$a.a[this.c.ordinal()];
            boolean b = true;
            if (n != 2) {
                if (n == 3) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("unable to interpolate strings ");
                    sb2.append(this.b);
                    throw new RuntimeException(sb2.toString());
                }
                if (n != 4) {
                    if (n != 6) {
                        if (n != 7) {
                            if (n == 8) {
                                class1.getMethod(string, Float.TYPE).invoke(obj, array[0]);
                            }
                        }
                        else {
                            class1.getMethod(string, Float.TYPE).invoke(obj, array[0]);
                        }
                    }
                    else {
                        class1.getMethod(string, Integer.TYPE).invoke(obj, (int)array[0]);
                    }
                }
                else {
                    class1.getMethod(string, Integer.TYPE).invoke(obj, b((int)((float)Math.pow(array[1], 0.45454545454545453) * 255.0f)) << 8 | (b((int)(array[3] * 255.0f)) << 24 | b((int)((float)Math.pow(array[0], 0.45454545454545453) * 255.0f)) << 16) | b((int)((float)Math.pow(array[2], 0.45454545454545453) * 255.0f)));
                }
            }
            else {
                final Method method = class1.getMethod(string, Boolean.TYPE);
                if (array[0] <= 0.5f) {
                    b = false;
                }
                method.invoke(obj, b);
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
            sb3.append(obj.getClass().getName());
            sb3.append("\"");
            c0.f("TransitionLayout", sb3.toString());
            ex2.printStackTrace();
        }
        catch (NoSuchMethodException ex3) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("no method ");
            sb4.append(string);
            sb4.append(" on View \"");
            sb4.append(obj.getClass().getName());
            sb4.append("\"");
            c0.f("TransitionLayout", sb4.toString());
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
        boolean g = true;
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
                final int h = h(array[0], array[1], array[2]);
                this.h = h;
                this.h = (b((int)(array[3] * 255.0f)) << 24 | (h & 0xFFFFFF));
                return;
            }
            case 3: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 2: {
                if (array[0] <= 0.5) {
                    g = false;
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
