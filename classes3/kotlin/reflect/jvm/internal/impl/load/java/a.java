// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public enum a
{
    H("METHOD"), 
    I("PARAMETER"), 
    J("FIELD"), 
    K("TYPE_USE"), 
    L("TYPE_USE"), 
    M("TYPE_PARAMETER");
    
    @e
    private final String G;
    
    private a(final String g) {
        this.G = g;
    }
    
    @e
    public final String b() {
        return this.G;
    }
}
