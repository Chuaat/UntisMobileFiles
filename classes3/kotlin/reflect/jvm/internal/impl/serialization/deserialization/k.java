// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public interface k
{
    boolean a();
    
    boolean b();
    
    boolean c();
    
    boolean d();
    
    boolean e();
    
    boolean f();
    
    boolean g();
    
    public static final class a implements k
    {
        @e
        public static final a a;
        
        static {
            a = new a();
        }
        
        private a() {
        }
        
        @Override
        public boolean a() {
            return b.b(this);
        }
        
        @Override
        public boolean b() {
            return b.a(this);
        }
        
        @Override
        public boolean c() {
            return b.f(this);
        }
        
        @Override
        public boolean d() {
            return b.e(this);
        }
        
        @Override
        public boolean e() {
            return b.d(this);
        }
        
        @Override
        public boolean f() {
            return b.g(this);
        }
        
        @Override
        public boolean g() {
            return b.c(this);
        }
    }
    
    public static final class b
    {
        public static boolean a(@e final k k) {
            k0.p((Object)k, "this");
            return false;
        }
        
        public static boolean b(@e final k k) {
            k0.p((Object)k, "this");
            return false;
        }
        
        public static boolean c(@e final k k) {
            k0.p((Object)k, "this");
            return false;
        }
        
        public static boolean d(@e final k k) {
            k0.p((Object)k, "this");
            return false;
        }
        
        public static boolean e(@e final k k) {
            k0.p((Object)k, "this");
            return false;
        }
        
        public static boolean f(@e final k k) {
            k0.p((Object)k, "this");
            return false;
        }
        
        public static boolean g(@e final k k) {
            k0.p((Object)k, "this");
            return true;
        }
    }
}
