// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.g;
import org.jetbrains.annotations.e;

public class a1 extends z0
{
    private final k1 a;
    private final c0 b;
    
    public a1(@e final c0 c0) {
        if (c0 == null) {
            e(2);
        }
        this(k1.K, c0);
    }
    
    public a1(@e final k1 a, @e final c0 b) {
        if (a == null) {
            e(0);
        }
        if (b == null) {
            e(1);
        }
        this.a = a;
        this.b = b;
    }
    
    private static /* synthetic */ void e(final int n) {
        String format;
        if (n != 4 && n != 5) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 4 && n != 5) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "projection";
                break;
            }
            case 6: {
                args[0] = "kotlinTypeRefiner";
                break;
            }
            case 4:
            case 5: {
                args[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            }
            case 1:
            case 2:
            case 3: {
                args[0] = "type";
                break;
            }
        }
        if (n != 4) {
            if (n != 5) {
                args[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
            }
            else {
                args[1] = "getType";
            }
        }
        else {
            args[1] = "getProjectionKind";
        }
        if (n != 3) {
            if (n != 4 && n != 5) {
                if (n != 6) {
                    args[2] = "<init>";
                }
                else {
                    args[2] = "refine";
                }
            }
        }
        else {
            args[2] = "replaceType";
        }
        final String format2 = String.format(format, args);
        RuntimeException ex;
        if (n != 4 && n != 5) {
            ex = new IllegalArgumentException(format2);
        }
        else {
            ex = new IllegalStateException(format2);
        }
        throw ex;
    }
    
    @e
    @Override
    public c0 a() {
        final c0 b = this.b;
        if (b == null) {
            e(5);
        }
        return b;
    }
    
    @e
    @Override
    public y0 b(@e final g g) {
        if (g == null) {
            e(6);
        }
        return new a1(this.a, g.g(this.b));
    }
    
    @e
    @Override
    public k1 c() {
        final k1 a = this.a;
        if (a == null) {
            e(4);
        }
        return a;
    }
    
    @Override
    public boolean d() {
        return false;
    }
}
