// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import android.graphics.Color;
import java.util.Random;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f" }, d2 = { "Lcom/untis/mobile/utils/w;", "", "", "a", "color", "", "b", "Ljava/util/Random;", "Ljava/util/Random;", "random", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class w
{
    @e
    public static final w a;
    @e
    private static final Random b;
    
    static {
        a = new w();
        b = new Random();
    }
    
    private w() {
    }
    
    public final int a() {
        final Random b = w.b;
        return Color.argb(255, b.nextInt(56) + 200, b.nextInt(56) + 200, b.nextInt(56) + 200);
    }
    
    public final boolean b(final int n) {
        boolean b = true;
        if (17170445 == n) {
            return true;
        }
        final int[] array = { Color.red(n), Color.green(n), Color.blue(n) };
        if ((int)Math.sqrt(array[0] * (double)array[0] * 0.241 + array[1] * (double)array[1] * 0.691 + array[2] * (double)array[2] * 0.068) > 100) {
            b = false;
        }
        return b;
    }
}
