// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.Closeable;
import kotlin.io.c;
import kotlin.jvm.internal.k0;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.o;

public final class b extends o implements BuiltInsPackageFragment
{
    @e
    public static final a T;
    private final boolean S;
    
    static {
        T = new a(null);
    }
    
    private b(final kotlin.reflect.jvm.internal.impl.name.b b, final kotlin.reflect.jvm.internal.impl.storage.n n, final e0 e0, final kotlin.reflect.jvm.internal.impl.metadata.a.m m, final kotlin.reflect.jvm.internal.impl.metadata.builtins.a a, final boolean s) {
        super(b, n, e0, m, a, null);
        this.S = s;
    }
    
    public static final class a
    {
        private a() {
        }
        
        @e
        public final b a(@e final kotlin.reflect.jvm.internal.impl.name.b b, @e final kotlin.reflect.jvm.internal.impl.storage.n n, @e final e0 e0, @e final InputStream inputStream, final boolean b2) {
            k0.p((Object)b, "fqName");
            k0.p((Object)n, "storageManager");
            k0.p((Object)e0, "module");
            k0.p((Object)inputStream, "inputStream");
            try {
                final kotlin.reflect.jvm.internal.impl.metadata.builtins.a a = kotlin.reflect.jvm.internal.impl.metadata.builtins.a.g.a(inputStream);
                if (a == null) {
                    k0.S("version");
                    throw null;
                }
                if (a.h()) {
                    final kotlin.reflect.jvm.internal.impl.metadata.a.m y = kotlin.reflect.jvm.internal.impl.metadata.a.m.Y(inputStream, kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.n.e());
                    c.a((Closeable)inputStream, (Throwable)null);
                    k0.o((Object)y, "proto");
                    return new b(b, n, e0, y, a, b2, null);
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Kotlin built-in definition format version is not supported: expected ");
                sb.append(kotlin.reflect.jvm.internal.impl.metadata.builtins.a.h);
                sb.append(", actual ");
                sb.append(a);
                sb.append(". Please update Kotlin");
                throw new UnsupportedOperationException(sb.toString());
            }
            finally {
                try {}
                finally {
                    c.a((Closeable)inputStream, (Throwable)b);
                }
            }
        }
    }
}
