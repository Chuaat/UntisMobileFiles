// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.inbox.details;

import org.jetbrains.annotations.f;
import m6.k;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.navigation.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\f\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00d6\u0003R\u0019\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a" }, d2 = { "Lcom/untis/mobile/messages/ui/inbox/details/MessageDetailsFragmentArgs;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "toBundle", "", "component1", "", "component2", "messageId", "messagePosition", "copy", "toString", "hashCode", "", "other", "", "equals", "I", "getMessagePosition", "()I", "Ljava/lang/String;", "getMessageId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;I)V", "Companion", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessageDetailsFragmentArgs implements l
{
    @e
    public static final Companion Companion;
    @e
    private final String messageId;
    private final int messagePosition;
    
    static {
        Companion = new Companion(null);
    }
    
    public MessageDetailsFragmentArgs(@e final String messageId, final int messagePosition) {
        k0.p(messageId, "messageId");
        this.messageId = messageId;
        this.messagePosition = messagePosition;
    }
    
    @k
    @e
    public static final MessageDetailsFragmentArgs fromBundle(@e final Bundle bundle) {
        return MessageDetailsFragmentArgs.Companion.fromBundle(bundle);
    }
    
    @e
    public final String component1() {
        return this.messageId;
    }
    
    public final int component2() {
        return this.messagePosition;
    }
    
    @e
    public final MessageDetailsFragmentArgs copy(@e final String s, final int n) {
        k0.p(s, "messageId");
        return new MessageDetailsFragmentArgs(s, n);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MessageDetailsFragmentArgs)) {
            return false;
        }
        final MessageDetailsFragmentArgs messageDetailsFragmentArgs = (MessageDetailsFragmentArgs)o;
        return k0.g(this.messageId, messageDetailsFragmentArgs.messageId) && this.messagePosition == messageDetailsFragmentArgs.messagePosition;
    }
    
    @e
    public final String getMessageId() {
        return this.messageId;
    }
    
    public final int getMessagePosition() {
        return this.messagePosition;
    }
    
    @Override
    public int hashCode() {
        return this.messageId.hashCode() * 31 + this.messagePosition;
    }
    
    @e
    public final Bundle toBundle() {
        final Bundle bundle = new Bundle();
        bundle.putString("messageId", this.messageId);
        bundle.putInt("messagePosition", this.messagePosition);
        return bundle;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MessageDetailsFragmentArgs(messageId=");
        sb.append(this.messageId);
        sb.append(", messagePosition=");
        sb.append(this.messagePosition);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "Lcom/untis/mobile/messages/ui/inbox/details/MessageDetailsFragmentArgs$Companion;", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/messages/ui/inbox/details/MessageDetailsFragmentArgs;", "fromBundle", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @k
        @e
        public final MessageDetailsFragmentArgs fromBundle(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(MessageDetailsFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("messageId")) {
                throw new IllegalArgumentException("Required argument \"messageId\" is missing and does not have an android:defaultValue");
            }
            final String string = bundle.getString("messageId");
            if (string != null) {
                int int1;
                if (bundle.containsKey("messagePosition")) {
                    int1 = bundle.getInt("messagePosition");
                }
                else {
                    int1 = -1;
                }
                return new MessageDetailsFragmentArgs(string, int1);
            }
            throw new IllegalArgumentException("Argument \"messageId\" is marked as non-null but was passed a null value.");
        }
    }
}
