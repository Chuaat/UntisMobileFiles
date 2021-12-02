// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.builtins.functions.c;
import m6.k;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.collections.j1;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.reflect.jvm.internal.impl.name.b;

public final class StandardNames
{
    @d
    @e
    public static final b ANNOTATION_PACKAGE_FQ_NAME;
    @d
    @e
    public static final b BUILT_INS_PACKAGE_FQ_NAME;
    @d
    @e
    public static final Set<b> BUILT_INS_PACKAGE_FQ_NAMES;
    @d
    @e
    public static final kotlin.reflect.jvm.internal.impl.name.e BUILT_INS_PACKAGE_NAME;
    @d
    @e
    public static final b COLLECTIONS_PACKAGE_FQ_NAME;
    @d
    @e
    public static final b CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL;
    @d
    @e
    public static final b CONTINUATION_INTERFACE_FQ_NAME_RELEASE;
    @d
    @e
    public static final b COROUTINES_INTRINSICS_PACKAGE_FQ_NAME_EXPERIMENTAL;
    @d
    @e
    public static final b COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL;
    @d
    @e
    public static final b COROUTINES_PACKAGE_FQ_NAME_RELEASE;
    @d
    @e
    public static final kotlin.reflect.jvm.internal.impl.name.e ENUM_VALUES;
    @d
    @e
    public static final kotlin.reflect.jvm.internal.impl.name.e ENUM_VALUE_OF;
    @e
    public static final StandardNames INSTANCE;
    @d
    @e
    public static final b KOTLIN_REFLECT_FQ_NAME;
    @d
    @e
    public static final List<String> PREFIXES;
    @d
    @e
    public static final b RANGES_PACKAGE_FQ_NAME;
    @d
    @e
    public static final b RESULT_FQ_NAME;
    @d
    @e
    public static final b TEXT_PACKAGE_FQ_NAME;
    
    static {
        INSTANCE = new StandardNames();
        final kotlin.reflect.jvm.internal.impl.name.e i = kotlin.reflect.jvm.internal.impl.name.e.i("values");
        k0.o(i, "identifier(\"values\")");
        ENUM_VALUES = i;
        final kotlin.reflect.jvm.internal.impl.name.e j = kotlin.reflect.jvm.internal.impl.name.e.i("valueOf");
        k0.o(j, "identifier(\"valueOf\")");
        ENUM_VALUE_OF = j;
        final b b = COROUTINES_PACKAGE_FQ_NAME_RELEASE = new b("kotlin.coroutines");
        final b c = b.c(kotlin.reflect.jvm.internal.impl.name.e.i("experimental"));
        k0.o(c, "COROUTINES_PACKAGE_FQ_NAME_RELEASE.child(Name.identifier(\"experimental\"))");
        COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL = c;
        final b c2 = c.c(kotlin.reflect.jvm.internal.impl.name.e.i("intrinsics"));
        k0.o(c2, "COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL.child(Name.identifier(\"intrinsics\"))");
        COROUTINES_INTRINSICS_PACKAGE_FQ_NAME_EXPERIMENTAL = c2;
        final b c3 = c.c(kotlin.reflect.jvm.internal.impl.name.e.i("Continuation"));
        k0.o(c3, "COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL.child(Name.identifier(\"Continuation\"))");
        CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL = c3;
        final b c4 = b.c(kotlin.reflect.jvm.internal.impl.name.e.i("Continuation"));
        k0.o(c4, "COROUTINES_PACKAGE_FQ_NAME_RELEASE.child(Name.identifier(\"Continuation\"))");
        CONTINUATION_INTERFACE_FQ_NAME_RELEASE = c4;
        RESULT_FQ_NAME = new b("kotlin.Result");
        final b b2 = KOTLIN_REFLECT_FQ_NAME = new b("kotlin.reflect");
        PREFIXES = v.L("KProperty", "KMutableProperty", "KFunction", "KSuspendFunction");
        final kotlin.reflect.jvm.internal.impl.name.e k = kotlin.reflect.jvm.internal.impl.name.e.i("kotlin");
        k0.o(k, "identifier(\"kotlin\")");
        BUILT_INS_PACKAGE_NAME = k;
        final b l = kotlin.reflect.jvm.internal.impl.name.b.k(k);
        k0.o(l, "topLevel(BUILT_INS_PACKAGE_NAME)");
        BUILT_INS_PACKAGE_FQ_NAME = l;
        final b c5 = l.c(kotlin.reflect.jvm.internal.impl.name.e.i("annotation"));
        k0.o(c5, "BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(\"annotation\"))");
        ANNOTATION_PACKAGE_FQ_NAME = c5;
        final b c6 = l.c(kotlin.reflect.jvm.internal.impl.name.e.i("collections"));
        k0.o(c6, "BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(\"collections\"))");
        COLLECTIONS_PACKAGE_FQ_NAME = c6;
        final b c7 = l.c(kotlin.reflect.jvm.internal.impl.name.e.i("ranges"));
        k0.o(c7, "BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(\"ranges\"))");
        RANGES_PACKAGE_FQ_NAME = c7;
        final b c8 = l.c(kotlin.reflect.jvm.internal.impl.name.e.i("text"));
        k0.o(c8, "BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(\"text\"))");
        TEXT_PACKAGE_FQ_NAME = c8;
        final b c9 = l.c(kotlin.reflect.jvm.internal.impl.name.e.i("internal"));
        k0.o(c9, "BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(\"internal\"))");
        BUILT_INS_PACKAGE_FQ_NAMES = j1.u(l, c6, c7, c5, b2, c9, b);
    }
    
