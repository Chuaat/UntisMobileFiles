// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.k;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.d0;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.types.a1;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.y0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.name.c;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.incremental.components.d;
import n6.l;
import java.util.Map;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.types.k0;
import java.util.EnumMap;
import java.util.Arrays;
import n6.a;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.storage.g;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.storage.i;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.x;
import kotlin.reflect.jvm.internal.impl.name.e;

public abstract class KotlinBuiltIns
{
    public static final kotlin.reflect.jvm.internal.impl.name.e BUILTINS_MODULE_NAME;
    private x a;
    private final i<e> b;
    private final i<Collection<m0>> c;
    private final g<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.descriptors.e> d;
    private final n e;
    
    static {
        BUILTINS_MODULE_NAME = kotlin.reflect.jvm.internal.impl.name.e.l("<built-ins module>");
    }
    
    protected KotlinBuiltIns(@org.jetbrains.annotations.e final n e) {
        if (e == null) {
            a(0);
        }
        this.e = e;
        this.c = (i<Collection<m0>>)e.g((a)new a<Collection<m0>>() {
            public Collection<m0> a() {
                return Arrays.asList(KotlinBuiltIns.this.a.R(StandardNames.BUILT_INS_PACKAGE_FQ_NAME), KotlinBuiltIns.this.a.R(StandardNames.COLLECTIONS_PACKAGE_FQ_NAME), KotlinBuiltIns.this.a.R(StandardNames.RANGES_PACKAGE_FQ_NAME), KotlinBuiltIns.this.a.R(StandardNames.ANNOTATION_PACKAGE_FQ_NAME));
            }
        });
        this.b = (i<e>)e.g((a)new a<e>() {
            public e a() {
                final EnumMap<PrimitiveType, k0> enumMap = new EnumMap<PrimitiveType, k0>(PrimitiveType.class);
                final HashMap<k0, k0> hashMap = new HashMap<k0, k0>();
                final HashMap<k0, k0> hashMap2 = new HashMap<k0, k0>();
                for (final PrimitiveType primitiveType : PrimitiveType.values()) {
                    final k0 d = KotlinBuiltIns.this.i(primitiveType.getTypeName().d());
                    final k0 d2 = KotlinBuiltIns.this.i(primitiveType.getArrayTypeName().d());
                    enumMap.put(primitiveType, d2);
                    hashMap.put(d, d2);
                    hashMap2.put(d2, d);
                }
                return new e((Map)enumMap, (Map)hashMap, (Map)hashMap2);
            }
        });
        this.d = (g<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.descriptors.e>)e.b((l)new l<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.descriptors.e>() {
            public kotlin.reflect.jvm.internal.impl.descriptors.e a(final kotlin.reflect.jvm.internal.impl.name.e obj) {
                final h g = ((k)KotlinBuiltIns.this.getBuiltInsPackageScope()).g(obj, (b)kotlin.reflect.jvm.internal.impl.incremental.components.d.J);
                if (g == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Built-in class ");
                    sb.append(StandardNames.BUILT_INS_PACKAGE_FQ_NAME.c(obj));
                    sb.append(" is not found");
                    throw new AssertionError((Object)sb.toString());
                }
                if (g instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                    return (kotlin.reflect.jvm.internal.impl.descriptors.e)g;
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Must be a class descriptor ");
                sb2.append(obj);
                sb2.append(", but was ");
                sb2.append(g);
                throw new AssertionError((Object)sb2.toString());
            }
        });
    }
    
    private static /* synthetic */ void a(final int n) {
        String format = null;
        switch (n) {
            default: {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 83:
            case 85:
            case 86: {
                format = "@NotNull method %s.%s must not return null";
                break;
            }
        }
        int n2 = 0;
        switch (n) {
            default: {
                n2 = 3;
                break;
            }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 83:
            case 85:
            case 86: {
                n2 = 2;
                break;
            }
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "storageManager";
                break;
            }
            case 158: {
                args[0] = "declarationDescriptor";
                break;
            }
            case 111: {
                args[0] = "classDescriptor";
                break;
            }
            case 100: {
                args[0] = "typeConstructor";
                break;
            }
            case 79: {
                args[0] = "annotations";
                break;
            }
            case 78:
            case 82:
            case 84: {
                args[0] = "argument";
                break;
            }
            case 77:
            case 81: {
                args[0] = "projectionType";
                break;
            }
            case 74: {
                args[0] = "kotlinType";
                break;
            }
            case 72: {
                args[0] = "primitiveType";
                break;
            }
            case 70: {
                args[0] = "notNullArrayType";
                break;
            }
            case 66: {
                args[0] = "arrayType";
                break;
            }
            case 45: {
                args[0] = "classSimpleName";
                break;
            }
            case 15:
            case 16:
            case 52:
            case 87:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 96:
            case 98:
            case 104:
            case 108:
            case 109:
            case 110:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 146:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 159: {
                args[0] = "type";
                break;
            }
            case 13: {
                args[0] = "simpleName";
                break;
            }
            case 11:
            case 97:
            case 99:
            case 101:
            case 103:
            case 105:
            case 134: {
                args[0] = "fqName";
                break;
            }
            case 8:
            case 9:
            case 75:
            case 76:
            case 88:
            case 95:
            case 102:
            case 106:
            case 107:
            case 144:
            case 145:
            case 147:
            case 155:
            case 156:
            case 157: {
                args[0] = "descriptor";
                break;
            }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 83:
            case 85:
            case 86: {
                args[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            }
            case 1:
            case 71: {
                args[0] = "module";
                break;
            }
        }
        switch (n) {
            default: {
                args[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            }
            case 86: {
                args[1] = "getAnnotationType";
                break;
            }
            case 85: {
                args[1] = "getEnumType";
                break;
            }
            case 80:
            case 83: {
                args[1] = "getArrayType";
                break;
            }
            case 73: {
                args[1] = "getPrimitiveArrayKotlinType";
                break;
            }
            case 67:
            case 68:
            case 69: {
                args[1] = "getArrayElementType";
                break;
            }
            case 65: {
                args[1] = "getIterableType";
                break;
            }
            case 64: {
                args[1] = "getStringType";
                break;
            }
            case 63: {
                args[1] = "getUnitType";
                break;
            }
            case 62: {
                args[1] = "getBooleanType";
                break;
            }
            case 61: {
                args[1] = "getCharType";
                break;
            }
            case 60: {
                args[1] = "getDoubleType";
                break;
            }
            case 59: {
                args[1] = "getFloatType";
                break;
            }
            case 58: {
                args[1] = "getLongType";
                break;
            }
            case 57: {
                args[1] = "getIntType";
                break;
            }
            case 56: {
                args[1] = "getShortType";
                break;
            }
            case 55: {
                args[1] = "getByteType";
                break;
            }
            case 54: {
                args[1] = "getNumberType";
                break;
            }
            case 53: {
                args[1] = "getPrimitiveKotlinType";
                break;
            }
            case 51: {
                args[1] = "getDefaultBound";
                break;
            }
            case 50: {
                args[1] = "getNullableAnyType";
                break;
            }
            case 49: {
                args[1] = "getAnyType";
                break;
            }
            case 48: {
                args[1] = "getNullableNothingType";
                break;
            }
            case 47: {
                args[1] = "getNothingType";
                break;
            }
            case 46: {
                args[1] = "getBuiltInTypeByClassName";
                break;
            }
            case 44: {
                args[1] = "getMutableListIterator";
                break;
            }
            case 43: {
                args[1] = "getListIterator";
                break;
            }
            case 42: {
                args[1] = "getMutableMapEntry";
                break;
            }
            case 41: {
                args[1] = "getMapEntry";
                break;
            }
            case 40: {
                args[1] = "getMutableMap";
                break;
            }
            case 39: {
                args[1] = "getMap";
                break;
            }
            case 38: {
                args[1] = "getMutableSet";
                break;
            }
            case 37: {
                args[1] = "getSet";
                break;
            }
            case 36: {
                args[1] = "getMutableList";
                break;
            }
            case 35: {
                args[1] = "getList";
                break;
            }
            case 34: {
                args[1] = "getMutableCollection";
                break;
            }
            case 33: {
                args[1] = "getCollection";
                break;
            }
            case 32: {
                args[1] = "getMutableIterator";
                break;
            }
            case 31: {
                args[1] = "getMutableIterable";
                break;
            }
            case 30: {
                args[1] = "getIterable";
                break;
            }
            case 29: {
                args[1] = "getIterator";
                break;
            }
            case 28: {
                args[1] = "getKMutableProperty2";
                break;
            }
            case 27: {
                args[1] = "getKMutableProperty1";
                break;
            }
            case 26: {
                args[1] = "getKMutableProperty0";
                break;
            }
            case 25: {
                args[1] = "getKProperty2";
                break;
            }
            case 24: {
                args[1] = "getKProperty1";
                break;
            }
            case 23: {
                args[1] = "getKProperty0";
                break;
            }
            case 22: {
                args[1] = "getKProperty";
                break;
            }
            case 21: {
                args[1] = "getKCallable";
                break;
            }
            case 20: {
                args[1] = "getKClass";
                break;
            }
            case 19: {
                args[1] = "getKSuspendFunction";
                break;
            }
            case 18: {
                args[1] = "getKFunction";
                break;
            }
            case 17: {
                args[1] = "getSuspendFunction";
                break;
            }
            case 14: {
                args[1] = "getBuiltInClassByName";
                break;
            }
            case 12: {
                args[1] = "getBuiltInClassByFqName";
                break;
            }
            case 10: {
                args[1] = "getBuiltInsPackageScope";
                break;
            }
            case 7: {
                args[1] = "getBuiltInPackagesImportedByDefault";
                break;
            }
            case 6: {
                args[1] = "getBuiltInsModule";
                break;
            }
            case 5: {
                args[1] = "getStorageManager";
                break;
            }
            case 4: {
                args[1] = "getClassDescriptorFactories";
                break;
            }
            case 3: {
                args[1] = "getPlatformDependentDeclarationFilter";
                break;
            }
            case 2: {
                args[1] = "getAdditionalClassPartsProvider";
                break;
            }
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "<init>";
                }
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 10:
                case 12:
                case 14:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 67:
                case 68:
                case 69:
                case 73:
                case 80:
                case 83:
                case 85:
                case 86: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex = null;
                    switch (n) {
                        default: {
                            ex = new IllegalArgumentException(format2);
                            break;
                        }
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 10:
                        case 12:
                        case 14:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 67:
                        case 68:
                        case 69:
                        case 73:
                        case 80:
                        case 83:
                        case 85:
                        case 86: {
                            ex = new IllegalStateException(format2);
                            break;
                        }
                    }
                    throw ex;
                }
                case 159: {
                    args[2] = "isNotNullOrNullableFunctionSupertype";
                    continue;
                }
                case 158: {
                    args[2] = "isDeprecated";
                    continue;
                }
                case 157: {
                    args[2] = "isCloneable";
                    continue;
                }
                case 156: {
                    args[2] = "isNonPrimitiveArray";
                    continue;
                }
                case 155: {
                    args[2] = "isKClass";
                    continue;
                }
                case 154: {
                    args[2] = "isThrowableOrNullableThrowable";
                    continue;
                }
                case 153: {
                    args[2] = "isIterableOrNullableIterable";
                    continue;
                }
                case 152: {
                    args[2] = "isMapOrNullableMap";
                    continue;
                }
                case 151: {
                    args[2] = "isSetOrNullableSet";
                    continue;
                }
                case 150: {
                    args[2] = "isListOrNullableList";
                    continue;
                }
                case 149: {
                    args[2] = "isCollectionOrNullableCollection";
                    continue;
                }
                case 147:
                case 148: {
                    args[2] = "isComparable";
                    continue;
                }
                case 145:
                case 146: {
                    args[2] = "isEnum";
                    continue;
                }
                case 144: {
                    args[2] = "isMemberOfAny";
                    continue;
                }
                case 143: {
                    args[2] = "isBooleanOrSubtype";
                    continue;
                }
                case 142: {
                    args[2] = "isUnitOrNullableUnit";
                    continue;
                }
                case 141: {
                    args[2] = "isUnit";
                    continue;
                }
                case 140: {
                    args[2] = "isDefaultBound";
                    continue;
                }
                case 139: {
                    args[2] = "isNullableAny";
                    continue;
                }
                case 138: {
                    args[2] = "isAnyOrNullableAny";
                    continue;
                }
                case 137: {
                    args[2] = "isNothingOrNullableNothing";
                    continue;
                }
                case 136: {
                    args[2] = "isNullableNothing";
                    continue;
                }
                case 135: {
                    args[2] = "isNothing";
                    continue;
                }
                case 133:
                case 134: {
                    args[2] = "isConstructedFromGivenClassAndNotNullable";
                    continue;
                }
                case 132: {
                    args[2] = "isDoubleOrNullableDouble";
                    continue;
                }
                case 131: {
                    args[2] = "isUnsignedArrayType";
                    continue;
                }
                case 130: {
                    args[2] = "isULongArray";
                    continue;
                }
                case 129: {
                    args[2] = "isUIntArray";
                    continue;
                }
                case 128: {
                    args[2] = "isUShortArray";
                    continue;
                }
                case 127: {
                    args[2] = "isUByteArray";
                    continue;
                }
                case 126: {
                    args[2] = "isULong";
                    continue;
                }
                case 125: {
                    args[2] = "isUInt";
                    continue;
                }
                case 124: {
                    args[2] = "isUShort";
                    continue;
                }
                case 123: {
                    args[2] = "isUByte";
                    continue;
                }
                case 122: {
                    args[2] = "isDouble";
                    continue;
                }
                case 121: {
                    args[2] = "isFloatOrNullableFloat";
                    continue;
                }
                case 120: {
                    args[2] = "isFloat";
                    continue;
                }
                case 119: {
                    args[2] = "isShort";
                    continue;
                }
                case 118: {
                    args[2] = "isLongOrNullableLong";
                    continue;
                }
                case 117: {
                    args[2] = "isLong";
                    continue;
                }
                case 116: {
                    args[2] = "isByte";
                    continue;
                }
                case 115: {
                    args[2] = "isInt";
                    continue;
                }
                case 114: {
                    args[2] = "isCharOrNullableChar";
                    continue;
                }
                case 113: {
                    args[2] = "isChar";
                    continue;
                }
                case 112: {
                    args[2] = "isNumber";
                    continue;
                }
                case 110: {
                    args[2] = "isBooleanOrNullableBoolean";
                    continue;
                }
                case 109:
                case 111: {
                    args[2] = "isBoolean";
                    continue;
                }
                case 107:
                case 108: {
                    args[2] = "isAny";
                    continue;
                }
                case 106: {
                    args[2] = "isSpecialClassWithNoSupertypes";
                    continue;
                }
                case 104:
                case 105: {
                    args[2] = "isNotNullConstructedFromGivenClass";
                    continue;
                }
                case 102:
                case 103: {
                    args[2] = "classFqNameEquals";
                    continue;
                }
                case 100:
                case 101: {
                    args[2] = "isTypeConstructorForGivenClass";
                    continue;
                }
                case 96:
                case 97:
                case 98:
                case 99: {
                    args[2] = "isConstructedFromGivenClass";
                    continue;
                }
                case 95: {
                    args[2] = "isPrimitiveClass";
                    continue;
                }
                case 94: {
                    args[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                    continue;
                }
                case 93: {
                    args[2] = "isPrimitiveType";
                    continue;
                }
                case 91: {
                    args[2] = "getPrimitiveArrayElementType";
                    continue;
                }
                case 90: {
                    args[2] = "isPrimitiveArray";
                    continue;
                }
                case 88:
                case 89: {
                    args[2] = "isArrayOrPrimitiveArray";
                    continue;
                }
                case 87: {
                    args[2] = "isArray";
                    continue;
                }
                case 84: {
                    args[2] = "getEnumType";
                    continue;
                }
                case 77:
                case 78:
                case 79:
                case 81:
                case 82: {
                    args[2] = "getArrayType";
                    continue;
                }
                case 76: {
                    args[2] = "getPrimitiveArrayType";
                    continue;
                }
                case 75:
                case 92: {
                    args[2] = "getPrimitiveType";
                    continue;
                }
                case 74: {
                    args[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                    continue;
                }
                case 72: {
                    args[2] = "getPrimitiveArrayKotlinType";
                    continue;
                }
                case 70:
                case 71: {
                    args[2] = "getElementTypeForUnsignedArray";
                    continue;
                }
                case 66: {
                    args[2] = "getArrayElementType";
                    continue;
                }
                case 52: {
                    args[2] = "getPrimitiveKotlinType";
                    continue;
                }
                case 45: {
                    args[2] = "getBuiltInTypeByClassName";
                    continue;
                }
                case 16: {
                    args[2] = "getPrimitiveArrayClassDescriptor";
                    continue;
                }
                case 15: {
                    args[2] = "getPrimitiveClassDescriptor";
                    continue;
                }
                case 13: {
                    args[2] = "getBuiltInClassByName";
                    continue;
                }
                case 11: {
                    args[2] = "getBuiltInClassByFqName";
                    continue;
                }
                case 9: {
                    args[2] = "isUnderKotlinPackage";
                    continue;
                }
                case 8: {
                    args[2] = "isBuiltIn";
                    continue;
                }
                case 1: {
                    args[2] = "setBuiltInsModule";
                    continue;
                }
            }
            break;
        }
    }
    
    private static boolean e(@org.jetbrains.annotations.e final h h, @org.jetbrains.annotations.e final c c) {
        if (h == null) {
            a(102);
        }
        if (c == null) {
            a(103);
        }
        return h.getName().equals((Object)c.i()) && c.equals((Object)kotlin.reflect.jvm.internal.impl.resolve.d.m((m)h));
    }
    
    @f
    public static PrimitiveType getPrimitiveArrayType(@org.jetbrains.annotations.e final m m) {
        if (m == null) {
            a(76);
        }
        PrimitiveType primitiveType;
        if (StandardNames.FqNames.primitiveArrayTypeShortNames.contains(m.getName())) {
            primitiveType = StandardNames.FqNames.arrayClassFqNameToPrimitiveType.get(kotlin.reflect.jvm.internal.impl.resolve.d.m(m));
        }
        else {
            primitiveType = null;
        }
        return primitiveType;
    }
    
    @f
    public static PrimitiveType getPrimitiveType(@org.jetbrains.annotations.e final m m) {
        if (m == null) {
            a(75);
        }
        PrimitiveType primitiveType;
        if (StandardNames.FqNames.primitiveTypeShortNames.contains(m.getName())) {
            primitiveType = StandardNames.FqNames.fqNameToPrimitiveType.get(kotlin.reflect.jvm.internal.impl.resolve.d.m(m));
        }
        else {
            primitiveType = null;
        }
        return primitiveType;
    }
    
    @org.jetbrains.annotations.e
    private kotlin.reflect.jvm.internal.impl.descriptors.e h(@org.jetbrains.annotations.e final String s) {
        if (s == null) {
            a(13);
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.e e = ((l<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.descriptors.e>)this.d).invoke(kotlin.reflect.jvm.internal.impl.name.e.i(s));
        if (e == null) {
            a(14);
        }
        return e;
    }
    
    @org.jetbrains.annotations.e
    private k0 i(@org.jetbrains.annotations.e final String s) {
        if (s == null) {
            a(45);
        }
        final k0 a = this.h(s).A();
        if (a == null) {
            a(46);
        }
        return a;
    }
    
    public static boolean isAny(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        if (e == null) {
            a(107);
        }
        return e(e, StandardNames.FqNames.any);
    }
    
    public static boolean isAnyOrNullableAny(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(138);
        }
        return o(c0, StandardNames.FqNames.any);
    }
    
    public static boolean isArray(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(87);
        }
        return o(c0, StandardNames.FqNames.array);
    }
    
    public static boolean isArrayOrPrimitiveArray(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        if (e == null) {
            a(88);
        }
        return e(e, StandardNames.FqNames.array) || getPrimitiveArrayType(e) != null;
    }
    
    public static boolean isBoolean(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(109);
        }
        return p(c0, StandardNames.FqNames._boolean);
    }
    
