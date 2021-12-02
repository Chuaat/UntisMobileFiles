// 
// Decompiled by Procyon v0.5.36
// 

package e7;

public final class a
{
    private a() {
    }
    
    public static <T> T a(final Class<T> clazz, final Object o, final String s) {
        if (clazz.isAssignableFrom(o.getClass())) {
            return (T)o;
        }
        throw new IllegalArgumentException(s);
    }
    
    public static void b(final String str, final boolean b) {
        if (b) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("state should be: ");
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }
    
    public static <T> T c(final String str, final T t, final boolean b) {
        if (b) {
            return t;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("state should be: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static void d(final String str, final boolean b) {
        if (b) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("state should be: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static <T> T e(final String str, final T t) {
        if (t != null) {
            return t;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" can not be null");
        throw new IllegalArgumentException(sb.toString());
    }
}
