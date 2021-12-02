// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.settings.old;

import android.app.Application;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.services.profile.legacy.j0;
import android.content.Context;
import android.content.SharedPreferences$Editor;
import com.untis.mobile.UntisMobileApplication;
import android.content.SharedPreferences;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\r\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0016\u0010!\u001a\u00020\u001b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0016\u0010\"\u001a\u00020\u001b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0016\u0010#\u001a\u00020\u001b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0016\u0010$\u001a\u00020\u001b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0016\u0010%\u001a\u00020\u001b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u001c¨\u0006(" }, d2 = { "Lcom/untis/mobile/utils/settings/old/c;", "Lcom/untis/mobile/utils/settings/old/a;", "Landroid/content/SharedPreferences;", "t", "", "s", "g", "enabled", "Lkotlin/j2;", "k", "f", "a", "j", "disabled", "o", "e", "h", "c", "n", "i", "m", "q", "b", "l", "p", "d", "r", "", "Ljava/lang/String;", "KEY_LOGGING_API", "KEY_PREMIUM_WIDGET_OFF", "KEY_DEVELOPER_MODE", "KEY_PREMIUM_HOMEWORK_OFF", "KEY_LOGGING_ALL", "KEY_EXTENDED_DEVELOPER_MODE", "KEY_NEW_ABSENCE_VIEW", "KEY_PREMIUM_OFF", "KEY_PREMIUM_TT_SETTING_OFF", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c implements a
{
    @e
    public static final c c;
    @e
    private static final String d = "ao";
    @e
    private static final String e = "firefly";
    @e
    private static final String f = "dark";
    @e
    private static final String g = "stranger_things";
    @e
    private static final String h = "dirk_gentlys_holistic_detective_agency";
    @e
    private static final String i = "star_trek_discovery";
    @e
    private static final String j = "a_series_of_unfortunate_events";
    @e
    private static final String k = "tale_of_tales";
    @e
    private static final String l = "black_mirror";
    
    static {
        c = new c();
    }
    
    private c() {
    }
    
    private final boolean s() {
        final SharedPreferences t = this.t();
        boolean boolean1 = false;
        if (t != null) {
            boolean1 = t.getBoolean("ao", false);
        }
        return boolean1;
    }
    
    private final SharedPreferences t() {
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        SharedPreferences sharedPreferences;
        if (b == null) {
            sharedPreferences = null;
        }
        else {
            sharedPreferences = ((Application)b).getSharedPreferences("schedule_widget_settings", 0);
        }
        return sharedPreferences;
    }
    
    @Override
    public void a(final boolean b) {
        final SharedPreferences t = this.t();
        if (t != null) {
            final SharedPreferences$Editor edit = t.edit();
            if (edit != null) {
                final SharedPreferences$Editor putBoolean = edit.putBoolean("firefly", b);
                if (putBoolean != null) {
                    putBoolean.apply();
                }
            }
        }
    }
    
    @Override
    public void b(final boolean b) {
        final SharedPreferences t = this.t();
        if (t != null) {
            final SharedPreferences$Editor edit = t.edit();
            if (edit != null) {
                final SharedPreferences$Editor putBoolean = edit.putBoolean("a_series_of_unfortunate_events", b);
                if (putBoolean != null) {
                    putBoolean.apply();
                }
            }
        }
    }
    
    @Override
    public boolean c() {
        final SharedPreferences t = this.t();
        final boolean b = false;
        if (t == null || !t.getBoolean("star_trek_discovery", false)) {
            final boolean b2 = b;
            if (!this.j()) {
                return b2;
            }
        }
        boolean b2 = b;
        if (this.s()) {
            b2 = true;
        }
        return b2;
    }
    
    @Override
    public boolean d() {
        final SharedPreferences t = this.t();
        final boolean b = false;
        final boolean b2 = t != null && t.getBoolean("black_mirror", false);
        boolean b3 = b;
        if (b2) {
            b3 = b;
            if (this.s()) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public boolean e() {
        final SharedPreferences t = this.t();
        final boolean b = false;
        if (t == null || !t.getBoolean("stranger_things", false)) {
            final boolean b2 = b;
            if (!this.j()) {
                return b2;
            }
        }
        boolean b2 = b;
        if (this.s()) {
            b2 = true;
        }
        return b2;
    }
    
    @Override
    public boolean f() {
        final SharedPreferences t = this.t();
        final boolean b = false;
        final boolean b2 = t != null && t.getBoolean("firefly", false);
        boolean b3 = b;
        if (b2) {
            b3 = b;
            if (this.s()) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public boolean g() {
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        final boolean b2 = false;
        if (b == null) {
            return false;
        }
        final boolean k = com.untis.mobile.utils.a.a((Context)b).K();
        boolean b3 = b2;
        if (this.s()) {
            if (!k) {
                final Profile n = j0.G.n();
                final boolean b4 = n != null && n.isPremium();
                b3 = b2;
                if (!b4) {
                    return b3;
                }
            }
            b3 = true;
        }
        return b3;
    }
    
    @Override
    public void h(final boolean b) {
        final SharedPreferences t = this.t();
        if (t != null) {
            final SharedPreferences$Editor edit = t.edit();
            if (edit != null) {
                final SharedPreferences$Editor putBoolean = edit.putBoolean("stranger_things", b);
                if (putBoolean != null) {
                    putBoolean.apply();
                }
            }
        }
    }
    
    @Override
    public boolean i() {
        final SharedPreferences t = this.t();
        final boolean b = false;
        if (t == null || !t.getBoolean("dirk_gentlys_holistic_detective_agency", false)) {
            final boolean b2 = b;
            if (!this.j()) {
                return b2;
            }
        }
        boolean b2 = b;
        if (this.s()) {
            b2 = true;
        }
        return b2;
    }
    
    @Override
    public boolean j() {
        final SharedPreferences t = this.t();
        final boolean b = false;
        final boolean b2 = t != null && t.getBoolean("dark", false);
        boolean b3 = b;
        if (b2) {
            b3 = b;
            if (this.s()) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public void k(final boolean b) {
        final SharedPreferences t = this.t();
        if (t != null) {
            final SharedPreferences$Editor edit = t.edit();
            if (edit != null) {
                final SharedPreferences$Editor putBoolean = edit.putBoolean("ao", b);
                if (putBoolean != null) {
                    putBoolean.apply();
                }
            }
        }
    }
    
    @Override
    public boolean l() {
        final SharedPreferences t = this.t();
        final boolean b = false;
        final boolean b2 = t != null && t.getBoolean("tale_of_tales", false);
        boolean b3 = b;
        if (b2) {
            b3 = b;
            if (this.s()) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public void m(final boolean b) {
        final SharedPreferences t = this.t();
        if (t != null) {
            final SharedPreferences$Editor edit = t.edit();
            if (edit != null) {
                final SharedPreferences$Editor putBoolean = edit.putBoolean("dirk_gentlys_holistic_detective_agency", b);
                if (putBoolean != null) {
                    putBoolean.apply();
                }
            }
        }
    }
    
    @Override
    public void n(final boolean b) {
        final SharedPreferences t = this.t();
        if (t != null) {
            final SharedPreferences$Editor edit = t.edit();
            if (edit != null) {
                final SharedPreferences$Editor putBoolean = edit.putBoolean("star_trek_discovery", b);
                if (putBoolean != null) {
                    putBoolean.apply();
                }
            }
        }
    }
    
    @Override
    public void o(final boolean b) {
        final SharedPreferences t = this.t();
        if (t != null) {
            final SharedPreferences$Editor edit = t.edit();
            if (edit != null) {
                final SharedPreferences$Editor putBoolean = edit.putBoolean("dark", b);
                if (putBoolean != null) {
                    putBoolean.apply();
                }
            }
        }
    }
    
    @Override
    public void p(final boolean b) {
        final SharedPreferences t = this.t();
        if (t != null) {
            final SharedPreferences$Editor edit = t.edit();
            if (edit != null) {
                final SharedPreferences$Editor putBoolean = edit.putBoolean("tale_of_tales", b);
                if (putBoolean != null) {
                    putBoolean.apply();
                }
            }
        }
    }
    
    @Override
    public boolean q() {
        final SharedPreferences t = this.t();
        final boolean b = false;
        final boolean b2 = t != null && t.getBoolean("a_series_of_unfortunate_events", false);
        boolean b3 = b;
        if (b2) {
            b3 = b;
            if (this.s()) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public void r(final boolean b) {
        final SharedPreferences t = this.t();
        if (t != null) {
            final SharedPreferences$Editor edit = t.edit();
            if (edit != null) {
                final SharedPreferences$Editor putBoolean = edit.putBoolean("black_mirror", b);
                if (putBoolean != null) {
                    putBoolean.apply();
                }
            }
        }
    }
}
