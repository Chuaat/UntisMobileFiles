// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import androidx.lifecycle.LiveData;
import androidx.annotation.j0;
import x2.a;
import androidx.annotation.t0;
import android.annotation.SuppressLint;

public interface u
{
    @SuppressLint({ "SyntheticAccessor" })
    @t0({ t0.a.H })
    public static final c a = new c();
    @SuppressLint({ "SyntheticAccessor" })
    @t0({ t0.a.H })
    public static final b.b b = new b.b();
    
    @j0
    x2.a<c> a();
    
    @j0
    LiveData<b> getState();
    
    public abstract static class b
    {
        @t0({ t0.a.H })
        b() {
        }
        
        public static final class a extends u.b
        {
            private final Throwable a;
            
            public a(@j0 final Throwable a) {
                this.a = a;
            }
            
            @j0
            public Throwable a() {
                return this.a;
            }
            
            @j0
            @Override
            public String toString() {
                return String.format("FAILURE (%s)", this.a.getMessage());
            }
        }
        
        public static final class b extends u.b
        {
            private b() {
            }
            
            @j0
            @Override
            public String toString() {
                return "IN_PROGRESS";
            }
        }
        
        public static final class c extends u.b
        {
            private c() {
            }
            
            @j0
            @Override
            public String toString() {
                return "SUCCESS";
            }
        }
    }
}
