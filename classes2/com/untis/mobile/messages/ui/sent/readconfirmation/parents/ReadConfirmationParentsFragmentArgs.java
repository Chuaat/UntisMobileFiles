// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.sent.readconfirmation.parents;

import java.io.Serializable;
import android.os.Parcelable;
import org.jetbrains.annotations.f;
import m6.k;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.messages.data.model.ReadConfirmationStatus;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.navigation.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\t\u001a\u00020\bH\u00d6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u00d6\u0003R\u0019\u0010\u0006\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/readconfirmation/parents/ReadConfirmationParentsFragmentArgs;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "toBundle", "Lcom/untis/mobile/messages/data/model/ReadConfirmationStatus;", "component1", "readConfirmationStatus", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/untis/mobile/messages/data/model/ReadConfirmationStatus;", "getReadConfirmationStatus", "()Lcom/untis/mobile/messages/data/model/ReadConfirmationStatus;", "<init>", "(Lcom/untis/mobile/messages/data/model/ReadConfirmationStatus;)V", "Companion", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ReadConfirmationParentsFragmentArgs implements l
{
    @e
    public static final Companion Companion;
    @e
    private final ReadConfirmationStatus readConfirmationStatus;
    
    static {
        Companion = new Companion(null);
    }
    
    public ReadConfirmationParentsFragmentArgs(@e final ReadConfirmationStatus readConfirmationStatus) {
        k0.p(readConfirmationStatus, "readConfirmationStatus");
        this.readConfirmationStatus = readConfirmationStatus;
    }
    
    @k
    @e
    public static final ReadConfirmationParentsFragmentArgs fromBundle(@e final Bundle bundle) {
        return ReadConfirmationParentsFragmentArgs.Companion.fromBundle(bundle);
    }
    
    @e
    public final ReadConfirmationStatus component1() {
        return this.readConfirmationStatus;
    }
    
    @e
    public final ReadConfirmationParentsFragmentArgs copy(@e final ReadConfirmationStatus readConfirmationStatus) {
        k0.p(readConfirmationStatus, "readConfirmationStatus");
        return new ReadConfirmationParentsFragmentArgs(readConfirmationStatus);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof ReadConfirmationParentsFragmentArgs && k0.g(this.readConfirmationStatus, ((ReadConfirmationParentsFragmentArgs)o).readConfirmationStatus));
    }
    
    @e
    public final ReadConfirmationStatus getReadConfirmationStatus() {
        return this.readConfirmationStatus;
    }
    
    @Override
    public int hashCode() {
        return this.readConfirmationStatus.hashCode();
    }
    
    @e
    public final Bundle toBundle() {
        final Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(ReadConfirmationStatus.class)) {
            bundle.putParcelable("readConfirmationStatus", (Parcelable)this.readConfirmationStatus);
        }
        else {
            if (!Serializable.class.isAssignableFrom(ReadConfirmationStatus.class)) {
                throw new UnsupportedOperationException(k0.C(ReadConfirmationStatus.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("readConfirmationStatus", (Serializable)this.readConfirmationStatus);
        }
        return bundle;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ReadConfirmationParentsFragmentArgs(readConfirmationStatus=");
        sb.append(this.readConfirmationStatus);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/readconfirmation/parents/ReadConfirmationParentsFragmentArgs$Companion;", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/messages/ui/sent/readconfirmation/parents/ReadConfirmationParentsFragmentArgs;", "fromBundle", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @k
        @e
        public final ReadConfirmationParentsFragmentArgs fromBundle(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(ReadConfirmationParentsFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("readConfirmationStatus")) {
                throw new IllegalArgumentException("Required argument \"readConfirmationStatus\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(ReadConfirmationStatus.class) && !Serializable.class.isAssignableFrom(ReadConfirmationStatus.class)) {
                throw new UnsupportedOperationException(k0.C(ReadConfirmationStatus.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            final ReadConfirmationStatus readConfirmationStatus = (ReadConfirmationStatus)bundle.get("readConfirmationStatus");
            if (readConfirmationStatus != null) {
                return new ReadConfirmationParentsFragmentArgs(readConfirmationStatus);
            }
            throw new IllegalArgumentException("Argument \"readConfirmationStatus\" is marked as non-null but was passed a null value.");
        }
    }
}
