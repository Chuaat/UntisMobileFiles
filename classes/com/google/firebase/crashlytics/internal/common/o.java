// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.a0$f$d;
import java.util.Iterator;
import com.google.firebase.crashlytics.internal.model.a0$f$d$a$b$e;
import com.google.firebase.crashlytics.internal.model.a0$f$d$a$b$d;
import android.os.Build$VERSION;
import com.google.firebase.crashlytics.internal.model.a0$f$e;
import android.os.StatFs;
import com.google.firebase.crashlytics.internal.model.a0$f$c;
import com.google.firebase.crashlytics.internal.model.a0$f;
import com.google.firebase.crashlytics.internal.model.a0$f$a$a;
import com.google.firebase.crashlytics.internal.model.a0$f$a;
import java.util.ArrayList;
import com.google.firebase.crashlytics.internal.model.a0$f$d$a$b$e$b;
import com.google.firebase.crashlytics.internal.model.a0$f$d$a$b$e$b$a;
import com.google.firebase.crashlytics.internal.model.a0$f$d$a$b;
import com.google.firebase.crashlytics.internal.model.a0$f$d$a$b$c$a;
import java.util.List;
import com.google.firebase.crashlytics.internal.model.a0$f$d$a$b$c;
import android.os.Environment;
import com.google.firebase.crashlytics.internal.model.a0$f$d$c;
import com.google.firebase.crashlytics.internal.model.a0$a;
import android.app.ActivityManager$RunningAppProcessInfo;
import com.google.firebase.crashlytics.internal.model.a0$f$d$a;
import c3.e;
import com.google.firebase.crashlytics.internal.model.b0;
import com.google.firebase.crashlytics.internal.model.a0$f$d$a$b$a;
import android.text.TextUtils;
import android.os.Build;
import com.google.firebase.crashlytics.internal.model.a0;
import com.google.firebase.crashlytics.internal.model.a0$c;
import java.util.Locale;
import java.util.HashMap;
import c3.d;
import android.content.Context;
import java.util.Map;

public class o
{
    private static final Map<String, Integer> e;
    static final String f;
    static final int g = 3;
    static final int h = 4;
    static final int i = 3;
    static final String j = "0";
    private final Context a;
    private final w b;
    private final a c;
    private final d d;
    
    static {
        final HashMap<String, Integer> e2 = new HashMap<String, Integer>();
        (e = e2).put("armeabi", 5);
        e2.put("armeabi-v7a", 6);
        e2.put("arm64-v8a", 9);
        e2.put("x86", 0);
        e2.put("x86_64", 1);
        f = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.2.1");
    }
    
