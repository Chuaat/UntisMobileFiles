// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.send.editor;

import java.io.Serializable;
import android.os.Parcelable;
import m6.k;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.messages.util.SendMessageTypes;
import com.untis.mobile.messages.util.SendMessageActions;
import org.jetbrains.annotations.f;
import com.untis.mobile.messages.data.model.Message;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.navigation.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001+B9\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010\r\u001a\u00020\fH\u00c6\u0003J=\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0012\u001a\u00020\fH\u00c6\u0001J\t\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003R\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0012\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010(¨\u0006," }, d2 = { "Lcom/untis/mobile/messages/ui/send/editor/SendMessageEditorFragmentArgs;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "toBundle", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "component1", "", "component2", "", "component3", "Lcom/untis/mobile/messages/data/model/Message;", "component4", "Lcom/untis/mobile/messages/util/SendMessageActions;", "component5", "sendMessageTo", "allowRequestReadConfirmation", "recipientSearchMaxResult", "messageToReply", "sendMessageAction", "copy", "", "toString", "hashCode", "", "other", "equals", "I", "getRecipientSearchMaxResult", "()I", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "getSendMessageTo", "()Lcom/untis/mobile/messages/util/SendMessageTypes;", "Lcom/untis/mobile/messages/data/model/Message;", "getMessageToReply", "()Lcom/untis/mobile/messages/data/model/Message;", "Z", "getAllowRequestReadConfirmation", "()Z", "Lcom/untis/mobile/messages/util/SendMessageActions;", "getSendMessageAction", "()Lcom/untis/mobile/messages/util/SendMessageActions;", "<init>", "(Lcom/untis/mobile/messages/util/SendMessageTypes;ZILcom/untis/mobile/messages/data/model/Message;Lcom/untis/mobile/messages/util/SendMessageActions;)V", "Companion", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SendMessageEditorFragmentArgs implements l
{
    @e
    public static final Companion Companion;
    private final boolean allowRequestReadConfirmation;
    @f
    private final Message messageToReply;
    private final int recipientSearchMaxResult;
    @e
    private final SendMessageActions sendMessageAction;
    @e
    private final SendMessageTypes sendMessageTo;
    
    static {
        Companion = new Companion(null);
    }
    
    public SendMessageEditorFragmentArgs(@e final SendMessageTypes sendMessageTo, final boolean allowRequestReadConfirmation, final int recipientSearchMaxResult, @f final Message messageToReply, @e final SendMessageActions sendMessageAction) {
        k0.p(sendMessageTo, "sendMessageTo");
        k0.p(sendMessageAction, "sendMessageAction");
        this.sendMessageTo = sendMessageTo;
        this.allowRequestReadConfirmation = allowRequestReadConfirmation;
        this.recipientSearchMaxResult = recipientSearchMaxResult;
        this.messageToReply = messageToReply;
        this.sendMessageAction = sendMessageAction;
    }
    
    @k
    @e
    public static final SendMessageEditorFragmentArgs fromBundle(@e final Bundle bundle) {
        return SendMessageEditorFragmentArgs.Companion.fromBundle(bundle);
    }
    
    @e
    public final SendMessageTypes component1() {
        return this.sendMessageTo;
    }
    
    public final boolean component2() {
        return this.allowRequestReadConfirmation;
    }
    
    public final int component3() {
        return this.recipientSearchMaxResult;
    }
    
    @f
    public final Message component4() {
        return this.messageToReply;
    }
    
    @e
    public final SendMessageActions component5() {
        return this.sendMessageAction;
    }
    
    @e
    public final SendMessageEditorFragmentArgs copy(@e final SendMessageTypes sendMessageTypes, final boolean b, final int n, @f final Message message, @e final SendMessageActions sendMessageActions) {
        k0.p(sendMessageTypes, "sendMessageTo");
        k0.p(sendMessageActions, "sendMessageAction");
        return new SendMessageEditorFragmentArgs(sendMessageTypes, b, n, message, sendMessageActions);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SendMessageEditorFragmentArgs)) {
            return false;
        }
        final SendMessageEditorFragmentArgs sendMessageEditorFragmentArgs = (SendMessageEditorFragmentArgs)o;
        return this.sendMessageTo == sendMessageEditorFragmentArgs.sendMessageTo && this.allowRequestReadConfirmation == sendMessageEditorFragmentArgs.allowRequestReadConfirmation && this.recipientSearchMaxResult == sendMessageEditorFragmentArgs.recipientSearchMaxResult && k0.g(this.messageToReply, sendMessageEditorFragmentArgs.messageToReply) && this.sendMessageAction == sendMessageEditorFragmentArgs.sendMessageAction;
    }
    
    public final boolean getAllowRequestReadConfirmation() {
        return this.allowRequestReadConfirmation;
    }
    
    @f
    public final Message getMessageToReply() {
        return this.messageToReply;
    }
    
    public final int getRecipientSearchMaxResult() {
        return this.recipientSearchMaxResult;
    }
    
    @e
    public final SendMessageActions getSendMessageAction() {
        return this.sendMessageAction;
    }
    
    @e
    public final SendMessageTypes getSendMessageTo() {
        return this.sendMessageTo;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.sendMessageTo.hashCode();
        int allowRequestReadConfirmation;
        if ((allowRequestReadConfirmation = (this.allowRequestReadConfirmation ? 1 : 0)) != 0) {
            allowRequestReadConfirmation = 1;
        }
        final int recipientSearchMaxResult = this.recipientSearchMaxResult;
        final Message messageToReply = this.messageToReply;
        int hashCode2;
        if (messageToReply == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = messageToReply.hashCode();
        }
        return (((hashCode * 31 + allowRequestReadConfirmation) * 31 + recipientSearchMaxResult) * 31 + hashCode2) * 31 + this.sendMessageAction.hashCode();
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
        bundle.putInt("recipientSearchMaxResult", this.recipientSearchMaxResult);
        if (Parcelable.class.isAssignableFrom(Message.class)) {
            bundle.putParcelable("messageToReply", (Parcelable)this.messageToReply);
        }
        else if (Serializable.class.isAssignableFrom(Message.class)) {
            bundle.putSerializable("messageToReply", (Serializable)this.messageToReply);
        }
        if (Parcelable.class.isAssignableFrom(SendMessageActions.class)) {
            bundle.putParcelable("sendMessageAction", (Parcelable)this.sendMessageAction);
        }
        else if (Serializable.class.isAssignableFrom(SendMessageActions.class)) {
            bundle.putSerializable("sendMessageAction", (Serializable)this.sendMessageAction);
        }
        return bundle;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SendMessageEditorFragmentArgs(sendMessageTo=");
        sb.append(this.sendMessageTo);
        sb.append(", allowRequestReadConfirmation=");
        sb.append(this.allowRequestReadConfirmation);
        sb.append(", recipientSearchMaxResult=");
        sb.append(this.recipientSearchMaxResult);
        sb.append(", messageToReply=");
        sb.append(this.messageToReply);
        sb.append(", sendMessageAction=");
        sb.append(this.sendMessageAction);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "Lcom/untis/mobile/messages/ui/send/editor/SendMessageEditorFragmentArgs$Companion;", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/messages/ui/send/editor/SendMessageEditorFragmentArgs;", "fromBundle", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @k
        @e
        public final SendMessageEditorFragmentArgs fromBundle(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(SendMessageEditorFragmentArgs.class.getClassLoader());
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
                Message message;
                if (bundle.containsKey("messageToReply")) {
                    if (!Parcelable.class.isAssignableFrom(Message.class) && !Serializable.class.isAssignableFrom(Message.class)) {
                        throw new UnsupportedOperationException(k0.C(Message.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
                    }
                    message = (Message)bundle.get("messageToReply");
                }
                else {
                    message = null;
                }
                SendMessageActions send_MESSAGE;
                if (bundle.containsKey("sendMessageAction")) {
                    if (!Parcelable.class.isAssignableFrom(SendMessageActions.class) && !Serializable.class.isAssignableFrom(SendMessageActions.class)) {
                        throw new UnsupportedOperationException(k0.C(SendMessageActions.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
                    }
                    send_MESSAGE = (SendMessageActions)bundle.get("sendMessageAction");
                    if (send_MESSAGE == null) {
                        throw new IllegalArgumentException("Argument \"sendMessageAction\" is marked as non-null but was passed a null value.");
                    }
                }
                else {
                    send_MESSAGE = SendMessageActions.SEND_MESSAGE;
                }
                return new SendMessageEditorFragmentArgs(sendMessageTypes, b, int1, message, send_MESSAGE);
            }
            throw new IllegalArgumentException("Argument \"sendMessageTo\" is marked as non-null but was passed a null value.");
        }
    }
}
