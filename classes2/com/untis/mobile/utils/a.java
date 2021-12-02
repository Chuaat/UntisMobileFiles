// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import org.joda.time.base.g;
import org.joda.time.base.e;
import android.util.TypedValue;
import java.util.Objects;
import android.annotation.SuppressLint;
import android.provider.Settings$Secure;
import java.lang.reflect.Type;
import com.google.gson.GsonBuilder;
import android.content.SharedPreferences$Editor;
import com.untis.mobile.utils.settings.old.c;
import org.joda.time.n0;
import org.joda.time.t;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.widget.ScheduleLinkWidgetContext;
import android.util.Log;
import com.google.gson.Gson;
import com.untis.mobile.persistence.models.silentmode.SilentModeSettings;
import com.untis.mobile.persistence.models.profile.Profile;
import android.preference.PreferenceManager;
import java.util.HashMap;
import android.content.SharedPreferences;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.k0;
import com.untis.mobile.persistence.models.DefaultColors;
import java.util.Map;

public class a
{
    public static final boolean A = false;
    public static final String A0 = "app_colors";
    @Deprecated
    public static final String B = "loadedlegacyprofiles_v2";
    private static final String B0 = "lastUpdate";
    public static final String C = "schedule_text_size";
    private static final String C0 = "last_version";
    public static final float D = 1.0f;
    private static final String D0 = "howAreYou";
    public static final String E = "first_premium_shown";
    private static final String E0 = "iAmGoodHowAreYou";
    public static final String F = "entity_type";
    private static final String F0 = "ibizaIsALie";
    public static final String G = "entity_id";
    private static final String G0 = "weAreGoingToIbiza";
    public static final String H = "slider_open";
    private static final String H0 = "end_premium_warning";
    public static final boolean I = false;
    private static final String I0 = "remove_premium_warning";
    public static final String J = "migration_level";
    private static final String J0 = "last_show_unsubscribe_hint_date";
    public static final int K = 0;
    private static final String K0 = "is_monthly_yearly_subscription";
    public static final String L = "silent_mode";
    private static final Map<String, DefaultColors> L0;
    public static final boolean M = false;
    public static final String N = "ics_04";
    public static final String O = "silent_mode_settings";
    public static final String P = "homework_show_old";
    public static final boolean Q = false;
    public static final String R = "scaling_v2";
    public static final String S = "show_help_v2";
    public static final String T = "premium_v2";
    public static final String U = "timetable_zoom_v2";
    public static final String V = "room_search_v2";
    public static final String W = "room_timetable_select_v2";
    public static final String X = "switch_to_weekly_view_v2";
    public static final String Y = "switch_to_daily_view_v2";
    public static final String Z = "switch_to_today_v2";
    public static final String a0 = "show_help_classbook_v2";
    public static final String b0 = "show_help_classrole";
    @k0
    private static a c;
    public static final String c0 = "show_help_favorites_v2";
    public static final String d = "schedulemode";
    public static final String d0 = "show_help_global_plan_search_v2";
    public static final boolean e = true;
    public static final String e0 = "show_help_date_picker_v1";
    public static final String f = "schedulemodedays";
    public static final String f0 = "show_help_lessontopic_v2";
    public static final int g = 7;
    public static final String g0 = "show_help_absences_v2";
    public static final String h = "colormode";
    public static final String h0 = "show_help_homework_v2";
    public static final boolean i = true;
    public static final String i0 = "show_help_infocenter_v2";
    public static final String j = "cancelled_periods";
    public static final String j0 = "show_help_selected_plan_search_v2";
    public static final boolean k = true;
    public static final String k0 = "show_help_officehour_v3";
    public static final String l = "cancelled_periods_display";
    public static final String l0 = "show_help_custom_color_v1";
    public static final boolean m = false;
    public static final String m0 = "show_help_submit_own_absence";
    public static final String n = "show_rooms";
    public static final String n0 = "show_help_things_to_do";
    public static final boolean o = true;
    public static final String o0 = "show_help_custom_notifications";
    public static final String p = "teacher_full";
    public static final String p0 = "show_help_custom_colors_details";
    public static final boolean q = true;
    public static final String q0 = "show_help_beta";
    public static final String r = "subjects_full";
    public static final String r0 = "show_lockscreen_notification";
    public static final boolean s = true;
    public static final String s0 = "widget_link_id";
    public static final String t = "element_color";
    public static final String t0 = "widget_link_profile";
    public static final boolean u = true;
    public static final String u0 = "widget_link_entity_type";
    public static final String v = "is_premium";
    public static final String v0 = "widget_link_entity_id";
    public static final String w = "is_yearly_premium";
    public static final String w0 = "fmc_token_old";
    public static final String x = "is_premium_homework";
    public static final String x0 = "fcm_token_current";
    public static final String y = "is_premium_widget";
    public static final String y0 = "profile_current";
    public static final String z = "is_premium_tt_settings";
    public static final String z0 = "profile_current_object";
    @j0
    private Context a;
    @j0
    private SharedPreferences b;
    
