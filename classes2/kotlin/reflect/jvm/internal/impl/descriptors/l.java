// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.c0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.d1;

public interface l extends y
{
    boolean H();
    
    @org.jetbrains.annotations.e
    e I();
    
    @org.jetbrains.annotations.e
    i c();
    
    @f
    l d(@org.jetbrains.annotations.e final d1 p0);
    
    @org.jetbrains.annotations.e
    c0 getReturnType();
    
    @org.jetbrains.annotations.e
    List<b1> getTypeParameters();
}
