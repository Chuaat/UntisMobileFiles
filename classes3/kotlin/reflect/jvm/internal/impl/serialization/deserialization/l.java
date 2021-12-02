// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import java.util.List;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.a;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.i;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.g;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.c;
import org.jetbrains.annotations.e;

public final class l
{
    @e
    private final j a;
    @e
    private final c b;
    @e
    private final m c;
    @e
    private final g d;
    @e
    private final i e;
    @e
    private final a f;
    @f
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g g;
    @e
    private final b0 h;
    @e
    private final u i;
    
    public l(@e final j a, @e final c b, @e final m c, @e final g d, @e final i e, @e final a f, @f final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g g, @f final b0 b2, @e final List<kotlin.reflect.jvm.internal.impl.metadata.a.s> list) {
        k0.p((Object)a, "components");
        k0.p((Object)b, "nameResolver");
        k0.p((Object)c, "containingDeclaration");
        k0.p((Object)d, "typeTable");
        k0.p((Object)e, "versionRequirementTable");
        k0.p((Object)f, "metadataVersion");
        k0.p((Object)list, "typeParameters");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        final StringBuilder sb = new StringBuilder();
        sb.append("Deserializer for \"");
        sb.append(((f0)c).getName());
        sb.append('\"');
        final String string = sb.toString();
        String c2 = null;
        Label_0153: {
            if (g != null) {
                c2 = g.c();
                if (c2 != null) {
                    break Label_0153;
                }
            }
            c2 = "[container not found]";
        }
        this.h = new b0(this, b2, list, string, c2, false, 32, null);
        this.i = new u(this);
    }
    
    @e
    public final l a(@e final m m, @e final List<kotlin.reflect.jvm.internal.impl.metadata.a.s> list, @e final c c, @e final g g, @e i e, @e final a a) {
        k0.p((Object)m, "descriptor");
        k0.p((Object)list, "typeParameterProtos");
        k0.p((Object)c, "nameResolver");
        k0.p((Object)g, "typeTable");
        k0.p((Object)e, "versionRequirementTable");
        k0.p((Object)a, "metadataVersion");
        final j a2 = this.a;
        if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.j.b(a)) {
            e = this.e;
        }
        return new l(a2, c, m, g, e, a, this.g, this.h, list);
    }
    
    @e
    public final j c() {
        return this.a;
    }
    
    @f
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g d() {
        return this.g;
    }
    
    @e
    public final m e() {
        return this.c;
    }
    
    @e
    public final u f() {
        return this.i;
    }
    
    @e
    public final c g() {
        return this.b;
    }
    
    @e
    public final n h() {
        return this.a.u();
    }
    
    @e
    public final b0 i() {
        return this.h;
    }
    
    @e
    public final g j() {
        return this.d;
    }
    
    @e
    public final i k() {
        return this.e;
    }
}
