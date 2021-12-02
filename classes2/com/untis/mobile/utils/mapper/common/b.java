// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.common;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import io.realm.l0;
import io.realm.p0;
import java.util.List;
import org.joda.time.v;
import org.joda.time.t;
import org.joda.time.c;
import androidx.annotation.j0;
import android.graphics.Color;
import androidx.annotation.k0;

public abstract class b<Source, Target>
{
    public static int a(@k0 final String s) {
        if (s == null) {
            return 0;
        }
        try {
            return Color.parseColor(s);
        }
        catch (Exception ex) {
            return 0;
        }
    }
    
    @j0
    public static String b(final int i) {
        final StringBuilder sb = new StringBuilder();
        sb.append("#");
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }
    
    @j0
    public static c c(@k0 final String s) {
        if (s == null) {
            return new c(0L);
        }
        try {
            return c.K0(s.replace("Z", ""));
        }
        catch (Exception ex) {
            return new c(0L);
        }
    }
    
    @j0
    public static t d(@k0 final String s) {
        if (s == null) {
            return new t(0L);
        }
        try {
            return t.c0(s.replace("Z", ""));
        }
        catch (Exception ex) {
            return new t(0L);
        }
    }
    
    @j0
    public static v e(@k0 final String s) {
        if (s == null) {
            return new v(0L);
        }
        try {
            return v.c0(s.replace("Z", ""));
        }
        catch (Exception ex) {
            return new v(0L);
        }
    }
    
    @j0
    public static <T extends p0> l0<T> h(@k0 final List<T> c) {
        final l0<Object> l0 = new l0<Object>();
        if (c == null) {
            return (l0<T>)l0;
        }
        l0.addAll(c);
        return (l0<T>)l0;
    }
    
    @k0
    public abstract Target f(@j0 final Source p0);
    
    @j0
    public List<Target> g(@j0 final List<Source> list) {
        final ArrayList<Target> list2 = new ArrayList<Target>();
        for (final Source next : list) {
            if (next == null) {
                continue;
            }
            final Target f = this.f(next);
            if (f == null) {
                continue;
            }
            list2.add(f);
        }
        return list2;
    }
}
