// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.extension;

import android.util.LongSparseArray;
import com.untis.mobile.persistence.models.Entity;
import androidx.core.content.d;
import android.text.Spannable;
import android.content.Context;
import com.untis.mobile.persistence.models.DisplayableEntity;
import java.util.ArrayList;
import kotlin.collections.v;
import n6.l;
import java.util.Iterator;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aN\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u00002!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0018\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u000b0\u00012\u0006\u0010\r\u001a\u00020\f\u001a \u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\b\b\u0000\u0010\u0000*\u00020\u0010*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001a\u0010\u0015\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00130\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¨\u0006\u0016" }, d2 = { "T", "", "replacement", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "t", "", "match", "c", "(Ljava/util/List;Ljava/lang/Object;Ln6/l;)Ljava/util/List;", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "Landroid/content/Context;", "context", "Landroid/text/Spannable;", "d", "Lcom/untis/mobile/persistence/models/Entity;", "Landroid/util/LongSparseArray;", "e", "", "separator", "a", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class c
{
    @e
    public static final String a(@e final List<String> list, @e final String s) {
        k0.p(list, "<this>");
        k0.p(s, "separator");
        final Iterator<String> iterator = (Iterator<String>)list.iterator();
        if (iterator.hasNext()) {
            String s2 = iterator.next();
            while (iterator.hasNext()) {
                final String s3 = iterator.next();
                String c;
                final String s4 = c = s2;
                if (s.U1((CharSequence)s4) ^ true) {
                    c = k0.C(s4, s);
                }
                s2 = k0.C(c, s3);
            }
            return s2;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
    
    @e
    public static final <T> List<T> c(@e final List<? extends T> list, final T t, @e final l<? super T, Boolean> l) {
        k0.p(list, "<this>");
        k0.p(l, "match");
        final ArrayList<T> list2 = new ArrayList<T>(v.Y((Iterable<?>)list, 10));
        final Iterator<? extends T> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next;
            if (l.invoke((T)(next = iterator.next()))) {
                next = t;
            }
            list2.add((T)next);
        }
        return list2;
    }
    
    @e
    public static final Spannable d(@e final List<? extends DisplayableEntity> list, @e final Context context) {
        k0.p(list, "<this>");
        k0.p(context, "context");
        final ArrayList<String> list2 = new ArrayList<String>(v.Y((Iterable<?>)list, 10));
        final Iterator<? extends T> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((DisplayableEntity)iterator.next()).getDisplayableDescription());
        }
        final Iterator<Object> iterator2 = list2.iterator();
        if (iterator2.hasNext()) {
            String s = iterator2.next();
            while (iterator2.hasNext()) {
                final String s2 = iterator2.next();
                String c;
                final String s3 = c = s;
                if (kotlin.text.s.U1((CharSequence)s3) ^ true) {
                    c = k0.C(s3, " | ");
                }
                s = k0.C(c, s2);
            }
            return h.N(s, "|", d.f(context, 2131099979));
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
    
    @e
    public static final <T extends Entity> LongSparseArray<T> e(@e final List<? extends T> list) {
        k0.p(list, "<this>");
        final LongSparseArray longSparseArray = new LongSparseArray();
        for (final Entity entity : list) {
            longSparseArray.put(entity.entityId(), (Object)entity);
        }
        return (LongSparseArray<T>)longSparseArray;
    }
}
