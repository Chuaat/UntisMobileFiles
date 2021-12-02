// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.name.a;

public enum UnsignedArrayType
{
    UBYTEARRAY(e), 
    UINTARRAY(e3), 
    ULONGARRAY(e4), 
    USHORTARRAY(e2);
    
    @e
    private final a G;
    @e
    private final kotlin.reflect.jvm.internal.impl.name.e H;
    
    static {
        final a e = a.e("kotlin/UByteArray");
        k0.o(e, "fromString(\"kotlin/UByteArray\")");
        final a e2 = a.e("kotlin/UShortArray");
        k0.o(e2, "fromString(\"kotlin/UShortArray\")");
        final a e3 = a.e("kotlin/UIntArray");
        k0.o(e3, "fromString(\"kotlin/UIntArray\")");
        final a e4 = a.e("kotlin/ULongArray");
        k0.o(e4, "fromString(\"kotlin/ULongArray\")");
    }
    
    private UnsignedArrayType(final a g) {
        this.G = g;
        final kotlin.reflect.jvm.internal.impl.name.e j = g.j();
        k0.o(j, "classId.shortClassName");
        this.H = j;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.name.e getTypeName() {
        return this.H;
    }
}
