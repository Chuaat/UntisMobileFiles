// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.incremental.components;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public interface c
{
    boolean a();
    
    void b(@e final String p0, @e final kotlin.reflect.jvm.internal.impl.incremental.components.e p1, @e final String p2, @e final f p3, @e final String p4);
    
    public static final class a implements c
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
            return false;
        }
        
        @Override
        public void b(@e final String s, @e final kotlin.reflect.jvm.internal.impl.incremental.components.e e, @e final String s2, @e final f f, @e final String s3) {
            k0.p((Object)s, "filePath");
            k0.p((Object)e, "position");
            k0.p((Object)s2, "scopeFqName");
            k0.p((Object)f, "scopeKind");
            k0.p((Object)s3, "name");
        }
    }
}
