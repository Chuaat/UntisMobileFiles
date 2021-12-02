// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import java.lang.annotation.Annotation;

final class x implements w
{
    private static final w N1;
    
    static {
        N1 = new x();
    }
    
    static Annotation[] a(final Annotation[] array) {
        if (y.l(array, w.class)) {
            return array;
        }
        final Annotation[] array2 = new Annotation[array.length + 1];
        array2[0] = x.N1;
        System.arraycopy(array, 0, array2, 1, array.length);
        return array2;
    }
    
    @Override
    public Class<? extends Annotation> annotationType() {
        return w.class;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof w;
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("@");
        sb.append(w.class.getName());
        sb.append("()");
        return sb.toString();
    }
}
