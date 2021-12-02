// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import java.util.regex.Matcher;
import java.util.LinkedHashSet;
import p7.x;
import okhttp3.f0;
import p7.a;
import okhttp3.z;
import p7.q;
import p7.c;
import p7.j;
import p7.i;
import java.util.Map;
import java.lang.reflect.ParameterizedType;
import p7.t;
import java.net.URI;
import kotlin.coroutines.d;
import p7.e;
import p7.k;
import p7.m;
import p7.o;
import p7.n;
import p7.g;
import p7.f;
import p7.b;
import java.io.Serializable;
import java.util.Set;
import java.lang.reflect.Type;
import java.lang.annotation.Annotation;
import java.util.regex.Pattern;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import okhttp3.e0;
import okhttp3.y;
import okhttp3.v;
import c6.h;
import okhttp3.w;
import java.lang.reflect.Method;

final class s
{
    private final Method a;
    private final w b;
    final String c;
    @h
    private final String d;
    @h
    private final v e;
    @h
    private final y f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final p<?>[] j;
    final boolean k;
    
    s(final a a) {
        this.a = a.b;
        this.b = a.a.c;
        this.c = a.n;
        this.d = a.r;
        this.e = a.s;
        this.f = a.t;
        this.g = a.o;
        this.h = a.p;
        this.i = a.q;
        this.j = a.v;
        this.k = a.w;
    }
    
    static s b(final u u, final Method method) {
        return new a(u, method).b();
    }
    
