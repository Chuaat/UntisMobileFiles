// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.nio.ByteBuffer;
import java.util.Date;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import io.realm.internal.Keep;

@Keep
public enum RealmFieldType
{
    BINARY(4), 
    BINARY_LIST(132), 
    BOOLEAN(1), 
    BOOLEAN_LIST(129), 
    DATE(8), 
    DATE_LIST(136), 
    DECIMAL128(11), 
    DECIMAL128_LIST(139), 
    DOUBLE(10), 
    DOUBLE_LIST(138), 
    FLOAT(9), 
    FLOAT_LIST(137), 
    INTEGER(0), 
    INTEGER_LIST(128), 
    LINKING_OBJECTS(14), 
    LIST(13), 
    OBJECT(12), 
    OBJECT_ID(15), 
    OBJECT_ID_LIST(143), 
    STRING(2), 
    STRING_LIST(130);
    
    private static final RealmFieldType[] basicTypes;
    private static final RealmFieldType[] listTypes;
    private final int nativeValue;
    
    static {
        basicTypes = new RealmFieldType[16];
        listTypes = new RealmFieldType[16];
        for (final RealmFieldType realmFieldType : values()) {
            final int nativeValue = realmFieldType.nativeValue;
            if (nativeValue < 128) {
                RealmFieldType.basicTypes[nativeValue] = realmFieldType;
            }
            else {
                RealmFieldType.listTypes[nativeValue - 128] = realmFieldType;
            }
        }
    }
    
    private RealmFieldType(final int nativeValue) {
        this.nativeValue = nativeValue;
    }
    
    public static RealmFieldType fromNativeValue(final int i) {
        if (i >= 0) {
            final RealmFieldType[] basicTypes = RealmFieldType.basicTypes;
            if (i < basicTypes.length) {
                final RealmFieldType realmFieldType = basicTypes[i];
                if (realmFieldType != null) {
                    return realmFieldType;
                }
            }
        }
        if (128 <= i) {
            final int n = i - 128;
            final RealmFieldType[] listTypes = RealmFieldType.listTypes;
            if (n < listTypes.length) {
                final RealmFieldType realmFieldType2 = listTypes[n];
                if (realmFieldType2 != null) {
                    return realmFieldType2;
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid native Realm type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public int getNativeValue() {
        return this.nativeValue;
    }
    
    public boolean isValid(final Object o) {
        final int nativeValue = this.nativeValue;
        final boolean b = true;
        final boolean b2 = true;
        if (nativeValue == 0) {
            boolean b3 = b;
            if (!(o instanceof Long)) {
                b3 = b;
                if (!(o instanceof Integer)) {
                    b3 = b;
                    if (!(o instanceof Short)) {
                        b3 = (o instanceof Byte && b);
                    }
                }
            }
            return b3;
        }
        if (nativeValue == 1) {
            return o instanceof Boolean;
        }
        if (nativeValue == 2) {
            return o instanceof String;
        }
        if (nativeValue != 4) {
            Label_0212: {
                if (nativeValue != 132 && nativeValue != 143) {
                    switch (nativeValue) {
                        default: {
                            switch (nativeValue) {
                                default: {
                                    switch (nativeValue) {
                                        default: {
                                            final StringBuilder sb = new StringBuilder();
                                            sb.append("Unsupported Realm type:  ");
                                            sb.append(this);
                                            throw new RuntimeException(sb.toString());
                                        }
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139: {
                                            break Label_0212;
                                        }
                                    }
                                    break;
                                }
                                case 128:
                                case 129:
                                case 130: {
                                    break Label_0212;
                                }
                            }
                            break;
                        }
                        case 15: {
                            return o instanceof ObjectId;
                        }
                        case 12: {
                            return false;
                        }
                        case 11: {
                            return o instanceof Decimal128;
                        }
                        case 10: {
                            return o instanceof Double;
                        }
                        case 9: {
                            return o instanceof Float;
                        }
                        case 8: {
                            return o instanceof Date;
                        }
                        case 13:
                        case 14: {
                            break;
                        }
                    }
                }
            }
            return false;
        }
        boolean b4 = b2;
        if (!(o instanceof byte[])) {
            b4 = (o instanceof ByteBuffer && b2);
        }
        return b4;
    }
}
