// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedHashSet;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.load.java.y;
import kotlin.reflect.jvm.internal.impl.name.b;
import java.util.Set;
import org.jetbrains.annotations.e;

public final class a
{
    @e
    public static final a a;
    @e
    private static final Set<kotlin.reflect.jvm.internal.impl.name.a> b;
    
    static {
        a = new a();
        final List<b> l = v.L(y.a, y.i, y.j, y.d, y.e, y.g);
        final LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.a> b2 = new LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.a>();
        final Iterator<Object> iterator = l.iterator();
        while (iterator.hasNext()) {
            b2.add(kotlin.reflect.jvm.internal.impl.name.a.m((b)iterator.next()));
        }
        b = b2;
    }
    
    private a() {
    }
    
    @e
    public final Set<kotlin.reflect.jvm.internal.impl.name.a> a() {
        return kotlin.reflect.jvm.internal.impl.a.b;
    }
}
