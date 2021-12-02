// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import org.jetbrains.annotations.e;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.name.b;
import java.util.Set;

public enum d
{
    K(PrimitiveType.BOOLEAN, "boolean", "Z", "java.lang.Boolean"), 
    L(PrimitiveType.CHAR, "char", "C", "java.lang.Character"), 
    M(PrimitiveType.BYTE, "byte", "B", "java.lang.Byte"), 
    N(PrimitiveType.SHORT, "short", "S", "java.lang.Short"), 
    O(PrimitiveType.INT, "int", "I", "java.lang.Integer"), 
    P(PrimitiveType.FLOAT, "float", "F", "java.lang.Float"), 
    Q(PrimitiveType.LONG, "long", "J", "java.lang.Long"), 
    R(PrimitiveType.DOUBLE, "double", "D", "java.lang.Double");
    
    private static final Set<b> S;
    private static final Map<String, d> T;
    private static final Map<PrimitiveType, d> U;
    private static final Map<String, d> V;
    private final PrimitiveType G;
    private final String H;
    private final String I;
    private final b J;
    
    static {
        int i = 0;
        S = new HashSet<b>();
        T = new HashMap<String, d>();
        U = new EnumMap<PrimitiveType, d>(PrimitiveType.class);
        V = new HashMap<String, d>();
        for (d[] values = values(); i < values.length; ++i) {
            final d d9 = values[i];
            d.S.add(d9.j());
            d.T.put(d9.h(), d9);
            d.U.put(d9.i(), d9);
            d.V.put(d9.g(), d9);
        }
    }
    
    private d(@e final PrimitiveType g, @e final String h, final String i, final String s) {
        if (g == null) {
            b(6);
        }
        if (h == null) {
            b(7);
        }
        if (i == null) {
            b(8);
        }
        if (s == null) {
            b(9);
        }
        super(name, ordinal);
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = new b(s);
    }
    
    private static /* synthetic */ void b(final int n) {
        String format = null;
        Label_0049: {
            if (n != 2 && n != 4) {
                switch (n) {
                    default: {
                        format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break Label_0049;
                    }
                    case 10:
                    case 11:
                    case 12:
                    case 13: {
                        break;
                    }
                }
            }
            format = "@NotNull method %s.%s must not return null";
        }
        int n2 = 0;
        Label_0099: {
            if (n != 2 && n != 4) {
                switch (n) {
                    default: {
                        n2 = 3;
                        break Label_0099;
                    }
                    case 10:
                    case 11:
                    case 12:
                    case 13: {
                        break;
                    }
                }
            }
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "className";
                break;
            }
            case 9: {
                args[0] = "wrapperClassName";
                break;
            }
            case 6: {
                args[0] = "primitiveType";
                break;
            }
            case 5:
            case 8: {
                args[0] = "desc";
                break;
            }
            case 3: {
                args[0] = "type";
                break;
            }
            case 2:
            case 4:
            case 10:
            case 11:
            case 12:
            case 13: {
                args[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            }
            case 1:
            case 7: {
                args[0] = "name";
                break;
            }
        }
        if (n != 2 && n != 4) {
            switch (n) {
                default: {
                    args[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
                }
                case 13: {
                    args[1] = "getWrapperFqName";
                    break;
                }
                case 12: {
                    args[1] = "getDesc";
                    break;
                }
                case 11: {
                    args[1] = "getJavaKeywordName";
                    break;
                }
                case 10: {
                    args[1] = "getPrimitiveType";
                    break;
                }
            }
        }
        else {
            args[1] = "get";
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "isWrapperClassName";
                }
                case 2:
                case 4:
                case 10:
                case 11:
                case 12:
                case 13: {
                    final String format2 = String.format(format, args);
                    if (n != 2 && n != 4) {
                        switch (n) {
                            default: {
                                throw new IllegalArgumentException(format2);
                            }
                            case 10:
                            case 11:
                            case 12:
                            case 13: {
                                break;
                            }
                        }
                    }
                    throw new IllegalStateException(format2);
                }
                case 6:
                case 7:
                case 8:
                case 9: {
                    args[2] = "<init>";
                    continue;
                }
                case 5: {
                    args[2] = "getByDesc";
                    continue;
                }
                case 1:
                case 3: {
                    args[2] = "get";
                    continue;
                }
            }
            break;
        }
    }
    
    @e
    public static d d(@e final String str) {
        if (str == null) {
            b(1);
        }
        final d d = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.T.get(str);
        if (d != null) {
            return d;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Non-primitive type name passed: ");
        sb.append(str);
        throw new AssertionError((Object)sb.toString());
    }
    
    @e
    public static d f(@e final PrimitiveType primitiveType) {
        if (primitiveType == null) {
            b(3);
        }
        final d d = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.U.get(primitiveType);
        if (d == null) {
            b(4);
        }
        return d;
    }
    
    @e
    public String g() {
        final String i = this.I;
        if (i == null) {
            b(12);
        }
        return i;
    }
    
    @e
    public String h() {
        final String h = this.H;
        if (h == null) {
            b(11);
        }
        return h;
    }
    
    @e
    public PrimitiveType i() {
        final PrimitiveType g = this.G;
        if (g == null) {
            b(10);
        }
        return g;
    }
    
    @e
    public b j() {
        final b j = this.J;
        if (j == null) {
            b(13);
        }
        return j;
    }
}
