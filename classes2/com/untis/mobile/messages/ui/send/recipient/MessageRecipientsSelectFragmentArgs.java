// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.send.recipient;

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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B-\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b \u0010!J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J1\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\tH\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\r\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#" }, d2 = { "Lcom/untis/mobile/messages/ui/send/recipient/MessageRecipientsSelectFragmentArgs;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "toBundle", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "component1", "", "component2", "component3", "", "component4", "sendMessageTo", "allowRequestReadConfirmation", "fromSendEditorFragment", "recipientSearchMaxResult", "copy", "", "toString", "hashCode", "", "other", "equals", "I", "getRecipientSearchMaxResult", "()I", "Z", "getFromSendEditorFragment", "()Z", "getAllowRequestReadConfirmation", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "getSendMessageTo", "()Lcom/untis/mobile/messages/util/SendMessageTypes;", "<init>", "(Lcom/untis/mobile/messages/util/SendMessageTypes;ZZI)V", "Companion", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessageRecipientsSelectFragmentArgs implements l
{
    @e
    public static final Companion Companion;
    private final boolean allowRequestReadConfirmation;
    private final boolean fromSendEditorFragment;
    private final int recipientSearchMaxResult;
    @e
    private final SendMessageTypes sendMessageTo;
    
    static {
        Companion = new Companion(null);
    }
    
    public MessageRecipientsSelectFragmentArgs(@e final SendMessageTypes sendMessageTo, final boolean allowRequestReadConfirmation, final boolean fromSendEditorFragment, final int recipientSearchMaxResult) {
        k0.p(sendMessageTo, "sendMessageTo");
        this.sendMessageTo = sendMessageTo;
        this.allowRequestReadConfirmation = allowRequestReadConfirmation;
        this.fromSendEditorFragment = fromSendEditorFragment;
        this.recipientSearchMaxResult = recipientSearchMaxResult;
    }
    
    @k
    @e
    public static final MessageRecipientsSelectFragmentArgs fromBundle(@e final Bundle bundle) {
        return MessageRecipientsSelectFragmentArgs.Companion.fromBundle(bundle);
    }
    
    @e
    public final SendMessageTypes component1() {
        return this.sendMessageTo;
    }
    
    public final boolean component2() {
        return this.allowRequestReadConfirmation;
    }
    
    public final boolean component3() {
        return this.fromSendEditorFragment;
    }
    
    public final int component4() {
        return this.recipientSearchMaxResult;
    }
    
    @e
    public final MessageRecipientsSelectFragmentArgs copy(@e final SendMessageTypes sendMessageTypes, final boolean b, final boolean b2, final int n) {
        k0.p(sendMessageTypes, "sendMessageTo");
        return new MessageRecipientsSelectFragmentArgs(sendMessageTypes, b, b2, n);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MessageRecipientsSelectFragmentArgs)) {
            return false;
        }
        final MessageRecipientsSelectFragmentArgs messageRecipientsSelectFragmentArgs = (MessageRecipientsSelectFragmentArgs)o;
        return this.sendMessageTo == messageRecipientsSelectFragmentArgs.sendMessageTo && this.allowRequestReadConfirmation == messageRecipientsSelectFragmentArgs.allowRequestReadConfirmation && this.fromSendEditorFragment == messageRecipientsSelectFragmentArgs.fromSendEditorFragment && this.recipientSearchMaxResult == messageRecipientsSelectFragmentArgs.recipientSearchMaxResult;
    }
    
    public final boolean getAllowRequestReadConfirmation() {
        return this.allowRequestReadConfirmation;
    }
    
    public final boolean getFromSendEditorFragment() {
        return this.fromSendEditorFragment;
    }
    
    public final int getRecipientSearchMaxResult() {
        return this.recipientSearchMaxResult;
    }
    
    @e
    public final SendMessageTypes getSendMessageTo() {
        return this.sendMessageTo;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.sendMessageTo.hashCode();
        final int allowRequestReadConfirmation = this.allowRequestReadConfirmation ? 1 : 0;
        int n = 1;
        int n2 = allowRequestReadConfirmation;
        if (allowRequestReadConfirmation != 0) {
            n2 = 1;
        }
        final int fromSendEditorFragment = this.fromSendEditorFragment ? 1 : 0;
        if (fromSendEditorFragment == 0) {
            n = fromSendEditorFragment;
        }
        return ((hashCode * 31 + n2) * 31 + n) * 31 + this.recipientSearchMaxResult;
    }
    
    @e
    public final Bundle toBundle() {
        final Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(SendMessageTypes.class)) {
            bundle.putParcelable("sendMessageTo", (Parcelable)this.sendMessageTo);
        }
        else {
            if (!Serializable.class.isAssignableFrom(SendMessageTypes.class)) {
                throw new UnsupportedOperationException(k0.C(SendMessageTypes.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("sendMessageTo", (Serializable)this.sendMessageTo);
        }
        bundle.putBoolean("allowRequestReadConfirmation", this.allowRequestReadConfirmation);
        bundle.putBoolean("fromSendEditorFragment", this.fromSendEditorFragment);
        bundle.putInt("recipientSearchMaxResult", this.recipientSearchMaxResult);
        return bundle;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MessageRecipientsSelectFragmentArgs(sendMessageTo=");
        sb.append(this.sendMessageTo);
        sb.append(", allowRequestReadConfirmation=");
        sb.append(this.allowRequestReadConfirmation);
        sb.append(", fromSendEditorFragment=");
        sb.append(this.fromSendEditorFragment);
        sb.append(", recipientSearchMaxResult=");
        sb.append(this.recipientSearchMaxResult);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "Lcom/untis/mobile/messages/ui/send/recipient/MessageRecipientsSelectFragmentArgs$Companion;", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/messages/ui/send/recipient/MessageRecipientsSelectFragmentArgs;", "fromBundle", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @k
        @e
        public final MessageRecipientsSelectFragmentArgs fromBundle(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(MessageRecipientsSelectFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("sendMessageTo")) {
                throw new IllegalArgumentException("Required argument \"sendMessageTo\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(SendMessageTypes.class) && !Serializable.class.isAssignableFrom(SendMessageTypes.class)) {
                throw new UnsupportedOperationException(k0.C(SendMessageTypes.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            final SendMessageTypes sendMessageTypes = (SendMessageTypes)bundle.get("sendMessageTo");
            if (sendMessageTypes != null) {
                final boolean containsKey = bundle.containsKey("allowRequestReadConfirmation");
                boolean boolean1 = false;
                final boolean b = containsKey && bundle.getBoolean("allowRequestReadConfirmation");
                if (bundle.containsKey("fromSendEditorFragment")) {
                    boolean1 = bundle.getBoolean("fromSendEditorFragment");
                }
                int int1;
                if (bundle.containsKey("recipientSearchMaxResult")) {
                    int1 = bundle.getInt("recipientSearchMaxResult");
                }
                else {
                    int1 = -1;
                }
                return new MessageRecipientsSelectFragmentArgs(sendMessageTypes, b, boolean1, int1);
            }
            throw new IllegalArgumentException("Argument \"sendMessageTo\" is marked as non-null but was passed a null value.");
        }
    }
}
