// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.persistence.typeconverter;

import org.joda.time.v;
import org.joda.time.t;
import androidx.room.f3;
import com.untis.mobile.utils.d0;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/utils/persistence/typeconverter/c;", "", "Lorg/joda/time/c;", "dateTime", "", "a", "iso", "b", "Lorg/joda/time/t;", "localDate", "e", "c", "Lorg/joda/time/v;", "localTime", "f", "d", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c
{
    @f3
    @f
    public final String a(@f final org.joda.time.c c) {
        String v;
        if (c == null) {
            v = null;
        }
        else {
            v = d0.v(c);
        }
        return v;
    }
    
    @f3
    @f
    public final org.joda.time.c b(@f final String s) {
        org.joda.time.c j;
        if (s == null) {
            j = null;
        }
        else {
            j = d0.j(s);
        }
        return j;
    }
    
    @f3
    @f
    public final t c(@f final String s) {
        t y;
        if (s == null) {
            y = null;
        }
        else {
            y = d0.y(s);
        }
        return y;
    }
    
    @f3
    @f
    public final v d(@f final String s) {
        v z;
        if (s == null) {
            z = null;
        }
        else {
            z = d0.z(s);
        }
        return z;
    }
    
    @f3
    @f
    public final String e(@f final t t) {
        String w;
        if (t == null) {
            w = null;
        }
        else {
            w = d0.w(t);
        }
        return w;
    }
    
    @f3
    @f
    public final String f(@f final v v) {
        String x;
        if (v == null) {
            x = null;
        }
        else {
            x = d0.x(v);
        }
        return x;
    }
}
