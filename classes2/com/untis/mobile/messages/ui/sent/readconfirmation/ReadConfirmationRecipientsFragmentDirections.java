// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.sent.readconfirmation;

import java.io.Serializable;
import android.os.Parcelable;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import com.untis.mobile.messages.data.model.ReadConfirmationStatus;
import androidx.navigation.d0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/readconfirmation/ReadConfirmationRecipientsFragmentDirections;", "", "<init>", "()V", "Companion", "ActionReadConfirmationRecipientsFragmentToReadConfirmationParentsFragment", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ReadConfirmationRecipientsFragmentDirections
{
    @e
    public static final Companion Companion;
    
    static {
        Companion = new Companion(null);
    }
    
    private ReadConfirmationRecipientsFragmentDirections() {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\t\u0010\f\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00d6\u0003R\u0019\u0010\b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/readconfirmation/ReadConfirmationRecipientsFragmentDirections$ActionReadConfirmationRecipientsFragmentToReadConfirmationParentsFragment;", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "Lcom/untis/mobile/messages/data/model/ReadConfirmationStatus;", "component1", "readConfirmationStatus", "copy", "", "toString", "hashCode", "", "other", "", "equals", "Lcom/untis/mobile/messages/data/model/ReadConfirmationStatus;", "getReadConfirmationStatus", "()Lcom/untis/mobile/messages/data/model/ReadConfirmationStatus;", "<init>", "(Lcom/untis/mobile/messages/data/model/ReadConfirmationStatus;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class ActionReadConfirmationRecipientsFragmentToReadConfirmationParentsFragment implements d0
    {
        @e
        private final ReadConfirmationStatus readConfirmationStatus;
        
        public ActionReadConfirmationRecipientsFragmentToReadConfirmationParentsFragment(@e final ReadConfirmationStatus readConfirmationStatus) {
            k0.p(readConfirmationStatus, "readConfirmationStatus");
            this.readConfirmationStatus = readConfirmationStatus;
        }
        
        @e
        public final ReadConfirmationStatus component1() {
            return this.readConfirmationStatus;
        }
        
        @e
        public final ActionReadConfirmationRecipientsFragmentToReadConfirmationParentsFragment copy(@e final ReadConfirmationStatus readConfirmationStatus) {
            k0.p(readConfirmationStatus, "readConfirmationStatus");
            return new ActionReadConfirmationRecipientsFragmentToReadConfirmationParentsFragment(readConfirmationStatus);
        }
        
        @Override
        public boolean equals(@f final Object o) {
            return this == o || (o instanceof ActionReadConfirmationRecipientsFragmentToReadConfirmationParentsFragment && k0.g(this.readConfirmationStatus, ((ActionReadConfirmationRecipientsFragmentToReadConfirmationParentsFragment)o).readConfirmationStatus));
        }
        
        public int getActionId() {
            return 2131296375;
        }
        
        @e
        public Bundle getArguments() {
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
        public final ReadConfirmationStatus getReadConfirmationStatus() {
            return this.readConfirmationStatus;
        }
        
        @Override
        public int hashCode() {
            return this.readConfirmationStatus.hashCode();
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionReadConfirmationRecipientsFragmentToReadConfirmationParentsFragment(readConfirmationStatus=");
            sb.append(this.readConfirmationStatus);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/readconfirmation/ReadConfirmationRecipientsFragmentDirections$Companion;", "", "Lcom/untis/mobile/messages/data/model/ReadConfirmationStatus;", "readConfirmationStatus", "Landroidx/navigation/d0;", "actionReadConfirmationRecipientsFragmentToReadConfirmationParentsFragment", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @e
        public final d0 actionReadConfirmationRecipientsFragmentToReadConfirmationParentsFragment(@e final ReadConfirmationStatus readConfirmationStatus) {
            k0.p(readConfirmationStatus, "readConfirmationStatus");
            return (d0)new ActionReadConfirmationRecipientsFragmentToReadConfirmationParentsFragment(readConfirmationStatus);
        }
    }
}
