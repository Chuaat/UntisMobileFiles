// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.java;

import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import org.jetbrains.annotations.e;

public final class a
{
    @e
    public static final a a;
    
    static {
        a = new a();
    }
    
    private a() {
    }
    
    public static final class a extends j1
    {
        @e
        public static final a c;
        
        static {
            c = new a();
        }
        
        private a() {
            super("package", false);
        }
        
        @f
        @Override
        public Integer a(@e final j1 j1) {
            k0.p(j1, "visibility");
            int i;
            if (this == j1) {
                i = 0;
            }
            else if (i1.a.b(j1)) {
                i = 1;
            }
            else {
                i = -1;
            }
            return i;
        }
        
        @e
        @Override
        public String b() {
            return "public/*package*/";
        }
        
        @e
        @Override
        public j1 d() {
            return i1.g.c;
        }
    }
    
    public static final class b extends j1
    {
        @e
        public static final b c;
        
        static {
            c = new b();
        }
        
        private b() {
            super("protected_and_package", true);
        }
        
        @f
        @Override
        public Integer a(@e final j1 j1) {
            k0.p(j1, "visibility");
            if (k0.g(this, j1)) {
                return 0;
            }
            if (j1 == i1.b.c) {
                return null;
            }
            int i;
            if (i1.a.b(j1)) {
                i = 1;
            }
            else {
                i = -1;
            }
            return i;
        }
        
        @e
        @Override
        public String b() {
            return "protected/*protected and package*/";
        }
        
        @e
        @Override
        public j1 d() {
            return i1.g.c;
        }
    }
    
    public static final class c extends j1
    {
        @e
        public static final c c;
        
        static {
            c = new c();
        }
        
        private c() {
            super("protected_static", true);
        }
        
        @e
        @Override
        public String b() {
            return "protected/*protected static*/";
        }
        
        @e
        @Override
        public j1 d() {
            return i1.g.c;
        }
    }
}
