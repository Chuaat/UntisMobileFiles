// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.d0;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.name.b;
import n6.a;
import kotlin.g0;
import kotlin.jvm.internal.k0;
import kotlin.collections.j1;
import kotlin.jvm.internal.w;
import kotlin.b0;
import m6.d;
import java.util.Set;
import org.jetbrains.annotations.e;

public enum PrimitiveType
{
    BOOLEAN("Boolean"), 
    BYTE("Byte"), 
    CHAR("Char");
    
    @e
    public static final Companion Companion;
    
    DOUBLE("Double"), 
    FLOAT("Float"), 
    INT("Int"), 
    LONG("Long");
    
    @d
    @e
    public static final Set<PrimitiveType> NUMBER_TYPES;
    
    SHORT("Short");
    
    @e
    private final kotlin.reflect.jvm.internal.impl.name.e G;
    @e
    private final kotlin.reflect.jvm.internal.impl.name.e H;
    @e
    private final b0 I;
    @e
    private final b0 J;
    
    static {
        final PrimitiveType primitiveType;
        final PrimitiveType primitiveType2;
        final PrimitiveType primitiveType3;
        final PrimitiveType primitiveType4;
        final PrimitiveType primitiveType5;
        final PrimitiveType primitiveType6;
        final PrimitiveType primitiveType7;
        final PrimitiveType primitiveType8;
        K = new PrimitiveType[] { primitiveType, primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7, primitiveType8 };
        Companion = new Companion(null);
        NUMBER_TYPES = j1.u(primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7, primitiveType8);
    }
    
    private PrimitiveType(final String s) {
        final kotlin.reflect.jvm.internal.impl.name.e i = kotlin.reflect.jvm.internal.impl.name.e.i(s);
        k0.o(i, "identifier(typeName)");
        this.G = i;
        final kotlin.reflect.jvm.internal.impl.name.e j = kotlin.reflect.jvm.internal.impl.name.e.i(k0.C(s, "Array"));
        k0.o(j, "identifier(\"${typeName}Array\")");
        this.H = j;
        final g0 h = g0.H;
        this.I = d0.b(h, (a<?>)new a<b>() {
            final /* synthetic */ PrimitiveType G;
            
            @e
            public final b a() {
                final b c = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.c(this.G.getTypeName());
                k0.o(c, "BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName)");
                return c;
            }
        });
        this.J = d0.b(h, (a<?>)new a<b>() {
            final /* synthetic */ PrimitiveType G;
            
            @e
            public final b a() {
                final b c = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.c(this.G.getArrayTypeName());
                k0.o(c, "BUILT_INS_PACKAGE_FQ_NAME.child(arrayTypeName)");
                return c;
            }
        });
    }
    
    @e
    public final b getArrayTypeFqName() {
        return this.J.getValue();
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.name.e getArrayTypeName() {
        return this.H;
    }
    
    @e
    public final b getTypeFqName() {
        return this.I.getValue();
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.name.e getTypeName() {
        return this.G;
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
