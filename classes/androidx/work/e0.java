// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import java.util.Collection;
import android.annotation.SuppressLint;
import java.util.ArrayList;
import androidx.annotation.j0;
import java.util.UUID;
import java.util.List;

public final class e0
{
    private final List<UUID> a;
    private final List<String> b;
    private final List<String> c;
    private final List<c0.a> d;
    
    e0(@j0 final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
    }
    
    @j0
    public List<UUID> a() {
        return this.a;
    }
    
    @j0
    public List<c0.a> b() {
        return this.d;
    }
    
    @j0
    public List<String> c() {
        return this.c;
    }
    
    @j0
    public List<String> d() {
        return this.b;
    }
    
    public static final class a
    {
        List<UUID> a;
        List<String> b;
        List<String> c;
        List<c0.a> d;
        
        private a() {
            this.a = new ArrayList<UUID>();
            this.b = new ArrayList<String>();
            this.c = new ArrayList<String>();
            this.d = new ArrayList<c0.a>();
        }
        
        @SuppressLint({ "BuilderSetStyle" })
        @j0
        public static a f(@j0 final List<UUID> list) {
            final a a = new a();
            a.a(list);
            return a;
        }
        
        @SuppressLint({ "BuilderSetStyle" })
        @j0
        public static a g(@j0 final List<c0.a> list) {
            final a a = new a();
            a.b(list);
            return a;
        }
        
        @SuppressLint({ "BuilderSetStyle" })
        @j0
        public static a h(@j0 final List<String> list) {
            final a a = new a();
            a.c(list);
            return a;
        }
        
        @SuppressLint({ "BuilderSetStyle" })
        @j0
        public static a i(@j0 final List<String> list) {
            final a a = new a();
            a.d(list);
            return a;
        }
        
        @j0
        public a a(@j0 final List<UUID> list) {
            this.a.addAll(list);
            return this;
        }
        
        @j0
        public a b(@j0 final List<c0.a> list) {
            this.d.addAll(list);
            return this;
        }
        
        @j0
        public a c(@j0 final List<String> list) {
            this.c.addAll(list);
            return this;
        }
        
        @j0
        public a d(@j0 final List<String> list) {
            this.b.addAll(list);
            return this;
        }
        
        @j0
        public e0 e() {
            if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new e0(this);
        }
    }
}
