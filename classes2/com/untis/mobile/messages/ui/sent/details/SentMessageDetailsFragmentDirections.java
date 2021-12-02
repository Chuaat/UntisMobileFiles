// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.sent.details;

import android.os.Bundle;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import androidx.navigation.d0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/details/SentMessageDetailsFragmentDirections;", "", "<init>", "()V", "Companion", "ActionSentMessageDetailsFragmentToReadConfirmationRecipientsFragment", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SentMessageDetailsFragmentDirections
{
    @e
    public static final Companion Companion;
    
    static {
        Companion = new Companion(null);
    }
    
    private SentMessageDetailsFragmentDirections() {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\bH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\bH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/details/SentMessageDetailsFragmentDirections$ActionSentMessageDetailsFragmentToReadConfirmationRecipientsFragment;", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "component1", "component2", "", "component3", "numberOfConfirms", "totalConfirmations", "messageId", "copy", "toString", "hashCode", "", "other", "", "equals", "I", "getTotalConfirmations", "()I", "getNumberOfConfirms", "Ljava/lang/String;", "getMessageId", "()Ljava/lang/String;", "<init>", "(IILjava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class ActionSentMessageDetailsFragmentToReadConfirmationRecipientsFragment implements d0
    {
        @e
        private final String messageId;
        private final int numberOfConfirms;
        private final int totalConfirmations;
        
        public ActionSentMessageDetailsFragmentToReadConfirmationRecipientsFragment(final int numberOfConfirms, final int totalConfirmations, @e final String messageId) {
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
        public final ActionSentMessageDetailsFragmentToReadConfirmationRecipientsFragment copy(final int n, final int n2, @e final String s) {
            k0.p(s, "messageId");
            return new ActionSentMessageDetailsFragmentToReadConfirmationRecipientsFragment(n, n2, s);
        }
        
        @Override
        public boolean equals(@f final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof ActionSentMessageDetailsFragmentToReadConfirmationRecipientsFragment)) {
                return false;
            }
            final ActionSentMessageDetailsFragmentToReadConfirmationRecipientsFragment actionSentMessageDetailsFragmentToReadConfirmationRecipientsFragment = (ActionSentMessageDetailsFragmentToReadConfirmationRecipientsFragment)o;
            return this.numberOfConfirms == actionSentMessageDetailsFragmentToReadConfirmationRecipientsFragment.numberOfConfirms && this.totalConfirmations == actionSentMessageDetailsFragmentToReadConfirmationRecipientsFragment.totalConfirmations && k0.g(this.messageId, actionSentMessageDetailsFragmentToReadConfirmationRecipientsFragment.messageId);
        }
        
        public int getActionId() {
            return 2131296382;
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
            sb.append("ActionSentMessageDetailsFragmentToReadConfirmationRecipientsFragment(numberOfConfirms=");
            sb.append(this.numberOfConfirms);
            sb.append(", totalConfirmations=");
            sb.append(this.totalConfirmations);
            sb.append(", messageId=");
            sb.append(this.messageId);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\"\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/details/SentMessageDetailsFragmentDirections$Companion;", "", "", "numberOfConfirms", "totalConfirmations", "", "messageId", "Landroidx/navigation/d0;", "actionSentMessageDetailsFragmentToReadConfirmationRecipientsFragment", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @e
        public final d0 actionSentMessageDetailsFragmentToReadConfirmationRecipientsFragment(final int n, final int n2, @e final String s) {
            k0.p(s, "messageId");
            return (d0)new ActionSentMessageDetailsFragmentToReadConfirmationRecipientsFragment(n, n2, s);
        }
    }
}
