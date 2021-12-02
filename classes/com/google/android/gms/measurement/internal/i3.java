// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.util.Log;
import java.util.Iterator;
import java.util.ArrayList;
import android.os.Bundle;
import com.google.android.gms.common.internal.x;
import java.util.concurrent.atomic.AtomicReference;

public final class i3 extends u5
{
    protected static final AtomicReference<String[]> c;
    protected static final AtomicReference<String[]> d;
    protected static final AtomicReference<String[]> e;
    
    static {
        c = new AtomicReference<String[]>();
        d = new AtomicReference<String[]>();
        e = new AtomicReference<String[]>();
    }
    
    i3(final z4 z4) {
        super(z4);
    }
    
    private static final String r(final String s, final String[] array, final String[] array2, final AtomicReference<String[]> atomicReference) {
        x.k(array);
        x.k(array2);
        x.k(atomicReference);
        final int length = array.length;
        final int length2 = array2.length;
        int i = 0;
        x.a(length == length2);
        while (i < array.length) {
            if (ga.Z(s, array[i])) {
                synchronized (atomicReference) {
                    String[] newValue;
                    if ((newValue = atomicReference.get()) == null) {
                        newValue = new String[array2.length];
                        atomicReference.set(newValue);
                    }
                    String string;
                    if ((string = newValue[i]) == null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(array2[i]);
                        sb.append("(");
                        sb.append(array[i]);
                        sb.append(")");
                        string = sb.toString();
                        newValue[i] = string;
                    }
                    return string;
                }
            }
            ++i;
        }
        return s;
    }
    
    @Override
    protected final boolean g() {
        return false;
    }
    
    protected final String l(final Object[] array) {
        if (array == null) {
            return "[]";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (final Object obj : array) {
            String str;
            if (obj instanceof Bundle) {
                str = this.m((Bundle)obj);
            }
            else {
                str = String.valueOf(obj);
            }
            if (str != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    protected final String m(final Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.q()) {
            return bundle.toString();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (final String s : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(this.o(s));
            sb.append("=");
            final Object value = bundle.get(s);
            String str;
            if (value instanceof Bundle) {
                str = this.l(new Object[] { value });
            }
            else if (value instanceof Object[]) {
                str = this.l((Object[])value);
            }
            else if (value instanceof ArrayList) {
                str = this.l(((ArrayList)value).toArray());
            }
            else {
                str = String.valueOf(value);
            }
            sb.append(str);
        }
        sb.append("}]");
        return sb.toString();
    }
    
    protected final String n(final String s) {
        if (s == null) {
            return null;
        }
        if (!this.q()) {
            return s;
        }
        return r(s, x5.c, x5.a, i3.c);
    }
    
    protected final String o(final String s) {
        if (s == null) {
            return null;
        }
        if (!this.q()) {
            return s;
        }
        return r(s, y5.b, y5.a, i3.d);
    }
    
    protected final String p(final String str) {
        if (str == null) {
            return null;
        }
        if (!this.q()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            final StringBuilder sb = new StringBuilder();
            sb.append("experiment_id(");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
        return r(str, z5.b, z5.a, i3.e);
    }
    
    protected final boolean q() {
        super.a.L();
        return super.a.n() && Log.isLoggable(super.a.c().z(), 3);
    }
}
