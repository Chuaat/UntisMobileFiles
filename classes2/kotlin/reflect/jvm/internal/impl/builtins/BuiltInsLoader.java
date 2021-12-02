// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.d0;
import kotlin.g0;
import kotlin.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.a;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import org.jetbrains.annotations.e;

public interface BuiltInsLoader
{
    @e
    public static final Companion Companion = BuiltInsLoader.Companion.a;
    
    @e
    i0 createPackageFragmentProvider(@e final n p0, @e final e0 p1, @e final Iterable<? extends b> p2, @e final c p3, @e final a p4, final boolean p5);
    
    public static final class Companion
    {
        static final /* synthetic */ Companion a;
        @e
        private static final b0<BuiltInsLoader> b;
        
        static {
            a = new Companion();
            b = d0.b(g0.H, (n6.a<? extends BuiltInsLoader>)BuiltInsLoader$Companion$a.G);
        }
        
        private Companion() {
        }
        
        @e
        public final BuiltInsLoader getInstance() {
            return Companion.b.getValue();
        }
    }
}
