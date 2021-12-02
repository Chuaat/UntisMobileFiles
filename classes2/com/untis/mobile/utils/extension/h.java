// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.extension;

import android.widget.EditText;
import com.untis.mobile.api.common.JsonRpcErrorType;
import android.widget.SearchView$OnQueryTextListener;
import android.widget.SearchView;
import android.annotation.SuppressLint;
import android.provider.Settings$Secure;
import android.graphics.drawable.Drawable;
import com.untis.mobile.persistence.models.EntityType;
import java.net.URLEncoder;
import retrofit2.j;
import java.io.EOFException;
import java.util.concurrent.TimeoutException;
import h5.f;
import h5.b;
import java.net.UnknownHostException;
import java.net.ConnectException;
import javax.net.ssl.SSLPeerUnverifiedException;
import com.untis.mobile.api.error.JsonRpcErrorUnspecified;
import javax.net.ssl.SSLHandshakeException;
import com.untis.mobile.api.error.JsonRpcError;
import androidx.annotation.w0;
import es.dmoral.toasty.c;
import androidx.core.content.d;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.util.Log;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import n6.a;
import android.view.View;
import com.untis.mobile.persistence.models.Entity;
import kotlin.z0;
import kotlin.i;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import android.text.style.StrikethroughSpan;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableStringBuilder;
import android.text.Spannable;
import android.util.LongSparseArray;
import java.util.Objects;
import com.untis.mobile.persistence.models.Displayable;
import kotlin.text.o;
import android.content.Context;
import kotlin.text.s;
import android.text.Spanned;
import java.util.Iterator;
import android.text.InputFilter;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.List;
import com.google.android.material.textfield.TextInputEditText;
import android.text.TextWatcher;
import com.untis.mobile.utils.n0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0012\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u001a\u0018\u0010\u000e\u001a\u00020\n*\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u001a\u0018\u0010\u000f\u001a\u00020\n*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u001a\u001a\u0010\u0011\u001a\u00020\n*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006\u001a\u001a\u0010\u0012\u001a\u00020\n*\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006\u001a-\u0010\u0015\u001a\u00020\n*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0013\"\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001a\u0010\u0018\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u001a\n\u0010\u001a\u001a\u00020\b*\u00020\u0019\u001a\f\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0007\u001a\u0014\u0010\u001f\u001a\u00020\b*\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\b\u001a\n\u0010 \u001a\u00020\u0006*\u00020\u0006\u001a$\u0010$\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020!0\f2\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u0019\u001a\u0012\u0010&\u001a\u00020\u001c*\u00020\u00002\u0006\u0010%\u001a\u00020\u0006\u001a\u0014\u0010(\u001a\u00020\u001c*\u00020\u00002\b\b\u0001\u0010'\u001a\u00020\b\u001a\u0012\u0010)\u001a\u00020\u001c*\u00020\u00002\u0006\u0010%\u001a\u00020\u0006\u001a\u0014\u0010*\u001a\u00020\u001c*\u00020\u00002\b\b\u0001\u0010'\u001a\u00020\b\u001a\u0012\u0010+\u001a\u00020\u001c*\u00020\u00002\u0006\u0010%\u001a\u00020\u0006\u001a\u0014\u0010-\u001a\u00020\u001c*\u00020\u00002\b\b\u0001\u0010,\u001a\u00020\b\u001a\u0012\u0010.\u001a\u00020\u001c*\u00020\u00002\u0006\u0010%\u001a\u00020\u0006\u001a\u0014\u0010/\u001a\u00020\u001c*\u00020\u00002\b\b\u0001\u0010,\u001a\u00020\b\u001a\u0012\u00102\u001a\u00020\u001c*\u00020\u00002\u0006\u00101\u001a\u000200\u001a\u000e\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u000203\u001a\u0012\u00106\u001a\u00020\u001c*\u00020\u00002\u0006\u0010%\u001a\u00020\u0006\u001a\u0012\u00107\u001a\u00020\u0006*\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000\u001a\f\u00108\u001a\u00020\u0006*\u00020\u0000H\u0007\u001a\n\u00109\u001a\u00020\n*\u00020\u0006\u001a\u0018\u0010=\u001a\u00020\u001c*\u00020:2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001c0;\u001a-\u0010C\u001a\u00020\u001c*\u00020>2!\u0010B\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u001c0?\u001a-\u0010E\u001a\u00020\u001c*\u00020D2!\u0010B\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u001c0?\u001a\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u001f*\b\u0012\u0004\u0012\u00028\u00000F\u001a(\u0010J\u001a\u00020\u001c\"\b\b\u0000\u0010\u001f*\u00020H*\b\u0012\u0004\u0012\u00028\u00000F2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u001a\n\u0010K\u001a\u00020\u0019*\u00020\u0000\u001a\u001f\u0010O\u001a\u00020L2\u0017\u0010N\u001a\u0013\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u001c0?¢\u0006\u0002\bM\u001a#\u0010Q\u001a\u00020\u001c*\u00020P2\u0017\u0010N\u001a\u0013\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u001c0?¢\u0006\u0002\bM\u001a\u001a\u0010T\u001a\u00020\u001c*\u00020>2\u000e\b\u0002\u0010S\u001a\b\u0012\u0004\u0012\u00020R0\f\u001a\u0017\u0010V\u001a\u00020U\"\u0004\b\u0000\u0010\u001f*\u00028\u0000¢\u0006\u0004\bV\u0010W\u001a\n\u0010X\u001a\u00020\u0006*\u00020\u0006\u001a\n\u0010Y\u001a\u00020\u0006*\u00020\u0006\u001a\n\u0010Z\u001a\u00020\u0006*\u00020\u0006\u001a\n\u0010[\u001a\u00020\u0019*\u00020\u0006\u001a-\u0010]\u001a\u00020\u001c*\u00020\\2!\u0010B\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u001c0?\"\u001d\u0010`\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001f*\u00028\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b^\u0010_\"\u0016\u0010b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\ba\u0010Y¨\u0006c" }, d2 = { "Landroid/content/Context;", "context", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "Landroid/graphics/drawable/Drawable;", "t", "", "v", "", "color", "Landroid/text/Spannable;", "M", "", "texts", "S", "R", "text", "P", "O", "", "values", "Q", "(Ljava/lang/String;I[Ljava/lang/String;)Landroid/text/Spannable;", "match", "N", "", "f", "Landroidx/appcompat/widget/AppCompatTextView;", "Lkotlin/j2;", "X", "visibility", "T", "J", "Lcom/untis/mobile/persistence/models/Displayable;", "separator", "useDescription", "G", "message", "n", "stringId", "m", "r", "q", "p", "id", "o", "k", "j", "", "throwable", "l", "Lretrofit2/j;", "exception", "y", "i", "V", "w", "L", "Landroid/view/View;", "Lkotlin/Function0;", "action", "c", "Lcom/google/android/material/textfield/TextInputEditText;", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "onTextChange", "B", "Landroidx/appcompat/widget/AppCompatEditText;", "A", "Landroid/util/LongSparseArray;", "K", "Lcom/untis/mobile/persistence/models/Entity;", "items", "b", "g", "Landroid/os/Bundle;", "Lkotlin/s;", "block", "d", "Landroidx/fragment/app/Fragment;", "e", "", "forbiddenChars", "C", "Ljava/lang/reflect/Type;", "W", "(Ljava/lang/Object;)Ljava/lang/reflect/Type;", "s", "I", "F", "h", "Landroid/widget/SearchView;", "z", "x", "(Ljava/lang/Object;)Ljava/lang/Object;", "exhaustive", "a", "INITIALS_MAX_LENGTH", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class h
{
    private static final int a = 2;
    
    public static final void A(@e final AppCompatEditText appCompatEditText, @e final l<? super String, j2> l) {
        k0.p(appCompatEditText, "<this>");
        k0.p(l, "onTextChange");
        ((EditText)appCompatEditText).addTextChangedListener((TextWatcher)new n0(new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                l.invoke(s);
            }
        }));
    }
    
    public static final void B(@e final TextInputEditText textInputEditText, @e final l<? super String, j2> l) {
        k0.p(textInputEditText, "<this>");
        k0.p(l, "onTextChange");
        ((EditText)textInputEditText).addTextChangedListener((TextWatcher)new n0(new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                l.invoke(s);
            }
        }));
    }
    
    public static final void C(@e final TextInputEditText textInputEditText, @e final List<Character> list) {
        k0.p(textInputEditText, "<this>");
        k0.p(list, "forbiddenChars");
        final ArrayList list2 = new ArrayList<Object>(v.Y((Iterable<?>)list, 10));
        final Iterator<Character> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(String.valueOf((char)iterator.next()));
        }
        final Iterator<String> iterator2 = (Iterator<String>)list2.iterator();
        if (iterator2.hasNext()) {
            String s = iterator2.next();
            while (iterator2.hasNext()) {
                final String str = iterator2.next();
                final String str2 = s;
                final StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(' ');
                sb.append(str);
                s = sb.toString();
            }
            ((EditText)textInputEditText).setFilters(new InputFilter[] { (InputFilter)new g(list, textInputEditText, s) });
            return;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
    
    private static final CharSequence E(final List list, final TextInputEditText textInputEditText, final String s, final CharSequence charSequence, final int n, final int n2, final Spanned spanned, final int n3, final int n4) {
        k0.p(list, "$forbiddenChars");
        k0.p(textInputEditText, "$this_secureInputWithFilter");
        k0.p(s, "$forbiddenCharsText");
        if (charSequence == null) {
            return charSequence;
        }
        final Iterator<Character> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (s.U2(charSequence, (char)iterator.next(), false, 2, (Object)null)) {
                final Context context = ((EditText)textInputEditText).getContext();
                k0.o(context, "context");
                final String string = ((EditText)textInputEditText).getContext().getString(2131886748);
                k0.o(string, "context.getString(R.string.shared_notAllowedCharactersValidationErrorDetail_text)");
                k(context, s.k2(string, "{0}", s, false, 4, (Object)null));
                return "";
            }
        }
        return charSequence;
    }
    
    @e
    public static final String F(@e String k2) {
        k0.p(k2, "<this>");
        k2 = s.k2(s.k2(s.k2(s.k2(s.k2(s.k2(k2, "[\u00c4]", "Ae", false, 4, (Object)null), "[\u00e4]", "ae", false, 4, (Object)null), "[\u00dc]", "Ue", false, 4, (Object)null), "[\u00fc]", "ue", false, 4, (Object)null), "[\u00d6]", "Oe", false, 4, (Object)null), "[\u00f6]", "oe", false, 4, (Object)null);
        return new o("[^\\w]").j((CharSequence)k2, "");
    }
    
    @e
    public static final String G(@e final List<? extends Displayable> list, @e final String s, final boolean b) {
        k0.p(list, "<this>");
        k0.p(s, "separator");
        if (list.isEmpty()) {
            return "";
        }
        final ArrayList<String> list2 = new ArrayList<String>(v.Y((Iterable<?>)list, 10));
        for (final Displayable displayable : list) {
            String s2;
            if (b) {
                s2 = displayable.getDisplayableDescription();
            }
            else {
                s2 = displayable.getDisplayableTitle();
            }
            list2.add(s2);
        }
        final Iterator<Object> iterator2 = list2.iterator();
        if (!iterator2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        final String next = iterator2.next();
        if (iterator2.hasNext()) {
            final String str = iterator2.next();
            String c;
            final String s3 = c = next;
            if (s.U1((CharSequence)s3) ^ true) {
                c = k0.C(s3, s);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append(' ');
            sb.append(str);
            return sb.toString();
        }
        return next;
    }
    
    @e
    public static final String I(@e final String s) {
        k0.p(s, "<this>");
        String c = s;
        if (!s.u2(s, "http://", false, 2, (Object)null)) {
            c = s;
            if (!s.u2(s, "https://", false, 2, (Object)null)) {
                c = k0.C("https://", s);
            }
        }
        return c;
    }
    
    @e
    public static final String J(@e String s) {
        k0.p(s, "<this>");
        final List s2 = s.S4((CharSequence)s, new String[] { " " }, false, 0, 6, (Object)null);
        if (s2.size() == 1) {
            final String s3 = s = s2.get(0);
            if (s3.length() >= 2) {
                s = s3.substring(0, 2);
                k0.o(s, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            }
        }
        else {
            final Iterator<String> iterator = s2.iterator();
            s = "";
            int n = 0;
            while (iterator.hasNext()) {
                final String obj = iterator.next();
                if (s.U1((CharSequence)obj)) {
                    continue;
                }
                if (n >= 2) {
                    break;
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                final String upperCase = obj.toUpperCase();
                k0.o(upperCase, "(this as java.lang.String).toUpperCase()");
                Objects.requireNonNull(upperCase, "null cannot be cast to non-null type java.lang.String");
                final String substring = upperCase.substring(0, 1);
                k0.o(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                s = k0.C(s, substring);
                ++n;
            }
        }
        return s;
    }
    
    @e
    public static final <T> List<T> K(@e final LongSparseArray<T> longSparseArray) {
        k0.p(longSparseArray, "<this>");
        final ArrayList<T> list = new ArrayList<T>();
        for (int size = longSparseArray.size(), i = 0; i < size; ++i) {
            list.add((T)longSparseArray.get(longSparseArray.keyAt(i)));
        }
        return list;
    }
    
    @e
    public static final Spannable L(@e final String s) {
        k0.p(s, "<this>");
        return (Spannable)new SpannableStringBuilder((CharSequence)s);
    }
    
    @e
    public static final Spannable M(@e final String s, final int n) {
        k0.p(s, "<this>");
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)s);
        spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(n), 0, s.length(), 256);
        return (Spannable)spannableStringBuilder;
    }
    
    @e
    public static final Spannable N(@e final String s, @e final String s2, final int n) {
        k0.p(s, "<this>");
        k0.p(s2, "match");
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)s);
        for (int i = s.r3((CharSequence)s, s2, 0, false, 6, (Object)null); i >= 0; i = s.r3((CharSequence)s, s2, i + 1, false, 4, (Object)null)) {
            spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(n), i, s2.length() + i, 256);
        }
        return (Spannable)spannableStringBuilder;
    }
    
    @e
    public static final Spannable O(@e final Spannable spannable, final int n, @e final String s) {
        k0.p(spannable, "<this>");
        k0.p(s, "text");
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)spannable);
        if (s.length() == 0) {
            return (Spannable)spannableStringBuilder;
        }
        final int n2 = s.n3((CharSequence)spannable, s, 0, true);
        if (n2 < 0) {
            return (Spannable)spannableStringBuilder;
        }
        spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(n), n2, s.length() + n2, 256);
        return (Spannable)spannableStringBuilder;
    }
    
    @e
    public static final Spannable P(@e final String s, final int n, @e final String s2) {
        k0.p(s, "<this>");
        k0.p(s2, "text");
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)s);
        if (s2.length() == 0) {
            return (Spannable)spannableStringBuilder;
        }
        final int n2 = s.n3((CharSequence)s, s2, 0, true);
        if (n2 < 0) {
            return (Spannable)spannableStringBuilder;
        }
        spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(n), n2, s2.length() + n2, 256);
        return (Spannable)spannableStringBuilder;
    }
    
    @e
    public static final Spannable Q(@e String s, final int n, @e final String... array) {
        k0.p(s, "<this>");
        k0.p(array, "values");
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)s);
        final int length = array.length;
        final int n2 = 0;
        if (length == 0) {
            return (Spannable)spannableStringBuilder;
        }
        for (int length2 = array.length, i = 0, j = n2; i < length2; ++i, ++j) {
            s = array[i];
            final StringBuilder sb = new StringBuilder();
            sb.append('{');
            sb.append(j);
            sb.append('}');
            final int r3 = s.r3((CharSequence)spannableStringBuilder, sb.toString(), 0, true, 2, (Object)null);
            if (r3 >= 0) {
                spannableStringBuilder.replace(r3, r3 + 3, (CharSequence)s);
                spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(n), r3, s.length() + r3, 256);
            }
        }
        return (Spannable)spannableStringBuilder;
    }
    
    @e
    public static final Spannable R(@e final Spannable spannable, @e final List<String> list) {
        k0.p(spannable, "<this>");
        k0.p(list, "texts");
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)spannable);
        if (list.isEmpty()) {
            return (Spannable)spannableStringBuilder;
        }
        for (final String s : list) {
            final int n3 = s.n3((CharSequence)spannable, s, 0, true);
            if (n3 >= 0) {
                spannableStringBuilder.setSpan((Object)new StrikethroughSpan(), n3, s.length() + n3, 256);
            }
        }
        return (Spannable)spannableStringBuilder;
    }
    
    @e
    public static final Spannable S(@e final String s, @e final List<String> list) {
        k0.p(s, "<this>");
        k0.p(list, "texts");
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)s);
        if (list.isEmpty()) {
            return (Spannable)spannableStringBuilder;
        }
        for (final String s2 : list) {
            final int n3 = s.n3((CharSequence)s, s2, 0, true);
            if (n3 >= 0) {
                spannableStringBuilder.setSpan((Object)new StrikethroughSpan(), n3, s2.length() + n3, 256);
            }
        }
        return (Spannable)spannableStringBuilder;
    }
    
    public static final int T(final boolean b, final int n) {
        if (b) {
            return 0;
        }
        return n;
    }
    
    @e
    public static final String V(final int n, @e final Context context) {
        k0.p(context, "context");
        final String string = context.getString(n);
        k0.o(string, "context.getString(this)");
        return string;
    }
    
    @e
    public static final <T> Type W(final T t) {
        final Type type = new TypeToken<T>() {}.getType();
        k0.o(type, "object : TypeToken<T>() {}.type");
        return type;
    }
    
    @i(message = "use updateVisibility", replaceWith = @z0(expression = "updateVisibility", imports = {}))
    public static final void X(@e final AppCompatTextView appCompatTextView) {
        k0.p(appCompatTextView, "<this>");
        q.e(appCompatTextView, null, 0, 3, null);
    }
    
    public static final <T extends Entity> void b(@e final LongSparseArray<T> longSparseArray, @e final List<? extends T> list) {
        k0.p(longSparseArray, "<this>");
        k0.p(list, "items");
        for (final Entity entity : list) {
            longSparseArray.put(entity.entityId(), (Object)entity);
        }
    }
    
    public static final void c(@e final View view, @e final n6.a<j2> a) {
        k0.p(view, "<this>");
        k0.p(a, "action");
        final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    Log.d("untis_log", "ViewTreeObserver.addOneTimeOnGlobalLayoutListener");
                    a.invoke();
                    final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                    }
                }
            });
        }
    }
    
    @e
    public static final Bundle d(@e final l<? super Bundle, j2> l) {
        k0.p(l, "block");
        final Bundle bundle = new Bundle();
        l.invoke(bundle);
        return bundle;
    }
    
    public static final void e(@e final Fragment fragment, @e final l<? super Bundle, j2> l) {
        k0.p(fragment, "<this>");
        k0.p(l, "block");
        final Bundle arguments = new Bundle();
        l.invoke(arguments);
        fragment.setArguments(arguments);
    }
    
    public static final int f(final boolean b) {
        int n;
        if (b) {
            n = 0;
        }
        else {
            n = 8;
        }
        return n;
    }
    
    public static final boolean g(@e final Context context) {
        k0.p(context, "<this>");
        final Object systemService = context.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        final NetworkInfo activeNetworkInfo = ((ConnectivityManager)systemService).getActiveNetworkInfo();
        boolean b = false;
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnectedOrConnecting()) {
                b = true;
            }
        }
        return b;
    }
    
    public static final boolean h(@e final String s) {
        k0.p(s, "<this>");
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (' ' > char1 || char1 > '~') {
                return true;
            }
        }
        return false;
    }
    
    public static final void i(@e final Context context, @e final String s) {
        k0.p(context, "<this>");
        k0.p(s, "message");
        c.o(context, s, d.i(context, 2131230884), 1, true).show();
    }
    
    public static final void j(@e final Context context, @w0 final int n) {
        k0.p(context, "<this>");
        k(context, V(n, context));
    }
    
    public static final void k(@e final Context context, @e final String s) {
        k0.p(context, "<this>");
        k0.p(s, "message");
        c.u(context, s, 1, true).show();
    }
    
    public static final void l(@e final Context context, @e Throwable cause) {
        Throwable t = cause;
        k0.p(context, "<this>");
        k0.p(t, "throwable");
        Log.e("untis_log", "error", t);
        cause = cause.getCause();
        if (cause != null) {
            t = cause;
        }
        while (true) {
            String s = null;
            String string = null;
            Label_0488: {
                int n = 0;
                Label_0443: {
                    Label_0415: {
                        Label_0381: {
                            Label_0364: {
                                Label_0354: {
                                    Label_0337: {
                                        Label_0327: {
                                            String s2 = null;
                                            String string2 = null;
                                            Label_0255: {
                                                if (t instanceof JsonRpcError) {
                                                    switch (h.a.b[((JsonRpcError)t).getType().ordinal()]) {
                                                        default: {
                                                            return;
                                                        }
                                                        case 31: {
                                                            s = context.getString(2131886693);
                                                            k0.o(s, "getString(R.string.shared_error_default_text)");
                                                            string = "unspecified";
                                                            break Label_0488;
                                                        }
                                                        case 30: {
                                                            s2 = context.getString(2131886693);
                                                            k0.o(s2, "getString(R.string.shared_error_default_text)");
                                                            string2 = context.getString(2131886704);
                                                            k0.o(string2, "getString(R.string.shared_error_noData_text)");
                                                            break;
                                                        }
                                                        case 24:
                                                        case 25:
                                                        case 26:
                                                        case 27: {
                                                            n = 2131886665;
                                                            break Label_0443;
                                                        }
                                                        case 23: {
                                                            n = 2131886592;
                                                            break Label_0443;
                                                        }
                                                        case 22: {
                                                            n = 2131886590;
                                                            break Label_0443;
                                                        }
                                                        case 21: {
                                                            n = 2131886591;
                                                            break Label_0443;
                                                        }
                                                        case 20: {
                                                            n = 2131886695;
                                                            break Label_0443;
                                                        }
                                                        case 17: {
                                                            n = 2131886706;
                                                            break Label_0443;
                                                        }
                                                        case 16:
                                                        case 18:
                                                        case 19: {
                                                            j(context, 2131886701);
                                                            return;
                                                        }
                                                        case 14: {
                                                            break Label_0327;
                                                        }
                                                        case 13: {
                                                            break Label_0337;
                                                        }
                                                        case 10: {
                                                            n = 2131886717;
                                                            break Label_0443;
                                                        }
                                                        case 9:
                                                        case 15: {
                                                            break Label_0354;
                                                        }
                                                        case 8: {
                                                            break Label_0364;
                                                        }
                                                        case 7: {
                                                            n = 2131886697;
                                                            break Label_0443;
                                                        }
                                                        case 6:
                                                        case 11:
                                                        case 12: {
                                                            break Label_0381;
                                                        }
                                                        case 5: {
                                                            n = 2131886708;
                                                            break Label_0443;
                                                        }
                                                        case 4: {
                                                            n = 2131886698;
                                                            break Label_0443;
                                                        }
                                                        case 3: {
                                                            j(context, 2131886704);
                                                            return;
                                                        }
                                                        case 2: {
                                                            break Label_0415;
                                                        }
                                                        case 1: {
                                                            n = 2131886134;
                                                            break Label_0443;
                                                        }
                                                    }
                                                }
                                                else {
                                                    if (t instanceof SSLHandshakeException) {
                                                        n = 2131886709;
                                                        break Label_0443;
                                                    }
                                                    if (t instanceof JsonRpcErrorUnspecified) {
                                                        s = context.getString(2131886693);
                                                        k0.o(s, "getString(R.string.shared_error_default_text)");
                                                        string = context.getString(2131886693);
                                                        k0.o(string, "getString(R.string.shared_error_default_text)");
                                                        break Label_0488;
                                                    }
                                                    if (!(t instanceof SSLPeerUnverifiedException)) {
                                                        if (!(t instanceof ConnectException)) {
                                                            if (!(t instanceof UnknownHostException)) {
                                                                if (t instanceof h5.a) {
                                                                    break Label_0354;
                                                                }
                                                                if (t instanceof b) {
                                                                    break Label_0415;
                                                                }
                                                                if (t instanceof h5.c) {
                                                                    break Label_0381;
                                                                }
                                                                if (t instanceof h5.d) {
                                                                    final String string3 = context.getString(2131886693);
                                                                    k0.o(string3, "getString(R.string.shared_error_default_text)");
                                                                    final String string4 = context.getString(2131886704);
                                                                    k0.o(string4, "getString(R.string.shared_error_noData_text)");
                                                                    final String s3 = kotlin.text.s.k2(string3, "{0}", string4, false, 4, (Object)null);
                                                                    break Label_0267;
                                                                }
                                                                if (t instanceof h5.e) {
                                                                    break Label_0327;
                                                                }
                                                                if (!(t instanceof f)) {
                                                                    if (t instanceof h5.g) {
                                                                        break Label_0337;
                                                                    }
                                                                    if (t instanceof h5.h) {
                                                                        break Label_0364;
                                                                    }
                                                                    if (t instanceof TimeoutException) {
                                                                        n = 2131886714;
                                                                        break Label_0443;
                                                                    }
                                                                    if (t instanceof EOFException) {
                                                                        final String s3 = "Invalid API response";
                                                                        break Label_0267;
                                                                    }
                                                                    if (t instanceof j) {
                                                                        final String s3 = y((j)t);
                                                                        break Label_0267;
                                                                    }
                                                                    s2 = context.getString(2131886693);
                                                                    k0.o(s2, "getString(R.string.shared_error_default_text)");
                                                                    string2 = "unspecified";
                                                                    break Label_0255;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    j(context, 2131886703);
                                                    return;
                                                }
                                            }
                                            final String s3 = kotlin.text.s.k2(s2, "{0}", string2, false, 4, (Object)null);
                                            k(context, s3);
                                            return;
                                        }
                                        j(context, 2131886699);
                                        return;
                                    }
                                    j(context, 2131886705);
                                    return;
                                }
                                j(context, 2131886719);
                                return;
                            }
                            j(context, 2131886707);
                            return;
                        }
                        j(context, 2131886694);
                        return;
                    }
                    j(context, 2131886711);
                    return;
                }
                j(context, n);
                return;
            }
            final String s3 = kotlin.text.s.k2(s, "{0}", string, false, 4, (Object)null);
            continue;
        }
    }
    
    public static final void m(@e final Context context, @w0 final int n) {
        k0.p(context, "<this>");
        final String string = context.getString(n);
        k0.o(string, "getString(stringId)");
        n(context, string);
    }
    
    public static final void n(@e final Context context, @e final String s) {
        k0.p(context, "<this>");
        k0.p(s, "message");
        c.A(context, s, 1, true).show();
    }
    
    public static final void o(@e final Context context, @w0 final int n) {
        k0.p(context, "<this>");
        p(context, V(n, context));
    }
    
    public static final void p(@e final Context context, @e final String s) {
        k0.p(context, "<this>");
        k0.p(s, "message");
        c.Q(context, s, 1, true).show();
    }
    
    public static final void q(@e final Context context, @w0 final int n) {
        k0.p(context, "<this>");
        final String string = context.getString(n);
        k0.o(string, "getString(stringId)");
        r(context, string);
    }
    
    public static final void r(@e final Context context, @e final String s) {
        k0.p(context, "<this>");
        k0.p(s, "message");
        c.W(context, s, 1, true).show();
    }
    
    @e
    public static final String s(@e String encode) {
        k0.p(encode, "<this>");
        encode = URLEncoder.encode(encode, "UTF-8");
        k0.o(encode, "encode(this, \"UTF-8\")");
        return encode;
    }
    
    @org.jetbrains.annotations.f
    public static final Drawable t(@e final Context context, @e final EntityType entityType) {
        k0.p(context, "context");
        k0.p(entityType, "entityType");
        final int n = h.a.a[entityType.ordinal()];
        final Drawable drawable = null;
        Drawable drawable2 = null;
        switch (n) {
            default: {
                if ((drawable2 = d.i(context, 2131230884)) == null) {
                    return drawable;
                }
                break;
            }
            case 11: {
                if ((drawable2 = d.i(context, 2131230948)) == null) {
                    return drawable;
                }
                break;
            }
            case 10: {
                if ((drawable2 = d.i(context, 2131230927)) == null) {
                    return drawable;
                }
                break;
            }
            case 9: {
                if ((drawable2 = d.i(context, 2131230927)) == null) {
                    return drawable;
                }
                break;
            }
            case 8: {
                if ((drawable2 = d.i(context, 2131230927)) == null) {
                    return drawable;
                }
                break;
            }
            case 7: {
                if ((drawable2 = d.i(context, 2131230870)) == null) {
                    return drawable;
                }
                break;
            }
            case 6: {
                if ((drawable2 = d.i(context, 2131230898)) == null) {
                    return drawable;
                }
                break;
            }
            case 5: {
                if ((drawable2 = d.i(context, 2131230876)) == null) {
                    return drawable;
                }
                break;
            }
            case 4: {
                if ((drawable2 = d.i(context, 2131230932)) == null) {
                    return drawable;
                }
                break;
            }
            case 3: {
                if ((drawable2 = d.i(context, 2131230951)) == null) {
                    return drawable;
                }
                break;
            }
            case 2: {
                if ((drawable2 = d.i(context, 2131230950)) == null) {
                    return drawable;
                }
                break;
            }
            case 1: {
                if ((drawable2 = d.i(context, 2131230952)) == null) {
                    return drawable;
                }
                break;
            }
        }
        return drawable2.mutate();
    }
    
    @e
    public static final String v(@e final Context context, @e final EntityType entityType) {
        k0.p(context, "context");
        k0.p(entityType, "entityType");
        String s = null;
        String s2 = null;
        switch (h.a.a[entityType.ordinal()]) {
            default: {
                s = context.getString(2131886670);
                s2 = "context.getString(R.string.shared_all_text)";
                break;
            }
            case 12: {
                s = context.getString(2131886759);
                s2 = "context.getString(R.string.shared_period_text)";
                break;
            }
            case 11: {
                s = context.getString(2131886764);
                s2 = "context.getString(R.string.shared_profiles_text)";
                break;
            }
            case 8:
            case 9:
            case 10: {
                s = context.getString(2131886758);
                k0.o(s, "context.getString(R.string.shared_parents_text)");
                return s;
            }
            case 7: {
                s = context.getString(2131886270);
                s2 = "context.getString(R.string.exam_exams_text)";
                break;
            }
            case 6: {
                s = context.getString(2131886306);
                s2 = "context.getString(R.string.homework_title)";
                break;
            }
            case 5: {
                s = context.getString(2131886680);
                s2 = "context.getString(R.string.shared_classes_text)";
                break;
            }
            case 4: {
                s = context.getString(2131886767);
                s2 = "context.getString(R.string.shared_rooms_text)";
                break;
            }
            case 3: {
                s = context.getString(2131886781);
                s2 = "context.getString(R.string.shared_subjects_text)";
                break;
            }
            case 2: {
                s = context.getString(2131886810);
                s2 = "context.getString(R.string.students_title)";
                break;
            }
            case 1: {
                s = context.getString(2131886783);
                s2 = "context.getString(R.string.shared_teachers_text)";
                break;
            }
        }
        k0.o(s, s2);
        return s;
    }
    
    @SuppressLint({ "HardwareIds" })
    @e
    public static final String w(@e final Context context) {
        k0.p(context, "<this>");
        String string;
        try {
            string = Settings$Secure.getString(context.getContentResolver(), "android_id");
            k0.o(string, "{\n        Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID)\n    }");
        }
        catch (Exception ex) {
            string = "n/a";
        }
        return string;
    }
    
    public static final <T> T x(final T t) {
        return t;
    }
    
    @e
    public static final String y(@e final j j) {
        k0.p(j, "exception");
        String s;
        if (j.a() == 500) {
            s = "Sorry, internal server error. Please contact our support";
        }
        else {
            s = "Sorry, unknown server error. Please contact our support";
        }
        return s;
    }
    
    public static final void z(@e final SearchView searchView, @e final l<? super String, j2> l) {
        k0.p(searchView, "<this>");
        k0.p(l, "onTextChange");
        searchView.setOnQueryTextListener((SearchView$OnQueryTextListener)new SearchView$OnQueryTextListener() {
            public boolean onQueryTextChange(@org.jetbrains.annotations.f final String s) {
                final l<String, j2> a = (l<String, j2>)l;
                String s2 = s;
                if (s == null) {
                    s2 = "";
                }
                a.invoke(s2);
                return true;
            }
            
            public boolean onQueryTextSubmit(@org.jetbrains.annotations.f final String s) {
                return true;
            }
        });
    }
}
