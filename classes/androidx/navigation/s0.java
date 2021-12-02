// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import java.io.Serializable;
import android.os.Parcelable;
import androidx.annotation.k0;
import androidx.annotation.c;
import android.os.Bundle;
import androidx.annotation.j0;

public abstract class s0<T>
{
    @j0
    public static final s0<Integer> b;
    @j0
    public static final s0<Integer> c;
    @j0
    public static final s0<int[]> d;
    @j0
    public static final s0<Long> e;
    @j0
    public static final s0<long[]> f;
    @j0
    public static final s0<Float> g;
    @j0
    public static final s0<float[]> h;
    @j0
    public static final s0<Boolean> i;
    @j0
    public static final s0<boolean[]> j;
    @j0
    public static final s0<String> k;
    @j0
    public static final s0<String[]> l;
    private final boolean a;
    
    static {
        b = new s0<Integer>() {
            @j0
            @Override
            public String c() {
                return "integer";
            }
            
            public Integer j(@j0 final Bundle bundle, @j0 final String s) {
                return (Integer)bundle.get(s);
            }
            
            @j0
            public Integer k(@j0 final String s) {
                int i;
                if (s.startsWith("0x")) {
                    i = Integer.parseInt(s.substring(2), 16);
                }
                else {
                    i = Integer.parseInt(s);
                }
                return i;
            }
            
            public void l(@j0 final Bundle bundle, @j0 final String s, @j0 final Integer n) {
                bundle.putInt(s, (int)n);
            }
        };
        c = new s0<Integer>() {
            @j0
            @Override
            public String c() {
                return "reference";
            }
            
            @c
            public Integer j(@j0 final Bundle bundle, @j0 final String s) {
                return (Integer)bundle.get(s);
            }
            
            @j0
            public Integer k(@j0 final String s) {
                int i;
                if (s.startsWith("0x")) {
                    i = Integer.parseInt(s.substring(2), 16);
                }
                else {
                    i = Integer.parseInt(s);
                }
                return i;
            }
            
            public void l(@j0 final Bundle bundle, @j0 final String s, @c @j0 final Integer n) {
                bundle.putInt(s, (int)n);
            }
        };
        d = new s0<int[]>() {
            @j0
            @Override
            public String c() {
                return "integer[]";
            }
            
            public int[] j(@j0 final Bundle bundle, @j0 final String s) {
                return (int[])bundle.get(s);
            }
            
            @j0
            public int[] k(@j0 final String s) {
                throw new UnsupportedOperationException("Arrays don't support default values.");
            }
            
            public void l(@j0 final Bundle bundle, @j0 final String s, @k0 final int[] array) {
                bundle.putIntArray(s, array);
            }
        };
        e = new s0<Long>() {
            @j0
            @Override
            public String c() {
                return "long";
            }
            
            public Long j(@j0 final Bundle bundle, @j0 final String s) {
                return (Long)bundle.get(s);
            }
            
            @j0
            public Long k(@j0 final String s) {
                String substring = s;
                if (s.endsWith("L")) {
                    substring = s.substring(0, s.length() - 1);
                }
                long l;
                if (substring.startsWith("0x")) {
                    l = Long.parseLong(substring.substring(2), 16);
                }
                else {
                    l = Long.parseLong(substring);
                }
                return l;
            }
            
            public void l(@j0 final Bundle bundle, @j0 final String s, @j0 final Long n) {
                bundle.putLong(s, (long)n);
            }
        };
        f = new s0<long[]>() {
            @j0
            @Override
            public String c() {
                return "long[]";
            }
            
            public long[] j(@j0 final Bundle bundle, @j0 final String s) {
                return (long[])bundle.get(s);
            }
            
            @j0
            public long[] k(@j0 final String s) {
                throw new UnsupportedOperationException("Arrays don't support default values.");
            }
            
            public void l(@j0 final Bundle bundle, @j0 final String s, @k0 final long[] array) {
                bundle.putLongArray(s, array);
            }
        };
        g = new s0<Float>() {
            @j0
            @Override
            public String c() {
                return "float";
            }
            
            public Float j(@j0 final Bundle bundle, @j0 final String s) {
                return (Float)bundle.get(s);
            }
            
            @j0
            public Float k(@j0 final String s) {
                return Float.parseFloat(s);
            }
            
            public void l(@j0 final Bundle bundle, @j0 final String s, @j0 final Float n) {
                bundle.putFloat(s, (float)n);
            }
        };
        h = new s0<float[]>() {
            @j0
            @Override
            public String c() {
                return "float[]";
            }
            
            public float[] j(@j0 final Bundle bundle, @j0 final String s) {
                return (float[])bundle.get(s);
            }
            
            @j0
            public float[] k(@j0 final String s) {
                throw new UnsupportedOperationException("Arrays don't support default values.");
            }
            
            public void l(@j0 final Bundle bundle, @j0 final String s, @k0 final float[] array) {
                bundle.putFloatArray(s, array);
            }
        };
        i = new s0<Boolean>() {
            @j0
            @Override
            public String c() {
                return "boolean";
            }
            
            public Boolean j(@j0 final Bundle bundle, @j0 final String s) {
                return (Boolean)bundle.get(s);
            }
            
            @j0
            public Boolean k(@j0 final String s) {
                if ("true".equals(s)) {
                    return Boolean.TRUE;
                }
                if ("false".equals(s)) {
                    return Boolean.FALSE;
                }
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            
            public void l(@j0 final Bundle bundle, @j0 final String s, @j0 final Boolean b) {
                bundle.putBoolean(s, (boolean)b);
            }
        };
        j = new s0<boolean[]>() {
            @j0
            @Override
            public String c() {
                return "boolean[]";
            }
            
            public boolean[] j(@j0 final Bundle bundle, @j0 final String s) {
                return (boolean[])bundle.get(s);
            }
            
            @j0
            public boolean[] k(@j0 final String s) {
                throw new UnsupportedOperationException("Arrays don't support default values.");
            }
            
            public void l(@j0 final Bundle bundle, @j0 final String s, @k0 final boolean[] array) {
                bundle.putBooleanArray(s, array);
            }
        };
        k = new s0<String>() {
            @j0
            @Override
            public String c() {
                return "string";
            }
            
            public String j(@j0 final Bundle bundle, @j0 final String s) {
                return (String)bundle.get(s);
            }
            
            @j0
            public String k(@j0 final String s) {
                return s;
            }
            
            public void l(@j0 final Bundle bundle, @j0 final String s, @k0 final String s2) {
                bundle.putString(s, s2);
            }
        };
        l = new s0<String[]>() {
            @j0
            @Override
            public String c() {
                return "string[]";
            }
            
            public String[] j(@j0 final Bundle bundle, @j0 final String s) {
                return (String[])bundle.get(s);
            }
            
            @j0
            public String[] k(@j0 final String s) {
                throw new UnsupportedOperationException("Arrays don't support default values.");
            }
            
            public void l(@j0 final Bundle bundle, @j0 final String s, @k0 final String[] array) {
                bundle.putStringArray(s, array);
            }
        };
    }
    
    s0(final boolean a) {
        this.a = a;
    }
    
    @j0
    public static s0<?> a(@k0 final String s, @k0 String s2) {
        final s0<Integer> b = s0.b;
        if (b.c().equals(s)) {
            return b;
        }
        final s0<int[]> d = s0.d;
        if (d.c().equals(s)) {
            return d;
        }
        final s0<Long> e = s0.e;
        if (e.c().equals(s)) {
            return e;
        }
        final s0<long[]> f = s0.f;
        if (f.c().equals(s)) {
            return f;
        }
        final s0<Boolean> i = s0.i;
        if (i.c().equals(s)) {
            return i;
        }
        final s0<boolean[]> j = s0.j;
        if (j.c().equals(s)) {
            return j;
        }
        final s0<String> k = s0.k;
        if (k.c().equals(s)) {
            return k;
        }
        final s0<String[]> l = s0.l;
        if (l.c().equals(s)) {
            return l;
        }
        final s0<Float> g = s0.g;
        if (g.c().equals(s)) {
            return g;
        }
        final s0<float[]> h = s0.h;
        if (h.c().equals(s)) {
            return h;
        }
        final s0<Integer> c = s0.c;
        if (c.c().equals(s)) {
            return c;
        }
        if (s != null && !s.isEmpty()) {
            try {
                if (s.startsWith(".") && s2 != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(s2);
                    sb.append(s);
                    s2 = sb.toString();
                }
                else {
                    s2 = s;
                }
                if (s.endsWith("[]")) {
                    s2 = s2.substring(0, s2.length() - 2);
                    final Class<?> forName = Class.forName(s2);
                    if (Parcelable.class.isAssignableFrom(forName)) {
                        return new m<Object>((Class<Parcelable>)forName);
                    }
                    if (Serializable.class.isAssignableFrom(forName)) {
                        return new o<Object>(forName);
                    }
                }
                else {
                    final Class<?> forName2 = Class.forName(s2);
                    if (Parcelable.class.isAssignableFrom(forName2)) {
                        return new n<Object>((Class<Object>)forName2);
                    }
                    if (Enum.class.isAssignableFrom(forName2)) {
                        return new l<Object>(forName2);
                    }
                    if (Serializable.class.isAssignableFrom(forName2)) {
                        return new p<Object>(forName2);
                    }
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(s2);
                sb2.append(" is not Serializable or Parcelable.");
                throw new IllegalArgumentException(sb2.toString());
            }
            catch (ClassNotFoundException cause) {
                throw new RuntimeException(cause);
            }
        }
        return k;
    }
    
    @j0
    static s0 d(@j0 final String s) {
        try {
            final s0<Integer> b = s0.b;
            b.h(s);
            return b;
        }
        catch (IllegalArgumentException ex) {
            try {
                final s0<Long> e = s0.e;
                e.h(s);
                return e;
            }
            catch (IllegalArgumentException ex2) {
                try {
                    final s0<Float> g = s0.g;
                    g.h(s);
                    return g;
                }
                catch (IllegalArgumentException ex3) {
                    try {
                        final s0<Boolean> i = s0.i;
                        i.h(s);
                        return i;
                    }
                    catch (IllegalArgumentException ex4) {
                        return s0.k;
                    }
                }
            }
        }
    }
    
    @j0
    static s0 e(@k0 final Object o) {
        if (o instanceof Integer) {
            return s0.b;
        }
        if (o instanceof int[]) {
            return s0.d;
        }
        if (o instanceof Long) {
            return s0.e;
        }
        if (o instanceof long[]) {
            return s0.f;
        }
        if (o instanceof Float) {
            return s0.g;
        }
        if (o instanceof float[]) {
            return s0.h;
        }
        if (o instanceof Boolean) {
            return s0.i;
        }
        if (o instanceof boolean[]) {
            return s0.j;
        }
        if (o instanceof String || o == null) {
            return s0.k;
        }
        if (o instanceof String[]) {
            return s0.l;
        }
        if (o.getClass().isArray() && Parcelable.class.isAssignableFrom(o.getClass().getComponentType())) {
            return new m(o.getClass().getComponentType());
        }
        if (o.getClass().isArray() && Serializable.class.isAssignableFrom(o.getClass().getComponentType())) {
            return new o(o.getClass().getComponentType());
        }
        if (o instanceof Parcelable) {
            return new n(o.getClass());
        }
        if (o instanceof Enum) {
            return new l(o.getClass());
        }
        if (o instanceof Serializable) {
            return new p(o.getClass());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Object of type ");
        sb.append(o.getClass().getName());
        sb.append(" is not supported for navigation arguments.");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @k0
    public abstract T b(@j0 final Bundle p0, @j0 final String p1);
    
    @j0
    public abstract String c();
    
    public boolean f() {
        return this.a;
    }
    
    @j0
    T g(@j0 final Bundle bundle, @j0 final String s, @j0 final String s2) {
        final T h = this.h(s2);
        this.i(bundle, s, h);
        return h;
    }
    
    @j0
    public abstract T h(@j0 final String p0);
    
    public abstract void i(@j0 final Bundle p0, @j0 final String p1, @k0 final T p2);
    
    @j0
    @Override
    public String toString() {
        return this.c();
    }
    
    public static final class l<D extends Enum> extends p<D>
    {
        @j0
        private final Class<D> n;
        
        public l(@j0 final Class<D> clazz) {
            super(false, clazz);
            if (clazz.isEnum()) {
                this.n = clazz;
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(clazz);
            sb.append(" is not an Enum type.");
            throw new IllegalArgumentException(sb.toString());
        }
        
        @j0
        @Override
        public String c() {
            return this.n.getName();
        }
        
        @j0
        public D m(@j0 final String s) {
            for (final Enum enum1 : this.n.getEnumConstants()) {
                if (enum1.name().equals(s)) {
                    return (D)enum1;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Enum value ");
            sb.append(s);
            sb.append(" not found for type ");
            sb.append(this.n.getName());
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    public static final class m<D extends Parcelable> extends s0<D[]>
    {
        @j0
        private final Class<D[]> m;
        
        public m(@j0 final Class<D> obj) {
            super(true);
            if (Parcelable.class.isAssignableFrom(obj)) {
                try {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("[L");
                    sb.append(obj.getName());
                    sb.append(";");
                    this.m = (Class<D[]>)Class.forName(sb.toString());
                    return;
                }
                catch (ClassNotFoundException cause) {
                    throw new RuntimeException(cause);
                }
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(" does not implement Parcelable.");
            throw new IllegalArgumentException(sb2.toString());
        }
        
        @j0
        @Override
        public String c() {
            return this.m.getName();
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o != null && m.class == o.getClass() && this.m.equals(((m)o).m));
        }
        
        @Override
        public int hashCode() {
            return this.m.hashCode();
        }
        
        @k0
        public D[] j(@j0 final Bundle bundle, @j0 final String s) {
            return (D[])bundle.get(s);
        }
        
        @j0
        public D[] k(@j0 final String s) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }
        
        public void l(@j0 final Bundle bundle, @j0 final String s, @k0 final D[] obj) {
            this.m.cast(obj);
            bundle.putParcelableArray(s, (Parcelable[])obj);
        }
    }
    
    public static final class n<D> extends s0<D>
    {
        @j0
        private final Class<D> m;
        
        public n(@j0 final Class<D> clazz) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(clazz) && !Serializable.class.isAssignableFrom(clazz)) {
                final StringBuilder sb = new StringBuilder();
                sb.append(clazz);
                sb.append(" does not implement Parcelable or Serializable.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.m = clazz;
        }
        
        @k0
        @Override
        public D b(@j0 final Bundle bundle, @j0 final String s) {
            return (D)bundle.get(s);
        }
        
        @j0
        @Override
        public String c() {
            return this.m.getName();
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o != null && n.class == o.getClass() && this.m.equals(((n)o).m));
        }
        
        @j0
        @Override
        public D h(@j0 final String s) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }
        
        @Override
        public int hashCode() {
            return this.m.hashCode();
        }
        
        @Override
        public void i(@j0 final Bundle bundle, @j0 final String s, @k0 final D obj) {
            this.m.cast(obj);
            if (obj != null && !(obj instanceof Parcelable)) {
                if (obj instanceof Serializable) {
                    bundle.putSerializable(s, (Serializable)obj);
                }
            }
            else {
                bundle.putParcelable(s, (Parcelable)obj);
            }
        }
    }
    
    public static final class o<D extends Serializable> extends s0<D[]>
    {
        @j0
        private final Class<D[]> m;
        
        public o(@j0 final Class<D> obj) {
            super(true);
            if (Serializable.class.isAssignableFrom(obj)) {
                try {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("[L");
                    sb.append(obj.getName());
                    sb.append(";");
                    this.m = (Class<D[]>)Class.forName(sb.toString());
                    return;
                }
                catch (ClassNotFoundException cause) {
                    throw new RuntimeException(cause);
                }
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(" does not implement Serializable.");
            throw new IllegalArgumentException(sb2.toString());
        }
        
        @j0
        @Override
        public String c() {
            return this.m.getName();
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o != null && o.class == o.getClass() && this.m.equals(((o)o).m));
        }
        
        @Override
        public int hashCode() {
            return this.m.hashCode();
        }
        
        @k0
        public D[] j(@j0 final Bundle bundle, @j0 final String s) {
            return (D[])bundle.get(s);
        }
        
        @j0
        public D[] k(@j0 final String s) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }
        
        public void l(@j0 final Bundle bundle, @j0 final String s, @k0 final D[] obj) {
            this.m.cast(obj);
            bundle.putSerializable(s, (Serializable)obj);
        }
    }
    
    public static class p<D extends Serializable> extends s0<D>
    {
        @j0
        private final Class<D> m;
        
        public p(@j0 final Class<D> obj) {
            super(true);
            if (!Serializable.class.isAssignableFrom(obj)) {
                final StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append(" does not implement Serializable.");
                throw new IllegalArgumentException(sb.toString());
            }
            if (!obj.isEnum()) {
                this.m = obj;
                return;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(" is an Enum. You should use EnumType instead.");
            throw new IllegalArgumentException(sb2.toString());
        }
        
        p(final boolean b, @j0 final Class<D> clazz) {
            super(b);
            if (Serializable.class.isAssignableFrom(clazz)) {
                this.m = clazz;
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(clazz);
            sb.append(" does not implement Serializable.");
            throw new IllegalArgumentException(sb.toString());
        }
        
        @j0
        @Override
        public String c() {
            return this.m.getName();
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof p && this.m.equals(((p)o).m));
        }
        
        @Override
        public int hashCode() {
            return this.m.hashCode();
        }
        
        @k0
        public D j(@j0 final Bundle bundle, @j0 final String s) {
            return (D)bundle.get(s);
        }
        
        @j0
        public D k(@j0 final String s) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }
        
        public void l(@j0 final Bundle bundle, @j0 final String s, @k0 final D obj) {
            this.m.cast(obj);
            bundle.putSerializable(s, (Serializable)obj);
        }
    }
}
