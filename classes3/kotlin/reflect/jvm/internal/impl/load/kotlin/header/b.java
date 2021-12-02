// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.load.java.y;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import org.jetbrains.annotations.e;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.c;
import kotlin.reflect.jvm.internal.impl.name.a;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;

public class b implements o.c
{
    private static final boolean j;
    private static final Map<kotlin.reflect.jvm.internal.impl.name.a, kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a> k;
    private int[] a;
    private kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.c b;
    private String c;
    private int d;
    private String e;
    private String[] f;
    private String[] g;
    private String[] h;
    private kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a i;
    
    static {
        j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        final HashMap<kotlin.reflect.jvm.internal.impl.name.a, kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a> i = new HashMap<kotlin.reflect.jvm.internal.impl.name.a, kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a>();
        (k = i).put(kotlin.reflect.jvm.internal.impl.name.a.m(new b("kotlin.jvm.internal.KotlinClass")), kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a.K);
        i.put(kotlin.reflect.jvm.internal.impl.name.a.m(new b("kotlin.jvm.internal.KotlinFileFacade")), kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a.L);
        i.put(kotlin.reflect.jvm.internal.impl.name.a.m(new b("kotlin.jvm.internal.KotlinMultifileClass")), kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a.N);
        i.put(kotlin.reflect.jvm.internal.impl.name.a.m(new b("kotlin.jvm.internal.KotlinMultifileClassPart")), kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a.O);
        i.put(kotlin.reflect.jvm.internal.impl.name.a.m(new b("kotlin.jvm.internal.KotlinSyntheticClass")), kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a.M);
    }
    
