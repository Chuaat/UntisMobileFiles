// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.types.k0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;

public final class e extends o<Character>
{
    public e(final char c) {
        super(c);
    }
    
    private final String c(final char c) {
        String value;
        if (c == '\b') {
            value = "\\b";
        }
        else if (c == '\t') {
            value = "\\t";
        }
        else if (c == '\n') {
            value = "\\n";
        }
        else if (c == '\f') {
            value = "\\f";
        }
        else if (c == '\r') {
            value = "\\r";
        }
        else if (this.e(c)) {
            value = String.valueOf(c);
        }
        else {
            value = "?";
        }
        return value;
    }
    
    private final boolean e(final char ch) {
        final byte b = (byte)Character.getType(ch);
        return b != 0 && b != 13 && b != 14 && b != 15 && b != 16 && b != 18 && b != 19;
    }
    
    @org.jetbrains.annotations.e
    public k0 d(@org.jetbrains.annotations.e final e0 e0) {
        kotlin.jvm.internal.k0.p((Object)e0, "module");
        final k0 charType = e0.w().getCharType();
        kotlin.jvm.internal.k0.o((Object)charType, "module.builtIns.charType");
        return charType;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final String format = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[] { this.b(), this.c(this.b()) }, 2));
        kotlin.jvm.internal.k0.o((Object)format, "java.lang.String.format(this, *args)");
        return format;
    }
}
