// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.view.LayoutInflater$Factory;
import android.util.Log;
import android.view.LayoutInflater$Factory2;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

public final class l
{
    private static final String a = "LayoutInflaterCompatHC";
    private static Field b;
    private static boolean c;
    
    private l() {
    }
    
    private static void a(final LayoutInflater layoutInflater, final LayoutInflater$Factory2 value) {
        if (!l.c) {
            try {
                (l.b = LayoutInflater.class.getDeclaredField("mFactory2")).setAccessible(true);
            }
            catch (NoSuchFieldException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
                sb.append(LayoutInflater.class.getName());
                sb.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", sb.toString(), (Throwable)ex);
            }
            l.c = true;
        }
        final Field b = l.b;
        if (b != null) {
            try {
                b.set(layoutInflater, value);
            }
            catch (IllegalAccessException ex2) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                sb2.append(layoutInflater);
                sb2.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", sb2.toString(), (Throwable)ex2);
            }
        }
    }
    
    @Deprecated
    public static m b(final LayoutInflater layoutInflater) {
        final LayoutInflater$Factory factory = layoutInflater.getFactory();
        if (factory instanceof a) {
            return ((a)factory).G;
        }
        return null;
    }
    
    @Deprecated
    public static void c(@j0 final LayoutInflater layoutInflater, @j0 final m m) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final LayoutInflater$Factory2 layoutInflater$Factory2 = null;
        Object factory2 = null;
        if (sdk_INT >= 21) {
            if (m != null) {
                factory2 = new a(m);
            }
            layoutInflater.setFactory2((LayoutInflater$Factory2)factory2);
        }
        else {
            Object factory3 = layoutInflater$Factory2;
            if (m != null) {
                factory3 = new a(m);
            }
            layoutInflater.setFactory2((LayoutInflater$Factory2)factory3);
            final LayoutInflater$Factory factory4 = layoutInflater.getFactory();
            if (factory4 instanceof LayoutInflater$Factory2) {
                a(layoutInflater, (LayoutInflater$Factory2)factory4);
            }
            else {
                a(layoutInflater, (LayoutInflater$Factory2)factory3);
            }
        }
    }
    
    public static void d(@j0 final LayoutInflater layoutInflater, @j0 final LayoutInflater$Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build$VERSION.SDK_INT < 21) {
            final LayoutInflater$Factory factory3 = layoutInflater.getFactory();
            if (factory3 instanceof LayoutInflater$Factory2) {
                a(layoutInflater, (LayoutInflater$Factory2)factory3);
            }
            else {
                a(layoutInflater, factory2);
            }
        }
    }
    
    static class a implements LayoutInflater$Factory2
    {
        final m G;
        
        a(final m g) {
            this.G = g;
        }
        
        public View onCreateView(final View view, final String s, final Context context, final AttributeSet set) {
            return this.G.onCreateView(view, s, context, set);
        }
        
        public View onCreateView(final String s, final Context context, final AttributeSet set) {
            return this.G.onCreateView(null, s, context, set);
        }
        
        @j0
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.getClass().getName());
            sb.append("{");
            sb.append(this.G);
            sb.append("}");
            return sb.toString();
        }
    }
}