    private StandardNames() {
    }
    
    @k
    @e
    public static final a getFunctionClassId(final int n) {
        return new a(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, kotlin.reflect.jvm.internal.impl.name.e.i(getFunctionName(n)));
    }
    
    @k
    @e
    public static final String getFunctionName(final int i) {
        return k0.C("Function", i);
    }
    
    @k
    @e
    public static final b getPrimitiveFqName(@e final PrimitiveType primitiveType) {
        k0.p(primitiveType, "primitiveType");
        final b c = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.c(primitiveType.getTypeName());
        k0.o(c, "BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.typeName)");
        return c;
    }
    
    @k
    @e
    public static final String getSuspendFunctionName(final int i) {
        return k0.C(c.K.b(), i);
    }
    
    @k
    public static final boolean isPrimitiveArray(@e final kotlin.reflect.jvm.internal.impl.name.c c) {
        k0.p(c, "arrayFqName");
        return FqNames.arrayClassFqNameToPrimitiveType.get(c) != null;
    }
    
    public static final class FqNames
    {
        @e
        public static final FqNames INSTANCE;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c _boolean;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c _byte;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c _char;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c _double;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c _enum;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c _float;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c _int;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c _long;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c _short;
        @d
        @e
        public static final b annotation;
        @d
        @e
        public static final b annotationRetention;
        @d
        @e
        public static final b annotationTarget;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c any;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c array;
        @d
        @e
        public static final Map<kotlin.reflect.jvm.internal.impl.name.c, PrimitiveType> arrayClassFqNameToPrimitiveType;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c charSequence;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c cloneable;
        @d
        @e
        public static final b collection;
        @d
        @e
        public static final b comparable;
        @d
        @e
        public static final b deprecated;
        @d
        @e
        public static final b deprecatedSinceKotlin;
        @d
        @e
        public static final b deprecationLevel;
        @d
        @e
        public static final b extensionFunctionType;
        @d
        @e
        public static final Map<kotlin.reflect.jvm.internal.impl.name.c, PrimitiveType> fqNameToPrimitiveType;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c functionSupertype;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c intRange;
        @d
        @e
        public static final b iterable;
        @d
        @e
        public static final b iterator;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c kCallable;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c kClass;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c kDeclarationContainer;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c kMutableProperty0;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c kMutableProperty1;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c kMutableProperty2;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c kMutablePropertyFqName;
        @d
        @e
        public static final a kProperty;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c kProperty0;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c kProperty1;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c kProperty2;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c kPropertyFqName;
        @d
        @e
        public static final b list;
        @d
        @e
        public static final b listIterator;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c longRange;
        @d
        @e
        public static final b map;
        @d
        @e
        public static final b mapEntry;
        @d
        @e
        public static final b mustBeDocumented;
        @d
        @e
        public static final b mutableCollection;
        @d
        @e
        public static final b mutableIterable;
        @d
        @e
        public static final b mutableIterator;
        @d
        @e
        public static final b mutableList;
        @d
        @e
        public static final b mutableListIterator;
        @d
        @e
        public static final b mutableMap;
        @d
        @e
        public static final b mutableMapEntry;
        @d
        @e
        public static final b mutableSet;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c nothing;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c number;
        @d
        @e
        public static final b parameterName;
        @d
        @e
        public static final Set<kotlin.reflect.jvm.internal.impl.name.e> primitiveArrayTypeShortNames;
        @d
        @e
        public static final Set<kotlin.reflect.jvm.internal.impl.name.e> primitiveTypeShortNames;
        @d
        @e
        public static final b publishedApi;
        @d
        @e
        public static final b repeatable;
        @d
        @e
        public static final b replaceWith;
        @d
        @e
        public static final b retention;
        @d
        @e
        public static final b set;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c string;
        @d
        @e
        public static final b suppress;
        @d
        @e
        public static final b target;
        @d
        @e
        public static final b throwable;
        @d
        @e
        public static final a uByte;
        @d
        @e
        public static final b uByteArrayFqName;
        @d
        @e
        public static final b uByteFqName;
        @d
        @e
        public static final a uInt;
        @d
        @e
        public static final b uIntArrayFqName;
        @d
        @e
        public static final b uIntFqName;
        @d
        @e
        public static final a uLong;
        @d
        @e
        public static final b uLongArrayFqName;
        @d
        @e
        public static final b uLongFqName;
        @d
        @e
        public static final a uShort;
        @d
        @e
        public static final b uShortArrayFqName;
        @d
        @e
        public static final b uShortFqName;
        @d
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c unit;
        @d
        @e
        public static final b unsafeVariance;
        
