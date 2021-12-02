// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins.functions;

import org.jetbrains.annotations.f;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import java.util.List;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionInterfacePackageFragment;
import java.util.ArrayList;
import kotlin.text.s;
import kotlin.collections.j1;
import java.util.Collection;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b;

public final class a implements b
{
    @e
    private final n a;
    @e
    private final e0 b;
    
    public a(@e final n a, @e final e0 b) {
        k0.p(a, "storageManager");
        k0.p(b, "module");
        this.a = a;
        this.b = b;
    }
    
    @e
    @Override
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> a(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
        k0.p(b, "packageFqName");
        return (Collection<kotlin.reflect.jvm.internal.impl.descriptors.e>)j1.k();
    }
    
    @Override
    public boolean b(@e final kotlin.reflect.jvm.internal.impl.name.b b, @e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p(b, "packageFqName");
        k0.p(e, "name");
        final String d = e.d();
        k0.o(d, "name.asString()");
        final boolean b2 = false;
        if (!s.u2(d, "Function", false, 2, (Object)null) && !s.u2(d, "KFunction", false, 2, (Object)null) && !s.u2(d, "SuspendFunction", false, 2, (Object)null)) {
            final boolean b3 = b2;
            if (!s.u2(d, "KSuspendFunction", false, 2, (Object)null)) {
                return b3;
            }
        }
        boolean b3 = b2;
        if (c.I.c(d, b) != null) {
            b3 = true;
        }
        return b3;
    }
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.e c(@e final kotlin.reflect.jvm.internal.impl.name.a a) {
        k0.p(a, "classId");
        if (a.k() || a.l()) {
            return null;
        }
        final String b = a.i().b();
        k0.o(b, "classId.relativeClassName.asString()");
        if (!s.V2((CharSequence)b, (CharSequence)"Function", false, 2, (Object)null)) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.name.b h = a.h();
        k0.o(h, "classId.packageFqName");
        final c.a.a c = kotlin.reflect.jvm.internal.impl.builtins.functions.c.I.c(b, h);
        if (c == null) {
            return null;
        }
        final c a2 = c.a();
        final int b2 = c.b();
        final List<h0> n = this.b.R(h).N();
        final ArrayList<FunctionInterfacePackageFragment> list = new ArrayList<FunctionInterfacePackageFragment>();
        for (final FunctionInterfacePackageFragment next : n) {
            if (next instanceof BuiltInsPackageFragment) {
                list.add(next);
            }
        }
        final ArrayList<FunctionInterfacePackageFragment> list2 = new ArrayList<FunctionInterfacePackageFragment>();
        for (final FunctionInterfacePackageFragment next2 : list) {
            if (next2 instanceof FunctionInterfacePackageFragment) {
                list2.add(next2);
            }
        }
        BuiltInsPackageFragment builtInsPackageFragment;
        if ((builtInsPackageFragment = v.t2((List<? extends FunctionInterfacePackageFragment>)list2)) == null) {
            builtInsPackageFragment = v.o2((List<? extends BuiltInsPackageFragment>)list);
        }
        return new kotlin.reflect.jvm.internal.impl.builtins.functions.b(this.a, builtInsPackageFragment, a2, b2);
    }
}
