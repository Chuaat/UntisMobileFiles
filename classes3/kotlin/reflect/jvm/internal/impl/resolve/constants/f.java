// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.name.a;

public final class f
{
    @e
    private final a a;
    private final int b;
    
    public f(@e final a a, final int b) {
        k0.p((Object)a, "classId");
        this.a = a;
        this.b = b;
    }
    
    @e
    public final a a() {
        return this.a;
    }
    
    public final int b() {
        return this.b;
    }
    
    public final int c() {
        return this.b;
    }
    
    @e
    public final a d() {
        return this.a;
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        return k0.g((Object)this.a, (Object)f.a) && this.b == f.b;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31 + this.b;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        final int c = this.c();
        final int n = 0;
        for (int i = 0; i < c; ++i) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.d());
        for (int c2 = this.c(), j = n; j < c2; ++j) {
            sb.append(">");
        }
        final String string = sb.toString();
        k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
