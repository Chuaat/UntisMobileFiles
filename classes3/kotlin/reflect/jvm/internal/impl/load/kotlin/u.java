// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import java.util.List;
import org.jetbrains.annotations.e;

public interface u
{
    @e
    List<String> a(@e final String p0);
    
    public static final class a implements u
    {
        @e
        public static final a a;
        
        static {
            a = new a();
        }
        
        private a() {
        }
        
        @e
        @Override
        public List<String> a(@e final String s) {
            k0.p((Object)s, "packageFqName");
            return (List<String>)v.E();
        }
    }
}
