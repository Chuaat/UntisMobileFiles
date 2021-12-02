// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import java.util.Locale;
import io.realm.RealmFieldType;

public class Property implements k
{
    public static final boolean H = true;
    public static final boolean I = true;
    public static final boolean J = true;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    public static final int N = 3;
    public static final int O = 4;
    public static final int P = 5;
    public static final int Q = 6;
    public static final int R = 7;
    public static final int S = 8;
    public static final int T = 11;
    public static final int U = 10;
    public static final int V = 0;
    public static final int W = 64;
    public static final int X = 128;
    private static final long Y;
    private long G;
    
    static {
        Y = nativeGetFinalizerPtr();
    }
    
    Property(final long g) {
        this.G = g;
        j.c.a(this);
    }
    
    static int a(final RealmFieldType realmFieldType, final boolean b) {
        final int n = Property$a.a[realmFieldType.ordinal()];
        int n2 = 1;
        int n3 = 0;
        while (true) {
            switch (n) {
                default: {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unsupported filed type: '%s'.", realmFieldType.name()));
                }
                case 5: {
                    if (!b) {
                        n3 = 64;
                    }
                    return n2 | n3;
                }
                case 21: {
                    n2 = 134;
                    continue;
                }
                case 20: {
                    n2 = 138;
                    continue;
                }
                case 19: {
                    n2 = 139;
                    continue;
                }
                case 18: {
                    n2 = 133;
                    continue;
                }
                case 17: {
                    n2 = 132;
                    continue;
                }
                case 16: {
                    n2 = 131;
                    continue;
                }
                case 15: {
                    n2 = 130;
                    continue;
                }
                case 14: {
                    n2 = 129;
                    continue;
                }
                case 13: {
                    n2 = 128;
                    continue;
                }
                case 12: {
                    n2 = 6;
                    continue;
                }
                case 11: {
                    n2 = 10;
                    continue;
                }
                case 10: {
                    n2 = 11;
                    continue;
                }
                case 9: {
                    n2 = 5;
                    continue;
                }
                case 8: {
                    n2 = 4;
                    continue;
                }
                case 7: {
                    n2 = 3;
                    continue;
                }
                case 6: {
                    n2 = 2;
                    continue;
                }
                case 4: {
                    n2 = 0;
                    continue;
                }
                case 3: {
                    return 136;
                }
                case 2: {
                    return 135;
                }
                case 1: {
                    return 71;
                }
            }
            break;
        }
    }
    
    private static RealmFieldType b(final int i) {
        final int n = i & 0xFFFFFFBF;
        if (n == 10) {
            return RealmFieldType.OBJECT_ID;
        }
        if (n == 11) {
            return RealmFieldType.DECIMAL128;
        }
        if (n == 138) {
            return RealmFieldType.OBJECT_ID_LIST;
        }
        if (n == 139) {
            return RealmFieldType.DECIMAL128_LIST;
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        throw new IllegalArgumentException(String.format(Locale.US, "Unsupported property type: '%d'", i));
                    }
                    case 136: {
                        return RealmFieldType.LINKING_OBJECTS;
                    }
                    case 135: {
                        return RealmFieldType.LIST;
                    }
                    case 134: {
                        return RealmFieldType.DOUBLE_LIST;
                    }
                    case 133: {
                        return RealmFieldType.FLOAT_LIST;
                    }
                    case 132: {
                        return RealmFieldType.DATE_LIST;
                    }
                    case 131: {
                        return RealmFieldType.BINARY_LIST;
                    }
                    case 130: {
                        return RealmFieldType.STRING_LIST;
                    }
                    case 129: {
                        return RealmFieldType.BOOLEAN_LIST;
                    }
                    case 128: {
                        return RealmFieldType.INTEGER_LIST;
                    }
                }
                break;
            }
            case 7: {
                return RealmFieldType.OBJECT;
            }
            case 6: {
                return RealmFieldType.DOUBLE;
            }
            case 5: {
                return RealmFieldType.FLOAT;
            }
            case 4: {
                return RealmFieldType.DATE;
            }
            case 3: {
                return RealmFieldType.BINARY;
            }
            case 2: {
                return RealmFieldType.STRING;
            }
            case 1: {
                return RealmFieldType.BOOLEAN;
            }
            case 0: {
                return RealmFieldType.INTEGER;
            }
        }
    }
    
    static native long nativeCreateComputedLinkProperty(final String p0, final String p1, final String p2);
    
    static native long nativeCreatePersistedLinkProperty(final String p0, final String p1, final int p2, final String p3);
    
    static native long nativeCreatePersistedProperty(final String p0, final String p1, final int p2, final boolean p3, final boolean p4);
    
    private static native long nativeGetColumnKey(final long p0);
    
    private static native long nativeGetFinalizerPtr();
    
    private static native String nativeGetLinkedObjectName(final long p0);
    
    private static native int nativeGetType(final long p0);
    
    public long c() {
        return nativeGetColumnKey(this.G);
    }
    
    public String d() {
        return nativeGetLinkedObjectName(this.G);
    }
    
    public RealmFieldType e() {
        return b(nativeGetType(this.G));
    }
    
    @Override
    public long getNativeFinalizerPtr() {
        return Property.Y;
    }
    
    @Override
    public long getNativePtr() {
        return this.G;
    }
}