    static {
        L0 = new HashMap<String, DefaultColors>();
    }
    
    private a(@j0 final Context a) {
        this.a = a;
        this.b = PreferenceManager.getDefaultSharedPreferences(a);
    }
    
    private void Z(@j0 final Context a) {
        this.a = a;
        this.b = PreferenceManager.getDefaultSharedPreferences(a);
    }
    
    public static a a(@j0 final Context context) {
        final a c = a.c;
        if (c == null) {
            a.c = new a(context.getApplicationContext());
        }
        else {
            c.Z(context.getApplicationContext());
        }
        return a.c;
    }
    
    @j0
    private String b(@j0 final Profile profile, final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append(profile.getUniqueId());
        sb.append("@");
        sb.append(str);
        return sb.toString();
    }
    
    public boolean A() {
        return this.b.getBoolean("remove_premium_warning", true);
    }
    
    public void A0(final boolean b) {
        this.b.edit().putBoolean("show_help_classbook_v2", b).apply();
    }
    
    public boolean A1() {
        return this.b.getBoolean("room_timetable_select_v2", true);
    }
    
    public int B() {
        return this.C().muteOnBreak;
    }
    
    public void B0(final boolean b) {
        this.b.edit().putBoolean("show_help_classrole", b).apply();
    }
    
    public boolean B1(@k0 final Profile profile) {
        return this.b.getBoolean("show_rooms", true);
    }
    
    @j0
    public SilentModeSettings C() {
        final SharedPreferences b = this.b;
        SilentModeSettings silentModeSettings = null;
        final String string = b.getString("silent_mode_settings", (String)null);
        try {
            silentModeSettings = new Gson().fromJson(string, SilentModeSettings.class);
        }
        catch (Exception ex) {
            Log.e("untis_log", "could not read json settings!", (Throwable)ex);
            this.b.edit().remove("silent_mode_settings").apply();
        }
        SilentModeSettings silentModeSettings2 = silentModeSettings;
        if (silentModeSettings == null) {
            silentModeSettings2 = new SilentModeSettings();
        }
        return silentModeSettings2;
    }
    
    public void C0(final boolean b) {
        this.b.edit().putBoolean("show_help_custom_colors_details", b).apply();
    }
    
    public boolean C1() {
        final SharedPreferences b = this.b;
        boolean b2 = true;
        if (!b.getBoolean("show_help_selected_plan_search_v2", true) || !this.t1()) {
            b2 = false;
        }
        return b2;
    }
    
    @k0
    public ScheduleLinkWidgetContext D(final int i) {
        final SharedPreferences b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("widget_link_id@");
        sb.append(i);
        if (b.getInt(sb.toString(), -1) == -1) {
            return null;
        }
        final SharedPreferences b2 = this.b;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("widget_link_id@");
        sb2.append(i);
        final int int1 = b2.getInt(sb2.toString(), 0);
        final SharedPreferences b3 = this.b;
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("widget_link_profile@");
        sb3.append(i);
        final String string = b3.getString(sb3.toString(), "");
        final EntityType.Companion companion = EntityType.Companion;
        final SharedPreferences b4 = this.b;
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("widget_link_entity_type@");
        sb4.append(i);
        final EntityType by = companion.findBy(b4.getInt(sb4.toString(), EntityType.NONE.getWebuntisId()));
        final SharedPreferences b5 = this.b;
        final StringBuilder sb5 = new StringBuilder();
        sb5.append("widget_link_entity_id@");
        sb5.append(i);
        return new ScheduleLinkWidgetContext(int1, string, by, b5.getLong(sb5.toString(), 0L));
    }
    
