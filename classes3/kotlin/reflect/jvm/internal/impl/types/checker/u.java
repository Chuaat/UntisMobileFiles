// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.c0;

public class u
{
    private static /* synthetic */ void a(final int n) {
        String format;
        if (n != 7 && n != 10) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 7 && n != 10) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "subtype";
                break;
            }
            case 20: {
                args[0] = "supertypeArgumentProjection";
                break;
            }
            case 19: {
                args[0] = "subtypeArgumentProjection";
                break;
            }
            case 14: {
                args[0] = "typeArgument";
                break;
            }
            case 13: {
                args[0] = "typeParameter";
                break;
            }
            case 12: {
                args[0] = "type2";
                break;
            }
            case 11: {
                args[0] = "type1";
                break;
            }
            case 7:
            case 10: {
                args[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            }
            case 6:
            case 9: {
                args[0] = "argument";
                break;
            }
            case 5:
            case 8:
            case 21: {
                args[0] = "parameter";
                break;
            }
            case 4: {
                args[0] = "typeCheckingProcedureCallbacks";
                break;
            }
            case 1:
            case 3:
            case 16:
            case 18: {
                args[0] = "supertype";
                break;
            }
        }
        if (n != 7) {
            if (n != 10) {
                args[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
            }
            else {
                args[1] = "getInType";
            }
        }
        else {
            args[1] = "getOutType";
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "findCorrespondingSupertype";
                }
                case 7:
                case 10: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex;
                    if (n != 7 && n != 10) {
                        ex = new IllegalArgumentException(format2);
                    }
                    else {
                        ex = new IllegalStateException(format2);
                    }
                    throw ex;
                }
                case 19:
                case 20:
                case 21: {
                    args[2] = "capture";
                    continue;
                }
                case 17:
                case 18: {
                    args[2] = "checkSubtypeForTheSameConstructor";
                    continue;
                }
                case 15:
                case 16: {
                    args[2] = "isSubtypeOf";
                    continue;
                }
                case 13:
                case 14: {
                    args[2] = "getEffectiveProjectionKind";
                    continue;
                }
                case 11:
                case 12: {
                    args[2] = "equalTypes";
                    continue;
                }
                case 8:
                case 9: {
                    args[2] = "getInType";
                    continue;
                }
                case 5:
                case 6: {
                    args[2] = "getOutType";
                    continue;
                }
            }
            break;
        }
    }
    
    @f
    public static c0 b(@e final c0 c0, @e final c0 c2) {
        if (c0 == null) {
            a(0);
        }
        if (c2 == null) {
            a(1);
        }
        return c(c0, c2, new t());
    }
    
    @f
    public static c0 c(@e final c0 c0, @e final c0 c2, @e final v v) {
        if (c0 == null) {
            a(2);
        }
        if (c2 == null) {
            a(3);
        }
        if (v == null) {
            a(4);
        }
        return x.d(c0, c2, v);
    }
}
