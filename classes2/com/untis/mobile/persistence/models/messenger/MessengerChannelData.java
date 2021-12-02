// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.messenger;

import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import android.os.Parcelable;
import com.untis.mobile.persistence.models.booking.ValidationError;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR0\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/persistence/models/messenger/MessengerChannelData;", "", "", "Lcom/untis/mobile/persistence/models/messenger/MessengerChannelCandidate;", "proposedconnectableMessengerChannels", "Ljava/util/List;", "getProposedconnectableMessengerChannels", "()Ljava/util/List;", "setProposedconnectableMessengerChannels", "(Ljava/util/List;)V", "Lcom/untis/mobile/persistence/models/booking/ValidationError;", "Landroid/os/Parcelable;", "errors", "getErrors", "setErrors", "", "proposedMessengerChannelName", "Ljava/lang/String;", "getProposedMessengerChannelName", "()Ljava/lang/String;", "setProposedMessengerChannelName", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessengerChannelData
{
    @f
    private List<? extends ValidationError<Parcelable>> errors;
    @e
    private String proposedMessengerChannelName;
    @e
    private List<MessengerChannelCandidate> proposedconnectableMessengerChannels;
    
    public MessengerChannelData(@e final String proposedMessengerChannelName, @e final List<MessengerChannelCandidate> proposedconnectableMessengerChannels, @f final List<? extends ValidationError<Parcelable>> errors) {
        k0.p(proposedMessengerChannelName, "proposedMessengerChannelName");
        k0.p(proposedconnectableMessengerChannels, "proposedconnectableMessengerChannels");
        this.proposedMessengerChannelName = proposedMessengerChannelName;
        this.proposedconnectableMessengerChannels = proposedconnectableMessengerChannels;
        this.errors = errors;
    }
    
    @f
    public final List<ValidationError<Parcelable>> getErrors() {
        return (List<ValidationError<Parcelable>>)this.errors;
    }
    
    @e
    public final String getProposedMessengerChannelName() {
        return this.proposedMessengerChannelName;
    }
    
    @e
    public final List<MessengerChannelCandidate> getProposedconnectableMessengerChannels() {
        return this.proposedconnectableMessengerChannels;
    }
    
    public final void setErrors(@f final List<? extends ValidationError<Parcelable>> errors) {
        this.errors = errors;
    }
    
    public final void setProposedMessengerChannelName(@e final String proposedMessengerChannelName) {
        k0.p(proposedMessengerChannelName, "<set-?>");
        this.proposedMessengerChannelName = proposedMessengerChannelName;
    }
    
    public final void setProposedconnectableMessengerChannels(@e final List<MessengerChannelCandidate> proposedconnectableMessengerChannels) {
        k0.p(proposedconnectableMessengerChannels, "<set-?>");
        this.proposedconnectableMessengerChannels = proposedconnectableMessengerChannels;
    }
}
