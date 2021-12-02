// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.k1;

public final class b
{
    private static final String b(final Object obj) {
        final StringBuilder sb = new StringBuilder();
        sb.append("ClassicTypeCheckerContext couldn't handle ");
        sb.append(k1.d((Class)obj.getClass()));
        sb.append(' ');
        sb.append(obj);
        return sb.toString();
    }
}
