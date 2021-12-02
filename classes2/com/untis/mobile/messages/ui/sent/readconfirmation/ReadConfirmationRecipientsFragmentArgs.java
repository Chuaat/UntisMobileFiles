// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.sent.readconfirmation;

import org.jetbrains.annotations.f;
import m6.k;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.navigation.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB#\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\r\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u000b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001d" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/readconfirmation/ReadConfirmationRecipientsFragmentArgs;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "toBundle", "", "component1", "component2", "", "component3", "numberOfConfirms", "totalConfirmations", "messageId", "copy", "toString", "hashCode", "", "other", "", "equals", "I", "getNumberOfConfirms", "()I", "Ljava/lang/String;", "getMessageId", "()Ljava/lang/String;", "getTotalConfirmations", "<init>", "(IILjava/lang/String;)V", "Companion", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ReadConfirmationRecipientsFragmentArgs implements l
{
    @e
    public static final Companion Companion;
    @e
    private final String messageId;
    private final int numberOfConfirms;
    private final int totalConfirmations;
    
    static {
        Companion = new Companion(null);
    }
    
    public ReadConfirmationRecipientsFragmentArgs(final int numberOfConfirms, final int totalConfirmations, @e final String messageId) {
        k0.p(messageId, "messageId");
        this.numberOfConfirms = numberOfConfirms;
        this.totalConfirmations = totalConfirmations;
        this.messageId = messageId;
    }
    
    @k
    @e
    public static final ReadConfirmationRecipientsFragmentArgs fromBundle(@e final Bundle bundle) {
        return ReadConfirmationRecipientsFragmentArgs.Companion.fromBundle(bundle);
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
    public final ReadConfirmationRecipientsFragmentArgs copy(final int n, final int n2, @e final String s) {
        k0.p(s, "messageId");
        return new ReadConfirmationRecipientsFragmentArgs(n, n2, s);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReadConfirmationRecipientsFragmentArgs)) {
            return false;
        }
        final ReadConfirmationRecipientsFragmentArgs readConfirmationRecipientsFragmentArgs = (ReadConfirmationRecipientsFragmentArgs)o;
        return this.numberOfConfirms == readConfirmationRecipientsFragmentArgs.numberOfConfirms && this.totalConfirmations == readConfirmationRecipientsFragmentArgs.totalConfirmations && k0.g(this.messageId, readConfirmationRecipientsFragmentArgs.messageId);
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
    public final Bundle toBundle() {
        final Bundle bundle = new Bundle();
        bundle.putInt("numberOfConfirms", this.numberOfConfirms);
        bundle.putInt("totalConfirmations", this.totalConfirmations);
        bundle.putString("messageId", this.messageId);
        return bundle;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ReadConfirmationRecipientsFragmentArgs(numberOfConfirms=");
        sb.append(this.numberOfConfirms);
        sb.append(", totalConfirmations=");
        sb.append(this.totalConfirmations);
        sb.append(", messageId=");
        sb.append(this.messageId);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/readconfirmation/ReadConfirmationRecipientsFragmentArgs$Companion;", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/messages/ui/sent/readconfirmation/ReadConfirmationRecipientsFragmentArgs;", "fromBundle", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @k
        @e
        public final ReadConfirmationRecipientsFragmentArgs fromBundle(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(ReadConfirmationRecipientsFragmentArgs.class.getClassLoader());
            final boolean containsKey = bundle.containsKey("numberOfConfirms");
            int int1 = 0;
            int int2;
            if (containsKey) {
                int2 = bundle.getInt("numberOfConfirms");
            }
            else {
                int2 = 0;
            }
            if (bundle.containsKey("totalConfirmations")) {
                int1 = bundle.getInt("totalConfirmations");
            }
            if (!bundle.containsKey("messageId")) {
                throw new IllegalArgumentException("Required argument \"messageId\" is missing and does not have an android:defaultValue");
            }
            final String string = bundle.getString("messageId");
            if (string != null) {
                return new ReadConfirmationRecipientsFragmentArgs(int2, int1, string);
            }
            throw new IllegalArgumentException("Argument \"messageId\" is marked as non-null but was passed a null value.");
        }
    }
}
