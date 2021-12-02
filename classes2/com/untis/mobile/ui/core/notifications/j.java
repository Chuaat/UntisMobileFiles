// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.core.notifications;

import android.view.ViewGroup;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.c;
import com.untis.mobile.persistence.models.MessageOfDayKt;
import kotlin.j2;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import java.util.List;
import android.content.Intent;
import android.net.Uri;
import kotlin.text.s;
import org.jetbrains.annotations.f;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.untis.mobile.persistence.models.MessageOfDay;
import n6.l;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.view.View;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$g0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J7\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042'\u0010\r\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006¨\u0006\u0013" }, d2 = { "Lcom/untis/mobile/ui/core/notifications/j;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Landroid/webkit/WebViewClient;", "d", "Lcom/untis/mobile/persistence/models/MessageOfDay;", "messageOfDay", "Lkotlin/Function1;", "", "Lcom/untis/mobile/persistence/models/drive/DriveAttachment;", "Lkotlin/t0;", "name", "attachments", "Lkotlin/j2;", "onAttachments", "b", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class j extends RecyclerView$g0
{
    public j(@e final View view) {
        k0.p(view, "view");
        super(view);
    }
    
    private static final void c(final l l, final MessageOfDay messageOfDay, final View view) {
        k0.p(l, "$onAttachments");
        k0.p(messageOfDay, "$messageOfDay");
        l.invoke(messageOfDay.getDriveAttachments());
    }
    
    private final WebViewClient d() {
        return new WebViewClient() {
            public boolean shouldOverrideUrlLoading(@e final WebView webView, @f final String s) {
                k0.p(webView, "view");
                boolean b = false;
                if (s != null) {
                    if (!s.u2(s, "http://", false, 2, (Object)null)) {
                        b = b;
                        if (!s.u2(s, "https://", false, 2, (Object)null)) {
                            return b;
                        }
                    }
                    final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
                    intent.setFlags(268435456);
                    webView.getContext().startActivity(intent);
                    b = true;
                }
                return b;
            }
        };
    }
    
    public final void b(@e final MessageOfDay messageOfDay, @e final l<? super List<DriveAttachment>, j2> l) {
        k0.p(messageOfDay, "messageOfDay");
        k0.p(l, "onAttachments");
        final String escapedSubject = MessageOfDayKt.getEscapedSubject(messageOfDay);
        final String escapedText = MessageOfDayKt.getEscapedText(messageOfDay);
        final View itemView = super.itemView;
        final int oz = c.i.oz;
        ((WebView)itemView.findViewById(oz)).setWebViewClient(this.d());
        ((WebView)super.itemView.findViewById(oz)).loadData(escapedSubject, "text/html; charset=utf-8", "UTF-8");
        if (!k0.g(escapedSubject, escapedText)) {
            final View itemView2 = super.itemView;
            final int pz = c.i.pz;
            ((WebView)itemView2.findViewById(pz)).setWebViewClient(this.d());
            ((WebView)super.itemView.findViewById(pz)).loadData(escapedText, "text/html; charset=utf-8", "UTF-8");
            ((WebView)super.itemView.findViewById(pz)).setVisibility(0);
        }
        else {
            ((WebView)super.itemView.findViewById(c.i.pz)).setVisibility(8);
        }
        if (messageOfDay.getDriveAttachments().isEmpty() ^ true) {
            final View itemView3 = super.itemView;
            final int nz = c.i.nz;
            ((ViewGroup)itemView3.findViewById(nz)).setOnClickListener((View$OnClickListener)new i(l, messageOfDay));
            ((ViewGroup)super.itemView.findViewById(nz)).setVisibility(0);
        }
        else {
            ((ViewGroup)super.itemView.findViewById(c.i.nz)).setVisibility(8);
        }
    }
}
