// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.inbox.details.viewmodel;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.model.MessageRequestConfirmation;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J+\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\t\u0010\r\u001a\u00020\fH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001c\u001a\u0004\b\b\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\"" }, d2 = { "Lcom/untis/mobile/messages/ui/inbox/details/viewmodel/ConfirmReadMessageState;", "", "", "component1", "Lcom/untis/mobile/messages/data/model/MessageRequestConfirmation;", "component2", "", "component3", "isConfirmReadMessageSuccess", "readConfirmationMessage", "error", "copy", "", "toString", "", "hashCode", "other", "equals", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "setError", "(Ljava/lang/Throwable;)V", "Lcom/untis/mobile/messages/data/model/MessageRequestConfirmation;", "getReadConfirmationMessage", "()Lcom/untis/mobile/messages/data/model/MessageRequestConfirmation;", "setReadConfirmationMessage", "(Lcom/untis/mobile/messages/data/model/MessageRequestConfirmation;)V", "Z", "()Z", "setConfirmReadMessageSuccess", "(Z)V", "<init>", "(ZLcom/untis/mobile/messages/data/model/MessageRequestConfirmation;Ljava/lang/Throwable;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ConfirmReadMessageState
{
    @f
    private Throwable error;
    private boolean isConfirmReadMessageSuccess;
    @f
    private MessageRequestConfirmation readConfirmationMessage;
    
    public ConfirmReadMessageState(final boolean isConfirmReadMessageSuccess, @f final MessageRequestConfirmation readConfirmationMessage, @f final Throwable error) {
        this.isConfirmReadMessageSuccess = isConfirmReadMessageSuccess;
        this.readConfirmationMessage = readConfirmationMessage;
        this.error = error;
    }
    
    public final boolean component1() {
        return this.isConfirmReadMessageSuccess;
    }
    
    @f
    public final MessageRequestConfirmation component2() {
        return this.readConfirmationMessage;
    }
    
    @f
    public final Throwable component3() {
        return this.error;
    }
    
    @e
    public final ConfirmReadMessageState copy(final boolean b, @f final MessageRequestConfirmation messageRequestConfirmation, @f final Throwable t) {
        return new ConfirmReadMessageState(b, messageRequestConfirmation, t);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfirmReadMessageState)) {
            return false;
        }
        final ConfirmReadMessageState confirmReadMessageState = (ConfirmReadMessageState)o;
        return this.isConfirmReadMessageSuccess == confirmReadMessageState.isConfirmReadMessageSuccess && k0.g(this.readConfirmationMessage, confirmReadMessageState.readConfirmationMessage) && k0.g(this.error, confirmReadMessageState.error);
    }
    
    @f
    public final Throwable getError() {
        return this.error;
    }
    
    @f
    public final MessageRequestConfirmation getReadConfirmationMessage() {
        return this.readConfirmationMessage;
    }
    
    @Override
    public int hashCode() {
        int isConfirmReadMessageSuccess;
        if ((isConfirmReadMessageSuccess = (this.isConfirmReadMessageSuccess ? 1 : 0)) != 0) {
            isConfirmReadMessageSuccess = 1;
        }
        final MessageRequestConfirmation readConfirmationMessage = this.readConfirmationMessage;
        int hashCode = 0;
        int hashCode2;
        if (readConfirmationMessage == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = readConfirmationMessage.hashCode();
        }
        final Throwable error = this.error;
        if (error != null) {
            hashCode = error.hashCode();
        }
        return (isConfirmReadMessageSuccess * 31 + hashCode2) * 31 + hashCode;
    }
    
    public final boolean isConfirmReadMessageSuccess() {
        return this.isConfirmReadMessageSuccess;
    }
    
    public final void setConfirmReadMessageSuccess(final boolean isConfirmReadMessageSuccess) {
        this.isConfirmReadMessageSuccess = isConfirmReadMessageSuccess;
    }
    
    public final void setError(@f final Throwable error) {
        this.error = error;
    }
    
    public final void setReadConfirmationMessage(@f final MessageRequestConfirmation readConfirmationMessage) {
        this.readConfirmationMessage = readConfirmationMessage;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ConfirmReadMessageState(isConfirmReadMessageSuccess=");
        sb.append(this.isConfirmReadMessageSuccess);
        sb.append(", readConfirmationMessage=");
        sb.append(this.readConfirmationMessage);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(')');
        return sb.toString();
    }
}
