// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import java.util.Iterator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;

final class c extends Preference
{
    private long z0;
    
    c(final Context context, final List<Preference> list, final long n) {
        super(context);
        this.i2();
        this.j2(list);
        this.z0 = n + 1000000L;
    }
    
    private void i2() {
        this.C1(o.j.D);
        this.w1(o.f.E0);
        this.V1(o.k.C);
        this.K1(999);
    }
    
    private void j2(final List<Preference> list) {
        final ArrayList<PreferenceGroup> list2 = new ArrayList<PreferenceGroup>();
        final Iterator<Preference> iterator = list.iterator();
        CharSequence string = null;
        while (iterator.hasNext()) {
            final Preference preference = iterator.next();
            final CharSequence k0 = preference.k0();
            final boolean b = preference instanceof PreferenceGroup;
            if (b && !TextUtils.isEmpty(k0)) {
                list2.add((PreferenceGroup)preference);
            }
            if (list2.contains(preference.I())) {
                if (!b) {
                    continue;
                }
                list2.add((PreferenceGroup)preference);
            }
            else {
                if (TextUtils.isEmpty(k0)) {
                    continue;
                }
                if (string == null) {
                    string = k0;
                }
                else {
                    string = this.l().getString(o.k.H, new Object[] { string, k0 });
                }
            }
        }
        this.T1(string);
    }
    
    @Override
    public void G0(final n n) {
        super.G0(n);
        n.e(false);
    }
    
    @Override
    long v() {
        return this.z0;
    }
}
