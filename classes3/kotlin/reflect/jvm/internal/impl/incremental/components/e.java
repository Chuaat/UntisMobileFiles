// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.incremental.components;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import java.io.Serializable;

public final class e implements Serializable
{
    @org.jetbrains.annotations.e
    public static final a I;
    @org.jetbrains.annotations.e
    private static final e J;
    private final int G;
    private final int H;
    
    static {
        I = new a(null);
        J = new e(-1, -1);
    }
    
    public e(final int g, final int h) {
        this.G = g;
        this.H = h;
    }
    
    public static final /* synthetic */ e a() {
        return e.J;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        return this.G == e.G && this.H == e.H;
    }
    
    @Override
    public int hashCode() {
        return this.G * 31 + this.H;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Position(line=");
        sb.append(this.G);
        sb.append(", column=");
        sb.append(this.H);
        sb.append(')');
        return sb.toString();
    }
    
    public static final class a
    {
        private a() {
        }
        
        @org.jetbrains.annotations.e
        public final e a() {
            return e.a();
        }
    }
}
