// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.events;

import androidx.navigation.a;
import java.util.Arrays;
import android.os.Parcelable;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import com.untis.mobile.dashboard.persistence.model.Attachment;
import androidx.navigation.d0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/events/h;", "", "<init>", "()V", "a", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h
{
    @e
    public static final b a;
    
    static {
        a = new b(null);
    }
    
    private h() {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0019" }, d2 = { "com/untis/mobile/dashboard/ui/option/events/h$a", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "", "Lcom/untis/mobile/dashboard/persistence/model/Attachment;", "a", "()[Lcom/untis/mobile/dashboard/persistence/model/Attachment;", "attachments", "Lcom/untis/mobile/dashboard/ui/option/events/h$a;", "b", "([Lcom/untis/mobile/dashboard/persistence/model/Attachment;)Lcom/untis/mobile/dashboard/ui/option/events/h$a;", "", "toString", "hashCode", "", "other", "", "equals", "[Lcom/untis/mobile/dashboard/persistence/model/Attachment;", "d", "<init>", "([Lcom/untis/mobile/dashboard/persistence/model/Attachment;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class a implements d0
    {
        @e
        private final Attachment[] a;
        
        public a(@e final Attachment[] a) {
            k0.p(a, "attachments");
            this.a = a;
        }
        
        @e
        public final Attachment[] a() {
            return this.a;
        }
        
        @e
        public final a b(@e final Attachment[] array) {
            k0.p(array, "attachments");
            return new a(array);
        }
        
        @e
        public final Attachment[] d() {
            return this.a;
        }
        
        @Override
        public boolean equals(@f final Object o) {
            return this == o || (o instanceof a && k0.g(this.a, ((a)o).a));
        }
        
        public int getActionId() {
            return 2131296357;
        }
        
        @e
        public Bundle getArguments() {
            final Bundle bundle = new Bundle();
            bundle.putParcelableArray("attachments", (Parcelable[])this.a);
            return bundle;
        }
        
        @Override
        public int hashCode() {
            return Arrays.hashCode(this.a);
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionDashboardUpcomingFragmentToDashboardAttachmentFragment(attachments=");
            sb.append(Arrays.toString(this.a));
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001b\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b" }, d2 = { "com/untis/mobile/dashboard/ui/option/events/h$b", "", "Landroidx/navigation/d0;", "b", "", "Lcom/untis/mobile/dashboard/persistence/model/Attachment;", "attachments", "a", "([Lcom/untis/mobile/dashboard/persistence/model/Attachment;)Landroidx/navigation/d0;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class b
    {
        private b() {
        }
        
        @e
        public final d0 a(@e final Attachment[] array) {
            k0.p(array, "attachments");
            return (d0)new a(array);
        }
        
        @e
        public final d0 b() {
            return (d0)new androidx.navigation.a(2131296358);
        }
    }
}