    public void D0(final boolean b) {
        this.b.edit().putBoolean("show_help_custom_color_v1", b).apply();
    }
    
    public boolean D1() {
        final SharedPreferences b = this.b;
        boolean b2 = true;
        if (!b.getBoolean("show_help_favorites_v2", true) || !this.t1()) {
            b2 = false;
        }
        return b2;
    }
    
    public boolean E() {
        return this.b.getBoolean("is_yearly_premium", false);
    }
    
    public void E0(final boolean b) {
        this.b.edit().putBoolean("show_help_custom_notifications", b).apply();
    }
    
    public boolean E1() {
        return this.b.getBoolean("show_help_submit_own_absence", true);
    }
    
    public boolean F() {
        return this.b.getBoolean("first_premium_shown", true);
    }
    
    public void F0(final boolean b) {
        this.b.edit().putBoolean("switch_to_daily_view_v2", b).apply();
    }
    
    public boolean F1() {
        final SharedPreferences b = this.b;
        boolean b2 = true;
        if (!b.getBoolean("switch_to_today_v2", true) || !this.t1()) {
            b2 = false;
        }
        return b2;
    }
    
    public boolean G() {
        return this.b.getBoolean("homework_show_old", false);
    }
    
    public void G0(final boolean b) {
        this.b.edit().putBoolean("show_help_date_picker_v1", b).apply();
    }
    
    public boolean G1() {
        final SharedPreferences b = this.b;
        boolean b2 = true;
        if (!b.getBoolean("timetable_zoom_v2", true) || !this.t1()) {
            b2 = false;
        }
        return b2;
    }
    
    public boolean H() {
        return this.b.getBoolean("show_lockscreen_notification", true);
    }
    
    public void H0(final boolean b) {
        this.b.edit().putBoolean("end_premium_warning", b).apply();
    }
    
    public boolean H1() {
        final SharedPreferences b = this.b;
        boolean b2 = true;
        if (!b.getBoolean("switch_to_weekly_view_v2", true) || !this.t1()) {
            b2 = false;
        }
        return b2;
    }
    
    public boolean I(@k0 final Profile profile) {
        final t t = new t();
        final t b = com.untis.mobile.utils.v.a.b();
        final boolean p = ((e)t).p((n0)b);
        boolean b3;
        final boolean b2 = b3 = true;
        if (!p) {
            if (((e)t).m((n0)b)) {
                b3 = b2;
            }
            else {
                if (profile == null) {
                    return false;
                }
                if (profile.isPremium() && !com.untis.mobile.utils.settings.old.c.c.j()) {
                    return true;
                }
                b3 = (this.b.getBoolean("is_premium", false) && !com.untis.mobile.utils.settings.old.c.c.j() && b2);
            }
        }
        return b3;
    }
    
    public void I0(final boolean b) {
        this.b.edit().putBoolean("show_help_v2", b).apply();
    }
    
    public boolean I1(@k0 final Profile profile) {
        return this.b.getBoolean("colormode", true);
    }
    
    public boolean J(@k0 final Profile profile) {
        final SharedPreferences b = this.b;
        final boolean b2 = false;
        if (!b.getBoolean("is_premium_homework", false)) {
            final boolean b3 = b2;
            if (!this.I(profile)) {
                return b3;
            }
        }
        boolean b3 = b2;
        if (!com.untis.mobile.utils.settings.old.c.c.e()) {
            b3 = true;
        }
        return b3;
    }
    
    public void J0(final boolean b) {
        this.b.edit().putBoolean("premium_v2", b).apply();
    }
    
    public boolean J1() {
        return this.b.getBoolean("schedulemode", true);
    }
    
    public boolean K() {
        return this.b.getBoolean("is_premium", false);
    }
    
