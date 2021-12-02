// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.d;

public interface r
{
    void a(@e final d p0);
    
    public static final class a implements r
    {
        @e
        public static final a a;
        
        static {
            a = new a();
        }
        
        private a() {
        }
        
        @Override
        public void a(@e final d d) {
            k0.p((Object)d, "classDescriptor");
        }
    }
}
