// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.events.attachment;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.jetbrains.annotations.f;
import android.os.Parcelable;
import m6.k;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.dashboard.persistence.model.Attachment;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.navigation.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \t2\u00020\u0001:\u0001\u0006B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0017" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/events/attachment/d;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "e", "", "Lcom/untis/mobile/dashboard/persistence/model/Attachment;", "a", "()[Lcom/untis/mobile/dashboard/persistence/model/Attachment;", "attachments", "b", "([Lcom/untis/mobile/dashboard/persistence/model/Attachment;)Lcom/untis/mobile/dashboard/ui/option/events/attachment/d;", "", "toString", "", "hashCode", "", "other", "", "equals", "[Lcom/untis/mobile/dashboard/persistence/model/Attachment;", "d", "<init>", "([Lcom/untis/mobile/dashboard/persistence/model/Attachment;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d implements l
{
    @e
    public static final a b;
    @e
    private final Attachment[] a;
    
    static {
        b = new a(null);
    }
    
    public d(@e final Attachment[] a) {
        k0.p(a, "attachments");
        this.a = a;
    }
    
    @k
    @e
    public static final d fromBundle(@e final Bundle bundle) {
        return d.b.a(bundle);
    }
    
    @e
    public final Attachment[] a() {
        return this.a;
    }
    
    @e
    public final d b(@e final Attachment[] array) {
        k0.p(array, "attachments");
        return new d(array);
    }
    
    @e
    public final Attachment[] d() {
        return this.a;
    }
    
    @e
    public final Bundle e() {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArray("attachments", (Parcelable[])this.a);
        return bundle;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof d && k0.g(this.a, ((d)o).a));
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.a);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DashboardAttachmentFragmentArgs(attachments=");
        sb.append(Arrays.toString(this.a));
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "com/untis/mobile/dashboard/ui/option/events/attachment/d$a", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/dashboard/ui/option/events/attachment/d;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final d a(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(d.class.getClassLoader());
            if (!bundle.containsKey("attachments")) {
                throw new IllegalArgumentException("Required argument \"attachments\" is missing and does not have an android:defaultValue");
            }
            final Parcelable[] parcelableArray = bundle.getParcelableArray("attachments");
            Attachment[] array;
            if (parcelableArray == null) {
                array = null;
            }
            else {
                final ArrayList list = new ArrayList<Attachment>(parcelableArray.length);
                for (final Parcelable obj : parcelableArray) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.dashboard.persistence.model.Attachment");
                    list.add((Attachment)obj);
                }
                final Attachment[] array2 = list.toArray(new Attachment[0]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                array = array2;
            }
            if (array != null) {
                return new d(array);
            }
            throw new IllegalArgumentException("Argument \"attachments\" is marked as non-null but was passed a null value.");
        }
    }
}
