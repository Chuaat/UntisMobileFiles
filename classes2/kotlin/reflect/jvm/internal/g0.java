// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import java.util.List;
import n6.l;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.renderer.c;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0007\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006\u001f" }, d2 = { "Lkotlin/reflect/jvm/internal/g0;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "receiver", "Lkotlin/j2;", "a", "Lkotlin/reflect/jvm/internal/impl/descriptors/a;", "callable", "b", "descriptor", "", "c", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "g", "Lkotlin/reflect/jvm/internal/impl/descriptors/y;", "d", "invoke", "e", "Lkotlin/reflect/jvm/internal/q;", "parameter", "f", "Lkotlin/reflect/jvm/internal/impl/types/c0;", "type", "h", "Lkotlin/reflect/jvm/internal/impl/renderer/c;", "Lkotlin/reflect/jvm/internal/impl/renderer/c;", "renderer", "<init>", "()V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public final class g0
{
    private static final c a;
    @e
    public static final g0 b;
    
    static {
        b = new g0();
        a = c.g;
    }
    
    private g0() {
    }
    
    private final void a(final StringBuilder sb, final t0 t0) {
        if (t0 != null) {
            final c0 a = t0.a();
            k0.o(a, "receiver.type");
            sb.append(this.h(a));
            sb.append(".");
        }
    }
    
    private final void b(final StringBuilder sb, final a a) {
        final t0 g = kotlin.reflect.jvm.internal.k0.g(a);
        final t0 q0 = a.q0();
        this.a(sb, g);
        final boolean b = g != null && q0 != null;
        if (b) {
            sb.append("(");
        }
        this.a(sb, q0);
        if (b) {
            sb.append(")");
        }
    }
    
    private final String c(final a obj) {
        String s;
        if (obj instanceof q0) {
            s = this.g((q0)obj);
        }
        else {
            if (!(obj instanceof y)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Illegal callable: ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
            s = this.d((y)obj);
        }
        return s;
    }
    
    @e
    public final String d(@e final y y) {
        k0.p(y, "descriptor");
        final StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        final g0 b = g0.b;
        b.b(sb, y);
        final c a = g0.a;
        final kotlin.reflect.jvm.internal.impl.name.e name = y.getName();
        k0.o(name, "descriptor.name");
        sb.append(a.x(name, true));
        final List<e1> m = y.m();
        k0.o(m, "descriptor.valueParameters");
        v.X2(m, sb, ", ", "(", ")", 0, null, g0$a.G, 48, null);
        sb.append(": ");
        final c0 returnType = y.getReturnType();
        k0.m(returnType);
        k0.o(returnType, "descriptor.returnType!!");
        sb.append(b.h(returnType));
        final String string = sb.toString();
        k0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    @e
    public final String e(@e final y y) {
        k0.p(y, "invoke");
        final StringBuilder sb = new StringBuilder();
        final g0 b = g0.b;
        b.b(sb, y);
        final List<e1> m = y.m();
        k0.o(m, "invoke.valueParameters");
        v.X2(m, sb, ", ", "(", ")", 0, null, g0$b.G, 48, null);
        sb.append(" -> ");
        final c0 returnType = y.getReturnType();
        k0.m(returnType);
        k0.o(returnType, "invoke.returnType!!");
        sb.append(b.h(returnType));
        final String string = sb.toString();
        k0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    @e
    public final String f(@e final q q) {
        k0.p(q, "parameter");
        final StringBuilder sb = new StringBuilder();
        final int n = f0.a[q.n().ordinal()];
        Label_0113: {
            String string;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        break Label_0113;
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("parameter #");
                    sb2.append(q.i());
                    sb2.append(' ');
                    sb2.append(q.getName());
                    string = sb2.toString();
                }
                else {
                    string = "instance parameter";
                }
            }
            else {
                string = "extension receiver parameter";
            }
            sb.append(string);
        }
        sb.append(" of ");
        sb.append(g0.b.c(q.r().l0()));
        final String string2 = sb.toString();
        k0.o(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }
    
    @e
    public final String g(@e final q0 q0) {
        k0.p(q0, "descriptor");
        final StringBuilder sb = new StringBuilder();
        String str;
        if (q0.n0()) {
            str = "var ";
        }
        else {
            str = "val ";
        }
        sb.append(str);
        final g0 b = g0.b;
        b.b(sb, q0);
        final c a = g0.a;
        final kotlin.reflect.jvm.internal.impl.name.e name = q0.getName();
        k0.o(name, "descriptor.name");
        sb.append(a.x(name, true));
        sb.append(": ");
        final c0 a2 = q0.a();
        k0.o(a2, "descriptor.type");
        sb.append(b.h(a2));
        final String string = sb.toString();
        k0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    @e
    public final String h(@e final c0 c0) {
        k0.p(c0, "type");
        return g0.a.y(c0);
    }
}
