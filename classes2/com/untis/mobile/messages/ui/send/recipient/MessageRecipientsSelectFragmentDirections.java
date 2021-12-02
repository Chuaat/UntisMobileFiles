// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.send.recipient;

import com.untis.mobile.messages.util.SendMessageActions;
import com.untis.mobile.messages.data.model.Message;
import java.io.Serializable;
import android.os.Parcelable;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import com.untis.mobile.messages.util.SendMessageTypes;
import androidx.navigation.d0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007" }, d2 = { "Lcom/untis/mobile/messages/ui/send/recipient/MessageRecipientsSelectFragmentDirections;", "", "<init>", "()V", "Companion", "ActionMessageRecipientsSelectFragmentToSearchRecipientFragment", "ActionMessageRecipientsSelectFragmentToSendMessageEditorFragment", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessageRecipientsSelectFragmentDirections
{
    @e
    public static final Companion Companion;
    
    static {
        Companion = new Companion(null);
    }
    
    private MessageRecipientsSelectFragmentDirections() {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\t\u0010\n\u001a\u00020\bH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0002H\u00c6\u0003J1\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003R\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#" }, d2 = { "Lcom/untis/mobile/messages/ui/send/recipient/MessageRecipientsSelectFragmentDirections$ActionMessageRecipientsSelectFragmentToSearchRecipientFragment;", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "component1", "", "component2", "component3", "component4", "recipientsType", "allowRequestReadConfirmation", "fromSendEditorFragment", "recipientSearchMaxResult", "copy", "", "toString", "hashCode", "", "other", "equals", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "getRecipientsType", "()Lcom/untis/mobile/messages/util/SendMessageTypes;", "Z", "getFromSendEditorFragment", "()Z", "getAllowRequestReadConfirmation", "I", "getRecipientSearchMaxResult", "()I", "<init>", "(Lcom/untis/mobile/messages/util/SendMessageTypes;ZZI)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class ActionMessageRecipientsSelectFragmentToSearchRecipientFragment implements d0
    {
        private final boolean allowRequestReadConfirmation;
        private final boolean fromSendEditorFragment;
        private final int recipientSearchMaxResult;
        @e
        private final SendMessageTypes recipientsType;
        
        public ActionMessageRecipientsSelectFragmentToSearchRecipientFragment() {
            this(null, false, false, 0, 15, null);
        }
        
        public ActionMessageRecipientsSelectFragmentToSearchRecipientFragment(@e final SendMessageTypes recipientsType, final boolean allowRequestReadConfirmation, final boolean fromSendEditorFragment, final int recipientSearchMaxResult) {
            k0.p(recipientsType, "recipientsType");
            this.recipientsType = recipientsType;
            this.allowRequestReadConfirmation = allowRequestReadConfirmation;
            this.fromSendEditorFragment = fromSendEditorFragment;
            this.recipientSearchMaxResult = recipientSearchMaxResult;
        }
        
        @e
        public final SendMessageTypes component1() {
            return this.recipientsType;
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
        public final ActionMessageRecipientsSelectFragmentToSearchRecipientFragment copy(@e final SendMessageTypes sendMessageTypes, final boolean b, final boolean b2, final int n) {
            k0.p(sendMessageTypes, "recipientsType");
            return new ActionMessageRecipientsSelectFragmentToSearchRecipientFragment(sendMessageTypes, b, b2, n);
        }
        
        @Override
        public boolean equals(@f final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof ActionMessageRecipientsSelectFragmentToSearchRecipientFragment)) {
                return false;
            }
            final ActionMessageRecipientsSelectFragmentToSearchRecipientFragment actionMessageRecipientsSelectFragmentToSearchRecipientFragment = (ActionMessageRecipientsSelectFragmentToSearchRecipientFragment)o;
            return this.recipientsType == actionMessageRecipientsSelectFragmentToSearchRecipientFragment.recipientsType && this.allowRequestReadConfirmation == actionMessageRecipientsSelectFragmentToSearchRecipientFragment.allowRequestReadConfirmation && this.fromSendEditorFragment == actionMessageRecipientsSelectFragmentToSearchRecipientFragment.fromSendEditorFragment && this.recipientSearchMaxResult == actionMessageRecipientsSelectFragmentToSearchRecipientFragment.recipientSearchMaxResult;
        }
        
        public int getActionId() {
            return 2131296365;
        }
        
        public final boolean getAllowRequestReadConfirmation() {
            return this.allowRequestReadConfirmation;
        }
        
        @e
        public Bundle getArguments() {
            final Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(SendMessageTypes.class)) {
                bundle.putParcelable("recipientsType", (Parcelable)this.recipientsType);
            }
            else if (Serializable.class.isAssignableFrom(SendMessageTypes.class)) {
                bundle.putSerializable("recipientsType", (Serializable)this.recipientsType);
            }
            bundle.putBoolean("allowRequestReadConfirmation", this.allowRequestReadConfirmation);
            bundle.putBoolean("fromSendEditorFragment", this.fromSendEditorFragment);
            bundle.putInt("recipientSearchMaxResult", this.recipientSearchMaxResult);
            return bundle;
        }
        
        public final boolean getFromSendEditorFragment() {
            return this.fromSendEditorFragment;
        }
        
        public final int getRecipientSearchMaxResult() {
            return this.recipientSearchMaxResult;
        }
        
        @e
        public final SendMessageTypes getRecipientsType() {
            return this.recipientsType;
        }
        
        @Override
        public int hashCode() {
            final int hashCode = this.recipientsType.hashCode();
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
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionMessageRecipientsSelectFragmentToSearchRecipientFragment(recipientsType=");
            sb.append(this.recipientsType);
            sb.append(", allowRequestReadConfirmation=");
            sb.append(this.allowRequestReadConfirmation);
            sb.append(", fromSendEditorFragment=");
            sb.append(this.fromSendEditorFragment);
            sb.append(", recipientSearchMaxResult=");
            sb.append(this.recipientSearchMaxResult);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0082\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\t\u0010\n\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0003J=\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\rH\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003R\u0019\u0010\u000f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b(\u0010)¨\u0006," }, d2 = { "Lcom/untis/mobile/messages/ui/send/recipient/MessageRecipientsSelectFragmentDirections$ActionMessageRecipientsSelectFragmentToSendMessageEditorFragment;", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "component1", "", "component2", "component3", "Lcom/untis/mobile/messages/util/SendMessageActions;", "component4", "Lcom/untis/mobile/messages/data/model/Message;", "component5", "sendMessageTo", "allowRequestReadConfirmation", "recipientSearchMaxResult", "sendMessageAction", "messageToReply", "copy", "", "toString", "hashCode", "", "other", "equals", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "getSendMessageTo", "()Lcom/untis/mobile/messages/util/SendMessageTypes;", "I", "getRecipientSearchMaxResult", "()I", "Z", "getAllowRequestReadConfirmation", "()Z", "Lcom/untis/mobile/messages/data/model/Message;", "getMessageToReply", "()Lcom/untis/mobile/messages/data/model/Message;", "Lcom/untis/mobile/messages/util/SendMessageActions;", "getSendMessageAction", "()Lcom/untis/mobile/messages/util/SendMessageActions;", "<init>", "(Lcom/untis/mobile/messages/util/SendMessageTypes;ZILcom/untis/mobile/messages/util/SendMessageActions;Lcom/untis/mobile/messages/data/model/Message;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class ActionMessageRecipientsSelectFragmentToSendMessageEditorFragment implements d0
    {
        private final boolean allowRequestReadConfirmation;
        @f
        private final Message messageToReply;
        private final int recipientSearchMaxResult;
        @e
        private final SendMessageActions sendMessageAction;
        @e
        private final SendMessageTypes sendMessageTo;
        
        public ActionMessageRecipientsSelectFragmentToSendMessageEditorFragment(@e final SendMessageTypes sendMessageTo, final boolean allowRequestReadConfirmation, final int recipientSearchMaxResult, @e final SendMessageActions sendMessageAction, @f final Message messageToReply) {
            k0.p(sendMessageTo, "sendMessageTo");
            k0.p(sendMessageAction, "sendMessageAction");
            this.sendMessageTo = sendMessageTo;
            this.allowRequestReadConfirmation = allowRequestReadConfirmation;
            this.recipientSearchMaxResult = recipientSearchMaxResult;
            this.sendMessageAction = sendMessageAction;
            this.messageToReply = messageToReply;
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
        
        @e
        public final SendMessageActions component4() {
            return this.sendMessageAction;
        }
        
        @f
        public final Message component5() {
            return this.messageToReply;
        }
        
        @e
        public final ActionMessageRecipientsSelectFragmentToSendMessageEditorFragment copy(@e final SendMessageTypes sendMessageTypes, final boolean b, final int n, @e final SendMessageActions sendMessageActions, @f final Message message) {
            k0.p(sendMessageTypes, "sendMessageTo");
            k0.p(sendMessageActions, "sendMessageAction");
            return new ActionMessageRecipientsSelectFragmentToSendMessageEditorFragment(sendMessageTypes, b, n, sendMessageActions, message);
        }
        
        @Override
        public boolean equals(@f final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof ActionMessageRecipientsSelectFragmentToSendMessageEditorFragment)) {
                return false;
            }
            final ActionMessageRecipientsSelectFragmentToSendMessageEditorFragment actionMessageRecipientsSelectFragmentToSendMessageEditorFragment = (ActionMessageRecipientsSelectFragmentToSendMessageEditorFragment)o;
            return this.sendMessageTo == actionMessageRecipientsSelectFragmentToSendMessageEditorFragment.sendMessageTo && this.allowRequestReadConfirmation == actionMessageRecipientsSelectFragmentToSendMessageEditorFragment.allowRequestReadConfirmation && this.recipientSearchMaxResult == actionMessageRecipientsSelectFragmentToSendMessageEditorFragment.recipientSearchMaxResult && this.sendMessageAction == actionMessageRecipientsSelectFragmentToSendMessageEditorFragment.sendMessageAction && k0.g(this.messageToReply, actionMessageRecipientsSelectFragmentToSendMessageEditorFragment.messageToReply);
        }
        
        public int getActionId() {
            return 2131296366;
        }
        
        public final boolean getAllowRequestReadConfirmation() {
            return this.allowRequestReadConfirmation;
        }
        
        @e
        public Bundle getArguments() {
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
            if (Parcelable.class.isAssignableFrom(SendMessageActions.class)) {
                bundle.putParcelable("sendMessageAction", (Parcelable)this.sendMessageAction);
            }
            else if (Serializable.class.isAssignableFrom(SendMessageActions.class)) {
                bundle.putSerializable("sendMessageAction", (Serializable)this.sendMessageAction);
            }
            if (Parcelable.class.isAssignableFrom(Message.class)) {
                bundle.putParcelable("messageToReply", (Parcelable)this.messageToReply);
            }
            else if (Serializable.class.isAssignableFrom(Message.class)) {
                bundle.putSerializable("messageToReply", (Serializable)this.messageToReply);
            }
            return bundle;
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
            final int hashCode2 = this.sendMessageAction.hashCode();
            final Message messageToReply = this.messageToReply;
            int hashCode3;
            if (messageToReply == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = messageToReply.hashCode();
            }
            return (((hashCode * 31 + allowRequestReadConfirmation) * 31 + recipientSearchMaxResult) * 31 + hashCode2) * 31 + hashCode3;
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionMessageRecipientsSelectFragmentToSendMessageEditorFragment(sendMessageTo=");
            sb.append(this.sendMessageTo);
            sb.append(", allowRequestReadConfirmation=");
            sb.append(this.allowRequestReadConfirmation);
            sb.append(", recipientSearchMaxResult=");
            sb.append(this.recipientSearchMaxResult);
            sb.append(", sendMessageAction=");
            sb.append(this.sendMessageAction);
            sb.append(", messageToReply=");
            sb.append(this.messageToReply);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nJ.\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006J,\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¨\u0006\u0014" }, d2 = { "Lcom/untis/mobile/messages/ui/send/recipient/MessageRecipientsSelectFragmentDirections$Companion;", "", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "sendMessageTo", "", "allowRequestReadConfirmation", "", "recipientSearchMaxResult", "Lcom/untis/mobile/messages/util/SendMessageActions;", "sendMessageAction", "Lcom/untis/mobile/messages/data/model/Message;", "messageToReply", "Landroidx/navigation/d0;", "actionMessageRecipientsSelectFragmentToSendMessageEditorFragment", "recipientsType", "fromSendEditorFragment", "actionMessageRecipientsSelectFragmentToSearchRecipientFragment", "actionGlobalMessageRecipientsSelectFragment", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @e
        public final d0 actionGlobalMessageRecipientsSelectFragment(@e final SendMessageTypes sendMessageTypes, final boolean b, final boolean b2, final int n) {
            k0.p(sendMessageTypes, "sendMessageTo");
            return com.untis.mobile.e.a.a(sendMessageTypes, b, b2, n);
        }
        
        @e
        public final d0 actionMessageRecipientsSelectFragmentToSearchRecipientFragment(@e final SendMessageTypes sendMessageTypes, final boolean b, final boolean b2, final int n) {
            k0.p(sendMessageTypes, "recipientsType");
            return (d0)new ActionMessageRecipientsSelectFragmentToSearchRecipientFragment(sendMessageTypes, b, b2, n);
        }
        
        @e
        public final d0 actionMessageRecipientsSelectFragmentToSendMessageEditorFragment(@e final SendMessageTypes sendMessageTypes, final boolean b, final int n, @e final SendMessageActions sendMessageActions, @f final Message message) {
            k0.p(sendMessageTypes, "sendMessageTo");
            k0.p(sendMessageActions, "sendMessageAction");
            return (d0)new ActionMessageRecipientsSelectFragmentToSendMessageEditorFragment(sendMessageTypes, b, n, sendMessageActions, message);
        }
    }
}
