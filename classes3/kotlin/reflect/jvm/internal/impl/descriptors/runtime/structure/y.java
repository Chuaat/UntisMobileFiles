// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import kotlin.reflect.jvm.internal.impl.load.java.structure.x;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import java.lang.annotation.Annotation;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a0;

public final class y extends n implements a0
{
    @e
    private final w a;
    @e
    private final Annotation[] b;
    @f
    private final String c;
    private final boolean d;
    
    public y(@e final w a, @e final Annotation[] b, @f final String c, final boolean d) {
        k0.p((Object)a, "type");
        k0.p((Object)b, "reflectAnnotations");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @f
    public c Q(@e final b b) {
        k0.p((Object)b, "fqName");
        return g.a(this.b, b);
    }
    
    @e
    public List<c> R() {
        return g.b(this.b);
    }
    
    @e
    public w S() {
        return this.a;
    }
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.name.e getName() {
        final String c = this.c;
        kotlin.reflect.jvm.internal.impl.name.e h;
        if (c == null) {
            h = null;
        }
        else {
            h = kotlin.reflect.jvm.internal.impl.name.e.h(c);
        }
        return h;
    }
    
    @Override
    public boolean i() {
        return false;
    }
    
    @Override
    public boolean l() {
        return this.d;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(y.class.getName());
        sb.append(": ");
        String str;
        if (this.l()) {
            str = "vararg ";
        }
        else {
            str = "";
        }
        sb.append(str);
        sb.append(this.getName());
        sb.append(": ");
        sb.append(this.S());
        return sb.toString();
    }
}
