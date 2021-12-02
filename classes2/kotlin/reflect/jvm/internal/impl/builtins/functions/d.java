// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import java.util.List;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.e;

public final class d extends e
{
    public d(@org.jetbrains.annotations.e final n n, @org.jetbrains.annotations.e final b b) {
        k0.p(n, "storageManager");
        k0.p(b, "containingClass");
        super(n, (kotlin.reflect.jvm.internal.impl.descriptors.e)b);
    }
    
    @org.jetbrains.annotations.e
    protected List<y> j() {
        final int n = a.a[((b)this.m()).V0().ordinal()];
        kotlin.reflect.jvm.internal.impl.builtins.functions.e e;
        if (n != 1) {
            if (n != 2) {
                final Object o = v.E();
                return (List<y>)o;
            }
            e = kotlin.reflect.jvm.internal.impl.builtins.functions.e.j0.a((b)this.m(), true);
        }
        else {
            e = kotlin.reflect.jvm.internal.impl.builtins.functions.e.j0.a((b)this.m(), false);
        }
        final Object o = v.k(e);
        return (List<y>)o;
    }
}
