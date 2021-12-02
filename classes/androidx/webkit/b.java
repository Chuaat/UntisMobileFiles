// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import androidx.annotation.t0;
import androidx.annotation.j0;
import java.util.List;

public final class b
{
    public static final String c = "http";
    public static final String d = "https";
    public static final String e = "*";
    private static final String f = "direct://";
    private static final String g = "<local>";
    private static final String h = "<-loopback>";
    private List<b> a;
    private List<String> b;
    
    @t0({ t0.a.G })
    public b(@j0 final List<b> a, @j0 final List<String> b) {
        this.a = a;
        this.b = b;
    }
    
    @j0
    public List<String> a() {
        return Collections.unmodifiableList((List<? extends String>)this.b);
    }
    
    @j0
    public List<b> b() {
        return Collections.unmodifiableList((List<? extends b>)this.a);
    }
    
    public static final class a
    {
        private List<b> a;
        private List<String> b;
        
        public a() {
            this.a = new ArrayList<b>();
            this.b = new ArrayList<String>();
        }
        
        public a(@j0 final b b) {
            this.a = b.b();
            this.b = b.a();
        }
        
        @j0
        private List<String> g() {
            return this.b;
        }
        
        @j0
        private List<b> i() {
            return this.a;
        }
        
        @j0
        public a a(@j0 final String s) {
            this.b.add(s);
            return this;
        }
        
        @j0
        public a b() {
            return this.c("*");
        }
        
        @j0
        public a c(@j0 final String s) {
            this.a.add(new b(s, "direct://"));
            return this;
        }
        
        @j0
        public a d(@j0 final String s) {
            this.a.add(new b(s));
            return this;
        }
        
        @j0
        public a e(@j0 final String s, @j0 final String s2) {
            this.a.add(new b(s2, s));
            return this;
        }
        
        @j0
        public b f() {
            return new b(this.i(), this.g());
        }
        
        @j0
        public a h() {
            return this.a("<local>");
        }
        
        @j0
        public a j() {
            return this.a("<-loopback>");
        }
    }
    
    public static final class b
    {
        private String a;
        private String b;
        
        @t0({ t0.a.G })
        public b(@j0 final String s) {
            this("*", s);
        }
        
        @t0({ t0.a.G })
        public b(@j0 final String a, @j0 final String b) {
            this.a = a;
            this.b = b;
        }
        
        @j0
        public String a() {
            return this.a;
        }
        
        @j0
        public String b() {
            return this.b;
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.G })
    public @interface c {
    }
}
