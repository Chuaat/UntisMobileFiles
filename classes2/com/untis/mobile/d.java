// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile;

import java.io.Serializable;
import android.os.Parcelable;
import org.jetbrains.annotations.f;
import m6.k;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.messages.util.SendMessageTypes;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.navigation.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \r2\u00020\u0001:\u0001\u0005B#\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\bH\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f" }, d2 = { "Lcom/untis/mobile/d;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "i", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "a", "", "b", "", "c", "sendMessageTo", "allowRequestReadConfirmation", "recipientSearchMaxResult", "d", "", "toString", "hashCode", "", "other", "equals", "Z", "f", "()Z", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "h", "()Lcom/untis/mobile/messages/util/SendMessageTypes;", "I", "g", "()I", "<init>", "(Lcom/untis/mobile/messages/util/SendMessageTypes;ZI)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d implements l
{
    @e
    public static final a d;
    @e
    private final SendMessageTypes a;
    private final boolean b;
    private final int c;
    
    static {
        d = new a(null);
    }
    
    public d(@e final SendMessageTypes a, final boolean b, final int c) {
        k0.p(a, "sendMessageTo");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @k
    @e
    public static final d fromBundle(@e final Bundle bundle) {
        return com.untis.mobile.d.d.a(bundle);
    }
    
    @e
    public final SendMessageTypes a() {
        return this.a;
    }
    
    public final boolean b() {
        return this.b;
    }
    
    public final int c() {
        return this.c;
    }
    
    @e
    public final d d(@e final SendMessageTypes sendMessageTypes, final boolean b, final int n) {
        k0.p(sendMessageTypes, "sendMessageTo");
        return new d(sendMessageTypes, b, n);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        return this.a == d.a && this.b == d.b && this.c == d.c;
    }
    
    public final boolean f() {
        return this.b;
    }
    
    public final int g() {
        return this.c;
    }
    
    @e
    public final SendMessageTypes h() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        return (hashCode * 31 + b) * 31 + this.c;
    }
    
    @e
    public final Bundle i() {
        final Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(SendMessageTypes.class)) {
            bundle.putParcelable("sendMessageTo", (Parcelable)this.a);
        }
        else {
            if (!Serializable.class.isAssignableFrom(SendMessageTypes.class)) {
                throw new UnsupportedOperationException(k0.C(SendMessageTypes.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("sendMessageTo", (Serializable)this.a);
        }
        bundle.putBoolean("allowRequestReadConfirmation", this.b);
        bundle.putInt("recipientSearchMaxResult", this.c);
        return bundle;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SendMessageNavigationArgs(sendMessageTo=");
        sb.append(this.a);
        sb.append(", allowRequestReadConfirmation=");
        sb.append(this.b);
        sb.append(", recipientSearchMaxResult=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "com/untis/mobile/d$a", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/d;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final d a(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(d.class.getClassLoader());
            if (!bundle.containsKey("sendMessageTo")) {
                throw new IllegalArgumentException("Required argument \"sendMessageTo\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(SendMessageTypes.class) && !Serializable.class.isAssignableFrom(SendMessageTypes.class)) {
                throw new UnsupportedOperationException(k0.C(SendMessageTypes.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            final SendMessageTypes sendMessageTypes = (SendMessageTypes)bundle.get("sendMessageTo");
            if (sendMessageTypes != null) {
                final boolean b = bundle.containsKey("allowRequestReadConfirmation") && bundle.getBoolean("allowRequestReadConfirmation");
                int int1;
                if (bundle.containsKey("recipientSearchMaxResult")) {
                    int1 = bundle.getInt("recipientSearchMaxResult");
                }
                else {
                    int1 = -1;
                }
                return new d(sendMessageTypes, b, int1);
            }
            throw new IllegalArgumentException("Argument \"sendMessageTo\" is marked as non-null but was passed a null value.");
        }
    }
}
