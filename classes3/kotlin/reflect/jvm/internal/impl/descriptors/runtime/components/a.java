// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.b;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.load.kotlin.m;
import kotlin.reflect.jvm.internal.impl.load.kotlin.n;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.c;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.jvm.internal.impl.load.kotlin.e;

public final class a
{
    @org.jetbrains.annotations.e
    private final e a;
    @org.jetbrains.annotations.e
    private final g b;
    @org.jetbrains.annotations.e
    private final ConcurrentHashMap<kotlin.reflect.jvm.internal.impl.name.a, h> c;
    
    public a(@org.jetbrains.annotations.e final e a, @org.jetbrains.annotations.e final g b) {
        k0.p((Object)a, "resolver");
        k0.p((Object)b, "kotlinClassFinder");
        this.a = a;
        this.b = b;
        this.c = new ConcurrentHashMap<kotlin.reflect.jvm.internal.impl.name.a, h>();
    }
    
    @org.jetbrains.annotations.e
    public final h a(@org.jetbrains.annotations.e final f obj) {
        k0.p((Object)obj, "fileClass");
        final ConcurrentHashMap<kotlin.reflect.jvm.internal.impl.name.a, h> c = this.c;
        final kotlin.reflect.jvm.internal.impl.name.a c2 = obj.c();
        final h value = c.get(c2);
        h a;
        if (value != null) {
            a = value;
        }
        else {
            final kotlin.reflect.jvm.internal.impl.name.b h = obj.c().h();
            k0.o((Object)h, "fileClass.classId.packageFqName");
            List<o> k;
            if (obj.a().c() == kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a.N) {
                final List<String> f = obj.a().f();
                final ArrayList<o> list = new ArrayList<o>();
                final Iterator<Object> iterator = f.iterator();
                while (true) {
                    k = list;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final kotlin.reflect.jvm.internal.impl.name.a m = kotlin.reflect.jvm.internal.impl.name.a.m(kotlin.reflect.jvm.internal.impl.resolve.jvm.c.d(iterator.next()).e());
                    k0.o((Object)m, "topLevel(JvmClassName.byInternalName(partName).fqNameForTopLevelClassMaybeWithDollars)");
                    final o b = n.b(this.b, m);
                    if (b == null) {
                        continue;
                    }
                    list.add(b);
                }
            }
            else {
                k = (List<o>)v.k((Object)obj);
            }
            final kotlin.reflect.jvm.internal.impl.descriptors.impl.m i = new kotlin.reflect.jvm.internal.impl.descriptors.impl.m(this.a.f().p(), h);
            final ArrayList<h> list2 = new ArrayList<h>();
            final Iterator<Object> iterator2 = k.iterator();
            while (iterator2.hasNext()) {
                final h d = this.a.d((h0)i, iterator2.next());
                if (d != null) {
                    list2.add(d);
                }
            }
            final List i2 = v.I5((Iterable)list2);
            final b.a d2 = kotlin.reflect.jvm.internal.impl.resolve.scopes.b.d;
            final StringBuilder sb = new StringBuilder();
            sb.append("package ");
            sb.append(h);
            sb.append(" (");
            sb.append(obj);
            sb.append(')');
            a = d2.a(sb.toString(), i2);
            final h putIfAbsent = c.putIfAbsent(c2, a);
            if (putIfAbsent != null) {
                a = putIfAbsent;
            }
        }
        k0.o((Object)a, "cache.getOrPut(fileClass.classId) {\n        val fqName = fileClass.classId.packageFqName\n\n        val parts =\n            if (fileClass.classHeader.kind == KotlinClassHeader.Kind.MULTIFILE_CLASS)\n                fileClass.classHeader.multifilePartNames.mapNotNull { partName ->\n                    val classId = ClassId.topLevel(JvmClassName.byInternalName(partName).fqNameForTopLevelClassMaybeWithDollars)\n                    kotlinClassFinder.findKotlinClass(classId)\n                }\n            else listOf(fileClass)\n\n        val packageFragment = EmptyPackageFragmentDescriptor(resolver.components.moduleDescriptor, fqName)\n\n        val scopes = parts.mapNotNull { part ->\n            resolver.createKotlinPackagePartScope(packageFragment, part)\n        }.toList()\n\n        ChainedMemberScope.create(\"package $fqName ($fileClass)\", scopes)\n    }");
        return a;
    }
}
