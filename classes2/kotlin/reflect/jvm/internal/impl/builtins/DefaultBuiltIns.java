// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.storage.f;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;

public final class DefaultBuiltIns extends KotlinBuiltIns
{
    @org.jetbrains.annotations.e
    public static final Companion Companion;
    @org.jetbrains.annotations.e
    private static final DefaultBuiltIns g;
    
    static {
        Companion = new Companion(null);
        g = new DefaultBuiltIns(false, 1, null);
    }
    
    public DefaultBuiltIns() {
        this(false, 1, null);
    }
    
    public DefaultBuiltIns(final boolean b) {
        super((n)new f("DefaultBuiltIns"));
        if (b) {
            this.f(false);
        }
    }
    
    public static final /* synthetic */ DefaultBuiltIns access$getInstance$cp() {
        return DefaultBuiltIns.g;
    }
    
    @org.jetbrains.annotations.e
    public static final DefaultBuiltIns getInstance() {
        return DefaultBuiltIns.Companion.getInstance();
    }
    
    public static final class Companion
    {
        private Companion() {
        }
        
        @org.jetbrains.annotations.e
        public final DefaultBuiltIns getInstance() {
            return DefaultBuiltIns.access$getInstance$cp();
        }
    }
}
