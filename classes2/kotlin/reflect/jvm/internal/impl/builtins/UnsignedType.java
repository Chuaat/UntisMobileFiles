// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.name.a;

public enum UnsignedType
{
    UBYTE(e), 
    UINT(e3), 
    ULONG(e4), 
    USHORT(e2);
    
    @e
    private final a G;
    @e
    private final kotlin.reflect.jvm.internal.impl.name.e H;
    @e
    private final a I;
    
    static {
        final a e = a.e("kotlin/UByte");
        k0.o(e, "fromString(\"kotlin/UByte\")");
        final a e2 = a.e("kotlin/UShort");
        k0.o(e2, "fromString(\"kotlin/UShort\")");
        final a e3 = a.e("kotlin/UInt");
        k0.o(e3, "fromString(\"kotlin/UInt\")");
        final a e4 = a.e("kotlin/ULong");
        k0.o(e4, "fromString(\"kotlin/ULong\")");
    }
    
    private UnsignedType(final a g) {
        this.G = g;
        final kotlin.reflect.jvm.internal.impl.name.e j = g.j();
        k0.o(j, "classId.shortClassName");
        this.H = j;
        this.I = new a(g.h(), kotlin.reflect.jvm.internal.impl.name.e.i(k0.C(j.d(), "Array")));
    }
    
    @e
    public final a getArrayClassId() {
        return this.I;
    }
    
    @e
    public final a getClassId() {
        return this.G;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.name.e getTypeName() {
        return this.H;
    }
}
