// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.common;

import org.joda.time.v;
import org.joda.time.t;
import kotlin.text.s;
import org.joda.time.c;
import android.graphics.Color;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0004J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0004J\u0014\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0004J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0004J\u0014\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0004J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0004J\u001c\u0010\u0013\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0004¨\u0006\u0016" }, d2 = { "Lcom/untis/mobile/utils/mapper/common/a;", "", "", "iso", "Lorg/joda/time/c;", "c", "Lorg/joda/time/v;", "h", "Lorg/joda/time/t;", "g", "dateTime", "d", "localDate", "e", "localTime", "f", "hex", "", "defaultColor", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public abstract class a
{
    protected final int a(@f final String s, int color) {
        try {
            color = Color.parseColor(s);
            return color;
        }
        catch (Exception ex) {
            return color;
        }
    }
    
    @f
    protected final c c(@f String k2) {
        final c c = null;
        Label_0023: {
            if (k2 == null) {
                k2 = null;
                break Label_0023;
            }
            try {
                k2 = s.k2(k2, "Z", "", false, 4, (Object)null);
                return org.joda.time.c.K0(k2);
            }
            catch (Exception ex) {
                return c;
            }
        }
    }
    
    @f
    protected final String d(@f final c c) {
        String g4;
        if (c == null) {
            g4 = null;
        }
        else {
            g4 = ((org.joda.time.base.a)c).g4("yyyy-MM-dd'T'HH:mm'Z'");
        }
        return g4;
    }
    
    @f
    protected final String e(@f final t t) {
        String g4;
        if (t == null) {
            g4 = null;
        }
        else {
            g4 = t.g4("yyyy-MM-dd");
        }
        return g4;
    }
    
    @f
    protected final String f(@f final v v) {
        String g4;
        if (v == null) {
            g4 = null;
        }
        else {
            g4 = v.g4("'T'HH:mm");
        }
        return g4;
    }
    
    @f
    protected final t g(@f String k2) {
        final t t = null;
        Label_0023: {
            if (k2 == null) {
                k2 = null;
                break Label_0023;
            }
            try {
                k2 = s.k2(k2, "Z", "", false, 4, (Object)null);
                return org.joda.time.t.c0(k2);
            }
            catch (Exception ex) {
                return t;
            }
        }
    }
    
    @f
    protected final v h(@f String k2) {
        final v v = null;
        Label_0023: {
            if (k2 == null) {
                k2 = null;
                break Label_0023;
            }
            try {
                k2 = s.k2(k2, "Z", "", false, 4, (Object)null);
                return org.joda.time.v.c0(k2);
            }
            catch (Exception ex) {
                return v;
            }
        }
    }
}