        static {
            final FqNames fqNames = INSTANCE = new FqNames();
            any = fqNames.d("Any");
            nothing = fqNames.d("Nothing");
            cloneable = fqNames.d("Cloneable");
            suppress = fqNames.c("Suppress");
            unit = fqNames.d("Unit");
            charSequence = fqNames.d("CharSequence");
            string = fqNames.d("String");
            array = fqNames.d("Array");
            _boolean = fqNames.d("Boolean");
            _char = fqNames.d("Char");
            _byte = fqNames.d("Byte");
            _short = fqNames.d("Short");
            _int = fqNames.d("Int");
            _long = fqNames.d("Long");
            _float = fqNames.d("Float");
            _double = fqNames.d("Double");
            number = fqNames.d("Number");
            _enum = fqNames.d("Enum");
            functionSupertype = fqNames.d("Function");
            throwable = fqNames.c("Throwable");
            comparable = fqNames.c("Comparable");
            intRange = fqNames.e("IntRange");
            longRange = fqNames.e("LongRange");
            deprecated = fqNames.c("Deprecated");
            deprecatedSinceKotlin = fqNames.c("DeprecatedSinceKotlin");
            deprecationLevel = fqNames.c("DeprecationLevel");
            replaceWith = fqNames.c("ReplaceWith");
            extensionFunctionType = fqNames.c("ExtensionFunctionType");
            parameterName = fqNames.c("ParameterName");
            annotation = fqNames.c("Annotation");
            target = fqNames.a("Target");
            annotationTarget = fqNames.a("AnnotationTarget");
            annotationRetention = fqNames.a("AnnotationRetention");
            retention = fqNames.a("Retention");
            repeatable = fqNames.a("Repeatable");
            mustBeDocumented = fqNames.a("MustBeDocumented");
            unsafeVariance = fqNames.c("UnsafeVariance");
            publishedApi = fqNames.c("PublishedApi");
            iterator = fqNames.b("Iterator");
            iterable = fqNames.b("Iterable");
            collection = fqNames.b("Collection");
            list = fqNames.b("List");
            listIterator = fqNames.b("ListIterator");
            set = fqNames.b("Set");
            final b c = (map = fqNames.b("Map")).c(kotlin.reflect.jvm.internal.impl.name.e.i("Entry"));
            k0.o(c, "map.child(Name.identifier(\"Entry\"))");
            mapEntry = c;
            mutableIterator = fqNames.b("MutableIterator");
            mutableIterable = fqNames.b("MutableIterable");
            mutableCollection = fqNames.b("MutableCollection");
            mutableList = fqNames.b("MutableList");
            mutableListIterator = fqNames.b("MutableListIterator");
            mutableSet = fqNames.b("MutableSet");
            final b c2 = (mutableMap = fqNames.b("MutableMap")).c(kotlin.reflect.jvm.internal.impl.name.e.i("MutableEntry"));
            k0.o(c2, "mutableMap.child(Name.identifier(\"MutableEntry\"))");
            mutableMapEntry = c2;
            kClass = reflect("KClass");
            kCallable = reflect("KCallable");
            kProperty0 = reflect("KProperty0");
            kProperty1 = reflect("KProperty1");
            kProperty2 = reflect("KProperty2");
            kMutableProperty0 = reflect("KMutableProperty0");
            kMutableProperty1 = reflect("KMutableProperty1");
            kMutableProperty2 = reflect("KMutableProperty2");
            final kotlin.reflect.jvm.internal.impl.name.c c3 = kPropertyFqName = reflect("KProperty");
            kMutablePropertyFqName = reflect("KMutableProperty");
            final a m = a.m(c3.l());
            k0.o(m, "topLevel(kPropertyFqName.toSafe())");
            kProperty = m;
            kDeclarationContainer = reflect("KDeclarationContainer");
            final b b = uByteFqName = fqNames.c("UByte");
            final b b2 = uShortFqName = fqNames.c("UShort");
            final b b3 = uIntFqName = fqNames.c("UInt");
            final b b4 = uLongFqName = fqNames.c("ULong");
            final a i = a.m(b);
            k0.o(i, "topLevel(uByteFqName)");
            uByte = i;
            final a j = a.m(b2);
            k0.o(j, "topLevel(uShortFqName)");
            uShort = j;
            final a k = a.m(b3);
            k0.o(k, "topLevel(uIntFqName)");
            uInt = k;
            final a l = a.m(b4);
            k0.o(l, "topLevel(uLongFqName)");
            uLong = l;
            uByteArrayFqName = fqNames.c("UByteArray");
            uShortArrayFqName = fqNames.c("UShortArray");
            uIntArrayFqName = fqNames.c("UIntArray");
            uLongArrayFqName = fqNames.c("ULongArray");
            final HashSet f = kotlin.reflect.jvm.internal.impl.utils.a.f(PrimitiveType.values().length);
            final PrimitiveType[] values = PrimitiveType.values();
            final int length = values.length;
            final int n = 0;
            for (int n2 = 0; n2 < length; ++n2) {
                f.add(values[n2].getTypeName());
            }
            primitiveTypeShortNames = f;
            final HashSet f2 = kotlin.reflect.jvm.internal.impl.utils.a.f(PrimitiveType.values().length);
            final PrimitiveType[] values2 = PrimitiveType.values();
            for (int length2 = values2.length, n3 = 0; n3 < length2; ++n3) {
                f2.add(values2[n3].getArrayTypeName());
            }
            primitiveArrayTypeShortNames = f2;
            final HashMap e = kotlin.reflect.jvm.internal.impl.utils.a.e(PrimitiveType.values().length);
            final PrimitiveType[] values3 = PrimitiveType.values();
            final int length3 = values3.length;
            int n4 = 0;
            while (n4 < length3) {
                final PrimitiveType primitiveType = values3[n4];
                ++n4;
                final FqNames instance = FqNames.INSTANCE;
                final String d = primitiveType.getTypeName().d();
                k0.o(d, "primitiveType.typeName.asString()");
                e.put(instance.d(d), primitiveType);
            }
            fqNameToPrimitiveType = e;
            final HashMap e2 = kotlin.reflect.jvm.internal.impl.utils.a.e(PrimitiveType.values().length);
            final PrimitiveType[] values4 = PrimitiveType.values();
            final int length4 = values4.length;
            int n5 = n;
            while (n5 < length4) {
                final PrimitiveType primitiveType2 = values4[n5];
                ++n5;
                final FqNames instance2 = FqNames.INSTANCE;
                final String d2 = primitiveType2.getArrayTypeName().d();
                k0.o(d2, "primitiveType.arrayTypeName.asString()");
                e2.put(instance2.d(d2), primitiveType2);
            }
            arrayClassFqNameToPrimitiveType = e2;
        }
        
