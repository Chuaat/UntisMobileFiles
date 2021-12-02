// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import androidx.annotation.t0;
import java.util.Collection;
import java.util.ArrayList;
import androidx.annotation.j0;
import java.util.List;

public class j
{
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 4;
    public static final int h = 8;
    public static final int i = 16;
    public static final int j = 32;
    public static final int k = 64;
    public static final int l = 0;
    public static final int m = 1;
    private int a;
    private final List<String> b;
    private int c;
    
    @t0({ t0.a.G })
    public j(final int a, @j0 final List<String> list, final int c) {
        final ArrayList<Object> b = new ArrayList<Object>();
        this.b = (List<String>)b;
        this.a = a;
        b.addAll(list);
        this.c = c;
    }
    
    @j0
    public List<String> a() {
        return this.b;
    }
    
    public int b() {
        return this.a;
    }
    
    public int c() {
        return this.c;
    }
    
    public static class a
    {
        private int a;
        private final List<String> b;
        private int c;
        
        public a() {
            this.a = 0;
            this.b = new ArrayList<String>();
            this.c = 1;
        }
        
        @j0
        public a a(@j0 final Collection<String> collection) {
            this.b.addAll(collection);
            return this;
        }
        
        @j0
        public a b(@j0 final int... array) {
            for (int length = array.length, i = 0; i < length; ++i) {
                this.a |= array[i];
            }
            return this;
        }
        
        @j0
        public a c(@j0 final String... a) {
            this.b.addAll(Arrays.asList(a));
            return this;
        }
        
        @j0
        public j d() {
            return new j(this.a, this.b, this.c);
        }
        
        @j0
        public a e(final int c) {
            this.c = c;
            return this;
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.G })
    public @interface b {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.G })
    public @interface c {
    }
}
