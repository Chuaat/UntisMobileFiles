// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content.res;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import androidx.annotation.p0;
import android.os.Looper;
import androidx.core.util.i;
import android.content.res.Configuration;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import androidx.core.graphics.x;
import android.content.res.XmlResourceParser;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;
import androidx.annotation.t0;
import androidx.annotation.p;
import android.graphics.drawable.Drawable;
import androidx.annotation.s;
import androidx.annotation.l;
import android.os.Build$VERSION;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.res.Resources$NotFoundException;
import android.os.Handler;
import android.graphics.Typeface;
import androidx.annotation.u;
import android.content.Context;
import androidx.annotation.k0;
import android.content.res.ColorStateList;
import androidx.annotation.n;
import androidx.annotation.j0;
import androidx.annotation.c;
import android.util.SparseArray;
import java.util.WeakHashMap;
import android.util.TypedValue;

public final class g
{
    private static final String a = "ResourcesCompat";
    private static final ThreadLocal<TypedValue> b;
    private static final WeakHashMap<b, SparseArray<a>> c;
    private static final Object d;
    @androidx.annotation.c
    public static final int e = 0;
    
    static {
        b = new ThreadLocal<TypedValue>();
        c = new WeakHashMap<b, SparseArray<a>>(0);
        d = new Object();
    }
    
    private g() {
    }
    
    private static void a(@j0 final b b, @n final int n, @j0 final ColorStateList list) {
        synchronized (g.d) {
            final WeakHashMap<b, SparseArray<a>> c = g.c;
            SparseArray value;
            if ((value = c.get(b)) == null) {
                value = new SparseArray();
                c.put(b, (SparseArray<a>)value);
            }
            value.append(n, (Object)new a(list, b.a.getConfiguration()));
        }
    }
    
    @k0
    private static ColorStateList b(@j0 final b key, @n final int n) {
        synchronized (g.d) {
            final SparseArray<a> sparseArray = g.c.get(key);
            if (sparseArray != null && sparseArray.size() > 0) {
                final a a = (a)sparseArray.get(n);
                if (a != null) {
                    if (a.b.equals(key.a.getConfiguration())) {
                        return a.a;
                    }
                    sparseArray.remove(n);
                }
            }
            return null;
        }
    }
    