    public b() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 0;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }
    
    private static /* synthetic */ void d(final int n) {
        final Object[] args = new Object[3];
        if (n != 1) {
            args[0] = "classId";
        }
        else {
            args[0] = "source";
        }
        args[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        args[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
    }
    
    private boolean o() {
        final kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a i = this.i;
        return i == kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a.K || i == kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a.L || i == kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a.O;
    }
    
    @Override
    public void a() {
    }
    
    @f
    @Override
    public a b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a a, @org.jetbrains.annotations.e final w0 w0) {
        if (a == null) {
            d(0);
        }
        if (w0 == null) {
            d(1);
        }
        if (a.b().equals(y.a)) {
            return new c();
        }
        if (kotlin.reflect.jvm.internal.impl.load.kotlin.header.b.j) {
            return null;
        }
        if (this.i != null) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a i = kotlin.reflect.jvm.internal.impl.load.kotlin.header.b.k.get(a);
        if (i != null) {
            this.i = i;
            return new d();
        }
        return null;
    }
    
    @f
    public kotlin.reflect.jvm.internal.impl.load.kotlin.header.a n() {
        if (this.i != null && this.a != null) {
            final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f f = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f(this.a, (this.d & 0x8) != 0x0);
            if (!f.h()) {
                this.h = this.f;
                this.f = null;
            }
            else if (this.o() && this.f == null) {
                return null;
            }
            final kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a i = this.i;
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.c c = this.b;
            if (c == null) {
                c = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.c.h;
            }
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.a(i, f, c, this.f, this.h, this.g, this.c, this.d, this.e);
        }
        return null;
    }
    
    private abstract static class b implements o.b
    {
        private final List<String> a;
        
        public b() {
            this.a = new ArrayList<String>();
        }
        
        private static /* synthetic */ void e(final int n) {
            final Object[] args = new Object[3];
            if (n != 1) {
                if (n != 2) {
                    args[0] = "enumClassId";
                }
                else {
                    args[0] = "classLiteralValue";
                }
            }
            else {
                args[0] = "enumEntryName";
            }
            args[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (n != 2) {
                args[2] = "visitEnum";
            }
            else {
                args[2] = "visitClassLiteral";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
        }
        
        @Override
        public void a() {
            this.f(this.a.toArray(new String[0]));
        }
        
        @Override
        public void b(@f final Object o) {
            if (o instanceof String) {
                this.a.add((String)o);
            }
        }
        
        @Override
        public void c(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a a, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
            if (a == null) {
                e(0);
            }
            if (e == null) {
                e(1);
            }
        }
        
        @Override
        public void d(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.constants.f f) {
            if (f == null) {
                e(2);
            }
        }
        
        protected abstract void f(@org.jetbrains.annotations.e final String[] p0);
    }
    
    private class c implements a
    {
        private static /* synthetic */ void g(final int n) {
            final Object[] args = new Object[3];
            if (n != 1) {
                if (n != 7) {
                    if (n != 4) {
                        if (n != 5) {
                            args[0] = "name";
                        }
                        else {
                            args[0] = "enumEntryName";
                        }
                    }
                    else {
                        args[0] = "enumClassId";
                    }
                }
                else {
                    args[0] = "classId";
                }
            }
            else {
                args[0] = "classLiteralValue";
            }
            args[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            switch (n) {
                default: {
                    args[2] = "visitClassLiteral";
                    break;
                }
                case 6:
                case 7: {
                    args[2] = "visitAnnotation";
                    break;
                }
                case 3:
                case 4:
                case 5: {
                    args[2] = "visitEnum";
                    break;
                }
                case 2: {
                    args[2] = "visitArray";
                    break;
                }
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
        }
        
        @org.jetbrains.annotations.e
        private o.b h() {
            return new b() {
                private static /* synthetic */ void e(final int n) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
                }
                
                @Override
                protected void f(@org.jetbrains.annotations.e final String[] array) {
                    if (array == null) {
                        e(0);
                    }
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.b.this.f = array;
                }
            };
        }
        
        @org.jetbrains.annotations.e
        private o.b i() {
            return new b() {
                private static /* synthetic */ void e(final int n) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
                }
                
                @Override
                protected void f(@org.jetbrains.annotations.e final String[] array) {
                    if (array == null) {
                        e(0);
                    }
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.b.this.g = array;
                }
            };
        }
        
        @Override
        public void a() {
        }
        
        @Override
        public void b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.constants.f f) {
            if (e == null) {
                g(0);
            }
            if (f == null) {
                g(1);
            }
        }
        
        @Override
        public void c(@f final kotlin.reflect.jvm.internal.impl.name.e e, @f final Object o) {
            if (e == null) {
                return;
            }
            final String d = e.d();
            if ("k".equals(d)) {
                if (o instanceof Integer) {
                    b.this.i = kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a.d((int)o);
                }
            }
            else if ("mv".equals(d)) {
                if (o instanceof int[]) {
                    b.this.a = (int[])o;
                }
            }
            else if ("bv".equals(d)) {
                if (o instanceof int[]) {
                    b.this.b = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.c((int[])o);
                }
            }
            else if ("xs".equals(d)) {
                if (o instanceof String) {
                    b.this.c = (String)o;
                }
            }
            else if ("xi".equals(d)) {
                if (o instanceof Integer) {
                    b.this.d = (int)o;
                }
            }
            else if ("pn".equals(d) && o instanceof String) {
                b.this.e = (String)o;
            }
        }
        
        @Override
        public void d(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a a, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e2) {
            if (e == null) {
                g(3);
            }
            if (a == null) {
                g(4);
            }
            if (e2 == null) {
                g(5);
            }
        }
        
        @f
        @Override
        public a e(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a a) {
            if (e == null) {
                g(6);
            }
            if (a == null) {
                g(7);
            }
            return null;
        }
        
        @f
        @Override
        public o.b f(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
            if (e == null) {
                g(2);
            }
            final String d = e.d();
            if ("d1".equals(d)) {
                return this.h();
            }
            if ("d2".equals(d)) {
                return this.i();
            }
            return null;
        }
    }
    
    private class d implements a
    {
        private static /* synthetic */ void g(final int n) {
            final Object[] args = new Object[3];
            if (n != 1) {
                if (n != 7) {
                    if (n != 4) {
                        if (n != 5) {
                            args[0] = "name";
                        }
                        else {
                            args[0] = "enumEntryName";
                        }
                    }
                    else {
                        args[0] = "enumClassId";
                    }
                }
                else {
                    args[0] = "classId";
                }
            }
            else {
                args[0] = "classLiteralValue";
            }
            args[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            switch (n) {
                default: {
                    args[2] = "visitClassLiteral";
                    break;
                }
                case 6:
                case 7: {
                    args[2] = "visitAnnotation";
                    break;
                }
                case 3:
                case 4:
                case 5: {
                    args[2] = "visitEnum";
                    break;
                }
                case 2: {
                    args[2] = "visitArray";
                    break;
                }
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
        }
        
        @org.jetbrains.annotations.e
        private o.b h() {
            return new b() {
                private static /* synthetic */ void e(final int n) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
                }
                
                @Override
                protected void f(@org.jetbrains.annotations.e final String[] array) {
                    if (array == null) {
                        e(0);
                    }
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.b.this.f = array;
                }
            };
        }
        
        @org.jetbrains.annotations.e
        private o.b i() {
            return new b() {
                private static /* synthetic */ void e(final int n) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
                }
                
                @Override
                protected void f(@org.jetbrains.annotations.e final String[] array) {
                    if (array == null) {
                        e(0);
                    }
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.b.this.g = array;
                }
            };
        }
        
        @Override
        public void a() {
        }
        
        @Override
        public void b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.constants.f f) {
            if (e == null) {
                g(0);
            }
            if (f == null) {
                g(1);
            }
        }
        
        @Override
        public void c(@f final kotlin.reflect.jvm.internal.impl.name.e e, @f final Object o) {
            if (e == null) {
                return;
            }
            final String d = e.d();
            if ("version".equals(d)) {
                if (o instanceof int[]) {
                    final b a = b.this;
                    final int[] array = (int[])o;
                    a.a = array;
                    if (b.this.b == null) {
                        b.this.b = new c(array);
                    }
                }
            }
            else if ("multifileClassName".equals(d)) {
                final b a2 = b.this;
                String s;
                if (o instanceof String) {
                    s = (String)o;
                }
                else {
                    s = null;
                }
                a2.c = s;
            }
        }
        
        @Override
        public void d(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a a, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e2) {
            if (e == null) {
                g(3);
            }
            if (a == null) {
                g(4);
            }
            if (e2 == null) {
                g(5);
            }
        }
        
        @f
        @Override
        public a e(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a a) {
            if (e == null) {
                g(6);
            }
            if (a == null) {
                g(7);
            }
            return null;
        }
        
        @f
        @Override
        public o.b f(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
            if (e == null) {
                g(2);
            }
            final String d = e.d();
            if ("data".equals(d) || "filePartClassNames".equals(d)) {
                return this.h();
            }
            if ("strings".equals(d)) {
                return this.i();
            }
            return null;
        }
    }
}
