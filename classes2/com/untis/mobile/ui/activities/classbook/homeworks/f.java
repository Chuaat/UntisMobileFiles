// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.homeworks;

import android.widget.ImageView;
import android.app.Activity;
import android.app.Dialog;
import android.annotation.SuppressLint;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.TextView;
import com.untis.mobile.c;
import android.content.DialogInterface$OnClickListener;
import android.view.ViewGroup;
import androidx.appcompat.app.d$a;
import com.untis.mobile.ui.activities.drive.DriveAttachmentListActivity;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import android.view.View;
import android.content.DialogInterface;
import java.util.ArrayList;
import kotlin.jvm.internal.w;
import androidx.core.content.d;
import android.content.Context;
import kotlin.jvm.internal.k0;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import java.util.List;
import com.untis.mobile.persistence.models.timetable.period.Period;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.widget.BaseAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BR\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010)\u001a\u00020'\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012!\u00106\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020\u000602¢\u0006\u0004\b7\u00108J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J$\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u0014\u0010\u0018\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\tR\u001e\u0010\u001d\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00069" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/homeworks/f;", "Landroid/widget/BaseAdapter;", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homeWork", "", "g", "Lkotlin/j2;", "m", "f", "", "Lcom/untis/mobile/persistence/models/drive/DriveAttachment;", "attachments", "l", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "h", "", "getItemId", "getCount", "homeWorks", "p", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "L", "Landroid/view/LayoutInflater;", "inflater", "N", "I", "colorCompleted", "M", "colorLocal", "", "H", "Ljava/lang/String;", "profileId", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "O", "colorDefault", "Lcom/untis/mobile/ui/activities/classbook/homeworks/HomeWorksActivity;", "G", "Lcom/untis/mobile/ui/activities/classbook/homeworks/HomeWorksActivity;", "activity", "J", "Ljava/util/List;", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "homework", "onHomework", "<init>", "(Lcom/untis/mobile/ui/activities/classbook/homeworks/HomeWorksActivity;Ljava/lang/String;Lcom/untis/mobile/persistence/models/timetable/period/Period;Ljava/util/List;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f extends BaseAdapter
{
    @e
    private final HomeWorksActivity G;
    @e
    private final String H;
    @e
    private final Period I;
    @e
    private List<HomeWork> J;
    @e
    private final l<HomeWork, j2> K;
    private final LayoutInflater L;
    private final int M;
    private final int N;
    private final int O;
    
    public f(@e final HomeWorksActivity g, @e final String h, @e final Period i, @e final List<HomeWork> j, @e final l<? super HomeWork, j2> k) {
        k0.p(g, "activity");
        k0.p(h, "profileId");
        k0.p(i, "period");
        k0.p(j, "homeWorks");
        k0.p(k, "onHomework");
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = (l<HomeWork, j2>)k;
        this.L = LayoutInflater.from((Context)g);
        this.M = d.f((Context)g, 2131099692);
        this.N = d.f((Context)g, 2131099687);
        this.O = d.f((Context)g, 2131099684);
    }
    
    private final void f(final HomeWork homeWork) {
        this.G.w(homeWork);
    }
    
    private final int g(final HomeWork homeWork) {
        if (homeWork.getCompletedStatus()) {
            return this.N;
        }
        if (homeWork.getLocal()) {
            return this.M;
        }
        return this.O;
    }
    
    private static final void i(final f f, final HomeWork homeWork, final View view) {
        k0.p(f, "this$0");
        k0.p(homeWork, "$homeWork");
        f.l(homeWork.getDriveAttachments());
    }
    
    private static final void j(final f f, final HomeWork homeWork, final View view) {
        k0.p(f, "this$0");
        k0.p(homeWork, "$homeWork");
        f.m(homeWork);
    }
    
    private static final void k(final f f, final HomeWork homeWork, final View view) {
        k0.p(f, "this$0");
        k0.p(homeWork, "$homeWork");
        f.K.invoke(homeWork);
    }
    
    private final void l(final List<DriveAttachment> list) {
        DriveAttachmentListActivity.s((Context)this.G, list);
    }
    
    private final void m(final HomeWork homeWork) {
        ((Dialog)new d$a((Context)this.G, 2131951624).M(this.L.inflate(2131493036, (ViewGroup)null, false)).r(2131886649, (DialogInterface$OnClickListener)b.G).B(2131886653, (DialogInterface$OnClickListener)new a(this, homeWork)).a()).show();
    }
    
    private static final void n(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void o(final f f, final HomeWork homeWork, final DialogInterface dialogInterface, final int n) {
        k0.p(f, "this$0");
        k0.p(homeWork, "$homeWork");
        f.f(homeWork);
    }
    
    public int getCount() {
        return this.J.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    @SuppressLint({ "SetTextI18n" })
    @e
    public View getView(int visibility, @org.jetbrains.annotations.f final View view, @org.jetbrains.annotations.f final ViewGroup viewGroup) {
        final HomeWork h = this.h(visibility);
        final int n = 0;
        View inflate = view;
        if (view == null) {
            inflate = this.L.inflate(2131493212, viewGroup, false);
        }
        visibility = c.i.Ry;
        ((TextView)inflate.findViewById(visibility)).setText((CharSequence)h.getText());
        final TextView textView = (TextView)inflate.findViewById(visibility);
        final CharSequence text = ((TextView)inflate.findViewById(visibility)).getText();
        k0.o(text, "view.item_homework_title.text");
        visibility = text.length();
        final int n2 = 1;
        if (visibility == 0) {
            visibility = 1;
        }
        else {
            visibility = 0;
        }
        if (visibility != 0) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        textView.setVisibility(visibility);
        visibility = c.i.Py;
        ((TextView)inflate.findViewById(visibility)).setText((CharSequence)h.getRemark());
        final TextView textView2 = (TextView)inflate.findViewById(visibility);
        final CharSequence text2 = ((TextView)inflate.findViewById(visibility)).getText();
        k0.o(text2, "view.item_homework_subtitle.text");
        if (text2.length() == 0) {
            visibility = 1;
        }
        else {
            visibility = 0;
        }
        if (visibility != 0) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        textView2.setVisibility(visibility);
        visibility = c.i.Qy;
        final TextView textView3 = (TextView)inflate.findViewById(visibility);
        final StringBuilder sb = new StringBuilder();
        sb.append(((Activity)this.G).getString(2131886294));
        sb.append(' ');
        sb.append((Object)((org.joda.time.base.a)h.getEnd()).g4("dd.MM.yyyy"));
        textView3.setText((CharSequence)sb.toString());
        final TextView textView4 = (TextView)inflate.findViewById(visibility);
        final CharSequence text3 = ((TextView)inflate.findViewById(visibility)).getText();
        k0.o(text3, "view.item_homework_subtitle2.text");
        if (text3.length() == 0) {
            visibility = n2;
        }
        else {
            visibility = 0;
        }
        if (visibility != 0) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        textView4.setVisibility(visibility);
        ((ImageView)inflate.findViewById(c.i.Oy)).setColorFilter(this.g(h));
        visibility = c.i.Ky;
        ((ImageView)inflate.findViewById(visibility)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.homeworks.e(this, h));
        final AppCompatImageView appCompatImageView = (AppCompatImageView)inflate.findViewById(visibility);
        if (h.getDriveAttachments().isEmpty()) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        ((ImageView)appCompatImageView).setVisibility(visibility);
        final int ly = c.i.Ly;
        final AppCompatImageView appCompatImageView2 = (AppCompatImageView)inflate.findViewById(ly);
        if (com.untis.mobile.services.a.a.x(this.I, h)) {
            visibility = n;
        }
        else {
            visibility = 8;
        }
        ((ImageView)appCompatImageView2).setVisibility(visibility);
        ((ImageView)inflate.findViewById(ly)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.homeworks.c(this, h));
        inflate.setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.homeworks.d(this, h));
        k0.o(inflate, "view");
        return inflate;
    }
    
    @e
    public HomeWork h(final int n) {
        return this.J.get(n);
    }
    
    public final void p(@e final List<HomeWork> j) {
        k0.p(j, "homeWorks");
        this.J = j;
        this.notifyDataSetInvalidated();
    }
}
