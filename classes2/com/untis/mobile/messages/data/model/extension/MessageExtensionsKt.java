// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model.extension;

import org.joda.time.base.g;
import org.joda.time.base.a;
import kotlin.collections.y0;
import kotlin.n1;
import kotlin.s0;
import com.untis.mobile.messages.data.model.Recipient;
import kotlin.text.o;
import java.util.Map;
import android.content.Context;
import org.joda.time.c;
import android.text.format.DateUtils;
import com.untis.mobile.utils.extension.h;
import kotlin.jvm.internal.k0;
import android.text.Spannable;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.model.Message;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0012\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001e\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¨\u0006\f" }, d2 = { "Lcom/untis/mobile/messages/data/model/Message;", "", "getFormattedSentDate", "", "spanColor", "Landroid/text/Spannable;", "getFormattedSentDateForHistory", "getDetailsFormattedSentDate", "Landroid/content/Context;", "context", "", "getSentToRecipientNameAndImage", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class MessageExtensionsKt
{
    @e
    public static final Spannable getDetailsFormattedSentDate(@e final Message message, final int n) {
        k0.p(message, "<this>");
        final String g4 = ((a)message.getSentDateTime()).g4("E | dd.MM.yy | HH:mm");
        k0.o(g4, "sentDateTime.toString(\"E | dd.MM.yy | HH:mm\")");
        return h.N(g4, "|", n);
    }
    
    @e
    public static final String getFormattedSentDate(@e final Message message) {
        k0.p(message, "<this>");
        final boolean today = DateUtils.isToday(((g)message.getSentDateTime()).n());
        final c sentDateTime = message.getSentDateTime();
        String s;
        String s2;
        if (today) {
            s = ((a)sentDateTime).g4("HH:mm");
            s2 = "{\n        sentDateTime.toString(\"HH:mm\")\n    }";
        }
        else {
            s = ((a)sentDateTime).g4("dd.MMM");
            s2 = "{\n        sentDateTime.toString(\"dd.MMM\")\n    }";
        }
        k0.o(s, s2);
        return s;
    }
    
    @e
    public static final Spannable getFormattedSentDateForHistory(@e final Message message, final int n) {
        k0.p(message, "<this>");
        final boolean today = DateUtils.isToday(((g)message.getSentDateTime()).n());
        final c sentDateTime = message.getSentDateTime();
        String s;
        String s2;
        if (today) {
            s = ((a)sentDateTime).g4("HH:mm");
            s2 = "sentDateTime.toString(\"HH:mm\")";
        }
        else {
            s = ((a)sentDateTime).g4("dd.MM.yy | HH:mm");
            s2 = "sentDateTime.toString(\"dd.MM.yy | HH:mm\")";
        }
        k0.o(s, s2);
        return h.N(s, "|", n);
    }
    
    @e
    public static final Map<String, String> getSentToRecipientNameAndImage(@e final Message message, @e final Context context) {
        k0.p(message, "<this>");
        k0.p(context, "context");
        final o o = new o("[^A-Za-z ]");
        final boolean empty = message.getRecipientGroups().isEmpty();
        String string = "";
        String s;
        String i;
        if (empty ^ true) {
            final String j = h.J(new o("\\s+").j((CharSequence)o.j((CharSequence)message.getRecipientGroups().get(0).getDisplayName(), ""), " "));
            final String displayName = message.getRecipientGroups().get(0).getDisplayName();
            String string2;
            if (message.getNumberOfRecipients() > 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append(" + ");
                sb.append(message.getNumberOfRecipients() - 1);
                sb.append(' ');
                sb.append(context.getString(2131886607));
                string2 = sb.toString();
            }
            else {
                string2 = "";
            }
            s = k0.C(displayName, string2);
            i = j;
        }
        else if (message.getRecipientPersons().isEmpty() ^ true) {
            final String k = h.J(new o("\\s+").j((CharSequence)o.j((CharSequence)message.getRecipientPersons().get(0).getDisplayName(), ""), " "));
            final String value = String.valueOf(message.getRecipientPersons().get(0).getImageUrl());
            final String displayName2 = message.getRecipientPersons().get(0).getDisplayName();
            if (message.getNumberOfRecipients() > 1) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(" + ");
                sb2.append(message.getNumberOfRecipients() - 1);
                sb2.append(' ');
                sb2.append(context.getString(2131886607));
                string = sb2.toString();
            }
            s = k0.C(displayName2, string);
            string = value;
            i = k;
        }
        else {
            final String string3 = context.getString(2131886608);
            k0.o(string3, "context.getString(R.string.sent_messages_unknown_recipients)");
            i = h.J(string3);
            s = context.getString(2131886608);
            k0.o(s, "context.getString(R.string.sent_messages_unknown_recipients)");
        }
        return (Map<String, String>)y0.W(n1.a("name", i), n1.a("imageUrl", string), n1.a("recipientText", s));
    }
}
