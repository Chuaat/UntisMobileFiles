// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.settings;

import kotlin.text.s;
import android.content.SharedPreferences$Editor;
import kotlin.d0;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import kotlin.b0;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010'\u001a\u00020%¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J$\u0010\u001c\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u001a2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010!\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&¨\u0006*" }, d2 = { "Lcom/untis/mobile/utils/settings/h;", "Lcom/untis/mobile/utils/settings/g;", "", "userId", "Landroid/content/SharedPreferences;", "n", "Lcom/untis/mobile/utils/settings/i;", "setting", "", "string", "Lkotlin/j2;", "b", "k", "e", "Lcom/untis/mobile/utils/settings/a;", "", "boolean", "a", "d", "i", "Lcom/untis/mobile/utils/settings/d;", "long", "j", "h", "c", "f", "T", "Lcom/untis/mobile/utils/settings/f;", "g", "Lcom/untis/mobile/utils/settings/b;", "Lkotlin/b0;", "m", "()Lcom/untis/mobile/utils/settings/b;", "cryptography", "Landroid/util/LongSparseArray;", "Landroid/util/LongSparseArray;", "preferencesCache", "Landroid/content/Context;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h implements g
{
    @e
    private final Context b;
    @e
    private final LongSparseArray<SharedPreferences> c;
    @e
    private final b0 d;
    
    public h(@e final Context b) {
        k0.p(b, "context");
        this.b = b;
        this.c = (LongSparseArray<SharedPreferences>)new LongSparseArray();
        this.d = d0.c((n6.a<?>)new n6.a<com.untis.mobile.utils.settings.b>() {
            final /* synthetic */ h G;
            
            @e
            public final com.untis.mobile.utils.settings.b a() {
                return new com.untis.mobile.utils.settings.b(h.l(this.G));
            }
        });
    }
    
    public static final /* synthetic */ Context l(final h h) {
        return h.b;
    }
    
    private final com.untis.mobile.utils.settings.b m() {
        return this.d.getValue();
    }
    
    private final SharedPreferences n(final long l) {
        SharedPreferences sharedPreferences;
        if ((sharedPreferences = (SharedPreferences)this.c.get(l)) == null) {
            sharedPreferences = this.b.getSharedPreferences(k0.C("untis.preferences.", l), 0);
            this.c.put(l, (Object)sharedPreferences);
        }
        k0.o(sharedPreferences, "preferences");
        return sharedPreferences;
    }
    
    @Override
    public void a(@e final com.untis.mobile.utils.settings.a a, final boolean b, final long n) {
        k0.p(a, "setting");
        final boolean c = a.c();
        final SharedPreferences$Editor edit = this.n(n).edit();
        final String a2 = a.a();
        SharedPreferences$Editor sharedPreferences$Editor;
        if (c) {
            sharedPreferences$Editor = edit.putString(a2, this.m().e(String.valueOf(b)));
        }
        else {
            sharedPreferences$Editor = edit.putBoolean(a2, b);
        }
        sharedPreferences$Editor.apply();
    }
    
    @Override
    public void b(@e final i i, @e final String s, final long n) {
        k0.p(i, "setting");
        k0.p(s, "string");
        String e = s;
        if (i.c()) {
            e = this.m().e(s);
        }
        this.n(n).edit().putString(i.a(), e).apply();
    }
    
    @Override
    public void c(@e final d d, final long n) {
        k0.p(d, "setting");
        this.n(n).edit().remove(d.a()).apply();
    }
    
    @Override
    public boolean d(@e final com.untis.mobile.utils.settings.a a, final long n) {
        k0.p(a, "setting");
        final boolean c = a.c();
        final SharedPreferences n2 = this.n(n);
        final String a2 = a.a();
        if (!c) {
            return n2.getBoolean(a2, (boolean)a.b());
        }
        final String string = n2.getString(a2, "");
        if (string == null) {
            return a.b();
        }
        if (string.length() == 0) {
            return a.b();
        }
        return Boolean.parseBoolean(this.m().d(string));
    }
    
    @Override
    public void e(@e final i i, final long n) {
        k0.p(i, "setting");
        this.n(n).edit().remove(i.a()).apply();
    }
    
    @Override
    public void f(final long n) {
        this.n(n).edit().clear().apply();
    }
    
    @Override
    public <T> boolean g(@e final f<T> f, final long n) {
        k0.p(f, "setting");
        return this.n(n).contains(f.a());
    }
    
    @Override
    public long h(@e final d d, long n) {
        k0.p(d, "setting");
        final boolean c = d.c();
        final SharedPreferences n2 = this.n(n);
        final String a = d.a();
        if (!c) {
            return n2.getLong(a, ((f<Number>)d).b().longValue());
        }
        final String string = n2.getString(a, "");
        if (string == null) {
            return ((f<Number>)d).b().longValue();
        }
        if (string.length() == 0) {
            return ((f<Number>)d).b().longValue();
        }
        final Long z0 = s.Z0(this.m().d(string));
        if (z0 == null) {
            n = ((f<Number>)d).b().longValue();
        }
        else {
            n = z0;
        }
        return n;
    }
    
    @Override
    public void i(@e final com.untis.mobile.utils.settings.a a, final long n) {
        k0.p(a, "setting");
        this.n(n).edit().remove(a.a()).apply();
    }
    
    @Override
    public void j(@e final d d, final long l, final long n) {
        k0.p(d, "setting");
        final boolean c = d.c();
        final SharedPreferences$Editor edit = this.n(n).edit();
        final String a = d.a();
        SharedPreferences$Editor sharedPreferences$Editor;
        if (c) {
            sharedPreferences$Editor = edit.putString(a, this.m().e(String.valueOf(l)));
        }
        else {
            sharedPreferences$Editor = edit.putLong(a, l);
        }
        sharedPreferences$Editor.apply();
    }
    
    @e
    @Override
    public String k(@e final i i, final long n) {
        k0.p(i, "setting");
        String string;
        if ((string = this.n(n).getString(i.a(), (String)i.b())) == null) {
            string = i.b();
        }
        k0.o(string, "preferences(userId)\n            .getString(setting.aliasKey, setting.defaultValue)\n            ?: setting.defaultValue");
        String d = string;
        if (i.c()) {
            d = this.m().d(string);
        }
        return d;
    }
}
