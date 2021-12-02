// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities;

import kotlin.text.s;
import android.widget.TextView;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup;
import org.jetbrains.annotations.f;
import android.view.View;
import kotlin.collections.y0;
import kotlin.s0;
import androidx.core.content.d;
import android.graphics.drawable.Drawable;
import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import org.joda.time.t;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.services.masterdata.b;
import java.util.EnumMap;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.DisplayableEntity;
import java.util.List;
import com.untis.mobile.persistence.models.EntityType;
import java.util.Map;
import android.view.LayoutInflater;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import android.widget.BaseAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016R\u001e\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&" }, d2 = { "Lcom/untis/mobile/ui/activities/q;", "Landroid/widget/BaseAdapter;", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "Landroid/graphics/drawable/Drawable;", "a", "", "c", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "Lkotlin/s0;", "", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "b", "", "getItemId", "getCount", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "H", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/Context;", "G", "Landroid/content/Context;", "context", "", "I", "Ljava/util/Map;", "entites", "profileId", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class q extends BaseAdapter
{
    @e
    private final Context G;
    private final LayoutInflater H;
    @e
    private final Map<EntityType, List<DisplayableEntity>> I;
    
    public q(@e final Context g, @e final String s) {
        k0.p(g, "context");
        k0.p(s, "profileId");
        this.G = g;
        this.H = LayoutInflater.from(g);
        final EnumMap<EntityType, List<DisplayableEntity>> i = new EnumMap<EntityType, List<DisplayableEntity>>(EntityType.class);
        this.I = i;
        final com.untis.mobile.services.masterdata.a a = b.Z.a(s);
        final List<Klasse> f = a.f(true);
        if (f.isEmpty() ^ true) {
            i.put(EntityType.CLASS, (List<DisplayableEntity>)f);
        }
        final List n = com.untis.mobile.services.masterdata.a.a.n(a, true, null, 2, null);
        if (n.isEmpty() ^ true) {
            i.put(EntityType.TEACHER, n);
        }
        final List<Subject> x = a.x(true);
        if (x.isEmpty() ^ true) {
            i.put(EntityType.SUBJECT, (List<DisplayableEntity>)x);
        }
        final List<Room> m = a.m(true);
        if (true ^ m.isEmpty()) {
            i.put(EntityType.ROOM, (List<DisplayableEntity>)m);
        }
    }
    
    private final Drawable a(final EntityType entityType) {
        final int n = a.a[entityType.ordinal()];
        Context context;
        int n2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        context = this.G;
                        n2 = 2131230884;
                    }
                    else {
                        context = this.G;
                        n2 = 2131230932;
                    }
                }
                else {
                    context = this.G;
                    n2 = 2131230951;
                }
            }
            else {
                context = this.G;
                n2 = 2131230952;
            }
        }
        else {
            context = this.G;
            n2 = 2131230876;
        }
        return d.i(context, n2);
    }
    
    private final String c(final EntityType entityType) {
        final int n = a.a[entityType.ordinal()];
        String string = null;
        Label_0082: {
            Context context;
            int n2;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            string = "?";
                            break Label_0082;
                        }
                        context = this.G;
                        n2 = 2131886767;
                    }
                    else {
                        context = this.G;
                        n2 = 2131886781;
                    }
                }
                else {
                    context = this.G;
                    n2 = 2131886783;
                }
            }
            else {
                context = this.G;
                n2 = 2131886680;
            }
            string = context.getString(n2);
        }
        k0.o(string, "when (entityType) {\n        EntityType.CLASS -> context.getString(R.string.shared_classes_text)\n        EntityType.TEACHER -> context.getString(R.string.shared_teachers_text)\n        EntityType.SUBJECT -> context.getString(R.string.shared_subjects_text)\n        EntityType.ROOM -> context.getString(R.string.shared_rooms_text)\n        else -> \"?\"\n    }");
        return string;
    }
    
    @e
    public s0<EntityType, List<DisplayableEntity>> b(final int n) {
        return (s0<EntityType, List<DisplayableEntity>>)y0.F1((Map<?, ?>)this.I).get(n);
    }
    
    public int getCount() {
        return this.I.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    @e
    public View getView(final int n, @f final View view, @f final ViewGroup viewGroup) {
        final s0<EntityType, List<DisplayableEntity>> b = this.b(n);
        final EntityType entityType = b.e();
        final List<DisplayableEntity> list = b.f();
        View inflate = view;
        if (view == null) {
            inflate = this.H.inflate(2131493245, viewGroup, false);
        }
        ((AppCompatImageView)inflate.findViewById(c.i.GB)).setImageDrawable(this.a(entityType));
        ((TextView)inflate.findViewById(c.i.IB)).setText((CharSequence)this.c(entityType));
        final TextView textView = (TextView)inflate.findViewById(c.i.HB);
        final String string = this.G.getString(2131886916);
        k0.o(string, "context.getString(R.string.widget_xElementsAvailable_text)");
        textView.setText((CharSequence)s.k2(string, "{0}", String.valueOf(list.size()), false, 4, (Object)null));
        k0.o(inflate, "view");
        return inflate;
    }
}
