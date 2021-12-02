// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.send.confirm;

import java.io.Serializable;
import android.os.Parcelable;
import m6.k;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import com.untis.mobile.messages.util.SendMessageTypes;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.navigation.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'B7\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b%\u0010&J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\t\u0010\n\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J=\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003R\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0010\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\u000f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$¨\u0006(" }, d2 = { "Lcom/untis/mobile/messages/ui/send/confirm/SendMessageConfirmedFragmentArgs;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "toBundle", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "component1", "", "component2", "", "component3", "component4", "", "component5", "sendMessageTo", "copyToStudents", "numberOfRecipients", "readConfirmation", "singleRecipientName", "copy", "toString", "hashCode", "", "other", "equals", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "getSendMessageTo", "()Lcom/untis/mobile/messages/util/SendMessageTypes;", "Ljava/lang/String;", "getSingleRecipientName", "()Ljava/lang/String;", "Z", "getReadConfirmation", "()Z", "getCopyToStudents", "I", "getNumberOfRecipients", "()I", "<init>", "(Lcom/untis/mobile/messages/util/SendMessageTypes;ZIZLjava/lang/String;)V", "Companion", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SendMessageConfirmedFragmentArgs implements l
{
    @e
    public static final Companion Companion;
    private final boolean copyToStudents;
    private final int numberOfRecipients;
    private final boolean readConfirmation;
    @e
    private final SendMessageTypes sendMessageTo;
    @f
    private final String singleRecipientName;
    
    static {
        Companion = new Companion(null);
    }
    
    public SendMessageConfirmedFragmentArgs(@e final SendMessageTypes sendMessageTo, final boolean copyToStudents, final int numberOfRecipients, final boolean readConfirmation, @f final String singleRecipientName) {
        k0.p(sendMessageTo, "sendMessageTo");
        this.sendMessageTo = sendMessageTo;
        this.copyToStudents = copyToStudents;
        this.numberOfRecipients = numberOfRecipients;
        this.readConfirmation = readConfirmation;
        this.singleRecipientName = singleRecipientName;
    }
    
    @k
    @e
    public static final SendMessageConfirmedFragmentArgs fromBundle(@e final Bundle bundle) {
        return SendMessageConfirmedFragmentArgs.Companion.fromBundle(bundle);
    }
    
    @e
    public final SendMessageTypes component1() {
        return this.sendMessageTo;
    }
    
    public final boolean component2() {
        return this.copyToStudents;
    }
    
    public final int component3() {
        return this.numberOfRecipients;
    }
    
    public final boolean component4() {
        return this.readConfirmation;
    }
    
    @f
    public final String component5() {
        return this.singleRecipientName;
    }
    
    @e
    public final SendMessageConfirmedFragmentArgs copy(@e final SendMessageTypes sendMessageTypes, final boolean b, final int n, final boolean b2, @f final String s) {
        k0.p(sendMessageTypes, "sendMessageTo");
        return new SendMessageConfirmedFragmentArgs(sendMessageTypes, b, n, b2, s);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SendMessageConfirmedFragmentArgs)) {
            return false;
        }
        final SendMessageConfirmedFragmentArgs sendMessageConfirmedFragmentArgs = (SendMessageConfirmedFragmentArgs)o;
        return this.sendMessageTo == sendMessageConfirmedFragmentArgs.sendMessageTo && this.copyToStudents == sendMessageConfirmedFragmentArgs.copyToStudents && this.numberOfRecipients == sendMessageConfirmedFragmentArgs.numberOfRecipients && this.readConfirmation == sendMessageConfirmedFragmentArgs.readConfirmation && k0.g(this.singleRecipientName, sendMessageConfirmedFragmentArgs.singleRecipientName);
    }
    
    public final boolean getCopyToStudents() {
        return this.copyToStudents;
    }
    
    public final int getNumberOfRecipients() {
        return this.numberOfRecipients;
    }
    
    public final boolean getReadConfirmation() {
        return this.readConfirmation;
    }
    
    @e
    public final SendMessageTypes getSendMessageTo() {
        return this.sendMessageTo;
    }
    
    @f
    public final String getSingleRecipientName() {
        return this.singleRecipientName;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.sendMessageTo.hashCode();
        final int copyToStudents = this.copyToStudents ? 1 : 0;
        int n = 1;
        int n2 = copyToStudents;
        if (copyToStudents != 0) {
            n2 = 1;
        }
        final int numberOfRecipients = this.numberOfRecipients;
        final int readConfirmation = this.readConfirmation ? 1 : 0;
        if (readConfirmation == 0) {
            n = readConfirmation;
        }
        final String singleRecipientName = this.singleRecipientName;
        int hashCode2;
        if (singleRecipientName == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = singleRecipientName.hashCode();
        }
        return (((hashCode * 31 + n2) * 31 + numberOfRecipients) * 31 + n) * 31 + hashCode2;
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
        bundle.putBoolean("copyToStudents", this.copyToStudents);
        bundle.putInt("numberOfRecipients", this.numberOfRecipients);
        bundle.putBoolean("readConfirmation", this.readConfirmation);
        bundle.putString("singleRecipientName", this.singleRecipientName);
        return bundle;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SendMessageConfirmedFragmentArgs(sendMessageTo=");
        sb.append(this.sendMessageTo);
        sb.append(", copyToStudents=");
        sb.append(this.copyToStudents);
        sb.append(", numberOfRecipients=");
        sb.append(this.numberOfRecipients);
        sb.append(", readConfirmation=");
        sb.append(this.readConfirmation);
        sb.append(", singleRecipientName=");
        sb.append((Object)this.singleRecipientName);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "Lcom/untis/mobile/messages/ui/send/confirm/SendMessageConfirmedFragmentArgs$Companion;", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/messages/ui/send/confirm/SendMessageConfirmedFragmentArgs;", "fromBundle", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @k
        @e
        public final SendMessageConfirmedFragmentArgs fromBundle(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(SendMessageConfirmedFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("sendMessageTo")) {
                throw new IllegalArgumentException("Required argument \"sendMessageTo\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(SendMessageTypes.class) && !Serializable.class.isAssignableFrom(SendMessageTypes.class)) {
                throw new UnsupportedOperationException(k0.C(SendMessageTypes.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            final SendMessageTypes sendMessageTypes = (SendMessageTypes)bundle.get("sendMessageTo");
            if (sendMessageTypes == null) {
                throw new IllegalArgumentException("Argument \"sendMessageTo\" is marked as non-null but was passed a null value.");
            }
            final boolean b = bundle.containsKey("copyToStudents") && bundle.getBoolean("copyToStudents");
            int int1;
            if (bundle.containsKey("numberOfRecipients")) {
                int1 = bundle.getInt("numberOfRecipients");
            }
            else {
                int1 = 0;
            }
            final boolean b2 = bundle.containsKey("readConfirmation") && bundle.getBoolean("readConfirmation");
            if (bundle.containsKey("singleRecipientName")) {
                return new SendMessageConfirmedFragmentArgs(sendMessageTypes, b, int1, b2, bundle.getString("singleRecipientName"));
            }
            throw new IllegalArgumentException("Required argument \"singleRecipientName\" is missing and does not have an android:defaultValue");
        }
    }
}