    public void K0(final boolean b) {
        this.b.edit().putBoolean("show_help_homework_v2", b).apply();
    }
    
    public boolean L(@k0 final Profile profile) {
        final SharedPreferences b = this.b;
        final boolean b2 = false;
        if (!b.getBoolean("is_premium_tt_settings", false)) {
            final boolean b3 = b2;
            if (!this.I(profile)) {
                return b3;
            }
        }
        boolean b3 = b2;
        if (!com.untis.mobile.utils.settings.old.c.c.c()) {
            b3 = true;
        }
        return b3;
    }
    
    public void L0(final boolean b) {
        this.b.edit().putBoolean("show_help_infocenter_v2", b).apply();
    }
    
    public boolean M(@k0 final Profile profile) {
        final SharedPreferences b = this.b;
        final boolean b2 = false;
        if (!b.getBoolean("is_premium_widget", false)) {
            final boolean b3 = b2;
            if (!this.I(profile)) {
                return b3;
            }
        }
        boolean b3 = b2;
        if (!com.untis.mobile.utils.settings.old.c.c.i()) {
            b3 = true;
        }
        return b3;
    }
    
    public void M0(final boolean b) {
        this.b.edit().putBoolean("show_help_things_to_do", b).apply();
    }
    
    public boolean N(final Profile profile) {
        return profile != null && (profile.isPremium() || this.K());
    }
    
    public void N0(final boolean b) {
        this.b.edit().putBoolean("show_help_lessontopic_v2", b).apply();
    }
    
    public boolean O() {
        return this.b.getBoolean("show_help_custom_colors_details", true);
    }
    
    public void O0(final boolean b) {
        this.b.edit().putBoolean("show_help_officehour_v3", b).apply();
    }
    
    public boolean P() {
        return this.b.getBoolean("show_help_custom_notifications", true);
    }
    
    public void P0(final boolean b) {
        this.b.edit().putBoolean("remove_premium_warning", b).apply();
    }
    
