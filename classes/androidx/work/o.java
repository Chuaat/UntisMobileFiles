// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import androidx.annotation.j0;
import java.util.List;
import androidx.annotation.t0;

public abstract class o
{
    private static final String a;
    
    static {
        a = q.f("InputMerger");
    }
    
    @t0({ t0.a.H })
    public static o a(final String s) {
        try {
            return (o)Class.forName(s).newInstance();
        }
        catch (Exception ex) {
            final q c = q.c();
            final String a = o.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Trouble instantiating + ");
            sb.append(s);
            c.b(a, sb.toString(), ex);
            return null;
        }
    }
    
    @j0
    public abstract f b(@j0 final List<f> p0);
}
