// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.extension;

import org.jetbrains.annotations.f;
import android.graphics.Color;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\n\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¨\u0006\u0005" }, d2 = { "", "", "a", "(Ljava/lang/String;)Ljava/lang/Integer;", "b", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class d
{
    @f
    public static final Integer a(@e String c) {
        k0.p(c, "<this>");
        final Integer n = null;
        if (!s.V2((CharSequence)c, (CharSequence)"#", false, 2, (Object)null)) {
            c = k0.C("#", c);
        }
        try {
            return Color.parseColor(c);
        }
        catch (Exception ex) {
            return n;
        }
    }
    
    @e
    public static final String b(final int i) {
        final String hexString = Integer.toHexString(i);
        k0.o(hexString, "toHexString(this)");
        return hexString;
    }
}
