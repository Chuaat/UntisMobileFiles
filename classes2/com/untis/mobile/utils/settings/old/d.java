// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.settings.old;

import org.joda.time.base.e;
import org.joda.time.base.g;
import org.joda.time.n0;
import org.joda.time.t;
import com.untis.mobile.ui.adapters.infocenter.a;
import android.preference.PreferenceManager;
import android.content.Context;
import androidx.annotation.j0;
import android.content.SharedPreferences;
import java.io.Serializable;

public class d implements b, Serializable
{
    private static final String H = "ics_01";
    private static final String I = "ics_02";
    private static final String J = "ics_03";
    private static final String K = "ics_04";
    private static final String L = "ics_05";
    private static final String M = "ics_06";
    @j0
    private final SharedPreferences G;
    
    private d(@j0 final Context context) {
        this.G = PreferenceManager.getDefaultSharedPreferences(context);
    }
    
    @j0
    public static b n(@j0 final Context context) {
        return new d(context);
    }
    
    @Override
    public void a() {
        this.G.edit().putBoolean("ics_06", false).apply();
    }
    
    @Override
    public boolean b() {
        final SharedPreferences g = this.G;
        boolean b = true;
        if (!g.getBoolean("ics_06", true) || this.G.getInt("ics_05", 0) <= 10) {
            b = false;
        }
        return b;
    }
    
    @Override
    public void c() {
        this.G.edit().putBoolean("ics_06", true).putInt("ics_05", 0).apply();
    }
    
    @Override
    public void d(@j0 final a a) {
        this.G.edit().putInt("ics_01", a.h()).apply();
    }
    
    @Override
    public void e(@j0 final t t) {
        this.G.edit().putLong("ics_03", ((g)t.F0()).n()).apply();
    }
    
    @Override
    public int f() {
        return this.G.getInt("ics_05", 0);
    }
    
    @Override
    public void g(final boolean b) {
        this.G.edit().putBoolean("ics_04", b).apply();
    }
    
    @Override
    public boolean h() {
        return this.G.getBoolean("ics_04", false);
    }
    
    @j0
    @Override
    public a i() {
        return a.d(this.G.getInt("ics_01", a.I.h()));
    }
    
    @j0
    @Override
    public t j() {
        final t t = new t(this.G.getLong("ics_03", com.untis.mobile.utils.time.a.d()));
        final t b = com.untis.mobile.utils.time.a.b();
        if (((e)t).m((n0)b)) {
            return t;
        }
        return b;
    }
    
    @Override
    public void k(final boolean b) {
        this.G.edit().putBoolean("ics_02", b).apply();
    }
    
    @Override
    public boolean l() {
        return this.G.getBoolean("ics_02", false);
    }
    
    @Override
    public void m() {
        this.G.edit().putInt("ics_05", this.G.getInt("ics_05", 0) + 1).apply();
    }
}
