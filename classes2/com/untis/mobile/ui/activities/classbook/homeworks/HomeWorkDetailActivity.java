// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.homeworks;

import android.widget.ImageButton;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import android.app.Dialog;
import android.app.Activity;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import com.untis.mobile.persistence.models.timetable.period.PeriodRight;
import com.untis.mobile.persistence.models.timetable.period.Period;
import java.util.ArrayList;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.Menu;
import java.util.Collection;
import com.untis.mobile.persistence.models.EntityType;
import android.os.Bundle;
import org.joda.time.l0;
import android.content.Intent;
import android.text.Editable;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.untis.mobile.persistence.models.classbook.homework.HomeWorkStatus;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.TextView;
import org.joda.time.t;
import java.util.Iterator;
import org.joda.time.n0;
import androidx.appcompat.widget.SwitchCompat;
import kotlin.n1;
import kotlin.s0;
import com.untis.mobile.analytics.base.c;
import android.widget.CompoundButton;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import androidx.appcompat.app.d$a;
import android.util.Log;
import android.content.DialogInterface;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import kotlin.jvm.internal.k0;
import android.view.View;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import com.untis.mobile.services.timetable.placeholder.k;
import kotlin.b0;
import com.untis.mobile.systemNotifications.a;
import java.util.List;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.text.TextWatcher;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 g2\u00020\u00012\u00020\u0002:\u0001hB\u0007¢\u0006\u0004\be\u0010fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0003H\u0002J\b\u0010\u0018\u001a\u00020\bH\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0002J\b\u0010\u001a\u001a\u00020\u0003H\u0002J\b\u0010\u001b\u001a\u00020\u0003H\u0002J\b\u0010\u001c\u001a\u00020\u0003H\u0002J\b\u0010\u001d\u001a\u00020\u0003H\u0002J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0006H\u0002J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0006H\u0002J\b\u0010\"\u001a\u00020\u0003H\u0002J\b\u0010#\u001a\u00020\u0003H\u0002J\b\u0010$\u001a\u00020\u0003H\u0002J\b\u0010%\u001a\u00020\u0003H\u0002J\b\u0010&\u001a\u00020\u0003H\u0002J\u0012\u0010)\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010'H\u0014J\u0012\u0010,\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010/\u001a\u00020\b2\u0006\u0010.\u001a\u00020-H\u0016J\u0010\u00101\u001a\u00020\u00032\u0006\u00100\u001a\u00020'H\u0014J\"\u00106\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\b\u00105\u001a\u0004\u0018\u000104H\u0014J*\u0010<\u001a\u00020\u00032\b\u00108\u001a\u0004\u0018\u0001072\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u00102\u0006\u0010;\u001a\u00020\u0010H\u0016J\u0012\u0010>\u001a\u00020\u00032\b\u00108\u001a\u0004\u0018\u00010=H\u0016J*\u0010?\u001a\u00020\u00032\b\u00108\u001a\u0004\u0018\u0001072\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u00102\u0006\u0010;\u001a\u00020\u0010H\u0016R\u0016\u0010B\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020J0I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010PR\u001d\u0010W\u001a\u00020R8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010ZR\u001d\u0010`\u001a\u00020\\8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010T\u001a\u0004\b^\u0010_R\u0016\u0010d\u001a\u00020a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006i" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/homeworks/HomeWorkDetailActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Landroid/text/TextWatcher;", "Lkotlin/j2;", "S", "Q0", "", "d0", "", "completed", "g0", "o0", "Landroid/view/View;", "dialogView", "N0", "G0", "", "days", "a0", "b0", "I0", "V", "H0", "n0", "S0", "P0", "R0", "x0", "O0", "m0", "text", "y0", "remark", "w0", "h0", "J0", "z0", "M0", "f0", "Landroid/os/Bundle;", "save", "onCreate", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "outState", "onSaveInstanceState", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "", "p0", "p1", "p2", "p3", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "beforeTextChanged", "J", "Z", "hasChanges", "I", "readOnly", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "H", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homeWork", "", "Lcom/untis/mobile/systemNotifications/a;", "K", "Ljava/util/List;", "notifications", "Lcom/untis/mobile/services/classbook/a;", "M", "Lcom/untis/mobile/services/classbook/a;", "classBookService", "Lcom/untis/mobile/systemNotifications/b;", "L", "Lkotlin/b0;", "e0", "()Lcom/untis/mobile/systemNotifications/b;", "systemNotificationService", "Lcom/untis/mobile/services/timetable/placeholder/k;", "N", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "Lcom/untis/mobile/analytics/base/b;", "O", "c0", "()Lcom/untis/mobile/analytics/base/b;", "analyticsTracker", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "<init>", "()V", "P", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class HomeWorkDetailActivity extends b implements TextWatcher
{
    @e
    public static final a P;
    @e
    private static final String Q = "bart";
    @e
    private static final String R = "lisa";
    @e
    private static final String S = "homer";
    @e
    private static final String T = "maggie";
    private Profile G;
    private HomeWork H;
    private boolean I;
    private boolean J;
    private List<com.untis.mobile.systemNotifications.a> K;
    @e
    private final b0 L;
    private com.untis.mobile.services.classbook.a M;
    private k N;
    @e
    private final b0 O;
    
    static {
        P = new a(null);
    }
    
    public HomeWorkDetailActivity() {
        this.L = d0.c((n6.a<?>)new n6.a<com.untis.mobile.systemNotifications.b>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final com.untis.mobile.systemNotifications.b invoke() {
                return (com.untis.mobile.systemNotifications.b)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(com.untis.mobile.systemNotifications.b.class), null, null);
            }
        });
        this.O = d0.c((n6.a<?>)new n6.a<com.untis.mobile.analytics.base.b>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final com.untis.mobile.analytics.base.b invoke() {
                return (com.untis.mobile.analytics.base.b)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(com.untis.mobile.analytics.base.b.class), null, null);
            }
        });
    }
    
    private static final void A0(final HomeWorkDetailActivity homeWorkDetailActivity, final HomeWork homeWork) {
        k0.p(homeWorkDetailActivity, "this$0");
        homeWorkDetailActivity.f0();
        h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ HomeWorkDetailActivity H;
            final /* synthetic */ HomeWork I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ HomeWorkDetailActivity H = this.H;
                    final /* synthetic */ HomeWork I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((HomeWorkDetailActivity$d)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        c1.n(o);
                    }
                }
                else {
                    c1.n(o);
                    final com.untis.mobile.services.classbook.a p = HomeWorkDetailActivity.P(this.H);
                    if (p == null) {
                        k0.S("classBookService");
                        throw null;
                    }
                    final HomeWork i = this.I;
                    k0.o(i, "homeWork");
                    this.G = 1;
                    if (p.j(i, true, this) == h) {
                        return h;
                    }
                }
                final k r = HomeWorkDetailActivity.R(this.H);
                if (r == null) {
                    k0.S("timeTableService");
                    throw null;
                }
                final HomeWork j = this.I;
                k0.o(j, "homeWork");
                this.G = 2;
                if (k.a.b(r, j, false, this, 2, null) == h) {
                    return h;
                }
                return j2.a;
            }
        }, 1, (Object)null);
        final a p2 = HomeWorkDetailActivity.P;
        k0.o(homeWork, "homeWork");
        ((Activity)homeWorkDetailActivity).setResult(-1, a.g(p2, homeWork, false, 2, null));
        ((Activity)homeWorkDetailActivity).finish();
    }
    
    private static final void B0(final HomeWorkDetailActivity homeWorkDetailActivity, final Throwable t) {
        k0.p(homeWorkDetailActivity, "this$0");
        Log.e("untis_log", "could not submit homework", t);
        homeWorkDetailActivity.f0();
        ((Dialog)new d$a((Context)homeWorkDetailActivity, 2131951624).L(2131493060).r(2131886649, (DialogInterface$OnClickListener)j0.G).B(2131886664, (DialogInterface$OnClickListener)new c0(homeWorkDetailActivity)).a()).show();
    }
    
    private static final void C0(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void D0(final HomeWorkDetailActivity homeWorkDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(homeWorkDetailActivity, "this$0");
        h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ HomeWorkDetailActivity H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ HomeWorkDetailActivity H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((HomeWorkDetailActivity$e)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        c1.n(o);
                    }
                }
                else {
                    c1.n(o);
                    final com.untis.mobile.services.classbook.a p = HomeWorkDetailActivity.P(this.H);
                    if (p == null) {
                        k0.S("classBookService");
                        throw null;
                    }
                    final HomeWork q = HomeWorkDetailActivity.Q(this.H);
                    if (q == null) {
                        k0.S("homeWork");
                        throw null;
                    }
                    this.G = 1;
                    if (p.j(q, true, this) == h) {
                        return h;
                    }
                }
                final k r = HomeWorkDetailActivity.R(this.H);
                if (r == null) {
                    k0.S("timeTableService");
                    throw null;
                }
                final HomeWork q2 = HomeWorkDetailActivity.Q(this.H);
                if (q2 == null) {
                    k0.S("homeWork");
                    throw null;
                }
                this.G = 2;
                if (k.a.b(r, q2, false, this, 2, null) == h) {
                    return h;
                }
                return j2.a;
            }
        }, 1, (Object)null);
        final a p3 = HomeWorkDetailActivity.P;
        final HomeWork h = homeWorkDetailActivity.H;
        if (h != null) {
            ((Activity)homeWorkDetailActivity).setResult(-1, a.g(p3, h, false, 2, null));
            dialogInterface.dismiss();
            ((Activity)homeWorkDetailActivity).finish();
            return;
        }
        k0.S("homeWork");
        throw null;
    }
    
    private static final void E0(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void F0(final HomeWorkDetailActivity homeWorkDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(homeWorkDetailActivity, "this$0");
        homeWorkDetailActivity.c0().d(c.e.N, androidx.core.os.b.a(new s0[] { n1.a(c.b.H.d(), Boolean.TRUE) }));
        final HomeWork h = homeWorkDetailActivity.H;
        if (h != null) {
            h.setSynced(false);
            kotlinx.coroutines.h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
                Object G;
                Object H;
                int I;
                int J;
                final /* synthetic */ HomeWorkDetailActivity K;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        Object G;
                        Object H;
                        int I;
                        int J;
                        final /* synthetic */ HomeWorkDetailActivity K = this.K;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((HomeWorkDetailActivity$g)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int j = this.J;
                    int i = 0;
                    HomeWorkDetailActivity k = null;
                    Object l = null;
                    HomeWorkDetailActivity.a p = null;
                    Label_0270: {
                        Label_0186: {
                            if (j != 0) {
                                if (j != 1) {
                                    if (j == 2) {
                                        c1.n(o);
                                        break Label_0186;
                                    }
                                    if (j == 3) {
                                        i = this.I;
                                        final HomeWorkDetailActivity.a a = (HomeWorkDetailActivity.a)this.H;
                                        k = (HomeWorkDetailActivity)this.G;
                                        c1.n(o);
                                        l = o;
                                        p = a;
                                        break Label_0270;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                else {
                                    c1.n(o);
                                }
                            }
                            else {
                                c1.n(o);
                                final com.untis.mobile.services.classbook.a p2 = HomeWorkDetailActivity.P(this.K);
                                if (p2 == null) {
                                    k0.S("classBookService");
                                    throw null;
                                }
                                final HomeWork q = HomeWorkDetailActivity.Q(this.K);
                                if (q == null) {
                                    k0.S("homeWork");
                                    throw null;
                                }
                                this.J = 1;
                                if (p2.j(q, true, this) == h) {
                                    return h;
                                }
                            }
                            final k r = HomeWorkDetailActivity.R(this.K);
                            if (r == null) {
                                k0.S("timeTableService");
                                throw null;
                            }
                            final HomeWork q2 = HomeWorkDetailActivity.Q(this.K);
                            if (q2 == null) {
                                k0.S("homeWork");
                                throw null;
                            }
                            this.J = 2;
                            if (com.untis.mobile.services.timetable.placeholder.k.a.b(r, q2, false, this, 2, null) == h) {
                                return h;
                            }
                        }
                        k = this.K;
                        i = -1;
                        p = HomeWorkDetailActivity.P;
                        final com.untis.mobile.services.classbook.a p3 = HomeWorkDetailActivity.P(k);
                        if (p3 == null) {
                            k0.S("classBookService");
                            throw null;
                        }
                        final HomeWork q3 = HomeWorkDetailActivity.Q(this.K);
                        if (q3 == null) {
                            k0.S("homeWork");
                            throw null;
                        }
                        this.G = k;
                        this.H = p;
                        this.I = -1;
                        this.J = 3;
                        if ((l = p3.j(q3, true, this)) == h) {
                            return h;
                        }
                    }
                    ((Activity)k).setResult(i, HomeWorkDetailActivity.a.g(p, (HomeWork)l, false, 2, null));
                    return j2.a;
                }
            }, 1, (Object)null);
            dialogInterface.dismiss();
            ((Activity)homeWorkDetailActivity).finish();
            return;
        }
        k0.S("homeWork");
        throw null;
    }
    
    private final void G0() {
        final com.untis.mobile.systemNotifications.b e0 = this.e0();
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final String uniqueId = g.getUniqueId();
        final HomeWork h = this.H;
        if (h == null) {
            k0.S("homeWork");
            throw null;
        }
        final long id = h.getId();
        final List<com.untis.mobile.systemNotifications.a> k = this.K;
        if (k != null) {
            e0.i(uniqueId, id, k);
            return;
        }
        k0.S("notifications");
        throw null;
    }
    
    private final int H0() {
        final HomeWork h = this.H;
        if (h == null) {
            k0.S("homeWork");
            throw null;
        }
        if (h.getLocal()) {
            return 8;
        }
        return 0;
    }
    
    private final void I0() {
        final List<com.untis.mobile.systemNotifications.a> k = this.K;
        if (k != null) {
            k.clear();
            return;
        }
        k0.S("notifications");
        throw null;
    }
    
    private final void J0() {
        new d$a((Context)this, 2131951624).L(2131493039).r(2131886655, (DialogInterface$OnClickListener)new l(this)).B(2131886664, (DialogInterface$OnClickListener)new com.untis.mobile.ui.activities.classbook.homeworks.w(this));
    }
    
    private static final void K0(final HomeWorkDetailActivity homeWorkDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(homeWorkDetailActivity, "this$0");
        dialogInterface.dismiss();
        ((ComponentActivity)homeWorkDetailActivity).onBackPressed();
    }
    
    private static final void L0(final HomeWorkDetailActivity homeWorkDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(homeWorkDetailActivity, "this$0");
        dialogInterface.dismiss();
        homeWorkDetailActivity.z0();
    }
    
    private final void M0() {
    }
    
    private final void N0(final View view) {
        final SwitchCompat switchCompat = (SwitchCompat)view.findViewById(com.untis.mobile.c.i.ql);
        final List<com.untis.mobile.systemNotifications.a> k = this.K;
        if (k != null) {
            final Iterator<Object> iterator = k.iterator();
            while (true) {
                com.untis.mobile.systemNotifications.a next;
                do {
                    final boolean hasNext = iterator.hasNext();
                    final boolean b = false;
                    if (hasNext) {
                        next = iterator.next();
                    }
                    else {
                        next = null;
                        switchCompat.setChecked(next != null);
                        final SwitchCompat switchCompat2 = (SwitchCompat)view.findViewById(com.untis.mobile.c.i.rl);
                        final List<com.untis.mobile.systemNotifications.a> i = this.K;
                        if (i != null) {
                            while (true) {
                                for (final com.untis.mobile.systemNotifications.a next2 : i) {
                                    if (next2.j() == -3) {
                                        switchCompat2.setChecked(next2 != null);
                                        final SwitchCompat switchCompat3 = (SwitchCompat)view.findViewById(com.untis.mobile.c.i.sl);
                                        final List<com.untis.mobile.systemNotifications.a> j = this.K;
                                        if (j != null) {
                                            while (true) {
                                                for (final com.untis.mobile.systemNotifications.a next3 : j) {
                                                    if (next3.j() == -7) {
                                                        switchCompat3.setChecked(next3 != null);
                                                        final SwitchCompat switchCompat4 = (SwitchCompat)view.findViewById(com.untis.mobile.c.i.tl);
                                                        final List<com.untis.mobile.systemNotifications.a> l = this.K;
                                                        if (l != null) {
                                                            while (true) {
                                                                for (final com.untis.mobile.systemNotifications.a next4 : l) {
                                                                    if (next4.j() == -14) {
                                                                        boolean checked = b;
                                                                        if (next4 != null) {
                                                                            checked = true;
                                                                        }
                                                                        switchCompat4.setChecked(checked);
                                                                        final t b2 = com.untis.mobile.utils.time.a.b();
                                                                        final SwitchCompat switchCompat5 = (SwitchCompat)view.findViewById(com.untis.mobile.c.i.ql);
                                                                        final HomeWork h = this.H;
                                                                        if (h == null) {
                                                                            k0.S("homeWork");
                                                                            throw null;
                                                                        }
                                                                        ((CompoundButton)switchCompat5).setEnabled(((org.joda.time.base.e)h.getEnd().s0(1).h1()).m((n0)b2));
                                                                        final SwitchCompat switchCompat6 = (SwitchCompat)view.findViewById(com.untis.mobile.c.i.rl);
                                                                        final HomeWork h2 = this.H;
                                                                        if (h2 == null) {
                                                                            k0.S("homeWork");
                                                                            throw null;
                                                                        }
                                                                        ((CompoundButton)switchCompat6).setEnabled(((org.joda.time.base.e)h2.getEnd().s0(3).h1()).m((n0)b2));
                                                                        final SwitchCompat switchCompat7 = (SwitchCompat)view.findViewById(com.untis.mobile.c.i.sl);
                                                                        final HomeWork h3 = this.H;
                                                                        if (h3 == null) {
                                                                            k0.S("homeWork");
                                                                            throw null;
                                                                        }
                                                                        ((CompoundButton)switchCompat7).setEnabled(((org.joda.time.base.e)h3.getEnd().s0(7).h1()).m((n0)b2));
                                                                        final SwitchCompat switchCompat8 = (SwitchCompat)view.findViewById(com.untis.mobile.c.i.tl);
                                                                        final HomeWork h4 = this.H;
                                                                        if (h4 != null) {
                                                                            ((CompoundButton)switchCompat8).setEnabled(((org.joda.time.base.e)h4.getEnd().s0(14).h1()).m((n0)b2));
                                                                            return;
                                                                        }
                                                                        k0.S("homeWork");
                                                                        throw null;
                                                                    }
                                                                }
                                                                com.untis.mobile.systemNotifications.a next4 = null;
                                                                continue;
                                                            }
                                                        }
                                                        k0.S("notifications");
                                                        throw null;
                                                    }
                                                }
                                                com.untis.mobile.systemNotifications.a next3 = null;
                                                continue;
                                            }
                                        }
                                        k0.S("notifications");
                                        throw null;
                                    }
                                }
                                com.untis.mobile.systemNotifications.a next2 = null;
                                continue;
                            }
                        }
                        k0.S("notifications");
                        throw null;
                    }
                } while (next.j() != -1);
                continue;
            }
        }
        k0.S("notifications");
        throw null;
    }
    
    private final void O0() {
        final HomeWork h = this.H;
        if (h != null) {
            TextView textView;
            String g4;
            if (((org.joda.time.base.g)h.getEnd()).n() > 0L) {
                textView = (TextView)this.findViewById(com.untis.mobile.c.i.D5);
                final HomeWork h2 = this.H;
                if (h2 == null) {
                    k0.S("homeWork");
                    throw null;
                }
                g4 = ((org.joda.time.base.a)h2.getEnd()).g4("E, dd.MM.yyyy");
            }
            else {
                textView = (TextView)this.findViewById(com.untis.mobile.c.i.D5);
                g4 = "";
            }
            textView.setText((CharSequence)g4);
            return;
        }
        k0.S("homeWork");
        throw null;
    }
    
    public static final /* synthetic */ com.untis.mobile.services.classbook.a P(final HomeWorkDetailActivity homeWorkDetailActivity) {
        return homeWorkDetailActivity.M;
    }
    
    private final void P0() {
        ((TextView)this.findViewById(com.untis.mobile.c.i.F5)).setText((CharSequence)this.d0());
        final AppCompatImageView appCompatImageView = (AppCompatImageView)this.findViewById(com.untis.mobile.c.i.E5);
        final List<com.untis.mobile.systemNotifications.a> k = this.K;
        if (k != null) {
            int n;
            if (k.isEmpty()) {
                n = 2131230859;
            }
            else {
                n = 2131230861;
            }
            appCompatImageView.setImageDrawable(androidx.core.content.d.i((Context)this, n));
            return;
        }
        k0.S("notifications");
        throw null;
    }
    
    public static final /* synthetic */ HomeWork Q(final HomeWorkDetailActivity homeWorkDetailActivity) {
        return homeWorkDetailActivity.H;
    }
    
    private final void Q0() {
        ((TextView)this.findViewById(com.untis.mobile.c.i.M5)).setText((CharSequence)this.d0());
        final AppCompatImageView appCompatImageView = (AppCompatImageView)this.findViewById(com.untis.mobile.c.i.L5);
        final List<com.untis.mobile.systemNotifications.a> k = this.K;
        if (k != null) {
            int n;
            if (k.isEmpty()) {
                n = 2131230859;
            }
            else {
                n = 2131230861;
            }
            appCompatImageView.setImageDrawable(androidx.core.content.d.i((Context)this, n));
            return;
        }
        k0.S("notifications");
        throw null;
    }
    
    public static final /* synthetic */ k R(final HomeWorkDetailActivity homeWorkDetailActivity) {
        return homeWorkDetailActivity.N;
    }
    
    private final void R0() {
        final TextView textView = (TextView)this.findViewById(com.untis.mobile.c.i.W5);
        final HomeWork h = this.H;
        if (h != null) {
            textView.setText((CharSequence)((org.joda.time.base.a)h.getStart()).g4("E, dd.MM.yyyy"));
            return;
        }
        k0.S("homeWork");
        throw null;
    }
    
    private final void S() {
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        if (g.isEndOfPremium()) {
            ((FrameLayout)this.findViewById(com.untis.mobile.c.i.G5)).setVisibility(8);
            ((FrameLayout)this.findViewById(com.untis.mobile.c.i.I5)).setVisibility(8);
        }
        final TextView textView = (TextView)this.findViewById(com.untis.mobile.c.i.R5);
        final HomeWork h = this.H;
        if (h == null) {
            k0.S("homeWork");
            throw null;
        }
        textView.setText((CharSequence)h.getText());
        final TextView textView2 = (TextView)this.findViewById(com.untis.mobile.c.i.O5);
        final HomeWork h2 = this.H;
        if (h2 == null) {
            k0.S("homeWork");
            throw null;
        }
        textView2.setText((CharSequence)h2.getRemark());
        final HomeWork h3 = this.H;
        if (h3 == null) {
            k0.S("homeWork");
            throw null;
        }
        if (h3.getRemark().length() == 0) {
            ((FrameLayout)this.findViewById(com.untis.mobile.c.i.N5)).setVisibility(8);
        }
        final TextView textView3 = (TextView)this.findViewById(com.untis.mobile.c.i.Q5);
        final HomeWork h4 = this.H;
        if (h4 == null) {
            k0.S("homeWork");
            throw null;
        }
        textView3.setText((CharSequence)((org.joda.time.base.a)h4.getStart()).g4("E, dd.MM.yyyy"));
        final TextView textView4 = (TextView)this.findViewById(com.untis.mobile.c.i.K5);
        final HomeWork h5 = this.H;
        if (h5 == null) {
            k0.S("homeWork");
            throw null;
        }
        textView4.setText((CharSequence)((org.joda.time.base.a)h5.getEnd()).g4("E, dd.MM.yyyy"));
        ((FrameLayout)this.findViewById(com.untis.mobile.c.i.G5)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.homeworks.p(this));
        final int h6 = com.untis.mobile.c.i.H5;
        final SwitchCompat switchCompat = (SwitchCompat)this.findViewById(h6);
        final HomeWork h7 = this.H;
        if (h7 != null) {
            switchCompat.setChecked(h7.getCompletedStatus());
            ((CompoundButton)this.findViewById(h6)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new s(this));
            this.Q0();
            return;
        }
        k0.S("homeWork");
        throw null;
    }
    
    private final boolean S0() {
        final int x5 = com.untis.mobile.c.i.X5;
        final int length = String.valueOf(((AppCompatEditText)this.findViewById(x5)).getText()).length();
        boolean b = false;
        if (length == 0) {
            ((EditText)this.findViewById(x5)).setError((CharSequence)((Activity)this).getString(2131886702));
        }
        else {
            b = true;
        }
        return b;
    }
    
    private static final void T(final HomeWorkDetailActivity homeWorkDetailActivity, final View view) {
        k0.p(homeWorkDetailActivity, "this$0");
        final int h5 = com.untis.mobile.c.i.H5;
        ((SwitchCompat)homeWorkDetailActivity.findViewById(h5)).setChecked(((CompoundButton)homeWorkDetailActivity.findViewById(h5)).isChecked() ^ true);
    }
    
    private static final void U(final HomeWorkDetailActivity homeWorkDetailActivity, final CompoundButton compoundButton, final boolean b) {
        k0.p(homeWorkDetailActivity, "this$0");
        homeWorkDetailActivity.g0(b);
    }
    
    private final void V() {
        if (com.untis.mobile.utils.d0.d(new t(), new t(2021, 7, 31))) {
            ((FrameLayout)this.findViewById(com.untis.mobile.c.i.B5)).setVisibility(8);
        }
        final int x5 = com.untis.mobile.c.i.X5;
        final TextInputEditText textInputEditText = (TextInputEditText)this.findViewById(x5);
        final HomeWork h = this.H;
        if (h == null) {
            k0.S("homeWork");
            throw null;
        }
        ((EditText)textInputEditText).setText((CharSequence)h.getText());
        ((EditText)this.findViewById(x5)).addTextChangedListener((TextWatcher)this);
        final TextInputEditText textInputEditText2 = (TextInputEditText)this.findViewById(x5);
        k0.o(textInputEditText2, "activity_homework_detail_text_edit");
        com.untis.mobile.utils.extension.h.D(textInputEditText2, null, 1, null);
        final int s5 = com.untis.mobile.c.i.S5;
        final TextInputEditText textInputEditText3 = (TextInputEditText)this.findViewById(s5);
        final HomeWork h2 = this.H;
        if (h2 == null) {
            k0.S("homeWork");
            throw null;
        }
        ((EditText)textInputEditText3).setText((CharSequence)h2.getRemark());
        ((EditText)this.findViewById(s5)).addTextChangedListener((TextWatcher)this);
        ((TextView)this.findViewById(com.untis.mobile.c.i.T5)).setVisibility(this.H0());
        final TextInputEditText textInputEditText4 = (TextInputEditText)this.findViewById(s5);
        k0.o(textInputEditText4, "activity_homework_detail_remark_edit");
        com.untis.mobile.utils.extension.h.D(textInputEditText4, null, 1, null);
        ((FrameLayout)this.findViewById(com.untis.mobile.c.i.C5)).setOnClickListener((View$OnClickListener)new n(this));
        this.R0();
        ((FrameLayout)this.findViewById(com.untis.mobile.c.i.z5)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.homeworks.o(this));
        this.O0();
        final int y5 = com.untis.mobile.c.i.y5;
        ((CompoundButton)this.findViewById(y5)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new r(this));
        final SwitchCompat switchCompat = (SwitchCompat)this.findViewById(y5);
        final HomeWork h3 = this.H;
        if (h3 != null) {
            switchCompat.setChecked(h3.getCompletedStatus());
            this.P0();
            ((ImageButton)this.findViewById(com.untis.mobile.c.i.A5)).setOnClickListener((View$OnClickListener)new q(this));
            return;
        }
        k0.S("homeWork");
        throw null;
    }
    
    private static final void W(final HomeWorkDetailActivity homeWorkDetailActivity, final View view) {
        k0.p(homeWorkDetailActivity, "this$0");
        homeWorkDetailActivity.x0();
    }
    
    private static final void X(final HomeWorkDetailActivity homeWorkDetailActivity, final View view) {
        k0.p(homeWorkDetailActivity, "this$0");
        homeWorkDetailActivity.m0();
    }
    
    private static final void Y(final HomeWorkDetailActivity homeWorkDetailActivity, final CompoundButton compoundButton, final boolean b) {
        k0.p(homeWorkDetailActivity, "this$0");
        homeWorkDetailActivity.g0(b);
    }
    
    private static final void Z(final HomeWorkDetailActivity homeWorkDetailActivity, final View view) {
        k0.p(homeWorkDetailActivity, "this$0");
        homeWorkDetailActivity.n0();
    }
    
    private final void a0(final int n) {
        final List<com.untis.mobile.systemNotifications.a> k = this.K;
        if (k == null) {
            k0.S("notifications");
            throw null;
        }
        final com.untis.mobile.systemNotifications.b e0 = this.e0();
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final String uniqueId = g.getUniqueId();
        final HomeWork h = this.H;
        if (h != null) {
            k.add(e0.h(uniqueId, h, n));
            return;
        }
        k0.S("homeWork");
        throw null;
    }
    
    private final void b0(final int n) {
        final List<com.untis.mobile.systemNotifications.a> k = this.K;
        if (k != null) {
            final Iterator<com.untis.mobile.systemNotifications.a> iterator = k.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().j() == n) {
                    iterator.remove();
                }
            }
            return;
        }
        k0.S("notifications");
        throw null;
    }
    
    private final com.untis.mobile.analytics.base.b c0() {
        return this.O.getValue();
    }
    
    private final String d0() {
        final List<com.untis.mobile.systemNotifications.a> k = this.K;
        if (k == null) {
            k0.S("notifications");
            throw null;
        }
        if (k.isEmpty()) {
            final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)this);
            final Profile g = this.G;
            if (g == null) {
                k0.S("profile");
                throw null;
            }
            if (!a.J(g)) {
                final String string = ((Activity)this).getString(2131886537);
                k0.o(string, "getString(R.string.premium_premiumOnlyFeatureDescription_text)");
                return string;
            }
        }
        final List<com.untis.mobile.systemNotifications.a> i = this.K;
        if (i == null) {
            k0.S("notifications");
            throw null;
        }
        if (i.isEmpty()) {
            final String string2 = ((Activity)this).getString(2131886776);
            k0.o(string2, "getString(R.string.shared_setReminder_text)");
            return string2;
        }
        final String string3 = ((Activity)this).getString(2131886307);
        k0.o(string3, "getString(R.string.homework_youHaveXReminder_text)");
        final List<com.untis.mobile.systemNotifications.a> j = this.K;
        if (j != null) {
            return kotlin.text.s.k2(string3, "{0}", String.valueOf(j.size()), false, 4, (Object)null);
        }
        k0.S("notifications");
        throw null;
    }
    
    private final com.untis.mobile.systemNotifications.b e0() {
        return this.L.getValue();
    }
    
    private final void f0() {
    }
    
    private final void g0(final boolean completed) {
        this.J = true;
        if (!this.I) {
            final HomeWork h = this.H;
            if (h != null) {
                h.setCompleted(completed);
                final SwitchCompat switchCompat = (SwitchCompat)this.findViewById(com.untis.mobile.c.i.y5);
                if (switchCompat != null) {
                    final HomeWork h2 = this.H;
                    if (h2 == null) {
                        k0.S("homeWork");
                        throw null;
                    }
                    switchCompat.setChecked(h2.getCompletedStatus());
                }
                return;
            }
            k0.S("homeWork");
            throw null;
        }
        else {
            final HomeWork h3 = this.H;
            if (h3 == null) {
                k0.S("homeWork");
                throw null;
            }
            HomeWorkStatus status;
            if (completed) {
                status = HomeWorkStatus.COMPLETED;
            }
            else {
                status = HomeWorkStatus.NOT_COMPLETED;
            }
            h3.setStatus(status);
            h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ HomeWorkDetailActivity H;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ HomeWorkDetailActivity H = this.H;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((HomeWorkDetailActivity$b)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            if (g == 2) {
                                c1.n(o);
                                return j2.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            c1.n(o);
                        }
                    }
                    else {
                        c1.n(o);
                        final com.untis.mobile.services.classbook.a p = HomeWorkDetailActivity.P(this.H);
                        if (p == null) {
                            k0.S("classBookService");
                            throw null;
                        }
                        final HomeWork q = HomeWorkDetailActivity.Q(this.H);
                        if (q == null) {
                            k0.S("homeWork");
                            throw null;
                        }
                        this.G = 1;
                        if (p.z(q, this) == h) {
                            return h;
                        }
                    }
                    final k r = HomeWorkDetailActivity.R(this.H);
                    if (r == null) {
                        k0.S("timeTableService");
                        throw null;
                    }
                    final HomeWork q2 = HomeWorkDetailActivity.Q(this.H);
                    if (q2 == null) {
                        k0.S("homeWork");
                        throw null;
                    }
                    this.G = 2;
                    if (k.a.b(r, q2, false, this, 2, null) == h) {
                        return h;
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
            final a p = HomeWorkDetailActivity.P;
            final HomeWork h4 = this.H;
            if (h4 != null) {
                ((Activity)this).setResult(-1, a.g(p, h4, false, 2, null));
                SwitchCompat switchCompat2;
                HomeWork homeWork;
                if (!this.I) {
                    switchCompat2 = (SwitchCompat)this.findViewById(com.untis.mobile.c.i.y5);
                    if (switchCompat2 == null) {
                        return;
                    }
                    homeWork = this.H;
                    if (homeWork == null) {
                        k0.S("homeWork");
                        throw null;
                    }
                }
                else {
                    switchCompat2 = (SwitchCompat)this.findViewById(com.untis.mobile.c.i.H5);
                    if (switchCompat2 == null) {
                        return;
                    }
                    homeWork = this.H;
                    if (homeWork == null) {
                        k0.S("homeWork");
                        throw null;
                    }
                }
                switchCompat2.setChecked(homeWork.getCompletedStatus());
                return;
            }
            k0.S("homeWork");
            throw null;
        }
    }
    
    private final void h0() {
        ((Dialog)new d$a((Context)this, 2131951624).L(2131493036).r(2131886649, (DialogInterface$OnClickListener)i0.G).B(2131886653, (DialogInterface$OnClickListener)new f0(this)).a()).show();
    }
    
    private static final void i0(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void j0(final HomeWorkDetailActivity homeWorkDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(homeWorkDetailActivity, "this$0");
        homeWorkDetailActivity.c0().c(c.e.N);
        final HomeWork h = homeWorkDetailActivity.H;
        if (h == null) {
            k0.S("homeWork");
            throw null;
        }
        if (h.getLocal()) {
            kotlinx.coroutines.h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ HomeWorkDetailActivity H;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ HomeWorkDetailActivity H = this.H;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((HomeWorkDetailActivity$c)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            if (g == 2) {
                                c1.n(o);
                                return j2.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            c1.n(o);
                        }
                    }
                    else {
                        c1.n(o);
                        final com.untis.mobile.services.classbook.a p = HomeWorkDetailActivity.P(this.H);
                        if (p == null) {
                            k0.S("classBookService");
                            throw null;
                        }
                        final HomeWork q = HomeWorkDetailActivity.Q(this.H);
                        if (q == null) {
                            k0.S("homeWork");
                            throw null;
                        }
                        this.G = 1;
                        if (p.f0(q, this) == h) {
                            return h;
                        }
                    }
                    final k r = HomeWorkDetailActivity.R(this.H);
                    if (r == null) {
                        k0.S("timeTableService");
                        throw null;
                    }
                    final HomeWork q2 = HomeWorkDetailActivity.Q(this.H);
                    if (q2 == null) {
                        k0.S("homeWork");
                        throw null;
                    }
                    this.G = 2;
                    if (k.a.b(r, q2, false, this, 2, null) == h) {
                        return h;
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
            final a p3 = HomeWorkDetailActivity.P;
            final HomeWork h2 = homeWorkDetailActivity.H;
            if (h2 != null) {
                ((Activity)homeWorkDetailActivity).setResult(-1, p3.f(h2, true));
                ((Activity)homeWorkDetailActivity).finish();
                dialogInterface.dismiss();
                return;
            }
            k0.S("homeWork");
            throw null;
        }
        else {
            final HomeWork h3 = homeWorkDetailActivity.H;
            if (h3 == null) {
                k0.S("homeWork");
                throw null;
            }
            h3.setSynced(false);
            final HomeWork h4 = homeWorkDetailActivity.H;
            if (h4 == null) {
                k0.S("homeWork");
                throw null;
            }
            h4.setPeriodId(0L);
            final com.untis.mobile.services.classbook.a m = homeWorkDetailActivity.M;
            if (m == null) {
                k0.S("classBookService");
                throw null;
            }
            final HomeWork h5 = homeWorkDetailActivity.H;
            if (h5 != null) {
                m.e0(h5).C5((rx.functions.b)new a0(homeWorkDetailActivity, dialogInterface), (rx.functions.b)new com.untis.mobile.ui.activities.classbook.homeworks.b0(homeWorkDetailActivity, dialogInterface));
                return;
            }
            k0.S("homeWork");
            throw null;
        }
    }
    
    private static final void k0(final HomeWorkDetailActivity homeWorkDetailActivity, final DialogInterface dialogInterface, final HomeWork homeWork) {
        k0.p(homeWorkDetailActivity, "this$0");
        final a p3 = HomeWorkDetailActivity.P;
        final HomeWork h = homeWorkDetailActivity.H;
        if (h != null) {
            ((Activity)homeWorkDetailActivity).setResult(-1, p3.f(h, true));
            ((Activity)homeWorkDetailActivity).finish();
            dialogInterface.dismiss();
            return;
        }
        k0.S("homeWork");
        throw null;
    }
    
    private static final void l0(final HomeWorkDetailActivity homeWorkDetailActivity, final DialogInterface dialogInterface, final Throwable t) {
        k0.p(homeWorkDetailActivity, "this$0");
        final a p3 = HomeWorkDetailActivity.P;
        final HomeWork h = homeWorkDetailActivity.H;
        if (h != null) {
            ((Activity)homeWorkDetailActivity).setResult(-1, p3.f(h, true));
            ((Activity)homeWorkDetailActivity).finish();
            dialogInterface.dismiss();
            return;
        }
        k0.S("homeWork");
        throw null;
    }
    
    private final void m0() {
        final HomeWorkDateSelectActivity.a k = HomeWorkDateSelectActivity.K;
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final String uniqueId = g.getUniqueId();
        final HomeWork h = this.H;
        if (h != null) {
            ((ComponentActivity)this).startActivityForResult(k.c(uniqueId, h.getPeriodId()), 122);
            return;
        }
        k0.S("homeWork");
        throw null;
    }
    
    private final void n0() {
        if (!this.S0()) {
            return;
        }
        this.z0();
    }
    
    private final void o0() {
        final View inflate = ((Activity)this).getLayoutInflater().inflate(2131493040, (ViewGroup)this.findViewById(com.untis.mobile.c.i.P5), false);
        if (inflate == null) {
            return;
        }
        ((CompoundButton)inflate.findViewById(com.untis.mobile.c.i.ql)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new com.untis.mobile.ui.activities.classbook.homeworks.t(this, inflate));
        ((CompoundButton)inflate.findViewById(com.untis.mobile.c.i.rl)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new u(this, inflate));
        ((CompoundButton)inflate.findViewById(com.untis.mobile.c.i.sl)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new v(this, inflate));
        ((CompoundButton)inflate.findViewById(com.untis.mobile.c.i.tl)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new x(this, inflate));
        this.N0(inflate);
        final androidx.appcompat.app.d a = new d$a((Context)this, 2131951624).M(inflate).u(2131886662, (DialogInterface$OnClickListener)new g0(this)).B(2131886664, (DialogInterface$OnClickListener)new com.untis.mobile.ui.activities.classbook.homeworks.d0(this)).r(2131886649, (DialogInterface$OnClickListener)m.G).a();
        k0.o(a, "Builder(this, R.style.AppDialogTheme)\n                .setView(dialogView)\n                .setNeutralButton(R.string.shared_alert_reset_button) { _, _ -> resetNotifications() }\n                .setPositiveButton(R.string.shared_alert_save_button) { dialog, _ ->\n                    persistNotifications()\n                    dialog.dismiss()\n                }\n                .setNegativeButton(R.string.shared_alert_cancel_button) { dialog, _ -> dialog.dismiss() }\n                .create()");
        ((Dialog)a).show();
    }
    
    private static final void p0(final HomeWorkDetailActivity homeWorkDetailActivity, final View view, final CompoundButton compoundButton, final boolean b) {
        k0.p(homeWorkDetailActivity, "this$0");
        k0.p(view, "$dialogView");
        if (b) {
            homeWorkDetailActivity.a0(-1);
        }
        else {
            homeWorkDetailActivity.b0(-1);
        }
        homeWorkDetailActivity.N0(view);
    }
    
    private static final void q0(final HomeWorkDetailActivity homeWorkDetailActivity, final View view, final CompoundButton compoundButton, final boolean b) {
        k0.p(homeWorkDetailActivity, "this$0");
        k0.p(view, "$dialogView");
        if (b) {
            homeWorkDetailActivity.a0(-3);
        }
        else {
            homeWorkDetailActivity.b0(-3);
        }
        homeWorkDetailActivity.N0(view);
    }
    
    private static final void r0(final HomeWorkDetailActivity homeWorkDetailActivity, final View view, final CompoundButton compoundButton, final boolean b) {
        k0.p(homeWorkDetailActivity, "this$0");
        k0.p(view, "$dialogView");
        if (b) {
            homeWorkDetailActivity.a0(-7);
        }
        else {
            homeWorkDetailActivity.b0(-7);
        }
        homeWorkDetailActivity.N0(view);
    }
    
    private static final void s0(final HomeWorkDetailActivity homeWorkDetailActivity, final View view, final CompoundButton compoundButton, final boolean b) {
        k0.p(homeWorkDetailActivity, "this$0");
        k0.p(view, "$dialogView");
        if (b) {
            homeWorkDetailActivity.a0(-14);
        }
        else {
            homeWorkDetailActivity.b0(-14);
        }
        homeWorkDetailActivity.N0(view);
    }
    
    private static final void t0(final HomeWorkDetailActivity homeWorkDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(homeWorkDetailActivity, "this$0");
        homeWorkDetailActivity.I0();
    }
    
    private static final void u0(final HomeWorkDetailActivity homeWorkDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(homeWorkDetailActivity, "this$0");
        homeWorkDetailActivity.G0();
        dialogInterface.dismiss();
    }
    
    private static final void v0(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private final void w0(final String remark) {
        this.J = true;
        final HomeWork h = this.H;
        if (h != null) {
            h.setRemark(remark);
            return;
        }
        k0.S("homeWork");
        throw null;
    }
    
    private final void x0() {
        final HomeWorkDateSelectActivity.a k = HomeWorkDateSelectActivity.K;
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final String uniqueId = g.getUniqueId();
        final HomeWork h = this.H;
        if (h != null) {
            ((ComponentActivity)this).startActivityForResult(k.c(uniqueId, h.getPeriodId()), 121);
            return;
        }
        k0.S("homeWork");
        throw null;
    }
    
    private final void y0(final String text) {
        this.J = true;
        final HomeWork h = this.H;
        if (h != null) {
            h.setText(text);
            return;
        }
        k0.S("homeWork");
        throw null;
    }
    
    private final void z0() {
        if (com.untis.mobile.utils.g0.a((Context)this)) {
            final HomeWork h = this.H;
            if (h == null) {
                k0.S("homeWork");
                throw null;
            }
            if (!h.getLocal()) {
                this.M0();
                this.c0().c(c.e.N);
                final com.untis.mobile.services.classbook.a m = this.M;
                if (m == null) {
                    k0.S("classBookService");
                    throw null;
                }
                final HomeWork h2 = this.H;
                if (h2 != null) {
                    m.e0(h2).C5((rx.functions.b)new y(this), (rx.functions.b)new z(this));
                    return;
                }
                k0.S("homeWork");
                throw null;
            }
        }
        final HomeWork h3 = this.H;
        if (h3 == null) {
            k0.S("homeWork");
            throw null;
        }
        if (h3.getLocal()) {
            final HomeWork h4 = this.H;
            if (h4 == null) {
                k0.S("homeWork");
                throw null;
            }
            if (h4.getId() < 1L) {
                this.c0().c(c.c.K);
            }
            h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ HomeWorkDetailActivity H;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ HomeWorkDetailActivity H = this.H;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((HomeWorkDetailActivity$f)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            if (g == 2) {
                                c1.n(o);
                                return j2.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            c1.n(o);
                        }
                    }
                    else {
                        c1.n(o);
                        final com.untis.mobile.services.classbook.a p = HomeWorkDetailActivity.P(this.H);
                        if (p == null) {
                            k0.S("classBookService");
                            throw null;
                        }
                        final HomeWork q = HomeWorkDetailActivity.Q(this.H);
                        if (q == null) {
                            k0.S("homeWork");
                            throw null;
                        }
                        this.G = 1;
                        if (p.j(q, true, this) == h) {
                            return h;
                        }
                    }
                    final k r = HomeWorkDetailActivity.R(this.H);
                    if (r == null) {
                        k0.S("timeTableService");
                        throw null;
                    }
                    final HomeWork q2 = HomeWorkDetailActivity.Q(this.H);
                    if (q2 == null) {
                        k0.S("homeWork");
                        throw null;
                    }
                    this.G = 2;
                    if (k.a.b(r, q2, false, this, 2, null) == h) {
                        return h;
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
            final a p = HomeWorkDetailActivity.P;
            final HomeWork h5 = this.H;
            if (h5 == null) {
                k0.S("homeWork");
                throw null;
            }
            ((Activity)this).setResult(-1, a.g(p, h5, false, 2, null));
            ((Activity)this).finish();
        }
        else {
            ((Dialog)new d$a((Context)this, 2131951624).L(2131493060).r(2131886649, (DialogInterface$OnClickListener)h0.G).B(2131886664, (DialogInterface$OnClickListener)new e0(this)).a()).show();
        }
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void afterTextChanged(@org.jetbrains.annotations.f final Editable editable) {
    }
    
    public void beforeTextChanged(@org.jetbrains.annotations.f final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    protected void onActivityResult(final int n, final int n2, @org.jetbrains.annotations.f final Intent intent) {
        final boolean b = n2 == -1;
        if (n != 121) {
            if (n != 122) {
                super.onActivityResult(n, n2, intent);
            }
            else if (b && intent != null) {
                final t a = HomeWorkDateSelectActivity.K.a(intent);
                final HomeWork h = this.H;
                if (h == null) {
                    k0.S("homeWork");
                    throw null;
                }
                final org.joda.time.c v0 = a.F0().S0(1).v0(1);
                k0.o(v0, "dueDate.toDateTimeAtStartOfDay().plusDays(1).minusMinutes(1)");
                h.setEnd(v0);
                final HomeWork h2 = this.H;
                if (h2 == null) {
                    k0.S("homeWork");
                    throw null;
                }
                final org.joda.time.c end = h2.getEnd();
                final HomeWork h3 = this.H;
                if (h3 == null) {
                    k0.S("homeWork");
                    throw null;
                }
                if (((org.joda.time.base.c)end).C((l0)h3.getStart())) {
                    final HomeWork h4 = this.H;
                    if (h4 == null) {
                        k0.S("homeWork");
                        throw null;
                    }
                    if (h4 == null) {
                        k0.S("homeWork");
                        throw null;
                    }
                    h4.setStart(h4.getEnd());
                    this.R0();
                }
                this.O0();
            }
        }
        else if (b && intent != null) {
            final t a2 = HomeWorkDateSelectActivity.K.a(intent);
            final HomeWork h5 = this.H;
            if (h5 == null) {
                k0.S("homeWork");
                throw null;
            }
            final org.joda.time.c f0 = a2.F0();
            k0.o(f0, "submitDate.toDateTimeAtStartOfDay()");
            h5.setStart(f0);
            final HomeWork h6 = this.H;
            if (h6 == null) {
                k0.S("homeWork");
                throw null;
            }
            final org.joda.time.c start = h6.getStart();
            final HomeWork h7 = this.H;
            if (h7 == null) {
                k0.S("homeWork");
                throw null;
            }
            if (((org.joda.time.base.c)start).R((l0)h7.getEnd())) {
                final HomeWork h8 = this.H;
                if (h8 == null) {
                    k0.S("homeWork");
                    throw null;
                }
                if (h8 == null) {
                    k0.S("homeWork");
                    throw null;
                }
                h8.setEnd(h8.getStart());
                this.O0();
            }
            this.R0();
        }
    }
    
    @Override
    protected void onCreate(@org.jetbrains.annotations.f Bundle extras) {
        super.onCreate(extras);
        final com.untis.mobile.services.profile.legacy.j0 g = com.untis.mobile.services.profile.legacy.j0.G;
        Bundle extras2;
        if (extras == null) {
            extras2 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras2 = extras;
        }
        final String s = "";
        String string;
        if (extras2 == null) {
            string = s;
        }
        else {
            string = extras2.getString("bart", "");
            if (string == null) {
                string = s;
            }
        }
        Profile g2;
        if ((g2 = g.l(string)) == null) {
            g2 = g.n();
            if (g2 == null) {
                throw new IllegalStateException("profile must not be null");
            }
        }
        this.G = g2;
        this.M = g2.getClassBookService();
        final Profile g3 = this.G;
        if (g3 == null) {
            k0.S("profile");
            throw null;
        }
        this.N = g3.getTimeTableService();
        Bundle extras3;
        if (extras == null) {
            extras3 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras3 = extras;
        }
        HomeWork homeWork;
        if (extras3 == null) {
            homeWork = null;
        }
        else {
            homeWork = (HomeWork)extras3.getParcelable("lisa");
        }
        HomeWork h = homeWork;
        if (homeWork == null) {
            h = new HomeWork(0L, 0L, null, null, null, null, false, null, 0L, 0L, false, null, false, null, 16383, null);
        }
        this.H = h;
        if (extras == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        this.I = (extras == null || extras.getBoolean("homer"));
        final com.untis.mobile.systemNotifications.b e0 = this.e0();
        final Profile g4 = this.G;
        if (g4 == null) {
            k0.S("profile");
            throw null;
        }
        final String uniqueId = g4.getUniqueId();
        final HomeWork h2 = this.H;
        if (h2 != null) {
            this.K = (List<com.untis.mobile.systemNotifications.a>)kotlin.collections.v.L5((Collection<?>)e0.k(uniqueId, h2.getId()));
            if (this.I) {
                this.setContentView(2131492921);
                this.S();
            }
            else {
                this.setContentView(2131492920);
                this.V();
            }
            final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
            if (supportActionBar != null) {
                final HomeWork h3 = this.H;
                if (h3 == null) {
                    k0.S("homeWork");
                    throw null;
                }
                int n = 0;
                Label_0440: {
                    if (h3.getId() == 0L) {
                        final HomeWork h4 = this.H;
                        if (h4 == null) {
                            k0.S("homeWork");
                            throw null;
                        }
                        if (h4.getLocal()) {
                            n = 2131886285;
                            break Label_0440;
                        }
                    }
                    final HomeWork h5 = this.H;
                    if (h5 == null) {
                        k0.S("homeWork");
                        throw null;
                    }
                    if (h5.getId() < 1L) {
                        final HomeWork h6 = this.H;
                        if (h6 == null) {
                            k0.S("homeWork");
                            throw null;
                        }
                        if (!h6.getLocal()) {
                            n = 2131886286;
                            break Label_0440;
                        }
                    }
                    n = 2131886295;
                }
                supportActionBar.A0((CharSequence)((Activity)this).getString(n));
            }
            final androidx.appcompat.app.a supportActionBar2 = this.getSupportActionBar();
            if (supportActionBar2 != null) {
                supportActionBar2.Y(true);
            }
            return;
        }
        k0.S("homeWork");
        throw null;
    }
    
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.f final Menu menu) {
        if (!this.I) {
            final HomeWork h = this.H;
            if (h == null) {
                k0.S("homeWork");
                throw null;
            }
            if (h.getId() != 0L) {
                this.getMenuInflater().inflate(2131558406, menu);
            }
        }
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(@e final MenuItem menuItem) {
        k0.p(menuItem, "item");
        final int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            if (this.J && !this.I) {
                this.J0();
            }
            else {
                ((ComponentActivity)this).onBackPressed();
            }
            return true;
        }
        if (itemId != 2131298436) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.h0();
        return true;
    }
    
    protected void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        bundle.putString("bart", g.getUniqueId());
        final HomeWork h = this.H;
        if (h != null) {
            bundle.putParcelable("lisa", (Parcelable)h);
            bundle.putBoolean("homer", this.I);
            return;
        }
        k0.S("homeWork");
        throw null;
    }
    
    public void onTextChanged(@org.jetbrains.annotations.f final CharSequence charSequence, final int n, final int n2, final int n3) {
        this.w0(String.valueOf(((AppCompatEditText)this.findViewById(com.untis.mobile.c.i.S5)).getText()));
        this.y0(String.valueOf(((AppCompatEditText)this.findViewById(com.untis.mobile.c.i.X5)).getText()));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\"\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J&\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bJ&\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\bJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u0012J\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0012R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006#" }, d2 = { "com/untis/mobile/ui/activities/classbook/homeworks/HomeWorkDetailActivity$a", "", "Landroid/content/Context;", "context", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "", "profileId", "", "h", "", "lessonId", "Lorg/joda/time/c;", "start", "a", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homeWork", "readOnly", "Landroid/content/Intent;", "d", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "e", "delete", "f", "data", "c", "b", "BUNDLE_DELETE", "Ljava/lang/String;", "BUNDLE_HOMEWORK", "BUNDLE_PROFILE_ID", "BUNDLE_READ_ONLY", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        private final org.joda.time.c a(final String s, final long n, final org.joda.time.c c) {
            final t h1 = c.h1();
            final List<Period> v = com.untis.mobile.services.timetable.placeholder.p.Y.a(s).v(n);
            final ArrayList<Period> list = new ArrayList<Period>();
            for (final Period next : v) {
                if (((org.joda.time.base.e)next.getStart().h1()).m((n0)h1)) {
                    list.add(next);
                }
            }
            final ArrayList list2 = new ArrayList<t>(kotlin.collections.v.Y((Iterable<?>)list, 10));
            final Iterator<Object> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                list2.add(iterator2.next().getStart().h1());
            }
            final t t = kotlin.collections.v.r2((Iterable<? extends t>)kotlin.collections.v.h1((Iterable<? extends Comparable>)list2));
            org.joda.time.c f0;
            if (t == null) {
                f0 = null;
            }
            else {
                f0 = t.F0();
            }
            return f0;
        }
        
        public static /* synthetic */ Intent g(final a a, final HomeWork homeWork, boolean b, final int n, final Object o) {
            if ((n & 0x2) != 0x0) {
                b = false;
            }
            return a.f(homeWork, b);
        }
        
        private final boolean h(final Context context, final Period period, final String s) {
            return !period.getRights().contains(PeriodRight.WRITE_HOMEWORK) && com.untis.mobile.utils.a.a(context).J(com.untis.mobile.services.profile.legacy.j0.G.l(s));
        }
        
        public final boolean b(@e final Intent intent) {
            k0.p(intent, "data");
            return intent.getBooleanExtra("maggie", false);
        }
        
        @org.jetbrains.annotations.f
        public final HomeWork c(@e final Intent intent) {
            k0.p(intent, "data");
            return (HomeWork)intent.getParcelableExtra("lisa");
        }
        
        @e
        public final Intent d(@e final Context context, @e final String s, @e final HomeWork homeWork, final boolean b) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            k0.p(homeWork, "homeWork");
            final Intent intent = new Intent(context, (Class)HomeWorkDetailActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("bart", s);
            bundle.putParcelable("lisa", (Parcelable)homeWork);
            bundle.putBoolean("homer", b);
            intent.putExtras(bundle);
            return intent;
        }
        
        @e
        public final Intent e(@e final Context context, @e final String s, @e final TimeTableEntity timeTableEntity, @e final Period period) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            k0.p(timeTableEntity, "timeTableEntity");
            k0.p(period, "period");
            final Intent intent = new Intent(context, (Class)HomeWorkDetailActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("bart", s);
            final long lessonId = period.getLessonId();
            final org.joda.time.c start = period.getStart();
            org.joda.time.c a;
            if ((a = this.a(s, period.getLessonId(), period.getStart())) == null) {
                a = new org.joda.time.c(0L);
            }
            bundle.putParcelable("lisa", (Parcelable)new HomeWork(0L, lessonId, start, a, null, null, false, timeTableEntity.getEntityType(), timeTableEntity.getEntityId(), period.getId(), this.h(context, period, s), null, true, null, 10353, null));
            bundle.putBoolean("homer", false);
            intent.putExtras(bundle);
            return intent;
        }
        
        @e
        public final Intent f(@e final HomeWork homeWork, final boolean b) {
            k0.p(homeWork, "homeWork");
            final Intent intent = new Intent();
            intent.putExtra("lisa", (Parcelable)homeWork);
            intent.putExtra("maggie", b);
            return intent;
        }
    }
}
