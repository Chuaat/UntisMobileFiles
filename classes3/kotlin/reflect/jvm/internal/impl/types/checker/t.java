// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.w0;

class t implements v
{
    private static /* synthetic */ void b(final int n) {
        final Object[] args = new Object[3];
        switch (n) {
            default: {
                args[0] = "a";
                break;
            }
            case 9: {
                args[0] = "typeProjection";
                break;
            }
            case 8: {
                args[0] = "type";
                break;
            }
            case 6:
            case 11: {
                args[0] = "supertype";
                break;
            }
            case 5:
            case 10: {
                args[0] = "subtype";
                break;
            }
            case 2:
            case 7: {
                args[0] = "typeCheckingProcedure";
                break;
            }
            case 1:
            case 4: {
                args[0] = "b";
                break;
            }
        }
        args[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (n) {
            default: {
                args[2] = "assertEqualTypes";
                break;
            }
            case 10:
            case 11: {
                args[2] = "noCorrespondingSupertype";
                break;
            }
            case 8:
            case 9: {
                args[2] = "capture";
                break;
            }
            case 5:
            case 6:
            case 7: {
                args[2] = "assertSubtype";
                break;
            }
            case 3:
            case 4: {
                args[2] = "assertEqualTypeConstructors";
                break;
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
    }
    
    @Override
    public boolean a(@e final w0 w0, @e final w0 obj) {
        if (w0 == null) {
            b(3);
        }
        if (obj == null) {
            b(4);
        }
        return w0.equals(obj);
    }
}