        private FqNames() {
        }
        
        private final b a(final String s) {
            final b c = StandardNames.ANNOTATION_PACKAGE_FQ_NAME.c(kotlin.reflect.jvm.internal.impl.name.e.i(s));
            k0.o(c, "ANNOTATION_PACKAGE_FQ_NAME.child(Name.identifier(simpleName))");
            return c;
        }
        
        private final b b(final String s) {
            final b c = StandardNames.COLLECTIONS_PACKAGE_FQ_NAME.c(kotlin.reflect.jvm.internal.impl.name.e.i(s));
            k0.o(c, "COLLECTIONS_PACKAGE_FQ_NAME.child(Name.identifier(simpleName))");
            return c;
        }
        
        private final b c(final String s) {
            final b c = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.c(kotlin.reflect.jvm.internal.impl.name.e.i(s));
            k0.o(c, "BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(simpleName))");
            return c;
        }
        
        private final kotlin.reflect.jvm.internal.impl.name.c d(final String s) {
            final kotlin.reflect.jvm.internal.impl.name.c j = this.c(s).j();
            k0.o(j, "fqName(simpleName).toUnsafe()");
            return j;
        }
        
        private final kotlin.reflect.jvm.internal.impl.name.c e(final String s) {
            final kotlin.reflect.jvm.internal.impl.name.c j = StandardNames.RANGES_PACKAGE_FQ_NAME.c(kotlin.reflect.jvm.internal.impl.name.e.i(s)).j();
            k0.o(j, "RANGES_PACKAGE_FQ_NAME.child(Name.identifier(simpleName)).toUnsafe()");
            return j;
        }
        
        @k
        @e
        public static final kotlin.reflect.jvm.internal.impl.name.c reflect(@e final String s) {
            k0.p(s, "simpleName");
            final kotlin.reflect.jvm.internal.impl.name.c j = StandardNames.KOTLIN_REFLECT_FQ_NAME.c(kotlin.reflect.jvm.internal.impl.name.e.i(s)).j();
            k0.o(j, "KOTLIN_REFLECT_FQ_NAME.child(Name.identifier(simpleName)).toUnsafe()");
            return j;
        }
    }
}
