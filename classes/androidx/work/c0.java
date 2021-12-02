// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import androidx.annotation.b0;
import androidx.annotation.t0;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import androidx.annotation.j0;
import java.util.UUID;

public final class c0
{
    @j0
    private UUID a;
    @j0
    private a b;
    @j0
    private f c;
    @j0
    private Set<String> d;
    @j0
    private f e;
    private int f;
    
    @t0({ t0.a.H })
    public c0(@j0 final UUID a, @j0 final a b, @j0 final f c, @j0 final List<String> c2, @j0 final f e, final int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new HashSet<String>(c2);
        this.e = e;
        this.f = f;
    }
    
    @j0
    public UUID a() {
        return this.a;
    }
    
    @j0
    public f b() {
        return this.c;
    }
    
    @j0
    public f c() {
        return this.e;
    }
    
    @b0(from = 0L)
    public int d() {
        return this.f;
    }
    
    @j0
    public a e() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && c0.class == o.getClass()) {
            final c0 c0 = (c0)o;
            return this.f == c0.f && this.a.equals(c0.a) && this.b == c0.b && this.c.equals(c0.c) && this.d.equals(c0.d) && this.e.equals(c0.e);
        }
        return false;
    }
    
    @j0
    public Set<String> f() {
        return this.d;
    }
    
    @Override
    public int hashCode() {
        return ((((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode()) * 31 + this.f;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("WorkInfo{mId='");
        sb.append(this.a);
        sb.append('\'');
        sb.append(", mState=");
        sb.append(this.b);
        sb.append(", mOutputData=");
        sb.append(this.c);
        sb.append(", mTags=");
        sb.append(this.d);
        sb.append(", mProgress=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
    
    public enum a
    {
        G, 
        H, 
        I, 
        J, 
        K, 
        L;
        
        public boolean b() {
            return this == a.I || this == a.J || this == a.L;
        }
    }
}
