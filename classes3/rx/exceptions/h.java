// 
// Decompiled by Procyon v0.5.36
// 

package rx.exceptions;

import java.util.HashSet;
import java.util.Set;
import rx.plugins.f;
import java.io.Serializable;

public final class h extends RuntimeException
{
    private static final long I = -569558213262703934L;
    private final boolean G;
    private final Object H;
    
    private h(final Throwable cause) {
        super(cause);
        this.G = false;
        this.H = null;
    }
    
    private h(final Throwable cause, Object message) {
        super(cause);
        this.G = true;
        if (!(message instanceof Serializable)) {
            try {
                String.valueOf(message);
            }
            finally {
                message = cause.getMessage();
            }
        }
        this.H = message;
    }
    
    public static Throwable a(Throwable b, final Object o) {
        Throwable t = b;
        if (b == null) {
            t = new NullPointerException();
        }
        b = c.b(t);
        if (b instanceof a && ((a)b).a() == o) {
            return t;
        }
        c.a(t, new a(o));
        return t;
    }
    
    public static h b(Throwable b) {
        Throwable t = b;
        if (b == null) {
            t = new NullPointerException();
        }
        b = c.b(t);
        if (b instanceof a) {
            return new h(t, ((a)b).a());
        }
        return new h(t);
    }
    
    public Object c() {
        return this.H;
    }
    
    public boolean d() {
        return this.G;
    }
    
    public static class a extends RuntimeException
    {
        private static final long H = -3454462756050397899L;
        private final Object G;
        
        public a(Object message) {
            final StringBuilder sb = new StringBuilder();
            sb.append("OnError while emitting onNext value: ");
            sb.append(b(message));
            super(sb.toString());
            if (!(message instanceof Serializable)) {
                try {
                    String.valueOf(message);
                }
                finally {
                    final Throwable t;
                    message = t.getMessage();
                }
            }
            this.G = message;
        }
        
        static String b(final Object o) {
            if (o == null) {
                return "null";
            }
            if (h.a.a.a.contains(o.getClass())) {
                return o.toString();
            }
            if (o instanceof String) {
                return (String)o;
            }
            if (o instanceof Enum) {
                return ((Enum)o).name();
            }
            final String b = f.c().b().b(o);
            if (b != null) {
                return b;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(o.getClass().getName());
            sb.append(".class");
            return sb.toString();
        }
        
        public Object a() {
            return this.G;
        }
        
        static final class a
        {
            static final Set<Class<?>> a;
            
            static {
                a = a();
            }
            
            private static Set<Class<?>> a() {
                final HashSet<Class<Boolean>> set = (HashSet<Class<Boolean>>)new HashSet<Class<Double>>();
                set.add((Class<Double>)Boolean.class);
                set.add((Class<Double>)Character.class);
                set.add((Class<Double>)Byte.class);
                set.add((Class<Double>)Short.class);
                set.add((Class<Double>)Integer.class);
                set.add((Class<Double>)Long.class);
                set.add((Class<Double>)Float.class);
                set.add(Double.class);
                return (Set<Class<?>>)set;
            }
        }
    }
}
