// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util;

public final class l
{
    public static final int a = 0;
    private static final int b;
    private static final boolean c;
    
    static {
        c = ((b = c()) != 0);
    }
    
    private l() {
        throw new IllegalStateException("No instances!");
    }
    
    public static int a() {
        return l.b;
    }
    
    public static boolean b() {
        return l.c;
    }
    
    private static int c() {
        try {
            return (int)Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        }
        catch (Exception ex) {
            return 0;
        }
    }
}
