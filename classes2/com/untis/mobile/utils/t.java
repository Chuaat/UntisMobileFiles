// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import android.graphics.Color;
import kotlin.random.g;
import kotlin.random.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/utils/t;", "", "Lkotlin/random/f;", "random", "", "b", "", "seed", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class t
{
    @e
    public static final t a;
    
    static {
        a = new t();
    }
    
    private t() {
    }
    
    private final int b(final f f) {
        return (int)(f.m(256) * 0.85f);
    }
    
    public final int a(final long n) {
        final f b = g.b(n);
        return Color.argb(255, this.b(b), this.b(b), this.b(b));
    }
}
