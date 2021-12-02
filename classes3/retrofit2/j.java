// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import c6.h;
import java.util.Objects;

public class j extends RuntimeException
{
    private final int G;
    private final String H;
    private final transient t<?> I;
    
    public j(final t<?> i) {
        super(b(i));
        this.G = i.b();
        this.H = i.h();
        this.I = i;
    }
    
    private static String b(final t<?> obj) {
        Objects.requireNonNull(obj, "response == null");
        final StringBuilder sb = new StringBuilder();
        sb.append("HTTP ");
        sb.append(obj.b());
        sb.append(" ");
        sb.append(obj.h());
        return sb.toString();
    }
    
    public int a() {
        return this.G;
    }
    
    public String c() {
        return this.H;
    }
    
    @h
    public t<?> d() {
        return this.I;
    }
}