    public o(final Context a, final w b, final a c, final d d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private a0$c a() {
        return a0.b().h("18.2.1").d(this.c.a).e(this.b.a()).b(this.c.e).c(this.c.f).g(4);
    }
    
    private static int e() {
        final String cpu_ABI = Build.CPU_ABI;
        if (TextUtils.isEmpty((CharSequence)cpu_ABI)) {
            return 7;
        }
        final Integer n = o.e.get(cpu_ABI.toLowerCase(Locale.US));
        if (n == null) {
            return 7;
        }
        return n;
    }
    
    private a0$f$d$a$b$a f() {
        return a0$f$d$a$b$a.a().b(0L).d(0L).c(this.c.d).e(this.c.b).a();
    }
    
    private b0<a0$f$d$a$b$a> g() {
        return (b0<a0$f$d$a$b$a>)b0.f((Object[])new a0$f$d$a$b$a[] { this.f() });
    }
    
    private a0$f$d$a h(final int n, final e e, final Thread thread, final int n2, final int n3, final boolean b) {
        final ActivityManager$RunningAppProcessInfo j = com.google.firebase.crashlytics.internal.common.g.j(this.c.d, this.a);
        Boolean value;
        if (j != null) {
            value = (j.importance != 100);
        }
        else {
            value = null;
        }
        return a0$f$d$a.a().b(value).f(n).d(this.m(e, thread, n2, n3, b)).a();
    }
    
    private a0$f$d$a i(final int n, final a0$a a0$a) {
        return a0$f$d$a.a().b(Boolean.valueOf(a0$a.b() != 100)).f(n).d(this.n(a0$a)).a();
    }
    
    private a0$f$d$c j(final int n) {
        final com.google.firebase.crashlytics.internal.common.d a = com.google.firebase.crashlytics.internal.common.d.a(this.a);
        final Float b = a.b();
        Double value;
        if (b != null) {
            value = (double)b;
        }
        else {
            value = null;
        }
        return a0$f$d$c.a().b(value).c(a.c()).f(com.google.firebase.crashlytics.internal.common.g.p(this.a)).e(n).g(com.google.firebase.crashlytics.internal.common.g.u() - com.google.firebase.crashlytics.internal.common.g.a(this.a)).d(com.google.firebase.crashlytics.internal.common.g.b(Environment.getDataDirectory().getPath())).a();
    }
    
    private a0$f$d$a$b$c k(final e e, final int n, final int n2) {
        return this.l(e, n, n2, 0);
    }
    
    private a0$f$d$a$b$c l(e d, final int n, final int n2, final int n3) {
        final String b = d.b;
        final String a = d.a;
        StackTraceElement[] c = d.c;
        int n4 = 0;
        int n5 = 0;
        if (c == null) {
            c = new StackTraceElement[0];
        }
        final e d2 = d.d;
        if (n3 >= n2) {
            d = d2;
            while (true) {
                n4 = n5;
                if (d == null) {
                    break;
                }
                d = d.d;
                ++n5;
            }
        }
        final a0$f$d$a$b$c$a d3 = a0$f$d$a$b$c.a().f(b).e(a).c(b0.b((List)this.p(c, n))).d(n4);
        if (d2 != null && n4 == 0) {
            d3.b(this.l(d2, n, n2, n3 + 1));
        }
        return d3.a();
    }
    
    private a0$f$d$a$b m(final e e, final Thread thread, final int n, final int n2, final boolean b) {
        return a0$f$d$a$b.a().f((b0)this.x(e, thread, n, b)).d(this.k(e, n, n2)).e(this.u()).c((b0)this.g()).a();
    }
    
    private a0$f$d$a$b n(final a0$a a0$a) {
        return a0$f$d$a$b.a().b(a0$a).e(this.u()).c((b0)this.g()).a();
    }
    
    private a0$f$d$a$b$e$b o(final StackTraceElement stackTraceElement, final a0$f$d$a$b$e$b$a a0$f$d$a$b$e$b$a) {
        final boolean nativeMethod = stackTraceElement.isNativeMethod();
        final long n = 0L;
        long max;
        if (nativeMethod) {
            max = Math.max(stackTraceElement.getLineNumber(), 0L);
        }
        else {
            max = 0L;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(stackTraceElement.getClassName());
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        final String string = sb.toString();
        final String fileName = stackTraceElement.getFileName();
        long n2 = n;
        if (!stackTraceElement.isNativeMethod()) {
            n2 = n;
            if (stackTraceElement.getLineNumber() > 0) {
                n2 = stackTraceElement.getLineNumber();
            }
        }
        return a0$f$d$a$b$e$b$a.e(max).f(string).b(fileName).d(n2).a();
    }
    
    private b0<a0$f$d$a$b$e$b> p(final StackTraceElement[] array, final int n) {
        final ArrayList<a0$f$d$a$b$e$b> list = new ArrayList<a0$f$d$a$b$e$b>();
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(this.o(array[i], a0$f$d$a$b$e$b.a().c(n)));
        }
        return (b0<a0$f$d$a$b$e$b>)b0.b((List)list);
    }
    
    private a0$f$a q() {
        final a0$f$a$a f = a0$f$a.a().e(this.b.f()).h(this.c.e).d(this.c.f).f(this.b.a());
        final String a = this.c.g.a();
        if (a != null) {
            f.b("Unity").c(a);
        }
        return f.a();
    }
    
    private a0$f r(final String s, final long n) {
        return a0$f.a().l(n).i(s).g(o.f).b(this.q()).k(this.t()).d(this.s()).h(3).a();
    }
    
    private a0$f$c s() {
        final StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return a0$f$c.a().b(e()).f(Build.MODEL).c(Runtime.getRuntime().availableProcessors()).h(com.google.firebase.crashlytics.internal.common.g.u()).d(statFs.getBlockCount() * (long)statFs.getBlockSize()).i(com.google.firebase.crashlytics.internal.common.g.A(this.a)).j(com.google.firebase.crashlytics.internal.common.g.m(this.a)).e(Build.MANUFACTURER).g(Build.PRODUCT).a();
    }
    
    private a0$f$e t() {
        return a0$f$e.a().d(3).e(Build$VERSION.RELEASE).b(Build$VERSION.CODENAME).c(com.google.firebase.crashlytics.internal.common.g.C(this.a)).a();
    }
    
    private a0$f$d$a$b$d u() {
        return a0$f$d$a$b$d.a().d("0").c("0").b(0L).a();
    }
    
    private a0$f$d$a$b$e v(final Thread thread, final StackTraceElement[] array) {
        return this.w(thread, array, 0);
    }
    
    private a0$f$d$a$b$e w(final Thread thread, final StackTraceElement[] array, final int n) {
        return a0$f$d$a$b$e.a().d(thread.getName()).c(n).b(b0.b((List)this.p(array, n))).a();
    }
    
    private b0<a0$f$d$a$b$e> x(final e e, final Thread obj, final int n, final boolean b) {
        final ArrayList<a0$f$d$a$b$e> list = new ArrayList<a0$f$d$a$b$e>();
        list.add(this.w(obj, e.c, n));
        if (b) {
            for (final Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                final Thread thread = entry.getKey();
                if (!thread.equals(obj)) {
                    list.add(this.v(thread, this.d.a((StackTraceElement[])entry.getValue())));
                }
            }
        }
        return (b0<a0$f$d$a$b$e>)b0.b((List)list);
    }
    
    public a0$f$d b(final a0$a a0$a) {
        final int orientation = this.a.getResources().getConfiguration().orientation;
        return a0$f$d.a().f("anr").e(a0$a.h()).b(this.i(orientation, a0$a)).c(this.j(orientation)).a();
    }
    
    public a0$f$d c(final Throwable t, final Thread thread, final String s, final long n, final int n2, final int n3, final boolean b) {
        final int orientation = this.a.getResources().getConfiguration().orientation;
        return a0$f$d.a().f(s).e(n).b(this.h(orientation, new e(t, this.d), thread, n2, n3, b)).c(this.j(orientation)).a();
    }
    
    public a0 d(final String s, final long n) {
        return this.a().i(this.r(s, n)).a();
    }
}
