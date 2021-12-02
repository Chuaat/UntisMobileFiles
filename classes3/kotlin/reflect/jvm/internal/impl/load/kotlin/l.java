// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.h0;
import kotlin.text.s;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.d;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.c;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import org.jetbrains.annotations.e;

final class l implements k<j>
{
    @e
    public static final l a;
    
    static {
        a = new l();
    }
    
    private l() {
    }
    
    @e
    public j g(@e final j j) {
        k0.p((Object)j, "possiblyPrimitiveType");
        j i = j;
        if (j instanceof j.d) {
            final j.d d = (j.d)j;
            i = j;
            if (d.i() != null) {
                final String f = c.c(d.i().j()).f();
                k0.o((Object)f, "byFqNameWithoutInnerClasses(possiblyPrimitiveType.jvmPrimitiveType.wrapperFqName).internalName");
                i = this.i(f);
            }
        }
        return i;
    }
    
    @e
    public j h(@e String s) {
        k0.p((Object)s, "representation");
        s.length();
        final char char1 = s.charAt(0);
        final d[] values = d.values();
        final int length = values.length;
        int i = 0;
        while (true) {
            while (i < length) {
                final d d = values[i];
                if (d.g().charAt(0) == char1) {
                    if (d == null) {
                        j j;
                        if (char1 == 'V') {
                            j = new j.d((d)null);
                        }
                        else if (char1 == '[') {
                            s = s.substring(1);
                            k0.o((Object)s, "(this as java.lang.String).substring(startIndex)");
                            j = new j.a(this.h(s));
                        }
                        else {
                            if (char1 == 'L') {
                                s.a3(s, ';', false, 2, null);
                            }
                            s = s.substring(1, s.length() - 1);
                            k0.o((Object)s, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                            j = new j.c(s);
                        }
                        return j;
                    }
                    return new j.d(d);
                }
                else {
                    ++i;
                }
            }
            final d d = null;
            continue;
        }
    }
    
    @e
    public j.c i(@e final String s) {
        k0.p((Object)s, "internalName");
        return new j.c(s);
    }
    
    @e
    public j j(@e final PrimitiveType primitiveType) {
        k0.p((Object)primitiveType, "primitiveType");
        j.d d = null;
        switch (l.a.a[((Enum)primitiveType).ordinal()]) {
            default: {
                throw new h0();
            }
            case 8: {
                d = j.a.d();
                break;
            }
            case 7: {
                d = j.a.g();
                break;
            }
            case 6: {
                d = j.a.e();
                break;
            }
            case 5: {
                d = j.a.f();
                break;
            }
            case 4: {
                d = j.a.h();
                break;
            }
            case 3: {
                d = j.a.b();
                break;
            }
            case 2: {
                d = j.a.c();
                break;
            }
            case 1: {
                d = j.a.a();
                break;
            }
        }
        return d;
    }
    
    @e
    public j k() {
        return this.i("java/lang/Class");
    }
    
    @e
    public String l(@e final j j) {
        k0.p((Object)j, "type");
        String s;
        if (j instanceof j.a) {
            s = k0.C("[", (Object)this.l(((j.a)j).i()));
        }
        else if (j instanceof j.d) {
            final d i = ((j.d)j).i();
            if (i == null || (s = i.g()) == null) {
                s = "V";
            }
        }
        else {
            if (!(j instanceof j.c)) {
                throw new h0();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append('L');
            sb.append(((j.c)j).i());
            sb.append(';');
            s = sb.toString();
        }
        return s;
    }
}
