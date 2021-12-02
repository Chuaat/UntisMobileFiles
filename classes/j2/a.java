// 
// Decompiled by Procyon v0.5.36
// 

package j2;

import com.google.android.gms.measurement.internal.a6;
import android.app.Activity;
import java.util.Map;
import androidx.annotation.c1;
import java.util.List;
import androidx.annotation.u0;
import com.google.android.gms.measurement.internal.b6;
import androidx.annotation.k0;
import androidx.annotation.s0;
import android.os.Bundle;
import androidx.annotation.j0;
import android.content.Context;
import com.google.android.gms.internal.measurement.j3;
import com.google.android.gms.common.internal.b0;

@b0
@a
public class a
{
    private final j3 a;
    
    public a(final j3 a) {
        this.a = a;
    }
    
    @j0
    @s0(allOf = { "android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK" })
    @b0
    @a
    public static a k(@j0 final Context context) {
        return j3.C(context, null, null, null, null).z();
    }
    
    @j0
    @s0(allOf = { "android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK" })
    @a
    public static a l(@j0 final Context context, @j0 final String s, @j0 final String s2, @k0 final String s3, @j0 final Bundle bundle) {
        return j3.C(context, s, s2, s3, bundle).z();
    }
    
    @b0
    @a
    public void A(@j0 final c c) {
        this.a.o(c);
    }
    
    public final void B(final boolean b) {
        this.a.h(b);
    }
    
    @a
    public void a(@j0 @u0(min = 1L) final String s) {
        this.a.Q(s);
    }
    
    @a
    public void b(@j0 @u0(max = 24L, min = 1L) final String s, @k0 final String s2, @k0 final Bundle bundle) {
        this.a.R(s, s2, bundle);
    }
    
    @a
    public void c(@j0 @u0(min = 1L) final String s) {
        this.a.S(s);
    }
    
    @a
    public long d() {
        return this.a.x();
    }
    
    @k0
    @a
    public String e() {
        return this.a.F();
    }
    
    @k0
    @a
    public String f() {
        return this.a.H();
    }
    
    @c1
    @j0
    @a
    public List<Bundle> g(@k0 final String s, @k0 @u0(max = 23L, min = 1L) final String s2) {
        return this.a.L(s, s2);
    }
    
    @k0
    @a
    public String h() {
        return this.a.I();
    }
    
    @k0
    @a
    public String i() {
        return this.a.J();
    }
    
    @k0
    @a
    public String j() {
        return this.a.K();
    }
    
    @c1
    @a
    public int m(@j0 @u0(min = 1L) final String s) {
        return this.a.w(s);
    }
    
    @c1
    @j0
    @a
    public Map<String, Object> n(@k0 final String s, @k0 @u0(max = 24L, min = 1L) final String s2, final boolean b) {
        return this.a.M(s, s2, b);
    }
    
    @a
    public void o(@j0 final String s, @j0 final String s2, @j0 final Bundle bundle) {
        this.a.U(s, s2, bundle);
    }
    
    @a
    public void p(@j0 final String s, @j0 final String s2, @j0 final Bundle bundle, final long n) {
        this.a.V(s, s2, bundle, n);
    }
    
    @k0
    @a
    public void q(@j0 final Bundle bundle) {
        this.a.y(bundle, false);
    }
    
    @k0
    @a
    public Bundle r(@j0 final Bundle bundle) {
        return this.a.y(bundle, true);
    }
    
    @b0
    @a
    public void s(@j0 final c c) {
        this.a.b(c);
    }
    
    @a
    public void t(@j0 final Bundle bundle) {
        this.a.d(bundle);
    }
    
    @a
    public void u(@j0 final Bundle bundle) {
        this.a.e(bundle);
    }
    
    @a
    public void v(@j0 final Activity activity, @k0 @u0(max = 36L, min = 1L) final String s, @k0 @u0(max = 36L, min = 1L) final String s2) {
        this.a.g(activity, s, s2);
    }
    
    @c1
    @b0
    @a
    public void w(@j0 final b b) {
        this.a.j(b);
    }
    
    @a
    public void x(@k0 final Boolean b) {
        this.a.k(b);
    }
    
    @a
    public void y(final boolean b) {
        this.a.k(b);
    }
    
    @a
    public void z(@j0 final String s, @j0 final String s2, @j0 final Object o) {
        this.a.n(s, s2, o, true);
    }
    
    @f2.a
    public static final class a
    {
        @j0
        @f2.a
        public static final String a = "origin";
        @j0
        @f2.a
        public static final String b = "name";
        @j0
        @f2.a
        public static final String c = "value";
        @j0
        @f2.a
        public static final String d = "trigger_event_name";
        @j0
        @f2.a
        public static final String e = "trigger_timeout";
        @j0
        @f2.a
        public static final String f = "timed_out_event_name";
        @j0
        @f2.a
        public static final String g = "timed_out_event_params";
        @j0
        @f2.a
        public static final String h = "triggered_event_name";
        @j0
        @f2.a
        public static final String i = "triggered_event_params";
        @j0
        @f2.a
        public static final String j = "time_to_live";
        @j0
        @f2.a
        public static final String k = "expired_event_name";
        @j0
        @f2.a
        public static final String l = "expired_event_params";
        @j0
        @f2.a
        public static final String m = "creation_timestamp";
        @j0
        @f2.a
        public static final String n = "active";
        @j0
        @f2.a
        public static final String o = "triggered_timestamp";
        
        private a() {
        }
    }
    
    @b0
    @a
    public interface b extends a6
    {
        @c1
        @b0
        @a
        void a(@j0 final String p0, @j0 final String p1, @j0 final Bundle p2, final long p3);
    }
    
    @b0
    @a
    public interface c extends b6
    {
        @c1
        @b0
        @a
        void a(@j0 final String p0, @j0 final String p1, @j0 final Bundle p2, final long p3);
    }
}
