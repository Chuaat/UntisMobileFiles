// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.model.o;

public interface w0 extends o
{
    @e
    w0 b(@e final g p0);
    
    @f
    h c();
    
    boolean d();
    
    @e
    List<b1> getParameters();
    
    @e
    Collection<c0> k();
    
    @e
    KotlinBuiltIns w();
}