    e0 a(final Object[] array) throws IOException {
        final p<?>[] j = this.j;
        final int length = array.length;
        if (length == j.length) {
            final r r = new r(this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i);
            int initialCapacity = length;
            if (this.k) {
                initialCapacity = length - 1;
            }
            final ArrayList list = new ArrayList<Object>(initialCapacity);
            for (int i = 0; i < initialCapacity; ++i) {
                list.add(array[i]);
                j[i].a(r, array[i]);
            }
            return r.k().z(l.class, new l(this.a, list)).b();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Argument count (");
        sb.append(length);
        sb.append(") doesn't match expected count (");
        sb.append(j.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
    
    static final class a
    {
        private static final String x = "[a-zA-Z][a-zA-Z0-9_-]*";
        private static final Pattern y;
        private static final Pattern z;
        final u a;
        final Method b;
        final Annotation[] c;
        final Annotation[][] d;
        final Type[] e;
        boolean f;
        boolean g;
        boolean h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;
        boolean m;
        @h
        String n;
        boolean o;
        boolean p;
        boolean q;
        @h
        String r;
        @h
        v s;
        @h
        y t;
        @h
        Set<String> u;
        @h
        p<?>[] v;
        boolean w;
        
        static {
            y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
            z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
        }
        
        a(final u a, final Method b) {
            this.a = a;
            this.b = b;
            this.c = b.getAnnotations();
            this.e = b.getGenericParameterTypes();
            this.d = b.getParameterAnnotations();
        }
        
        private static Class<?> a(final Class<?> clazz) {
            if (Boolean.TYPE == clazz) {
                return Boolean.class;
            }
            if (Byte.TYPE == clazz) {
                return Byte.class;
            }
            if (Character.TYPE == clazz) {
                return Character.class;
            }
            if (Double.TYPE == clazz) {
                return Double.class;
            }
            if (Float.TYPE == clazz) {
                return Float.class;
            }
            if (Integer.TYPE == clazz) {
                return Integer.class;
            }
            if (Long.TYPE == clazz) {
                return Long.class;
            }
            Serializable s;
            if (Short.TYPE == (s = clazz)) {
                s = Short.class;
            }
            return (Class<?>)s;
        }
        
        private v c(final String[] array) {
            final v.a a = new v.a();
            for (final String s : array) {
                final int index = s.indexOf(58);
                if (index == -1 || index == 0 || index == s.length() - 1) {
                    throw retrofit2.y.m(this.b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", s);
                }
                final String substring = s.substring(0, index);
                final String trim = s.substring(index + 1).trim();
                Label_0134: {
                    if ("Content-Type".equalsIgnoreCase(substring)) {
                        try {
                            this.t = okhttp3.y.h(trim);
                            break Label_0134;
                        }
                        catch (IllegalArgumentException ex) {
                            throw retrofit2.y.n(this.b, ex, "Malformed content type: %s", trim);
                        }
                    }
                    a.b(substring, trim);
                }
            }
            return a.i();
        }
        
        private void d(String substring, final String r, final boolean o) {
            final String n = this.n;
            if (n != null) {
                throw retrofit2.y.m(this.b, "Only one HTTP method is allowed. Found: %s and %s.", n, substring);
            }
            this.n = substring;
            this.o = o;
            if (r.isEmpty()) {
                return;
            }
            final int index = r.indexOf(63);
            if (index != -1 && index < r.length() - 1) {
                substring = r.substring(index + 1);
                if (retrofit2.s.a.y.matcher(substring).find()) {
                    throw retrofit2.y.m(this.b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.r = r;
            this.u = h(r);
        }
        
        private void e(final Annotation annotation) {
            String s = null;
            String s2 = null;
            Label_0020: {
                if (annotation instanceof b) {
                    s = ((b)annotation).value();
                    s2 = "DELETE";
                }
                else if (annotation instanceof f) {
                    s = ((f)annotation).value();
                    s2 = "GET";
                }
                else {
                    if (!(annotation instanceof g)) {
                        String s3;
                        String s4;
                        if (annotation instanceof n) {
                            s3 = ((n)annotation).value();
                            s4 = "PATCH";
                        }
                        else if (annotation instanceof o) {
                            s3 = ((o)annotation).value();
                            s4 = "POST";
                        }
                        else if (annotation instanceof p7.p) {
                            s3 = ((p7.p)annotation).value();
                            s4 = "PUT";
                        }
                        else {
                            if (annotation instanceof m) {
                                s = ((m)annotation).value();
                                s2 = "OPTIONS";
                                break Label_0020;
                            }
                            if (annotation instanceof p7.h) {
                                final p7.h h = (p7.h)annotation;
                                this.d(h.method(), h.path(), h.hasBody());
                                return;
                            }
                            if (annotation instanceof k) {
                                final String[] value = ((k)annotation).value();
                                if (value.length != 0) {
                                    this.s = this.c(value);
                                    return;
                                }
                                throw retrofit2.y.m(this.b, "@Headers annotation is empty.", new Object[0]);
                            }
                            else if (annotation instanceof p7.l) {
                                if (!this.p) {
                                    this.q = true;
                                    return;
                                }
                                throw retrofit2.y.m(this.b, "Only one encoding annotation is allowed.", new Object[0]);
                            }
                            else {
                                if (!(annotation instanceof e)) {
                                    return;
                                }
                                if (!this.q) {
                                    this.p = true;
                                    return;
                                }
                                throw retrofit2.y.m(this.b, "Only one encoding annotation is allowed.", new Object[0]);
                            }
                        }
                        this.d(s4, s3, true);
                        return;
                    }
                    s = ((g)annotation).value();
                    s2 = "HEAD";
                }
            }
            this.d(s2, s, false);
        }
        
        @h
        private p<?> f(final int n, final Type type, @h final Annotation[] array, final boolean b) {
            p<?> p5;
            if (array != null) {
                final int length = array.length;
                p<?> p4 = null;
                int n2 = 0;
                while (true) {
                    p5 = p4;
                    if (n2 >= length) {
                        break;
                    }
                    final p<?> g = this.g(n, type, array, array[n2]);
                    if (g != null) {
                        if (p4 != null) {
                            throw retrofit2.y.o(this.b, n, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        p4 = g;
                    }
                    ++n2;
                }
            }
            else {
                p5 = null;
            }
            if (p5 != null) {
                return p5;
            }
            Label_0107: {
                if (!b) {
                    break Label_0107;
                }
                try {
                    if (retrofit2.y.h(type) == d.class) {
                        this.w = true;
                        return null;
                    }
                    throw retrofit2.y.o(this.b, n, "No Retrofit annotation found.", new Object[0]);
                }
                catch (NoClassDefFoundError noClassDefFoundError) {
                    throw retrofit2.y.o(this.b, n, "No Retrofit annotation found.", new Object[0]);
                }
            }
        }
        
        @h
        private p<?> g(final int n, Type type, final Annotation[] array, final Annotation annotation) {
            if (annotation instanceof p7.y) {
                this.j(n, type);
                if (this.m) {
                    throw retrofit2.y.o(this.b, n, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.i) {
                    throw retrofit2.y.o(this.b, n, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.j) {
                    throw retrofit2.y.o(this.b, n, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.k) {
                    throw retrofit2.y.o(this.b, n, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.l) {
                    throw retrofit2.y.o(this.b, n, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.r != null) {
                    throw retrofit2.y.o(this.b, n, "@Url cannot be used with @%s URL", this.n);
                }
                this.m = true;
                if (type != w.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class)type).getName()))) {
                    throw retrofit2.y.o(this.b, n, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                }
                return new p.p(this.b, n);
            }
            else if (annotation instanceof p7.s) {
                this.j(n, type);
                if (this.j) {
                    throw retrofit2.y.o(this.b, n, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.k) {
                    throw retrofit2.y.o(this.b, n, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.l) {
                    throw retrofit2.y.o(this.b, n, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.m) {
                    throw retrofit2.y.o(this.b, n, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.r != null) {
                    this.i = true;
                    final p7.s s = (p7.s)annotation;
                    final String value = s.value();
                    this.i(n, value);
                    return new p.k<Object>(this.b, n, value, this.a.o(type, array), s.encoded());
                }
                throw retrofit2.y.o(this.b, n, "@Path can only be used with relative url on @%s", this.n);
            }
            else if (annotation instanceof t) {
                this.j(n, type);
                final t t = (t)annotation;
                final String value2 = t.value();
                final boolean encoded = t.encoded();
                final Class<?> h = retrofit2.y.h(type);
                this.j = true;
                if (Iterable.class.isAssignableFrom(h)) {
                    if (type instanceof ParameterizedType) {
                        type = retrofit2.y.g(0, (ParameterizedType)type);
                        return new p.l<Object>(value2, this.a.o(type, array), encoded).c();
                    }
                    final Method b = this.b;
                    final StringBuilder sb = new StringBuilder();
                    sb.append(h.getSimpleName());
                    sb.append(" must include generic type (e.g., ");
                    sb.append(h.getSimpleName());
                    sb.append("<String>)");
                    throw retrofit2.y.o(b, n, sb.toString(), new Object[0]);
                }
                else {
                    if (h.isArray()) {
                        return new p.l<Object>(value2, this.a.o(a(h.getComponentType()), array), encoded).b();
                    }
                    return new p.l<Object>(value2, this.a.o(type, array), encoded);
                }
            }
            else if (annotation instanceof p7.v) {
                this.j(n, type);
                final boolean encoded2 = ((p7.v)annotation).encoded();
                final Class<?> h2 = retrofit2.y.h(type);
                this.k = true;
                if (Iterable.class.isAssignableFrom(h2)) {
                    if (type instanceof ParameterizedType) {
                        type = retrofit2.y.g(0, (ParameterizedType)type);
                        return new p.n<Object>(this.a.o(type, array), encoded2).c();
                    }
                    final Method b2 = this.b;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(h2.getSimpleName());
                    sb2.append(" must include generic type (e.g., ");
                    sb2.append(h2.getSimpleName());
                    sb2.append("<String>)");
                    throw retrofit2.y.o(b2, n, sb2.toString(), new Object[0]);
                }
                else {
                    if (h2.isArray()) {
                        return new p.n<Object>(this.a.o(a(h2.getComponentType()), array), encoded2).b();
                    }
                    return new p.n<Object>(this.a.o(type, array), encoded2);
                }
            }
            else if (annotation instanceof p7.u) {
                this.j(n, type);
                final Class<?> h3 = retrofit2.y.h(type);
                this.l = true;
                if (!Map.class.isAssignableFrom(h3)) {
                    throw retrofit2.y.o(this.b, n, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                type = retrofit2.y.i(type, h3, Map.class);
                if (!(type instanceof ParameterizedType)) {
                    throw retrofit2.y.o(this.b, n, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                final ParameterizedType parameterizedType = (ParameterizedType)type;
                type = retrofit2.y.g(0, parameterizedType);
                if (String.class == type) {
                    type = retrofit2.y.g(1, parameterizedType);
                    return new p.m<Object>(this.b, n, this.a.o(type, array), ((p7.u)annotation).encoded());
                }
                final Method b3 = this.b;
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("@QueryMap keys must be of type String: ");
                sb3.append(type);
                throw retrofit2.y.o(b3, n, sb3.toString(), new Object[0]);
            }
            else if (annotation instanceof i) {
                this.j(n, type);
                final String value3 = ((i)annotation).value();
                final Class<?> h4 = retrofit2.y.h(type);
                if (Iterable.class.isAssignableFrom(h4)) {
                    if (type instanceof ParameterizedType) {
                        type = retrofit2.y.g(0, (ParameterizedType)type);
                        return new p.f<Object>(value3, this.a.o(type, array)).c();
                    }
                    final Method b4 = this.b;
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append(h4.getSimpleName());
                    sb4.append(" must include generic type (e.g., ");
                    sb4.append(h4.getSimpleName());
                    sb4.append("<String>)");
                    throw retrofit2.y.o(b4, n, sb4.toString(), new Object[0]);
                }
                else {
                    if (h4.isArray()) {
                        return new p.f<Object>(value3, this.a.o(a(h4.getComponentType()), array)).b();
                    }
                    return new p.f<Object>(value3, this.a.o(type, array));
                }
            }
            else if (annotation instanceof j) {
                if (type == v.class) {
                    return new p.h(this.b, n);
                }
                this.j(n, type);
                final Class<?> h5 = retrofit2.y.h(type);
                if (!Map.class.isAssignableFrom(h5)) {
                    throw retrofit2.y.o(this.b, n, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                type = retrofit2.y.i(type, h5, Map.class);
                if (!(type instanceof ParameterizedType)) {
                    throw retrofit2.y.o(this.b, n, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                final ParameterizedType parameterizedType2 = (ParameterizedType)type;
                type = retrofit2.y.g(0, parameterizedType2);
                if (String.class == type) {
                    type = retrofit2.y.g(1, parameterizedType2);
                    return new p.g<Object>(this.b, n, this.a.o(type, array));
                }
                final Method b5 = this.b;
                final StringBuilder sb5 = new StringBuilder();
                sb5.append("@HeaderMap keys must be of type String: ");
                sb5.append(type);
                throw retrofit2.y.o(b5, n, sb5.toString(), new Object[0]);
            }
            else if (annotation instanceof c) {
                this.j(n, type);
                if (!this.p) {
                    throw retrofit2.y.o(this.b, n, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                final c c = (c)annotation;
                final String value4 = c.value();
                final boolean encoded3 = c.encoded();
                this.f = true;
                final Class<?> h6 = retrofit2.y.h(type);
                if (Iterable.class.isAssignableFrom(h6)) {
                    if (type instanceof ParameterizedType) {
                        type = retrofit2.y.g(0, (ParameterizedType)type);
                        return new p.d<Object>(value4, this.a.o(type, array), encoded3).c();
                    }
                    final Method b6 = this.b;
                    final StringBuilder sb6 = new StringBuilder();
                    sb6.append(h6.getSimpleName());
                    sb6.append(" must include generic type (e.g., ");
                    sb6.append(h6.getSimpleName());
                    sb6.append("<String>)");
                    throw retrofit2.y.o(b6, n, sb6.toString(), new Object[0]);
                }
                else {
                    if (h6.isArray()) {
                        return new p.d<Object>(value4, this.a.o(a(h6.getComponentType()), array), encoded3).b();
                    }
                    return new p.d<Object>(value4, this.a.o(type, array), encoded3);
                }
            }
            else if (annotation instanceof p7.d) {
                this.j(n, type);
                if (!this.p) {
                    throw retrofit2.y.o(this.b, n, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                final Class<?> h7 = retrofit2.y.h(type);
                if (!Map.class.isAssignableFrom(h7)) {
                    throw retrofit2.y.o(this.b, n, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                type = retrofit2.y.i(type, h7, Map.class);
                if (!(type instanceof ParameterizedType)) {
                    throw retrofit2.y.o(this.b, n, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                final ParameterizedType parameterizedType3 = (ParameterizedType)type;
                type = retrofit2.y.g(0, parameterizedType3);
                if (String.class == type) {
                    type = retrofit2.y.g(1, parameterizedType3);
                    final retrofit2.f<?, String> o = this.a.o(type, array);
                    this.f = true;
                    return new p.e<Object>(this.b, n, (retrofit2.f<Object, String>)o, ((p7.d)annotation).encoded());
                }
                final Method b7 = this.b;
                final StringBuilder sb7 = new StringBuilder();
                sb7.append("@FieldMap keys must be of type String: ");
                sb7.append(type);
                throw retrofit2.y.o(b7, n, sb7.toString(), new Object[0]);
            }
            else if (annotation instanceof q) {
                this.j(n, type);
                if (!this.q) {
                    throw retrofit2.y.o(this.b, n, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                final q q = (q)annotation;
                this.g = true;
                final String value5 = q.value();
                final Class<?> h8 = retrofit2.y.h(type);
                if (value5.isEmpty()) {
                    if (Iterable.class.isAssignableFrom(h8)) {
                        if (!(type instanceof ParameterizedType)) {
                            final Method b8 = this.b;
                            final StringBuilder sb8 = new StringBuilder();
                            sb8.append(h8.getSimpleName());
                            sb8.append(" must include generic type (e.g., ");
                            sb8.append(h8.getSimpleName());
                            sb8.append("<String>)");
                            throw retrofit2.y.o(b8, n, sb8.toString(), new Object[0]);
                        }
                        if (z.c.class.isAssignableFrom(retrofit2.y.h(retrofit2.y.g(0, (ParameterizedType)type)))) {
                            return retrofit2.p.o.a.c();
                        }
                        throw retrofit2.y.o(this.b, n, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    else if (h8.isArray()) {
                        if (z.c.class.isAssignableFrom(h8.getComponentType())) {
                            return retrofit2.p.o.a.b();
                        }
                        throw retrofit2.y.o(this.b, n, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    else {
                        if (z.c.class.isAssignableFrom(h8)) {
                            return retrofit2.p.o.a;
                        }
                        throw retrofit2.y.o(this.b, n, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                }
                else {
                    final StringBuilder sb9 = new StringBuilder();
                    sb9.append("form-data; name=\"");
                    sb9.append(value5);
                    sb9.append("\"");
                    final v r = okhttp3.v.r("Content-Disposition", sb9.toString(), "Content-Transfer-Encoding", q.encoding());
                    if (Iterable.class.isAssignableFrom(h8)) {
                        if (!(type instanceof ParameterizedType)) {
                            final Method b9 = this.b;
                            final StringBuilder sb10 = new StringBuilder();
                            sb10.append(h8.getSimpleName());
                            sb10.append(" must include generic type (e.g., ");
                            sb10.append(h8.getSimpleName());
                            sb10.append("<String>)");
                            throw retrofit2.y.o(b9, n, sb10.toString(), new Object[0]);
                        }
                        type = retrofit2.y.g(0, (ParameterizedType)type);
                        if (!z.c.class.isAssignableFrom(retrofit2.y.h(type))) {
                            return new p.i<Object>(this.b, n, r, this.a.m(type, array, this.c)).c();
                        }
                        throw retrofit2.y.o(this.b, n, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    else if (h8.isArray()) {
                        final Class<?> a = a(h8.getComponentType());
                        if (!z.c.class.isAssignableFrom(a)) {
                            return new p.i<Object>(this.b, n, r, this.a.m(a, array, this.c)).b();
                        }
                        throw retrofit2.y.o(this.b, n, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    else {
                        if (!z.c.class.isAssignableFrom(h8)) {
                            return new p.i<Object>(this.b, n, r, this.a.m(type, array, this.c));
                        }
                        throw retrofit2.y.o(this.b, n, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                }
            }
            else if (annotation instanceof p7.r) {
                this.j(n, type);
                if (!this.q) {
                    throw retrofit2.y.o(this.b, n, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.g = true;
                final Class<?> h9 = retrofit2.y.h(type);
                if (!Map.class.isAssignableFrom(h9)) {
                    throw retrofit2.y.o(this.b, n, "@PartMap parameter type must be Map.", new Object[0]);
                }
                type = retrofit2.y.i(type, h9, Map.class);
                if (!(type instanceof ParameterizedType)) {
                    throw retrofit2.y.o(this.b, n, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                final ParameterizedType parameterizedType4 = (ParameterizedType)type;
                type = retrofit2.y.g(0, parameterizedType4);
                if (String.class != type) {
                    final Method b10 = this.b;
                    final StringBuilder sb11 = new StringBuilder();
                    sb11.append("@PartMap keys must be of type String: ");
                    sb11.append(type);
                    throw retrofit2.y.o(b10, n, sb11.toString(), new Object[0]);
                }
                type = retrofit2.y.g(1, parameterizedType4);
                if (!z.c.class.isAssignableFrom(retrofit2.y.h(type))) {
                    return new p.j<Object>(this.b, n, this.a.m(type, array, this.c), ((p7.r)annotation).encoding());
                }
                throw retrofit2.y.o(this.b, n, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
            }
            else if (annotation instanceof p7.a) {
                this.j(n, type);
                if (!this.p && !this.q) {
                    if (!this.h) {
                        try {
                            final retrofit2.f<?, f0> m = this.a.m(type, array, this.c);
                            this.h = true;
                            return new p.c<Object>(this.b, n, (retrofit2.f<Object, f0>)m);
                        }
                        catch (RuntimeException ex) {
                            throw retrofit2.y.p(this.b, ex, n, "Unable to create @Body converter for %s", type);
                        }
                    }
                    throw retrofit2.y.o(this.b, n, "Multiple @Body method annotations found.", new Object[0]);
                }
                throw retrofit2.y.o(this.b, n, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
            }
            else {
                if (annotation instanceof x) {
                    this.j(n, type);
                    final Class<?> h10 = retrofit2.y.h(type);
                    for (int i = n - 1; i >= 0; --i) {
                        final p<?> p4 = this.v[i];
                        if (p4 instanceof p.q && ((p.q)p4).a.equals(h10)) {
                            final Method b11 = this.b;
                            final StringBuilder sb12 = new StringBuilder();
                            sb12.append("@Tag type ");
                            sb12.append(h10.getName());
                            sb12.append(" is duplicate of parameter #");
                            sb12.append(i + 1);
                            sb12.append(" and would always overwrite its value.");
                            throw retrofit2.y.o(b11, n, sb12.toString(), new Object[0]);
                        }
                    }
                    return new p.q<Object>((Class<Object>)h10);
                }
                return null;
            }
        }
        
        static Set<String> h(final String input) {
            final Matcher matcher = a.y.matcher(input);
            final LinkedHashSet<String> set = new LinkedHashSet<String>();
            while (matcher.find()) {
                set.add(matcher.group(1));
            }
            return set;
        }
        
        private void i(final int n, final String input) {
            if (!retrofit2.s.a.z.matcher(input).matches()) {
                throw retrofit2.y.o(this.b, n, "@Path parameter name must match %s. Found: %s", retrofit2.s.a.y.pattern(), input);
            }
            if (this.u.contains(input)) {
                return;
            }
            throw retrofit2.y.o(this.b, n, "URL \"%s\" does not contain \"{%s}\".", this.r, input);
        }
        
        private void j(final int n, final Type type) {
            if (!retrofit2.y.j(type)) {
                return;
            }
            throw retrofit2.y.o(this.b, n, "Parameter type must not include a type variable or wildcard: %s", type);
        }
        
        s b() {
            final Annotation[] c = this.c;
            for (int length = c.length, i = 0; i < length; ++i) {
                this.e(c[i]);
            }
            if (this.n == null) {
                throw retrofit2.y.m(this.b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.o) {
                if (this.q) {
                    throw retrofit2.y.m(this.b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.p) {
                    throw retrofit2.y.m(this.b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            final int length2 = this.d.length;
            this.v = (p<?>[])new p[length2];
            int n = 0;
            while (true) {
                boolean b = true;
                if (n >= length2) {
                    break;
                }
                final p<?>[] v = this.v;
                final Type type = this.e[n];
                final Annotation[] array = this.d[n];
                if (n != length2 - 1) {
                    b = false;
                }
                v[n] = this.f(n, type, array, b);
                ++n;
            }
            if (this.r == null && !this.m) {
                throw retrofit2.y.m(this.b, "Missing either @%s URL or @Url parameter.", this.n);
            }
            final boolean p = this.p;
            if (!p && !this.q && !this.o && this.h) {
                throw retrofit2.y.m(this.b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (p && !this.f) {
                throw retrofit2.y.m(this.b, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (this.q && !this.g) {
                throw retrofit2.y.m(this.b, "Multipart method must contain at least one @Part.", new Object[0]);
            }
            return new s(this);
        }
    }
}
