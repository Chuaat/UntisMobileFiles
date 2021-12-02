// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.firebase.model;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import java.util.Map;
import org.jetbrains.annotations.e;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u0015\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003J)\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001J\t\u0010\n\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c" }, d2 = { "Lcom/untis/mobile/firebase/model/a;", "", "Lcom/untis/mobile/firebase/model/c;", "a", "", "", "b", "type", "payload", "c", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "g", "(Ljava/util/Map;)V", "Lcom/untis/mobile/firebase/model/c;", "f", "()Lcom/untis/mobile/firebase/model/c;", "h", "(Lcom/untis/mobile/firebase/model/c;)V", "<init>", "(Lcom/untis/mobile/firebase/model/c;Ljava/util/Map;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a
{
    @JsonAdapter(c.b.class)
    @SerializedName("type")
    @e
    private c a;
    @SerializedName("payload")
    @e
    private Map<String, String> b;
    
    public a(@e final c a, @e final Map<String, String> b) {
        k0.p(a, "type");
        k0.p(b, "payload");
        this.a = a;
        this.b = b;
    }
    
    @e
    public final c a() {
        return this.a;
    }
    
    @e
    public final Map<String, String> b() {
        return this.b;
    }
    
    @e
    public final a c(@e final c c, @e final Map<String, String> map) {
        k0.p(c, "type");
        k0.p(map, "payload");
        return new a(c, map);
    }
    
    @e
    public final Map<String, String> e() {
        return this.b;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return this.a == a.a && k0.g(this.b, a.b);
    }
    
    @e
    public final c f() {
        return this.a;
    }
    
    public final void g(@e final Map<String, String> b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
    
    public final void h(@e final c a) {
        k0.p(a, "<set-?>");
        this.a = a;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("FcmAction(type=");
        sb.append(this.a);
        sb.append(", payload=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
