// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.content.res;

import android.content.res.Configuration;
import android.content.res.XmlResourceParser;
import android.content.res.Resources;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;
import android.graphics.drawable.Drawable;
import androidx.annotation.s;
import androidx.core.content.d;
import android.os.Build$VERSION;
import androidx.annotation.k0;
import android.content.res.ColorStateList;
import androidx.annotation.n;
import androidx.annotation.j0;
import android.util.SparseArray;
import android.content.Context;
import java.util.WeakHashMap;
import android.util.TypedValue;
import android.annotation.SuppressLint;

@SuppressLint({ "RestrictedAPI" })
public final class a
{
    private static final String a = "AppCompatResources";
    private static final ThreadLocal<TypedValue> b;
    private static final WeakHashMap<Context, SparseArray<a>> c;
    private static final Object d;
    
    static {
        b = new ThreadLocal<TypedValue>();
        c = new WeakHashMap<Context, SparseArray<a>>(0);
        d = new Object();
    }
    
    private a() {
    }
    
    private static void a(@j0 final Context context, @n final int n, @j0 final ColorStateList list) {
        synchronized (androidx.appcompat.content.res.a.d) {
            final WeakHashMap<Context, SparseArray<a>> c = androidx.appcompat.content.res.a.c;
            SparseArray value;
            if ((value = c.get(context)) == null) {
                value = new SparseArray();
                c.put(context, (SparseArray<a>)value);
            }
            value.append(n, (Object)new a(list, context.getResources().getConfiguration()));
        }
    }
    
    @k0
    private static ColorStateList b(@j0 final Context key, @n final int n) {
        synchronized (androidx.appcompat.content.res.a.d) {
            final SparseArray<a> sparseArray = androidx.appcompat.content.res.a.c.get(key);
            if (sparseArray != null && sparseArray.size() > 0) {
                final a a = (a)sparseArray.get(n);
                if (a != null) {
                    if (a.b.equals(key.getResources().getConfiguration())) {
                        return a.a;
                    }
                    sparseArray.remove(n);
                }
            }
            return null;
        }
    }
    
    public static ColorStateList c(@j0 final Context context, @n final int n) {
        if (Build$VERSION.SDK_INT >= 23) {
            return context.getColorStateList(n);
        }
        final ColorStateList b = b(context, n);
        if (b != null) {
            return b;
        }
        final ColorStateList f = f(context, n);
        if (f != null) {
            a(context, n, f);
            return f;
        }
        return androidx.core.content.d.g(context, n);
    }
    
    @k0
    public static Drawable d(@j0 final Context context, @s final int n) {
        return androidx.appcompat.widget.j0.h().j(context, n);
    }
    
    @j0
    private static TypedValue e() {
        final ThreadLocal<TypedValue> b = androidx.appcompat.content.res.a.b;
        TypedValue value;
        if ((value = b.get()) == null) {
            value = new TypedValue();
            b.set(value);
        }
        return value;
    }
    
    @k0
    private static ColorStateList f(final Context context, final int n) {
        if (g(context, n)) {
            return null;
        }
        final Resources resources = context.getResources();
        final XmlResourceParser xml = resources.getXml(n);
        try {
            return androidx.core.content.res.a.a(resources, (XmlPullParser)xml, context.getTheme());
        }
        catch (Exception ex) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", (Throwable)ex);
            return null;
        }
    }
    
    private static boolean g(@j0 final Context context, @n int type) {
        final Resources resources = context.getResources();
        final TypedValue e = e();
        boolean b = true;
        resources.getValue(type, e, true);
        type = e.type;
        if (type < 28 || type > 31) {
            b = false;
        }
        return b;
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
}
