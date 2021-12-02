// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.load.java.structure.e;

public final class h extends d implements e
{
    @org.jetbrains.annotations.e
    private final Object[] c;
    
    public h(@f final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final Object[] c) {
        k0.p((Object)c, "values");
        super(e);
        this.c = c;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public List<d> e() {
        final Object[] c = this.c;
        final ArrayList list = new ArrayList<d>(c.length);
        for (final Object o : c) {
            final a b = d.b;
            k0.m(o);
            list.add(b.a(o, null));
        }
        return (List<d>)list;
    }
}
