// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000¨\u0006\u0004" }, d2 = { "", "otherString", "seperator", "a", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class q0
{
    @e
    public static final String a(@e final String s, @e final String s2, @e final String s3) {
        k0.p(s, "<this>");
        k0.p(s2, "otherString");
        k0.p(s3, "seperator");
        final boolean b = s.length() > 0;
        String c = s;
        if (b) {
            c = k0.C(s, s3);
        }
        return k0.C(c, s2);
    }
}
