// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.m0;
import n6.l;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Objects;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class v
{
    @e
    public static final v a;
    
    static {
        a = new v();
    }
    
    private v() {
    }
    
    private final String c(final String str) {
        String string = str;
        if (str.length() > 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append('L');
            sb.append(str);
            sb.append(';');
            string = sb.toString();
        }
        return string;
    }
    
    @e
    public final String[] b(@e final String... array) {
        k0.p((Object)array, "signatures");
        final ArrayList<String> list = new ArrayList<String>(array.length);
        for (final String str : array) {
            final StringBuilder sb = new StringBuilder();
            sb.append("<init>(");
            sb.append(str);
            sb.append(")V");
            list.add(sb.toString());
        }
        final String[] array2 = list.toArray(new String[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        return array2;
    }
    
    @e
    public final Set<String> d(@e final String str, @e final String... array) {
        k0.p((Object)str, "internalName");
        k0.p((Object)array, "signatures");
        final LinkedHashSet<String> set = new LinkedHashSet<String>();
        for (final String str2 : array) {
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('.');
            sb.append(str2);
            set.add(sb.toString());
        }
        return set;
    }
    
    @e
    public final Set<String> e(@e String h, @e final String... array) {
        k0.p((Object)h, "name");
        k0.p((Object)array, "signatures");
        h = this.h(h);
        final String[] array2 = new String[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        return this.d(h, array2);
    }
    
    @e
    public final Set<String> f(@e final String s, @e final String... array) {
        k0.p((Object)s, "name");
        k0.p((Object)array, "signatures");
        final String i = this.i(s);
        final String[] array2 = new String[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        return this.d(i, array2);
    }
    
    @e
    public final String g(@e final String s) {
        k0.p((Object)s, "name");
        return k0.C("java/util/function/", (Object)s);
    }
    
    @e
    public final String h(@e final String s) {
        k0.p((Object)s, "name");
        return k0.C("java/lang/", (Object)s);
    }
    
    @e
    public final String i(@e final String s) {
        k0.p((Object)s, "name");
        return k0.C("java/util/", (Object)s);
    }
    
    @e
    public final String j(@e final String str, @e final List<String> list, @e final String s) {
        k0.p((Object)str, "name");
        k0.p((Object)list, "parameters");
        k0.p((Object)s, "ret");
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(kotlin.collections.v.Z2((Iterable)list, (CharSequence)"", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)new l<String, CharSequence>() {
            @e
            public final CharSequence a(@e final String s) {
                k0.p((Object)s, "it");
                return v.this.c(s);
            }
        }, 30, (Object)null));
        sb.append(')');
        sb.append(this.c(s));
        return sb.toString();
    }
    
    @e
    public final String k(@e final String str, @e final String str2) {
        k0.p((Object)str, "internalName");
        k0.p((Object)str2, "jvmDescriptor");
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('.');
        sb.append(str2);
        return sb.toString();
    }
}