    @k0
    public static Typeface c(@j0 final Context context, @u final int n) throws Resources$NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return o(context, n, new TypedValue(), 0, null, null, false, true);
    }
    
    @l
    public static int d(@j0 final Resources resources, @n final int n, @k0 final Resources$Theme resources$Theme) throws Resources$NotFoundException {
        if (Build$VERSION.SDK_INT >= 23) {
            return resources.getColor(n, resources$Theme);
        }
        return resources.getColor(n);
    }
    
    @k0
    public static ColorStateList e(@j0 final Resources resources, @n final int n, @k0 final Resources$Theme resources$Theme) throws Resources$NotFoundException {
        if (Build$VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(n, resources$Theme);
        }
        final b b = new b(resources, resources$Theme);
        final ColorStateList b2 = b(b, n);
        if (b2 != null) {
            return b2;
        }
        final ColorStateList m = m(resources, n, resources$Theme);
        if (m != null) {
            a(b, n, m);
            return m;
        }
        return resources.getColorStateList(n);
    }
    
    @k0
    public static Drawable f(@j0 final Resources resources, @s final int n, @k0 final Resources$Theme resources$Theme) throws Resources$NotFoundException {
        if (Build$VERSION.SDK_INT >= 21) {
            return resources.getDrawable(n, resources$Theme);
        }
        return resources.getDrawable(n);
    }
    
    @k0
    public static Drawable g(@j0 final Resources resources, @s final int n, final int n2, @k0 final Resources$Theme resources$Theme) throws Resources$NotFoundException {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 21) {
            return resources.getDrawableForDensity(n, n2, resources$Theme);
        }
        if (sdk_INT >= 15) {
            return resources.getDrawableForDensity(n, n2);
        }
        return resources.getDrawable(n);
    }
    
    public static float h(@j0 final Resources resources, @p final int i) {
        if (Build$VERSION.SDK_INT >= 29) {
            return g.d.a(resources, i);
        }
        final TypedValue l = l();
        resources.getValue(i, l, true);
        if (l.type == 4) {
            return l.getFloat();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Resource ID #0x");
        sb.append(Integer.toHexString(i));
        sb.append(" type #0x");
        sb.append(Integer.toHexString(l.type));
        sb.append(" is not valid");
        throw new Resources$NotFoundException(sb.toString());
    }
    
    @k0
    public static Typeface i(@j0 final Context context, @u final int n) throws Resources$NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return o(context, n, new TypedValue(), 0, null, null, false, false);
    }
    
    @t0({ t0.a.I })
    public static Typeface j(@j0 final Context context, @u final int n, final TypedValue typedValue, final int n2, @k0 final c c) throws Resources$NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return o(context, n, typedValue, n2, c, null, true, false);
    }
    
    public static void k(@j0 final Context context, @u final int n, @j0 final c c, @k0 final Handler handler) throws Resources$NotFoundException {
        androidx.core.util.n.g(c);
        if (context.isRestricted()) {
            c.a(-4, handler);
            return;
        }
        o(context, n, new TypedValue(), 0, c, handler, false, false);
    }
    
    @j0
    private static TypedValue l() {
        final ThreadLocal<TypedValue> b = g.b;
        TypedValue value;
        if ((value = b.get()) == null) {
            value = new TypedValue();
            b.set(value);
        }
        return value;
    }
    
    @k0
    private static ColorStateList m(final Resources resources, final int n, @k0 final Resources$Theme resources$Theme) {
        if (n(resources, n)) {
            return null;
        }
        final XmlResourceParser xml = resources.getXml(n);
        try {
            return androidx.core.content.res.a.a(resources, (XmlPullParser)xml, resources$Theme);
        }
        catch (Exception ex) {
            Log.e("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", (Throwable)ex);
            return null;
        }
    }
    
    private static boolean n(@j0 final Resources resources, @n int type) {
        final TypedValue l = l();
        boolean b = true;
        resources.getValue(type, l, true);
        type = l.type;
        if (type < 28 || type > 31) {
            b = false;
        }
        return b;
    }
    
    private static Typeface o(@j0 final Context context, final int i, final TypedValue typedValue, final int n, @k0 final c c, @k0 final Handler handler, final boolean b, final boolean b2) {
        final Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        final Typeface p8 = p(context, resources, typedValue, i, n, c, handler, b, b2);
        if (p8 == null && c == null && !b2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Font resource ID #0x");
            sb.append(Integer.toHexString(i));
            sb.append(" could not be retrieved.");
            throw new Resources$NotFoundException(sb.toString());
        }
        return p8;
    }
    
    private static Typeface p(@j0 final Context context, final Resources resources, final TypedValue obj, final int i, final int n, @k0 final c c, @k0 final Handler handler, final boolean b, final boolean b2) {
        final CharSequence string = obj.string;
        if (string == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Resource \"");
            sb.append(resources.getResourceName(i));
            sb.append("\" (");
            sb.append(Integer.toHexString(i));
            sb.append(") is not a Font: ");
            sb.append(obj);
            throw new Resources$NotFoundException(sb.toString());
        }
        final String string2 = string.toString();
        if (!string2.startsWith("res/")) {
            if (c != null) {
                c.a(-3, handler);
            }
            return null;
        }
        final Typeface g = x.g(resources, i, n);
        if (g != null) {
            if (c != null) {
                c.b(g, handler);
            }
            return g;
        }
        if (b2) {
            return null;
        }
        StringBuilder sb2;
        String str;
        try {
            if (!string2.toLowerCase().endsWith(".xml")) {
                final Typeface e = x.e(context, resources, i, string2, n);
                if (c != null) {
                    if (e != null) {
                        c.b(e, handler);
                    }
                    else {
                        c.a(-3, handler);
                    }
                }
                return e;
            }
            final androidx.core.content.res.d.a b3 = androidx.core.content.res.d.b((XmlPullParser)resources.getXml(i), resources);
            if (b3 == null) {
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                if (c != null) {
                    c.a(-3, handler);
                }
                return null;
            }
            return x.d(context, b3, resources, i, n, c, handler, b);
        }
        catch (IOException ex) {
            sb2 = new StringBuilder();
            str = "Failed to read xml resource ";
        }
        catch (XmlPullParserException ex) {
            sb2 = new StringBuilder();
            str = "Failed to parse xml resource ";
        }
        sb2.append(str);
        sb2.append(string2);
        final IOException ex;
        Log.e("ResourcesCompat", sb2.toString(), (Throwable)ex);
        if (c != null) {
            c.a(-3, handler);
        }
        return null;
    }
    
    private static class a
    {
        final ColorStateList a;
        final Configuration b;
        
        a(@j0 final ColorStateList a, @j0 final Configuration b) {
            this.a = a;
            this.b = b;
        }
    }
    
    private static final class b
    {
        final Resources a;
        @k0
        final Resources$Theme b;
        
        b(@j0 final Resources a, @k0 final Resources$Theme b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && b.class == o.getClass()) {
                final b b2 = (b)o;
                if (!this.a.equals(b2.a) || !i.a(this.b, b2.b)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            return i.b(this.a, this.b);
        }
    }
    
    public abstract static class c
    {
        @j0
        @t0({ t0.a.G })
        public static Handler c(@k0 final Handler handler) {
            Handler handler2 = handler;
            if (handler == null) {
                handler2 = new Handler(Looper.getMainLooper());
            }
            return handler2;
        }
        
        @t0({ t0.a.I })
        public final void a(final int n, @k0 final Handler handler) {
            c(handler).post((Runnable)new Runnable() {
                @Override
                public void run() {
                    c.this.d(n);
                }
            });
        }
        
        @t0({ t0.a.I })
        public final void b(final Typeface typeface, @k0 final Handler handler) {
            c(handler).post((Runnable)new Runnable() {
                @Override
                public void run() {
                    c.this.e(typeface);
                }
            });
        }
        
        public abstract void d(final int p0);
        
        public abstract void e(@j0 final Typeface p0);
    }
    
    @p0(29)
    static class d
    {
        private d() {
        }
        
        static float a(@j0 final Resources resources, @p final int n) {
            return resources.getFloat(n);
        }
    }
    
    public static final class e
    {
        private e() {
        }
        
        public static void a(@j0 final Resources$Theme resources$Theme) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 29) {
                b.a(resources$Theme);
            }
            else if (sdk_INT >= 23) {
                a.a(resources$Theme);
            }
        }
        
        @p0(23)
        static class a
        {
            private static final Object a;
            private static Method b;
            private static boolean c;
            
            static {
                a = new Object();
            }
            
            private a() {
            }
            
            static void a(@j0 final Resources$Theme obj) {
                synchronized (e.a.a) {
                    if (!e.a.c) {
                        try {
                            (e.a.b = Resources$Theme.class.getDeclaredMethod("rebase", (Class<?>[])new Class[0])).setAccessible(true);
                        }
                        catch (NoSuchMethodException ex) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", (Throwable)ex);
                        }
                        e.a.c = true;
                    }
                    final Method b = e.a.b;
                    if (b != null) {
                        try {
                            b.invoke(obj, new Object[0]);
                            return;
                        }
                        catch (InvocationTargetException obj) {}
                        catch (IllegalAccessException ex2) {}
                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", (Throwable)obj);
                        e.a.b = null;
                    }
                }
            }
        }
        
        @p0(29)
        static class b
        {
            private b() {
            }
            
            static void a(@j0 final Resources$Theme resources$Theme) {
                resources$Theme.rebase();
            }
        }
    }
}
