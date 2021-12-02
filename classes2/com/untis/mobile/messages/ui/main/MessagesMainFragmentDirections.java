// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.main;

import com.untis.mobile.messages.util.SendMessageActions;
import com.untis.mobile.messages.data.model.Message;
import java.io.Serializable;
import android.os.Parcelable;
import com.untis.mobile.messages.util.SendMessageTypes;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import androidx.navigation.d0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u0000 \u00042\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n" }, d2 = { "Lcom/untis/mobile/messages/ui/main/MessagesMainFragmentDirections;", "", "<init>", "()V", "Companion", "ActionMessagesMainFragmentToMessageDetailsFragment", "ActionMessagesMainFragmentToMessageRecipientsSelectFragment", "ActionMessagesMainFragmentToReadConfirmationRecipientsFragment", "ActionMessagesMainFragmentToReplyMessageEditorFragment", "ActionMessagesMainFragmentToSentMessageDetailsFragment", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessagesMainFragmentDirections
{
    @e
    public static final Companion Companion;
    
    static {
        Companion = new Companion(null);
    }
    
    private MessagesMainFragmentDirections() {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0002H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\f\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\r\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a" }, d2 = { "Lcom/untis/mobile/messages/ui/main/MessagesMainFragmentDirections$ActionMessagesMainFragmentToMessageDetailsFragment;", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "", "component1", "component2", "messageId", "messagePosition", "copy", "toString", "hashCode", "", "other", "", "equals", "I", "getMessagePosition", "()I", "Ljava/lang/String;", "getMessageId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;I)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class ActionMessagesMainFragmentToMessageDetailsFragment implements d0
    {
        @e
        private final String messageId;
        private final int messagePosition;
        
        public ActionMessagesMainFragmentToMessageDetailsFragment(@e final String messageId, final int messagePosition) {
            k0.p(messageId, "messageId");
            this.messageId = messageId;
            this.messagePosition = messagePosition;
        }
        
        @e
        public final String component1() {
            return this.messageId;
        }
        
        public final int component2() {
            return this.messagePosition;
        }
        
        @e
        public final ActionMessagesMainFragmentToMessageDetailsFragment copy(@e final String s, final int n) {
            k0.p(s, "messageId");
            return new ActionMessagesMainFragmentToMessageDetailsFragment(s, n);
        }
        
        @Override
        public boolean equals(@f final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof ActionMessagesMainFragmentToMessageDetailsFragment)) {
                return false;
            }
            final ActionMessagesMainFragmentToMessageDetailsFragment actionMessagesMainFragmentToMessageDetailsFragment = (ActionMessagesMainFragmentToMessageDetailsFragment)o;
            return k0.g(this.messageId, actionMessagesMainFragmentToMessageDetailsFragment.messageId) && this.messagePosition == actionMessagesMainFragmentToMessageDetailsFragment.messagePosition;
        }
        
        public int getActionId() {
            return 2131296367;
        }
        
        @e
        public Bundle getArguments() {
            final Bundle bundle = new Bundle();
            bundle.putString("messageId", this.messageId);
            bundle.putInt("messagePosition", this.messagePosition);
            return bundle;
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
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionMessagesMainFragmentToMessageDetailsFragment(messageId=");
            sb.append(this.messageId);
            sb.append(", messagePosition=");
            sb.append(this.messagePosition);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\t\u0010\n\u001a\u00020\u0002H\u00c6\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 " }, d2 = { "Lcom/untis/mobile/messages/ui/main/MessagesMainFragmentDirections$ActionMessagesMainFragmentToMessageRecipientsSelectFragment;", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "component1", "", "component2", "component3", "sendMessageTo", "allowRequestReadConfirmation", "recipientSearchMaxResult", "copy", "", "toString", "hashCode", "", "other", "equals", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "getSendMessageTo", "()Lcom/untis/mobile/messages/util/SendMessageTypes;", "Z", "getAllowRequestReadConfirmation", "()Z", "I", "getRecipientSearchMaxResult", "()I", "<init>", "(Lcom/untis/mobile/messages/util/SendMessageTypes;ZI)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class ActionMessagesMainFragmentToMessageRecipientsSelectFragment implements d0
    {
        private final boolean allowRequestReadConfirmation;
        private final int recipientSearchMaxResult;
        @e
        private final SendMessageTypes sendMessageTo;
        
        public ActionMessagesMainFragmentToMessageRecipientsSelectFragment(@e final SendMessageTypes sendMessageTo, final boolean allowRequestReadConfirmation, final int recipientSearchMaxResult) {
            k0.p(sendMessageTo, "sendMessageTo");
            this.sendMessageTo = sendMessageTo;
            this.allowRequestReadConfirmation = allowRequestReadConfirmation;
            this.recipientSearchMaxResult = recipientSearchMaxResult;
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
        public final ActionMessagesMainFragmentToMessageRecipientsSelectFragment copy(@e final SendMessageTypes sendMessageTypes, final boolean b, final int n) {
            k0.p(sendMessageTypes, "sendMessageTo");
            return new ActionMessagesMainFragmentToMessageRecipientsSelectFragment(sendMessageTypes, b, n);
        }
        
        @Override
        public boolean equals(@f final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof ActionMessagesMainFragmentToMessageRecipientsSelectFragment)) {
                return false;
            }
            final ActionMessagesMainFragmentToMessageRecipientsSelectFragment actionMessagesMainFragmentToMessageRecipientsSelectFragment = (ActionMessagesMainFragmentToMessageRecipientsSelectFragment)o;
            return this.sendMessageTo == actionMessagesMainFragmentToMessageRecipientsSelectFragment.sendMessageTo && this.allowRequestReadConfirmation == actionMessagesMainFragmentToMessageRecipientsSelectFragment.allowRequestReadConfirmation && this.recipientSearchMaxResult == actionMessagesMainFragmentToMessageRecipientsSelectFragment.recipientSearchMaxResult;
        }
        
        public int getActionId() {
            return 2131296368;
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
            return bundle;
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
            int allowRequestReadConfirmation;
            if ((allowRequestReadConfirmation = (this.allowRequestReadConfirmation ? 1 : 0)) != 0) {
                allowRequestReadConfirmation = 1;
            }
            return (hashCode * 31 + allowRequestReadConfirmation) * 31 + this.recipientSearchMaxResult;
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionMessagesMainFragmentToMessageRecipientsSelectFragment(sendMessageTo=");
            sb.append(this.sendMessageTo);
            sb.append(", allowRequestReadConfirmation=");
            sb.append(this.allowRequestReadConfirmation);
            sb.append(", recipientSearchMaxResult=");
            sb.append(this.recipientSearchMaxResult);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\bH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\bH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d" }, d2 = { "Lcom/untis/mobile/messages/ui/main/MessagesMainFragmentDirections$ActionMessagesMainFragmentToReadConfirmationRecipientsFragment;", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "component1", "component2", "", "component3", "numberOfConfirms", "totalConfirmations", "messageId", "copy", "toString", "hashCode", "", "other", "", "equals", "I", "getNumberOfConfirms", "()I", "getTotalConfirmations", "Ljava/lang/String;", "getMessageId", "()Ljava/lang/String;", "<init>", "(IILjava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class ActionMessagesMainFragmentToReadConfirmationRecipientsFragment implements d0
    {
        @e
        private final String messageId;
        private final int numberOfConfirms;
        private final int totalConfirmations;
        
        public ActionMessagesMainFragmentToReadConfirmationRecipientsFragment(final int numberOfConfirms, final int totalConfirmations, @e final String messageId) {
            k0.p(messageId, "messageId");
            this.numberOfConfirms = numberOfConfirms;
            this.totalConfirmations = totalConfirmations;
            this.messageId = messageId;
        }
        
        public final int component1() {
            return this.numberOfConfirms;
        }
        
        public final int component2() {
            return this.totalConfirmations;
        }
        
        @e
        public final String component3() {
            return this.messageId;
        }
        
        @e
        public final ActionMessagesMainFragmentToReadConfirmationRecipientsFragment copy(final int n, final int n2, @e final String s) {
            k0.p(s, "messageId");
            return new ActionMessagesMainFragmentToReadConfirmationRecipientsFragment(n, n2, s);
        }
        
        @Override
        public boolean equals(@f final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof ActionMessagesMainFragmentToReadConfirmationRecipientsFragment)) {
                return false;
            }
            final ActionMessagesMainFragmentToReadConfirmationRecipientsFragment actionMessagesMainFragmentToReadConfirmationRecipientsFragment = (ActionMessagesMainFragmentToReadConfirmationRecipientsFragment)o;
            return this.numberOfConfirms == actionMessagesMainFragmentToReadConfirmationRecipientsFragment.numberOfConfirms && this.totalConfirmations == actionMessagesMainFragmentToReadConfirmationRecipientsFragment.totalConfirmations && k0.g(this.messageId, actionMessagesMainFragmentToReadConfirmationRecipientsFragment.messageId);
        }
        
        public int getActionId() {
            return 2131296369;
        }
        
        @e
        public Bundle getArguments() {
            final Bundle bundle = new Bundle();
            bundle.putInt("numberOfConfirms", this.numberOfConfirms);
            bundle.putInt("totalConfirmations", this.totalConfirmations);
            bundle.putString("messageId", this.messageId);
            return bundle;
        }
        
        @e
        public final String getMessageId() {
            return this.messageId;
        }
        
        public final int getNumberOfConfirms() {
            return this.numberOfConfirms;
        }
        
        public final int getTotalConfirmations() {
            return this.totalConfirmations;
        }
        
        @Override
        public int hashCode() {
            return (this.numberOfConfirms * 31 + this.totalConfirmations) * 31 + this.messageId.hashCode();
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionMessagesMainFragmentToReadConfirmationRecipientsFragment(numberOfConfirms=");
            sb.append(this.numberOfConfirms);
            sb.append(", totalConfirmations=");
            sb.append(this.totalConfirmations);
            sb.append(", messageId=");
            sb.append(this.messageId);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0082\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\t\u0010\n\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003J=\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\rH\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0013\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)¨\u0006," }, d2 = { "Lcom/untis/mobile/messages/ui/main/MessagesMainFragmentDirections$ActionMessagesMainFragmentToReplyMessageEditorFragment;", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "component1", "", "component2", "component3", "Lcom/untis/mobile/messages/data/model/Message;", "component4", "Lcom/untis/mobile/messages/util/SendMessageActions;", "component5", "sendMessageTo", "allowRequestReadConfirmation", "recipientSearchMaxResult", "messageToReply", "sendMessageAction", "copy", "", "toString", "hashCode", "", "other", "equals", "Lcom/untis/mobile/messages/data/model/Message;", "getMessageToReply", "()Lcom/untis/mobile/messages/data/model/Message;", "Z", "getAllowRequestReadConfirmation", "()Z", "Lcom/untis/mobile/messages/util/SendMessageActions;", "getSendMessageAction", "()Lcom/untis/mobile/messages/util/SendMessageActions;", "I", "getRecipientSearchMaxResult", "()I", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "getSendMessageTo", "()Lcom/untis/mobile/messages/util/SendMessageTypes;", "<init>", "(Lcom/untis/mobile/messages/util/SendMessageTypes;ZILcom/untis/mobile/messages/data/model/Message;Lcom/untis/mobile/messages/util/SendMessageActions;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class ActionMessagesMainFragmentToReplyMessageEditorFragment implements d0
    {
        private final boolean allowRequestReadConfirmation;
        @f
        private final Message messageToReply;
        private final int recipientSearchMaxResult;
        @e
        private final SendMessageActions sendMessageAction;
        @e
        private final SendMessageTypes sendMessageTo;
        
        public ActionMessagesMainFragmentToReplyMessageEditorFragment(@e final SendMessageTypes sendMessageTo, final boolean allowRequestReadConfirmation, final int recipientSearchMaxResult, @f final Message messageToReply, @e final SendMessageActions sendMessageAction) {
            k0.p(sendMessageTo, "sendMessageTo");
            k0.p(sendMessageAction, "sendMessageAction");
            this.sendMessageTo = sendMessageTo;
            this.allowRequestReadConfirmation = allowRequestReadConfirmation;
            this.recipientSearchMaxResult = recipientSearchMaxResult;
            this.messageToReply = messageToReply;
            this.sendMessageAction = sendMessageAction;
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
        public final ActionMessagesMainFragmentToReplyMessageEditorFragment copy(@e final SendMessageTypes sendMessageTypes, final boolean b, final int n, @f final Message message, @e final SendMessageActions sendMessageActions) {
            k0.p(sendMessageTypes, "sendMessageTo");
            k0.p(sendMessageActions, "sendMessageAction");
            return new ActionMessagesMainFragmentToReplyMessageEditorFragment(sendMessageTypes, b, n, message, sendMessageActions);
        }
        
        @Override
        public boolean equals(@f final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof ActionMessagesMainFragmentToReplyMessageEditorFragment)) {
                return false;
            }
            final ActionMessagesMainFragmentToReplyMessageEditorFragment actionMessagesMainFragmentToReplyMessageEditorFragment = (ActionMessagesMainFragmentToReplyMessageEditorFragment)o;
            return this.sendMessageTo == actionMessagesMainFragmentToReplyMessageEditorFragment.sendMessageTo && this.allowRequestReadConfirmation == actionMessagesMainFragmentToReplyMessageEditorFragment.allowRequestReadConfirmation && this.recipientSearchMaxResult == actionMessagesMainFragmentToReplyMessageEditorFragment.recipientSearchMaxResult && k0.g(this.messageToReply, actionMessagesMainFragmentToReplyMessageEditorFragment.messageToReply) && this.sendMessageAction == actionMessagesMainFragmentToReplyMessageEditorFragment.sendMessageAction;
        }
        
        public int getActionId() {
            return 2131296370;
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
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionMessagesMainFragmentToReplyMessageEditorFragment(sendMessageTo=");
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
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0002H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\f\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\r\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003R\u0019\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a" }, d2 = { "Lcom/untis/mobile/messages/ui/main/MessagesMainFragmentDirections$ActionMessagesMainFragmentToSentMessageDetailsFragment;", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "", "component1", "component2", "messageId", "messagePosition", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getMessageId", "()Ljava/lang/String;", "I", "getMessagePosition", "()I", "<init>", "(Ljava/lang/String;I)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class ActionMessagesMainFragmentToSentMessageDetailsFragment implements d0
    {
        @e
        private final String messageId;
        private final int messagePosition;
        
        public ActionMessagesMainFragmentToSentMessageDetailsFragment(@e final String messageId, final int messagePosition) {
            k0.p(messageId, "messageId");
            this.messageId = messageId;
            this.messagePosition = messagePosition;
        }
        
        @e
        public final String component1() {
            return this.messageId;
        }
        
        public final int component2() {
            return this.messagePosition;
        }
        
        @e
        public final ActionMessagesMainFragmentToSentMessageDetailsFragment copy(@e final String s, final int n) {
            k0.p(s, "messageId");
            return new ActionMessagesMainFragmentToSentMessageDetailsFragment(s, n);
        }
        
        @Override
        public boolean equals(@f final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof ActionMessagesMainFragmentToSentMessageDetailsFragment)) {
                return false;
            }
            final ActionMessagesMainFragmentToSentMessageDetailsFragment actionMessagesMainFragmentToSentMessageDetailsFragment = (ActionMessagesMainFragmentToSentMessageDetailsFragment)o;
            return k0.g(this.messageId, actionMessagesMainFragmentToSentMessageDetailsFragment.messageId) && this.messagePosition == actionMessagesMainFragmentToSentMessageDetailsFragment.messagePosition;
        }
        
        public int getActionId() {
            return 2131296371;
        }
        
        @e
        public Bundle getArguments() {
            final Bundle bundle = new Bundle();
            bundle.putString("messageId", this.messageId);
            bundle.putInt("messagePosition", this.messagePosition);
            return bundle;
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
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionMessagesMainFragmentToSentMessageDetailsFragment(messageId=");
            sb.append(this.messageId);
            sb.append(", messagePosition=");
            sb.append(this.messagePosition);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\"\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0004J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\"\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J8\u0010\u0016\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014¨\u0006\u0019" }, d2 = { "Lcom/untis/mobile/messages/ui/main/MessagesMainFragmentDirections$Companion;", "", "", "messageId", "", "messagePosition", "Landroidx/navigation/d0;", "actionMessagesMainFragmentToMessageDetailsFragment", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "sendMessageTo", "", "allowRequestReadConfirmation", "recipientSearchMaxResult", "actionMessagesMainFragmentToMessageRecipientsSelectFragment", "actionMessagesMainFragmentToSentMessageDetailsFragment", "numberOfConfirms", "totalConfirmations", "actionMessagesMainFragmentToReadConfirmationRecipientsFragment", "Lcom/untis/mobile/messages/data/model/Message;", "messageToReply", "Lcom/untis/mobile/messages/util/SendMessageActions;", "sendMessageAction", "actionMessagesMainFragmentToReplyMessageEditorFragment", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @e
        public final d0 actionMessagesMainFragmentToMessageDetailsFragment(@e final String s, final int n) {
            k0.p(s, "messageId");
            return (d0)new ActionMessagesMainFragmentToMessageDetailsFragment(s, n);
        }
        
        @e
        public final d0 actionMessagesMainFragmentToMessageRecipientsSelectFragment(@e final SendMessageTypes sendMessageTypes, final boolean b, final int n) {
            k0.p(sendMessageTypes, "sendMessageTo");
            return (d0)new ActionMessagesMainFragmentToMessageRecipientsSelectFragment(sendMessageTypes, b, n);
        }
        
        @e
        public final d0 actionMessagesMainFragmentToReadConfirmationRecipientsFragment(final int n, final int n2, @e final String s) {
            k0.p(s, "messageId");
            return (d0)new ActionMessagesMainFragmentToReadConfirmationRecipientsFragment(n, n2, s);
        }
        
        @e
        public final d0 actionMessagesMainFragmentToReplyMessageEditorFragment(@e final SendMessageTypes sendMessageTypes, final boolean b, final int n, @f final Message message, @e final SendMessageActions sendMessageActions) {
            k0.p(sendMessageTypes, "sendMessageTo");
            k0.p(sendMessageActions, "sendMessageAction");
            return (d0)new ActionMessagesMainFragmentToReplyMessageEditorFragment(sendMessageTypes, b, n, message, sendMessageActions);
        }
        
        @e
        public final d0 actionMessagesMainFragmentToSentMessageDetailsFragment(@e final String s, final int n) {
            k0.p(s, "messageId");
            return (d0)new ActionMessagesMainFragmentToSentMessageDetailsFragment(s, n);
        }
    }
}
