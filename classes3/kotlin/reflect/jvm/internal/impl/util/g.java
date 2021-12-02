// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.m;

public interface g
{
    boolean a(@e final m p0, @e final m p1);
    
    public static final class a implements g
    {
        @e
        public static final a a;
        
        static {
            a = new a();
        }
        
        private a() {
        }
        
        @Override
        public boolean a(@e final m m, @e final m i) {
            k0.p((Object)m, "what");
            k0.p((Object)i, "from");
            return true;
        }
    }
}
