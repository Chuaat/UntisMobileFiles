// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile;

import java.io.Serializable;
import android.os.Parcelable;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import com.untis.mobile.messages.util.SendMessageTypes;
import androidx.navigation.d0;
import kotlin.jvm.internal.w;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006" }, d2 = { "Lcom/untis/mobile/e;", "", "<init>", "()V", "a", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e
{
    @org.jetbrains.annotations.e
    public static final b a;
    
    static {
        a = new b(null);
    }
    
    private e() {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\t\u0010\n\u001a\u00020\bH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0002H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003R\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$" }, d2 = { "com/untis/mobile/e$a", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "a", "", "b", "c", "d", "sendMessageTo", "allowRequestReadConfirmation", "fromSendEditorFragment", "recipientSearchMaxResult", "Lcom/untis/mobile/e$a;", "e", "", "toString", "hashCode", "", "other", "equals", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "j", "()Lcom/untis/mobile/messages/util/SendMessageTypes;", "Z", "h", "()Z", "g", "I", "i", "()I", "<init>", "(Lcom/untis/mobile/messages/util/SendMessageTypes;ZZI)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class a implements d0
    {
        @org.jetbrains.annotations.e
        private final SendMessageTypes a;
        private final boolean b;
        private final boolean c;
        private final int d;
        
        public a(@org.jetbrains.annotations.e final SendMessageTypes a, final boolean b, final boolean c, final int d) {
            k0.p(a, "sendMessageTo");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @org.jetbrains.annotations.e
        public final SendMessageTypes a() {
            return this.a;
        }
        
        public final boolean b() {
            return this.b;
        }
        
        public final boolean c() {
            return this.c;
        }
        
        public final int d() {
            return this.d;
        }
        
        @org.jetbrains.annotations.e
        public final a e(@org.jetbrains.annotations.e final SendMessageTypes sendMessageTypes, final boolean b, final boolean b2, final int n) {
            k0.p(sendMessageTypes, "sendMessageTo");
            return new a(sendMessageTypes, b, b2, n);
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
            return this.a == a.a && this.b == a.b && this.c == a.c && this.d == a.d;
        }
        
        public final boolean g() {
            return this.b;
        }
        
        public int getActionId() {
            return 2131296360;
        }
        
        @org.jetbrains.annotations.e
        public Bundle getArguments() {
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
            bundle.putBoolean("fromSendEditorFragment", this.c);
            bundle.putInt("recipientSearchMaxResult", this.d);
            return bundle;
        }
        
        public final boolean h() {
            return this.c;
        }
        
        @Override
        public int hashCode() {
            final int hashCode = this.a.hashCode();
            final int b = this.b ? 1 : 0;
            int n = 1;
            int n2 = b;
            if (b != 0) {
                n2 = 1;
            }
            final int c = this.c ? 1 : 0;
            if (c == 0) {
                n = c;
            }
            return ((hashCode * 31 + n2) * 31 + n) * 31 + this.d;
        }
        
        public final int i() {
            return this.d;
        }
        
        @org.jetbrains.annotations.e
        public final SendMessageTypes j() {
            return this.a;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionGlobalMessageRecipientsSelectFragment(sendMessageTo=");
            sb.append(this.a);
            sb.append(", allowRequestReadConfirmation=");
            sb.append(this.b);
            sb.append(", fromSendEditorFragment=");
            sb.append(this.c);
            sb.append(", recipientSearchMaxResult=");
            sb.append(this.d);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007¨\u0006\r" }, d2 = { "com/untis/mobile/e$b", "", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "sendMessageTo", "", "allowRequestReadConfirmation", "fromSendEditorFragment", "", "recipientSearchMaxResult", "Landroidx/navigation/d0;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class b
    {
        private b() {
        }
        
        @org.jetbrains.annotations.e
        public final d0 a(@org.jetbrains.annotations.e final SendMessageTypes sendMessageTypes, final boolean b, final boolean b2, final int n) {
            k0.p(sendMessageTypes, "sendMessageTo");
            return (d0)new a(sendMessageTypes, b, b2, n);
        }
    }
}