    public boolean Q() {
        final SharedPreferences b = this.b;
        boolean b2 = false;
        if (b.getBoolean("silent_mode", false)) {
            b2 = b2;
            if (this.C().profileId != null) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public void Q0(final boolean b) {
        this.b.edit().putBoolean("room_search_v2", b).apply();
    }
    
    public boolean R() {
        return this.b.getBoolean("ics_04", false);
    }
    
    public void R0(final boolean b) {
        this.b.edit().putBoolean("room_timetable_select_v2", b).apply();
    }
    
    public boolean S() {
        return this.C().isVibrate;
    }
    
    public void S0(final boolean b) {
        this.b.edit().putBoolean("show_help_favorites_v2", b).apply();
    }
    
    public boolean T() {
        return this.b.getBoolean("slider_open", false);
    }
    
    public void T0(final boolean b) {
        this.b.edit().putBoolean("show_help_submit_own_absence", b).apply();
    }
    
    public boolean U() {
        return this.s() == 0;
    }
    
    public void U0(final boolean b) {
        this.b.edit().putBoolean("switch_to_today_v2", b).apply();
    }
    
    public void V(final int n) {
        final SharedPreferences$Editor edit = this.b.edit();
        final StringBuilder sb = new StringBuilder();
        sb.append("widget_link_id@");
        sb.append(n);
        final SharedPreferences$Editor remove = edit.remove(sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("widget_link_profile@");
        sb2.append(n);
        final SharedPreferences$Editor remove2 = remove.remove(sb2.toString());
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("widget_link_entity_type@");
        sb3.append(n);
        final SharedPreferences$Editor remove3 = remove2.remove(sb3.toString());
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("widget_link_entity_id@");
        sb4.append(n);
        remove3.remove(sb4.toString()).apply();
    }
    
    public void V0(final boolean b) {
        this.b.edit().putBoolean("timetable_zoom_v2", b).apply();
    }
    
    public void W(@j0 final Profile profile) {
        this.b.edit().remove(this.b(profile, "ibizaIsALie")).remove(this.b(profile, "weAreGoingToIbiza")).remove(this.b(profile, "howAreYou")).remove(this.b(profile, "iAmGoodHowAreYou")).apply();
    }
    
    public void W0(final boolean b) {
        this.b.edit().putBoolean("switch_to_weekly_view_v2", b).apply();
    }
    
    public void X() {
        this.I0(true);
        this.J0(true);
        this.V0(true);
        this.Q0(true);
        this.R0(true);
        this.W0(true);
        this.F0(true);
        this.A0(true);
        this.e0(true);
        this.N0(true);
        this.z0(true);
        this.L0(true);
        this.U0(true);
        this.O0(true);
        this.y0(true);
        this.S0(true);
        this.D0(true);
        this.O0(true);
        this.M0(true);
        this.T0(true);
        this.E0(true);
        this.C0(true);
        this.G0(true);
    }
    
    public void X0(final boolean b) {
        this.b.edit().putBoolean("silent_mode", b).apply();
    }
    
    public void Y(@j0 final Profile profile, @k0 final DefaultColors defaultColors) {
        DefaultColors defaultColors2 = defaultColors;
        if (defaultColors == null) {
            defaultColors2 = new DefaultColors();
        }
        com.untis.mobile.utils.a.L0.put(profile.getUniqueId(), defaultColors2);
        final SharedPreferences$Editor edit = this.b.edit();
        final StringBuilder sb = new StringBuilder();
        sb.append(profile.getUniqueId());
        sb.append("@");
        sb.append("app_colors");
        edit.putString(sb.toString(), new Gson().toJson(defaultColors2)).apply();
    }
    
    public void Y0(final int muteOnBreak) {
        final SilentModeSettings c = this.C();
        c.muteOnBreak = muteOnBreak;
        this.a1(c);
    }
    
    public void Z0(final boolean b) {
        this.b.edit().putBoolean("ics_04", b).apply();
    }
    
    public void a0(@j0 final String s) {
        this.b.edit().putString("fcm_token_current", s).apply();
    }
    
    public void a1(@k0 final SilentModeSettings silentModeSettings) {
        if (silentModeSettings == null) {
            return;
        }
        this.b.edit().putString("silent_mode_settings", new Gson().toJson(silentModeSettings)).apply();
    }
    
    public void b0(final Profile profile) {
        this.b.edit().putString("profile_current_object", new GsonBuilder().registerTypeAdapter(Profile.class, new s5.a()).enableComplexMapKeySerialization().excludeFieldsWithModifiers(16).create().toJson(profile)).apply();
    }
    
    public void b1(final boolean isVibrate) {
        final SilentModeSettings c = this.C();
        c.isVibrate = isVibrate;
        this.a1(c);
    }
    
    public void c() {
        this.b.edit().remove("profile_current").remove("profile_current_object").apply();
    }
    
    public void c0(final long n) {
        this.b.edit().putLong("profile_current", n).apply();
    }
    
    public void c1(final boolean b) {
        this.b.edit().putBoolean("slider_open", b).apply();
    }
    
    public void d(@j0 final Profile profile) {
        final SharedPreferences$Editor edit = this.b.edit();
        final StringBuilder sb = new StringBuilder();
        sb.append(profile.getUniqueId());
        sb.append("@");
        sb.append("entity_type");
        edit.remove(sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(profile.getUniqueId());
        sb2.append("@");
        sb2.append("entity_id");
        edit.remove(sb2.toString());
        edit.apply();
    }
    
    public void d0(final boolean b) {
        this.b.edit().putBoolean("first_premium_shown", b).apply();
    }
    
    public void d1(final boolean b) {
        this.b.edit().putBoolean("schedulemode", b).apply();
    }
    
    @SuppressLint({ "HardwareIds" })
    @j0
    public String e() {
        try {
            return Settings$Secure.getString(this.a.getContentResolver(), "android_id");
        }
        catch (Exception ex) {
            return "";
        }
    }
    
    public void e0(final boolean b) {
        this.b.edit().putBoolean("show_help_global_plan_search_v2", b).apply();
    }
    
    public void e1(final boolean b) {
        this.b.edit().putBoolean("colormode", b).apply();
    }
    
    @j0
    public DefaultColors f(@k0 final Profile profile) {
        String uniqueId;
        if (profile == null) {
            uniqueId = "";
        }
        else {
            uniqueId = profile.getUniqueId();
        }
        return this.g(uniqueId);
    }
    
    public void f0(final boolean b) {
        this.b.edit().putBoolean("homework_show_old", b).apply();
    }
    
    public void f1(@j0 final ScheduleLinkWidgetContext scheduleLinkWidgetContext) {
        final SharedPreferences$Editor edit = this.b.edit();
        final StringBuilder sb = new StringBuilder();
        sb.append("widget_link_id@");
        sb.append(scheduleLinkWidgetContext.getWidgetId());
        final SharedPreferences$Editor putInt = edit.putInt(sb.toString(), scheduleLinkWidgetContext.getWidgetId());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("widget_link_profile@");
        sb2.append(scheduleLinkWidgetContext.getWidgetId());
        final SharedPreferences$Editor putString = putInt.putString(sb2.toString(), scheduleLinkWidgetContext.getProfileId());
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("widget_link_entity_type@");
        sb3.append(scheduleLinkWidgetContext.getWidgetId());
        final SharedPreferences$Editor putInt2 = putString.putInt(sb3.toString(), scheduleLinkWidgetContext.getEntityType().getWebuntisId());
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("widget_link_entity_id@");
        sb4.append(scheduleLinkWidgetContext.getWidgetId());
        putInt2.putLong(sb4.toString(), scheduleLinkWidgetContext.getEntityId()).apply();
    }
    
    @j0
    public DefaultColors g(@k0 final String str) {
        // monitorenter(this)
        Label_0018: {
            if (str != null) {
                break Label_0018;
            }
            try {
                return new DefaultColors();
                // iftrue(Label_0127:, defaultColors2 != null)
                // iftrue(Label_0138:, defaultColors = defaultColors2 != null)
                DefaultColors defaultColors = null;
            Label_0127:
                while (true) {
                    DefaultColors defaultColors2 = null;
                    defaultColors = defaultColors2;
                    defaultColors = new DefaultColors();
                    break Label_0127;
                    Label_0138: {
                        return defaultColors;
                    }
                    defaultColors2 = com.untis.mobile.utils.a.L0.get(str);
                    final SharedPreferences b = this.b;
                    final StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("@");
                    sb.append("app_colors");
                    final String string = b.getString(sb.toString(), (String)null);
                    try {
                        defaultColors2 = new Gson().fromJson(string, DefaultColors.class);
                    }
                    catch (Exception ex) {}
                    continue;
                }
                com.untis.mobile.utils.a.L0.put(str, defaultColors);
                return defaultColors;
            }
            finally {
            }
            // monitorexit(this)
        }
    }
    
    public void g0(final boolean b) {
        this.b.edit().putBoolean("is_monthly_yearly_subscription", b).apply();
    }
    
    public void g1(final boolean b) {
        this.b.edit().putBoolean("is_yearly_premium", b).apply();
    }
    
    @j0
    public String h() {
        return this.b.getString("fcm_token_current", "");
    }
    
    public void h0(final boolean b) {
        this.b.edit().putBoolean("show_lockscreen_notification", b).apply();
    }
    
    public boolean h1() {
        final SharedPreferences b = this.b;
        boolean b2 = true;
        if (!b.getBoolean("show_help_absences_v2", true) || !this.t1()) {
            b2 = false;
        }
        return b2;
    }
    
    public Profile i() {
        final Gson create = new GsonBuilder().registerTypeAdapter(Profile.class, new s5.a()).enableComplexMapKeySerialization().excludeFieldsWithModifiers(16).create();
        final String string = this.b.getString("profile_current_object", "");
        Objects.requireNonNull(string);
        Profile n;
        if ((n = create.fromJson(string, Profile.class)) == null) {
            n = com.untis.mobile.services.profile.legacy.j0.G.n();
        }
        return n;
    }
    
    public void i0(@j0 final Profile profile) {
        final t userPremiumEnd = profile.getUserPremiumEnd();
        SharedPreferences$Editor sharedPreferences$Editor;
        if (userPremiumEnd == null) {
            sharedPreferences$Editor = this.b.edit().remove(this.b(profile, "howAreYou"));
        }
        else {
            sharedPreferences$Editor = this.b.edit().putString(this.b(profile, "howAreYou"), userPremiumEnd.toString());
        }
        sharedPreferences$Editor.apply();
    }
    
    public boolean i1(@k0 final Profile profile) {
        return this.b.getBoolean("cancelled_periods_display", false);
    }
    
    public long j() {
        return this.b.getLong("profile_current", 0L);
    }
    
    public void j0(@j0 final Profile profile, final boolean b) {
        this.b.edit().putBoolean(this.b(profile, "ibizaIsALie"), b).apply();
    }
    
    public boolean j1() {
        return this.b.getBoolean("cancelled_periods", true);
    }
    
    public boolean k() {
        return this.b.getBoolean("is_monthly_yearly_subscription", false);
    }
    
    public void k0(@j0 final Profile profile, final boolean b) {
        this.b.edit().putBoolean(this.b(profile, "weAreGoingToIbiza"), b).apply();
    }
    
    public boolean k1() {
        final SharedPreferences b = this.b;
        boolean b2 = true;
        if (!b.getBoolean("show_help_classbook_v2", true) || !this.t1()) {
            b2 = false;
        }
        return b2;
    }
    
    @k0
    public t l(@j0 final Profile profile) {
        try {
            return org.joda.time.t.c0(this.b.getString(this.b(profile, "howAreYou"), (String)null));
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public void l0(@j0 final Profile profile) {
        this.b.edit().putBoolean(this.b(profile, "iAmGoodHowAreYou"), profile.getUserPremium()).apply();
    }
    
    public boolean l1() {
        final SharedPreferences b = this.b;
        boolean b2 = true;
        if (!b.getBoolean("show_help_classrole", true) || !this.t1()) {
            b2 = false;
        }
        return b2;
    }
    
    public boolean m(@j0 final Profile profile) {
        return this.b.getBoolean(this.b(profile, "ibizaIsALie"), true);
    }
    
    public void m0(final String s) {
        this.b.edit().putString("last_show_unsubscribe_hint_date", s).apply();
    }
    
    public boolean m1() {
        return this.b.getBoolean("show_help_custom_color_v1", true);
    }
    
    public boolean n(@j0 final Profile profile) {
        return this.b.getBoolean(this.b(profile, "weAreGoingToIbiza"), true);
    }
    
    public void n0(final long n) {
        this.b.edit().putLong("lastUpdate", n).apply();
    }
    
    public boolean n1() {
        final SharedPreferences b = this.b;
        boolean b2 = true;
        if (!b.getBoolean("switch_to_daily_view_v2", true) || !this.t1()) {
            b2 = false;
        }
        return b2;
    }
    
    public boolean o(@j0 final Profile profile) {
        return this.b.getBoolean(this.b(profile, "iAmGoodHowAreYou"), false);
    }
    
    public void o0(final int n) {
        this.b.edit().putInt("last_version", n).apply();
    }
    
    public boolean o1() {
        final SharedPreferences b = this.b;
        boolean b2 = true;
        if (!b.getBoolean("show_help_date_picker_v1", true) || !this.t1()) {
            b2 = false;
        }
        return b2;
    }
    
    public String p() {
        return this.b.getString("last_show_unsubscribe_hint_date", new t().toString());
    }
    
    public void p0() {
        this.b.edit().putInt("migration_level", com.untis.mobile.utils.u.d).apply();
    }
    
    public boolean p1(@k0 final Profile profile) {
        return this.b.getBoolean("element_color", true);
    }
    
    public long q() {
        final long long1 = this.b.getLong("lastUpdate", 0L);
        if (long1 == 0L) {
            this.n0(((g)com.untis.mobile.utils.v.a.e()).n());
            return 0L;
        }
        return long1;
    }
    
    public void q0(@j0 final String s) {
        this.b.edit().putString("fmc_token_old", s).apply();
    }
    
    public boolean q1() {
        return this.b.getBoolean("subjects_full", true);
    }
    
    public int r() {
        return this.b.getInt("last_version", 603);
    }
    
    public void r0(final boolean b) {
        this.b.edit().putBoolean("is_premium", b).apply();
    }
    
    public boolean r1() {
        return this.b.getBoolean("teacher_full", true);
    }
    
    public int s() {
        return this.b.getInt("migration_level", 0);
    }
    
    public void s0(final boolean b) {
        this.b.edit().putBoolean("is_premium_homework", b).apply();
    }
    
    public boolean s1() {
        final SharedPreferences b = this.b;
        boolean b2 = true;
        if (!b.getBoolean("show_help_global_plan_search_v2", true) || !this.t1()) {
            b2 = false;
        }
        return b2;
    }
    
    @j0
    public String t() {
        return this.b.getString("fmc_token_old", "");
    }
    
    public void t0(final boolean b) {
        this.b.edit().putBoolean("is_premium_tt_settings", b).apply();
    }
    
    public boolean t1() {
        return this.b.getBoolean("show_help_v2", true);
    }
    
    public float u() {
        final TypedValue typedValue = new TypedValue();
        try {
            this.a.getResources().getValue(2131165637, typedValue, true);
            return typedValue.getFloat();
        }
        catch (Exception ex) {
            Log.e("untis_log", "could not load R.dimen.schedule_scale, fallback with 2.0f", (Throwable)ex);
            return 2.0f;
        }
    }
    
    public void u0(final boolean b) {
        this.b.edit().putBoolean("is_premium_widget", b).apply();
    }
    
    public boolean u1() {
        final SharedPreferences b = this.b;
        boolean b2 = true;
        if (!b.getBoolean("show_help_homework_v2", true) || !this.t1()) {
            b2 = false;
        }
        return b2;
    }
    
    public float v(@k0 final Profile profile) {
        final float u = this.u();
        if (!this.L(profile)) {
            return u * 1.0f;
        }
        final float float1 = this.b.getFloat("scaling_v2", 1.0f * u);
        final float n = 0.5f * u;
        final float n2 = u * 4.0f;
        if (float1 < n) {
            return n;
        }
        if (float1 > n2) {
            return n2;
        }
        return float1;
    }
    
    public void v0(final float n) {
        this.b.edit().putFloat("scaling_v2", n).apply();
    }
    
    public boolean v1() {
        final SharedPreferences b = this.b;
        boolean b2 = true;
        if (!b.getBoolean("show_help_infocenter_v2", true) || !this.t1()) {
            b2 = false;
        }
        return b2;
    }
    
    public int w(@k0 final Profile profile) {
        final int int1 = this.b.getInt("schedulemodedays", 7);
        if (this.L(profile)) {
            return int1;
        }
        if (int1 != 1 && int1 != 7) {
            return 7;
        }
        return int1;
    }
    
    public void w0(final int n) {
        this.b.edit().putInt("schedulemodedays", n).apply();
    }
    
    public boolean w1() {
        return this.b.getBoolean("show_help_things_to_do", true);
    }
    
    public float x() {
        return this.b.getFloat("schedule_text_size", 1.0f);
    }
    
    public void x0(final float n) {
        this.b.edit().putFloat("schedule_text_size", n).apply();
    }
    
    public boolean x1() {
        final SharedPreferences b = this.b;
        boolean b2 = true;
        if (!b.getBoolean("show_help_lessontopic_v2", true) || !this.t1()) {
            b2 = false;
        }
        return b2;
    }
    
    public boolean y() {
        return this.b.getBoolean("end_premium_warning", true);
    }
    
    public void y0(final boolean b) {
        this.b.edit().putBoolean("show_help_selected_plan_search_v2", b).apply();
    }
    
    public boolean y1() {
        return this.b.getBoolean("show_help_officehour_v3", true);
    }
    
    public boolean z() {
        return this.b.getBoolean("premium_v2", true);
    }
    
    public void z0(final boolean b) {
        this.b.edit().putBoolean("show_help_absences_v2", b).apply();
    }
    
    public boolean z1() {
        final SharedPreferences b = this.b;
        boolean b2 = true;
        if (!b.getBoolean("room_search_v2", true) || !this.t1()) {
            b2 = false;
        }
        return b2;
    }
}
