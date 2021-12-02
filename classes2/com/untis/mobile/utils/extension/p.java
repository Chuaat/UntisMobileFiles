// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.extension;

import java.util.Iterator;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¨\u0006\u0004" }, d2 = { "", "", "separator", "a", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class p
{
    @e
    public static final String a(@e final List<String> list, @e final String s) {
        k0.p(list, "<this>");
        k0.p(s, "separator");
        final Iterator<String> iterator = (Iterator<String>)list.iterator();
        if (iterator.hasNext()) {
            String s2 = iterator.next();
            while (iterator.hasNext()) {
                final String s3 = iterator.next();
                String c;
                final String s4 = c = s2;
                if (s.U1((CharSequence)s4) ^ true) {
                    c = k0.C(s4, s);
                }
                s2 = k0.C(c, s3);
            }
            return s2;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
