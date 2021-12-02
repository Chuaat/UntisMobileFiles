// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import n6.l;
import kotlin.collections.v;
import java.util.LinkedList;
import java.util.List;
import kotlin.m1;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.metadata.a;

public final class d implements c
{
    @e
    private final kotlin.reflect.jvm.internal.impl.metadata.a.p a;
    @e
    private final kotlin.reflect.jvm.internal.impl.metadata.a.o b;
    
    public d(@e final kotlin.reflect.jvm.internal.impl.metadata.a.p a, @e final kotlin.reflect.jvm.internal.impl.metadata.a.o b) {
        k0.p((Object)a, "strings");
        k0.p((Object)b, "qualifiedNames");
        this.a = a;
        this.b = b;
    }
    
    private final m1<List<String>, List<String>, Boolean> c(int i) {
        final LinkedList<String> list = new LinkedList<String>();
        final LinkedList<String> list2 = new LinkedList<String>();
        boolean b = false;
        while (i != -1) {
            final kotlin.reflect.jvm.internal.impl.metadata.a.o.c x = this.b.x(i);
            final String x2 = this.a.x(x.C());
            final kotlin.reflect.jvm.internal.impl.metadata.a.o.c.c z = x.z();
            k0.m((Object)z);
            i = d.a.a[z.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        list2.addFirst(x2);
                        b = true;
                    }
                }
                else {
                    list.addFirst(x2);
                }
            }
            else {
                list2.addFirst(x2);
            }
            i = x.B();
        }
        return (m1<List<String>, List<String>, Boolean>)new m1((Object)list, (Object)list2, (Object)b);
    }
    
    @e
    @Override
    public String a(final int n) {
        final m1<List<String>, List<String>, Boolean> c = this.c(n);
        final List list = (List)c.a();
        String str = v.Z2((Iterable)c.b(), (CharSequence)".", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)null, 62, (Object)null);
        if (!list.isEmpty()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(v.Z2((Iterable)list, (CharSequence)"/", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)null, 62, (Object)null));
            sb.append('/');
            sb.append(str);
            str = sb.toString();
        }
        return str;
    }
    
    @Override
    public boolean b(final int n) {
        return (boolean)this.c(n).h();
    }
    
    @e
    @Override
    public String getString(final int n) {
        final String x = this.a.x(n);
        k0.o((Object)x, "strings.getString(index)");
        return x;
    }
}
