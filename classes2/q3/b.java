// 
// Decompiled by Procyon v0.5.36
// 

package q3;

public class b implements a
{
    private static b a;
    
    private b() {
    }
    
    public static b b() {
        if (b.a == null) {
            b.a = new b();
        }
        return b.a;
    }
    
    @Override
    public long a() {
        return System.currentTimeMillis();
    }
}