    public static boolean isBuiltIn(@org.jetbrains.annotations.e final m m) {
        if (m == null) {
            a(8);
        }
        boolean b = false;
        if (kotlin.reflect.jvm.internal.impl.resolve.d.r(m, (Class)BuiltInsPackageFragment.class, false) != null) {
            b = true;
        }
        return b;
    }
    
    public static boolean isByte(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(116);
        }
        return p(c0, StandardNames.FqNames._byte);
    }
    
    public static boolean isChar(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(113);
        }
        return p(c0, StandardNames.FqNames._char);
    }
    
    public static boolean isDefaultBound(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(140);
        }
        return isNullableAny(c0);
    }
    
    public static boolean isDeprecated(@org.jetbrains.annotations.e final m m) {
        if (m == null) {
            a(158);
        }
        final boolean b4 = m.b().getAnnotations().B4(StandardNames.FqNames.deprecated);
        final boolean b5 = true;
        if (b4) {
            return true;
        }
        if (m instanceof q0) {
            final q0 q0 = (q0)m;
            final boolean n0 = q0.n0();
            final r0 e = q0.e();
            final s0 h = q0.h();
            if (e != null && isDeprecated(e)) {
                boolean b6 = b5;
                if (!n0) {
                    return b6;
                }
                if (h != null && isDeprecated(h)) {
                    b6 = b5;
                    return b6;
                }
            }
            return false;
        }
        return false;
    }
    
    public static boolean isDouble(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(122);
        }
        return isDoubleOrNullableDouble(c0) && !c0.O0();
    }
    
    public static boolean isDoubleOrNullableDouble(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(132);
        }
        return o(c0, StandardNames.FqNames._double);
    }
    
    public static boolean isFloat(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(120);
        }
        return isFloatOrNullableFloat(c0) && !c0.O0();
    }
    
    public static boolean isFloatOrNullableFloat(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(121);
        }
        return o(c0, StandardNames.FqNames._float);
    }
    
    public static boolean isInt(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(115);
        }
        return p(c0, StandardNames.FqNames._int);
    }
    
    public static boolean isKClass(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        if (e == null) {
            a(155);
        }
        return e(e, StandardNames.FqNames.kClass);
    }
    
    public static boolean isLong(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(117);
        }
        return p(c0, StandardNames.FqNames._long);
    }
    
    public static boolean isNothing(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(135);
        }
        return isNothingOrNullableNothing(c0) && !f1.l(c0);
    }
    
    public static boolean isNothingOrNullableNothing(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(137);
        }
        return o(c0, StandardNames.FqNames.nothing);
    }
    
    public static boolean isNullableAny(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(139);
        }
        return isAnyOrNullableAny(c0) && c0.O0();
    }
    
    public static boolean isPrimitiveArray(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(90);
        }
        final h c2 = c0.N0().c();
        return c2 != null && getPrimitiveArrayType(c2) != null;
    }
    
    public static boolean isPrimitiveClass(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        if (e == null) {
            a(95);
        }
        return getPrimitiveType(e) != null;
    }
    
    public static boolean isPrimitiveType(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(93);
        }
        return !c0.O0() && isPrimitiveTypeOrNullablePrimitiveType(c0);
    }
    
    public static boolean isPrimitiveTypeOrNullablePrimitiveType(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(94);
        }
        final h c2 = c0.N0().c();
        return c2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e && isPrimitiveClass((kotlin.reflect.jvm.internal.impl.descriptors.e)c2);
    }
    
    public static boolean isShort(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(119);
        }
        return p(c0, StandardNames.FqNames._short);
    }
    
    public static boolean isSpecialClassWithNoSupertypes(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        if (e == null) {
            a(106);
        }
        return e(e, StandardNames.FqNames.any) || e(e, StandardNames.FqNames.nothing);
    }
    
    public static boolean isString(@f final c0 c0) {
        return c0 != null && q(c0, StandardNames.FqNames.string);
    }
    
    public static boolean isTypeConstructorForGivenClass(@org.jetbrains.annotations.e final w0 w0, @org.jetbrains.annotations.e final c c) {
        if (w0 == null) {
            a(100);
        }
        if (c == null) {
            a(101);
        }
        final h c2 = w0.c();
        return c2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e && e(c2, c);
    }
    
    public static boolean isUByteArray(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(127);
        }
        return p(c0, StandardNames.FqNames.uByteArrayFqName.j());
    }
    
    public static boolean isUIntArray(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(129);
        }
        return p(c0, StandardNames.FqNames.uIntArrayFqName.j());
    }
    
    public static boolean isULongArray(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(130);
        }
        return p(c0, StandardNames.FqNames.uLongArrayFqName.j());
    }
    
    public static boolean isUShortArray(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(128);
        }
        return p(c0, StandardNames.FqNames.uShortArrayFqName.j());
    }
    
    public static boolean isUnderKotlinPackage(@org.jetbrains.annotations.e final m m) {
        m c = m;
        if (m == null) {
            a(9);
            c = m;
        }
        while (c != null) {
            if (c instanceof h0) {
                return ((h0)c).f().i(StandardNames.BUILT_INS_PACKAGE_NAME);
            }
            c = c.c();
        }
        return false;
    }
    
    public static boolean isUnit(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(141);
        }
        return q(c0, StandardNames.FqNames.unit);
    }
    
    public static boolean isUnsignedArrayType(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            a(131);
        }
        return isUByteArray(c0) || isUShortArray(c0) || isUIntArray(c0) || isULongArray(c0);
    }
    
    @f
    private static c0 k(@org.jetbrains.annotations.e final c0 c0, @org.jetbrains.annotations.e final e0 e0) {
        if (c0 == null) {
            a(70);
        }
        if (e0 == null) {
            a(71);
        }
        final h c2 = c0.N0().c();
        if (c2 == null) {
            return null;
        }
        final UnsignedTypes instance = UnsignedTypes.INSTANCE;
        if (!instance.isShortNameOfUnsignedArray(c2.getName())) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.name.a h = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.h(c2);
        if (h == null) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.name.a unsignedClassIdByArrayClassId = instance.getUnsignedClassIdByArrayClassId(h);
        if (unsignedClassIdByArrayClassId == null) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.e a = kotlin.reflect.jvm.internal.impl.descriptors.x.a(e0, unsignedClassIdByArrayClassId);
        if (a == null) {
            return null;
        }
        return (c0)a.A();
    }
    
    @org.jetbrains.annotations.e
    private kotlin.reflect.jvm.internal.impl.descriptors.e m(@org.jetbrains.annotations.e final PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(15);
        }
        return this.h(primitiveType.getTypeName().d());
    }
    
    private static boolean o(@org.jetbrains.annotations.e final c0 c0, @org.jetbrains.annotations.e final c c2) {
        if (c0 == null) {
            a(96);
        }
        if (c2 == null) {
            a(97);
        }
        return isTypeConstructorForGivenClass(c0.N0(), c2);
    }
    
    private static boolean p(@org.jetbrains.annotations.e final c0 c0, @org.jetbrains.annotations.e final c c2) {
        if (c0 == null) {
            a(133);
        }
        if (c2 == null) {
            a(134);
        }
        return o(c0, c2) && !c0.O0();
    }
    
    private static boolean q(@org.jetbrains.annotations.e final c0 c0, @org.jetbrains.annotations.e final c c2) {
        if (c0 == null) {
            a(104);
        }
        if (c2 == null) {
            a(105);
        }
        return !c0.O0() && o(c0, c2);
    }
    
    protected void f(final boolean b) {
        (this.a = new x(KotlinBuiltIns.BUILTINS_MODULE_NAME, this.e, this, null)).S0(BuiltInsLoader.Companion.getInstance().createPackageFragmentProvider(this.e, this.a, this.j(), this.l(), this.g(), b));
        final x a = this.a;
        a.Y0(a);
    }
    
    @org.jetbrains.annotations.e
    protected kotlin.reflect.jvm.internal.impl.descriptors.deserialization.a g() {
        final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.a.a a = kotlin.reflect.jvm.internal.impl.descriptors.deserialization.a.a.a;
        if (a == null) {
            a(2);
        }
        return a;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e getAny() {
        return this.h("Any");
    }
    
    @org.jetbrains.annotations.e
    public k0 getAnyType() {
        final k0 a = this.getAny().A();
        if (a == null) {
            a(49);
        }
        return a;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e getArray() {
        return this.h("Array");
    }
    
    @org.jetbrains.annotations.e
    public c0 getArrayElementType(@org.jetbrains.annotations.e c0 a) {
        if (a == null) {
            a(66);
        }
        if (isArray(a)) {
            if (a.M0().size() == 1) {
                a = a.M0().get(0).a();
                if (a == null) {
                    a(67);
                }
                return a;
            }
            throw new IllegalStateException();
        }
        else {
            final c0 n = f1.n(a);
            final c0 c0 = (c0)((a<e>)this.b).invoke().c.get(n);
            if (c0 != null) {
                return c0;
            }
            final e0 i = kotlin.reflect.jvm.internal.impl.resolve.d.i(n);
            if (i != null) {
                final c0 k = k(n, i);
                if (k != null) {
                    return k;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("not array: ");
            sb.append(a);
            throw new IllegalStateException(sb.toString());
        }
    }
    
    @org.jetbrains.annotations.e
    public k0 getArrayType(@org.jetbrains.annotations.e final k1 k1, @org.jetbrains.annotations.e final c0 c0) {
        if (k1 == null) {
            a(81);
        }
        if (c0 == null) {
            a(82);
        }
        final k0 arrayType = this.getArrayType(k1, c0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b());
        if (arrayType == null) {
            a(83);
        }
        return arrayType;
    }
    
    @org.jetbrains.annotations.e
    public k0 getArrayType(@org.jetbrains.annotations.e final k1 k1, @org.jetbrains.annotations.e final c0 c0, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g) {
        if (k1 == null) {
            a(77);
        }
        if (c0 == null) {
            a(78);
        }
        if (g == null) {
            a(79);
        }
        final k0 g2 = d0.g(g, this.getArray(), (List)Collections.singletonList(new a1(k1, c0)));
        if (g2 == null) {
            a(80);
        }
        return g2;
    }
    
    @org.jetbrains.annotations.e
    public k0 getBooleanType() {
        final k0 primitiveKotlinType = this.getPrimitiveKotlinType(PrimitiveType.BOOLEAN);
        if (primitiveKotlinType == null) {
            a(62);
        }
        return primitiveKotlinType;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e getBuiltInClassByFqName(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.b b) {
        if (b == null) {
            a(11);
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.e a = s.a(this.a, b, (b)kotlin.reflect.jvm.internal.impl.incremental.components.d.J);
        if (a == null) {
            a(12);
        }
        return a;
    }
    
    @org.jetbrains.annotations.e
    public x getBuiltInsModule() {
        final x a = this.a;
        if (a == null) {
            a(6);
        }
        return a;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h getBuiltInsPackageScope() {
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.h x = this.a.R(StandardNames.BUILT_INS_PACKAGE_FQ_NAME).x();
        if (x == null) {
            a(10);
        }
        return x;
    }
    
    @org.jetbrains.annotations.e
    public k0 getByteType() {
        final k0 primitiveKotlinType = this.getPrimitiveKotlinType(PrimitiveType.BYTE);
        if (primitiveKotlinType == null) {
            a(55);
        }
        return primitiveKotlinType;
    }
    
    @org.jetbrains.annotations.e
    public k0 getCharType() {
        final k0 primitiveKotlinType = this.getPrimitiveKotlinType(PrimitiveType.CHAR);
        if (primitiveKotlinType == null) {
            a(61);
        }
        return primitiveKotlinType;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e getCollection() {
        final kotlin.reflect.jvm.internal.impl.descriptors.e builtInClassByFqName = this.getBuiltInClassByFqName(StandardNames.FqNames.collection);
        if (builtInClassByFqName == null) {
            a(33);
        }
        return builtInClassByFqName;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e getComparable() {
        return this.h("Comparable");
    }
    
    @org.jetbrains.annotations.e
    public k0 getDefaultBound() {
        final k0 nullableAnyType = this.getNullableAnyType();
        if (nullableAnyType == null) {
            a(51);
        }
        return nullableAnyType;
    }
    
    @org.jetbrains.annotations.e
    public k0 getDoubleType() {
        final k0 primitiveKotlinType = this.getPrimitiveKotlinType(PrimitiveType.DOUBLE);
        if (primitiveKotlinType == null) {
            a(60);
        }
        return primitiveKotlinType;
    }
    
    @org.jetbrains.annotations.e
    public k0 getFloatType() {
        final k0 primitiveKotlinType = this.getPrimitiveKotlinType(PrimitiveType.FLOAT);
        if (primitiveKotlinType == null) {
            a(59);
        }
        return primitiveKotlinType;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e getFunction(final int n) {
        return this.h(StandardNames.getFunctionName(n));
    }
    
    @org.jetbrains.annotations.e
    public k0 getIntType() {
        final k0 primitiveKotlinType = this.getPrimitiveKotlinType(PrimitiveType.INT);
        if (primitiveKotlinType == null) {
            a(57);
        }
        return primitiveKotlinType;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e getKClass() {
        final kotlin.reflect.jvm.internal.impl.descriptors.e builtInClassByFqName = this.getBuiltInClassByFqName(StandardNames.FqNames.kClass.l());
        if (builtInClassByFqName == null) {
            a(20);
        }
        return builtInClassByFqName;
    }
    
    @org.jetbrains.annotations.e
    public k0 getLongType() {
        final k0 primitiveKotlinType = this.getPrimitiveKotlinType(PrimitiveType.LONG);
        if (primitiveKotlinType == null) {
            a(58);
        }
        return primitiveKotlinType;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e getNothing() {
        return this.h("Nothing");
    }
    
    @org.jetbrains.annotations.e
    public k0 getNothingType() {
        final k0 a = this.getNothing().A();
        if (a == null) {
            a(47);
        }
        return a;
    }
    
    @org.jetbrains.annotations.e
    public k0 getNullableAnyType() {
        final k0 u0 = this.getAnyType().U0(true);
        if (u0 == null) {
            a(50);
        }
        return u0;
    }
    
    @org.jetbrains.annotations.e
    public k0 getNullableNothingType() {
        final k0 u0 = this.getNothingType().U0(true);
        if (u0 == null) {
            a(48);
        }
        return u0;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e getNumber() {
        return this.h("Number");
    }
    
    @org.jetbrains.annotations.e
    public k0 getNumberType() {
        final k0 a = this.getNumber().A();
        if (a == null) {
            a(54);
        }
        return a;
    }
    
    @org.jetbrains.annotations.e
    public k0 getPrimitiveArrayKotlinType(@org.jetbrains.annotations.e final PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(72);
        }
        final k0 k0 = ((a<e>)this.b).invoke().a.get(primitiveType);
        if (k0 == null) {
            a(73);
        }
        return k0;
    }
    
    @org.jetbrains.annotations.e
    public k0 getPrimitiveKotlinType(@org.jetbrains.annotations.e final PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(52);
        }
        final k0 a = this.m(primitiveType).A();
        if (a == null) {
            a(53);
        }
        return a;
    }
    
    @org.jetbrains.annotations.e
    public k0 getShortType() {
        final k0 primitiveKotlinType = this.getPrimitiveKotlinType(PrimitiveType.SHORT);
        if (primitiveKotlinType == null) {
            a(56);
        }
        return primitiveKotlinType;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e getString() {
        return this.h("String");
    }
    
    @org.jetbrains.annotations.e
    public k0 getStringType() {
        final k0 a = this.getString().A();
        if (a == null) {
            a(64);
        }
        return a;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e getSuspendFunction(final int n) {
        final kotlin.reflect.jvm.internal.impl.descriptors.e builtInClassByFqName = this.getBuiltInClassByFqName(StandardNames.COROUTINES_PACKAGE_FQ_NAME_RELEASE.c(kotlin.reflect.jvm.internal.impl.name.e.i(StandardNames.getSuspendFunctionName(n))));
        if (builtInClassByFqName == null) {
            a(17);
        }
        return builtInClassByFqName;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e getUnit() {
        return this.h("Unit");
    }
    
    @org.jetbrains.annotations.e
    public k0 getUnitType() {
        final k0 a = this.getUnit().A();
        if (a == null) {
            a(63);
        }
        return a;
    }
    
    @org.jetbrains.annotations.e
    protected Iterable<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b> j() {
        final List<kotlin.reflect.jvm.internal.impl.builtins.functions.a> singletonList = Collections.singletonList(new kotlin.reflect.jvm.internal.impl.builtins.functions.a(this.e, this.a));
        if (singletonList == null) {
            a(4);
        }
        return (Iterable<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b>)singletonList;
    }
    
    @org.jetbrains.annotations.e
    protected kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c l() {
        final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c.b a = kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c.b.a;
        if (a == null) {
            a(3);
        }
        return a;
    }
    
    @org.jetbrains.annotations.e
    protected n n() {
        final n e = this.e;
        if (e == null) {
            a(5);
        }
        return e;
    }
    
    public void setBuiltInsModule(@org.jetbrains.annotations.e final x x) {
        if (x == null) {
            a(1);
        }
        this.e.f((a)new a<Void>() {
            public Void a() {
                if (KotlinBuiltIns.this.a == null) {
                    KotlinBuiltIns.this.a = x;
                    return null;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Built-ins module is already set: ");
                sb.append(KotlinBuiltIns.this.a);
                sb.append(" (attempting to reset to ");
                sb.append(x);
                sb.append(")");
                throw new AssertionError((Object)sb.toString());
            }
        });
    }
    
    private static class e
    {
        public final Map<PrimitiveType, k0> a;
        public final Map<c0, k0> b;
        public final Map<k0, k0> c;
        
        private e(@org.jetbrains.annotations.e final Map<PrimitiveType, k0> a, @org.jetbrains.annotations.e final Map<c0, k0> b, @org.jetbrains.annotations.e final Map<k0, k0> c) {
            if (a == null) {
                a(0);
            }
            if (b == null) {
                a(1);
            }
            if (c == null) {
                a(2);
            }
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        private static /* synthetic */ void a(final int n) {
            final Object[] args = new Object[3];
            if (n != 1) {
                if (n != 2) {
                    args[0] = "primitiveTypeToArrayKotlinType";
                }
                else {
                    args[0] = "kotlinArrayTypeToPrimitiveKotlinType";
                }
            }
            else {
                args[0] = "primitiveKotlinTypeToKotlinArrayType";
            }
            args[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            args[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
        }
    }
}
