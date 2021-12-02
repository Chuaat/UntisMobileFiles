// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Collection;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.b;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.name.a;
import java.util.Set;
import org.jetbrains.annotations.e;

public final class CompanionObjectMapping
{
    @e
    public static final CompanionObjectMapping INSTANCE;
    @e
    private static final Set<a> a;
    
    static {
        INSTANCE = new CompanionObjectMapping();
        final Set<PrimitiveType> number_TYPES = PrimitiveType.NUMBER_TYPES;
        final StandardNames instance = StandardNames.INSTANCE;
        final ArrayList list = new ArrayList<b>(v.Y((Iterable<?>)number_TYPES, 10));
        final Iterator<Object> iterator = number_TYPES.iterator();
        while (iterator.hasNext()) {
            list.add(StandardNames.getPrimitiveFqName(iterator.next()));
        }
        final b l = StandardNames.FqNames.string.l();
        k0.o(l, "string.toSafe()");
        final List<b> r4 = v.r4((Collection<? extends b>)list, l);
        final b i = StandardNames.FqNames._boolean.l();
        k0.o(i, "_boolean.toSafe()");
        final List<b> r5 = v.r4(r4, i);
        final b j = StandardNames.FqNames._enum.l();
        k0.o(j, "_enum.toSafe()");
        final List<b> r6 = v.r4(r5, j);
        final LinkedHashSet<a> a2 = new LinkedHashSet<a>();
        final Iterator<Object> iterator2 = r6.iterator();
        while (iterator2.hasNext()) {
            a2.add(kotlin.reflect.jvm.internal.impl.name.a.m((b)iterator2.next()));
        }
        a = a2;
    }
    
    private CompanionObjectMapping() {
    }
    
    @e
    public final Set<a> allClassesWithIntrinsicCompanions() {
        return CompanionObjectMapping.a;
    }
    
    @e
    public final Set<a> getClassIds() {
        return CompanionObjectMapping.a;
    }
}
