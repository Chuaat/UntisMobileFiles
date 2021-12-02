// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.extension;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a&\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001\u001a&\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001¨\u0006\b" }, d2 = { "Lcom/untis/mobile/persistence/models/profile/Profile;", "", "major", "minor", "patch", "", "c", "a", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class k
{
    public static final boolean a(@e final Profile profile, final int n, final int n2, final int n3) {
        k0.p(profile, "<this>");
        if (profile.getSchoolSemanticApiVersion().length() == 0) {
            return false;
        }
        final List s4 = s.S4((CharSequence)profile.getSchoolSemanticApiVersion(), new String[] { "." }, false, 0, 6, (Object)null);
        final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)s4, 10));
        final Iterator<String> iterator = s4.iterator();
        while (iterator.hasNext()) {
            final Integer x0 = s.X0((String)iterator.next());
            int intValue;
            if (x0 == null) {
                intValue = 0;
            }
            else {
                intValue = x0;
            }
            list.add(Integer.valueOf(intValue));
        }
        return !list.isEmpty() && list.size() >= 3 && ((Integer)list.get(0)).intValue() >= n && (((Integer)list.get(0)).intValue() > n || (((Integer)list.get(1)).intValue() >= n2 && (((Integer)list.get(1)).intValue() > n2 || ((Integer)list.get(2)).intValue() >= n3)));
    }
    
    public static final boolean c(@e final Profile profile, final int n, final int n2, final int n3) {
        k0.p(profile, "<this>");
        if (profile.getSchoolSemanticWuVersion().length() == 0) {
            return false;
        }
        final List s4 = s.S4((CharSequence)profile.getSchoolSemanticWuVersion(), new String[] { "." }, false, 0, 6, (Object)null);
        final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)s4, 10));
        final Iterator<String> iterator = s4.iterator();
        while (iterator.hasNext()) {
            final Integer x0 = s.X0((String)iterator.next());
            int intValue;
            if (x0 == null) {
                intValue = 0;
            }
            else {
                intValue = x0;
            }
            list.add(Integer.valueOf(intValue));
        }
        return !list.isEmpty() && list.size() >= 3 && ((Integer)list.get(0)).intValue() >= n && (((Integer)list.get(0)).intValue() > n || (((Integer)list.get(1)).intValue() >= n2 && (((Integer)list.get(1)).intValue() > n2 || ((Integer)list.get(2)).intValue() >= n3)));
    }
}
