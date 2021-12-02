// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import n6.l;
import kotlin.i;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.name.b;

public interface i0
{
    @i(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @e
    List<h0> a(@e final b p0);
    
    @e
    Collection<b> z(@e final b p0, @e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> p1);
}
