// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import java.util.List;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.View;
import android.net.Uri$Builder;
import androidx.core.content.d;
import java.io.InputStream;
import java.io.IOException;
import android.content.res.Resources$NotFoundException;
import java.io.FileNotFoundException;
import android.net.Uri;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import android.text.style.TextAppearanceSpan;
import android.text.SpannableString;
import c.a;
import android.util.TypedValue;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.ImageView;
import android.util.Log;
import android.graphics.drawable.Drawable;
import android.database.Cursor;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable$ConstantState;
import java.util.WeakHashMap;
import android.content.Context;
import android.app.SearchableInfo;
import android.view.View$OnClickListener;
import androidx.cursoradapter.widget.c;

class o0 extends c implements View$OnClickListener
{
    private static final boolean i0 = false;
    private static final String j0 = "SuggestionsAdapter";
    private static final int k0 = 50;
    static final int l0 = 0;
    static final int m0 = 1;
    static final int n0 = 2;
    static final int o0 = -1;
    private final SearchView U;
    private final SearchableInfo V;
    private final Context W;
    private final WeakHashMap<String, Drawable$ConstantState> X;
    private final int Y;
    private boolean Z;
    private int a0;
    private ColorStateList b0;
    private int c0;
    private int d0;
    private int e0;
    private int f0;
    private int g0;
    private int h0;
    
    public o0(final Context w, final SearchView u, final SearchableInfo v, final WeakHashMap<String, Drawable$ConstantState> x) {
        super(w, u.getSuggestionRowLayout(), null, true);
        this.Z = false;
        this.a0 = 1;
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.U = u;
        this.V = v;
        this.Y = u.getSuggestionCommitIconResId();
        this.W = w;
        this.X = x;
    }
    
    private Drawable A(final Cursor cursor) {
        final int g0 = this.g0;
        if (g0 == -1) {
            return null;
        }
        return this.y(cursor.getString(g0));
    }
    
    private static String D(final Cursor cursor, final int n) {
        if (n == -1) {
            return null;
        }
        try {
            return cursor.getString(n);
        }
        catch (Exception ex) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", (Throwable)ex);
            return null;
        }
    }
    
    private void F(final ImageView imageView, final Drawable imageDrawable, final int visibility) {
        imageView.setImageDrawable(imageDrawable);
        if (imageDrawable == null) {
            imageView.setVisibility(visibility);
        }
        else {
            imageView.setVisibility(0);
            imageDrawable.setVisible(false, false);
            imageDrawable.setVisible(true, false);
        }
    }
    
    private void G(final TextView textView, final CharSequence text) {
        textView.setText(text);
        int visibility;
        if (TextUtils.isEmpty(text)) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        textView.setVisibility(visibility);
    }
    
    private void H(final String key, final Drawable drawable) {
        if (drawable != null) {
            this.X.put(key, drawable.getConstantState());
        }
    }
    
    private void I(final Cursor cursor) {
        Bundle extras;
        if (cursor != null) {
            extras = cursor.getExtras();
        }
        else {
            extras = null;
        }
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }
    
    private Drawable p(final String key) {
        final Drawable$ConstantState drawable$ConstantState = this.X.get(key);
        if (drawable$ConstantState == null) {
            return null;
        }
        return drawable$ConstantState.newDrawable();
    }
    
    private CharSequence r(final CharSequence charSequence) {
        if (this.b0 == null) {
            final TypedValue typedValue = new TypedValue();
            this.W.getTheme().resolveAttribute(c.a.c.E3, typedValue, true);
            this.b0 = this.W.getResources().getColorStateList(typedValue.resourceId);
        }
        final SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan((Object)new TextAppearanceSpan((String)null, 0, 0, this.b0, (ColorStateList)null), 0, charSequence.length(), 33);
        return (CharSequence)spannableString;
    }
    
    private Drawable s(final ComponentName componentName) {
        final PackageManager packageManager = this.W.getPackageManager();
        while (true) {
            try {
                final ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
                final int iconResource = activityInfo.getIconResource();
                if (iconResource == 0) {
                    return null;
                }
                final Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
                if (drawable == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid icon resource ");
                    sb.append(iconResource);
                    sb.append(" for ");
                    sb.append(componentName.flattenToShortString());
                    final String s = sb.toString();
                    Log.w("SuggestionsAdapter", s);
                    return null;
                }
                return drawable;
            }
            catch (PackageManager$NameNotFoundException ex) {
                final String s = ex.toString();
                continue;
            }
            break;
        }
    }
    
    private Drawable t(final ComponentName componentName) {
        final String flattenToShortString = componentName.flattenToShortString();
        final boolean containsKey = this.X.containsKey(flattenToShortString);
        final Drawable$ConstantState drawable$ConstantState = null;
        final Drawable drawable = null;
        if (containsKey) {
            final Drawable$ConstantState drawable$ConstantState2 = this.X.get(flattenToShortString);
            Drawable drawable2;
            if (drawable$ConstantState2 == null) {
                drawable2 = drawable;
            }
            else {
                drawable2 = drawable$ConstantState2.newDrawable(this.W.getResources());
            }
            return drawable2;
        }
        final Drawable s = this.s(componentName);
        Drawable$ConstantState constantState;
        if (s == null) {
            constantState = drawable$ConstantState;
        }
        else {
            constantState = s.getConstantState();
        }
        this.X.put(flattenToShortString, constantState);
        return s;
    }
    
    public static String u(final Cursor cursor, final String s) {
        return D(cursor, cursor.getColumnIndex(s));
    }
    
    private Drawable v() {
        final Drawable t = this.t(this.V.getSearchActivity());
        if (t != null) {
            return t;
        }
        return this.W.getPackageManager().getDefaultActivityIcon();
    }
    
    private Drawable w(final Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return this.x(uri);
                }
                catch (Resources$NotFoundException ex3) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Resource does not exist: ");
                    sb.append(uri);
                    throw new FileNotFoundException(sb.toString());
                }
            }
            final InputStream openInputStream = this.W.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                try {
                    return Drawable.createFromStream(openInputStream, (String)null);
                }
                finally {
                    try {
                        openInputStream.close();
                    }
                    catch (IOException ex) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Error closing icon stream for ");
                        sb2.append(uri);
                        Log.e("SuggestionsAdapter", sb2.toString(), (Throwable)ex);
                    }
                }
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Failed to open ");
            sb3.append(uri);
            throw new FileNotFoundException(sb3.toString());
        }
        catch (FileNotFoundException ex2) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Icon not found: ");
            sb4.append(uri);
            sb4.append(", ");
            sb4.append(ex2.getMessage());
            Log.w("SuggestionsAdapter", sb4.toString());
            return null;
        }
    }
    
    private Drawable y(final String str) {
        Drawable w;
        final Drawable drawable = w = null;
        if (str != null) {
            w = drawable;
            if (!str.isEmpty()) {
                if ("0".equals(str)) {
                    w = drawable;
                }
                else {
                    try {
                        final int int1 = Integer.parseInt(str);
                        final StringBuilder sb = new StringBuilder();
                        sb.append("android.resource://");
                        sb.append(this.W.getPackageName());
                        sb.append("/");
                        sb.append(int1);
                        final String string = sb.toString();
                        final Drawable p = this.p(string);
                        if (p != null) {
                            return p;
                        }
                        final Drawable i = d.i(this.W, int1);
                        this.H(string, i);
                        return i;
                    }
                    catch (Resources$NotFoundException ex) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Icon resource not found: ");
                        sb2.append(str);
                        Log.w("SuggestionsAdapter", sb2.toString());
                        return null;
                    }
                    catch (NumberFormatException ex2) {
                        final Drawable p2 = this.p(str);
                        if (p2 != null) {
                            return p2;
                        }
                        w = this.w(Uri.parse(str));
                        this.H(str, w);
                    }
                }
            }
        }
        return w;
    }
    
    private Drawable z(final Cursor cursor) {
        final int f0 = this.f0;
        if (f0 == -1) {
            return null;
        }
        final Drawable y = this.y(cursor.getString(f0));
        if (y != null) {
            return y;
        }
        return this.v();
    }
    
    public int B() {
        return this.a0;
    }
    
    Cursor C(final SearchableInfo searchableInfo, final String s, final int i) {
        final String[] array = null;
        if (searchableInfo == null) {
            return null;
        }
        final String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            return null;
        }
        final Uri$Builder fragment = new Uri$Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        final String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        final String suggestSelection = searchableInfo.getSuggestSelection();
        String[] array2;
        if (suggestSelection != null) {
            array2 = new String[] { s };
        }
        else {
            fragment.appendPath(s);
            array2 = array;
        }
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.W.getContentResolver().query(fragment.build(), (String[])null, suggestSelection, array2, (String)null);
    }
    
    public void E(final int a0) {
        this.a0 = a0;
    }
    
    public CharSequence a(final Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        final String u = u(cursor, "suggest_intent_query");
        if (u != null) {
            return u;
        }
        if (this.V.shouldRewriteQueryFromData()) {
            final String u2 = u(cursor, "suggest_intent_data");
            if (u2 != null) {
                return u2;
            }
        }
        if (this.V.shouldRewriteQueryFromText()) {
            final String u3 = u(cursor, "suggest_text_1");
            if (u3 != null) {
                return u3;
            }
        }
        return null;
    }
    
    public void b(final Cursor cursor) {
        if (this.Z) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        try {
            super.b(cursor);
            if (cursor != null) {
                this.c0 = cursor.getColumnIndex("suggest_text_1");
                this.d0 = cursor.getColumnIndex("suggest_text_2");
                this.e0 = cursor.getColumnIndex("suggest_text_2_url");
                this.f0 = cursor.getColumnIndex("suggest_icon_1");
                this.g0 = cursor.getColumnIndex("suggest_icon_2");
                this.h0 = cursor.getColumnIndex("suggest_flags");
            }
        }
        catch (Exception ex) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", (Throwable)ex);
        }
    }
    
    public Cursor d(final CharSequence charSequence) {
        String string;
        if (charSequence == null) {
            string = "";
        }
        else {
            string = charSequence.toString();
        }
        if (this.U.getVisibility() == 0) {
            if (this.U.getWindowVisibility() == 0) {
                try {
                    final Cursor c = this.C(this.V, string, 50);
                    if (c != null) {
                        c.getCount();
                        return c;
                    }
                }
                catch (RuntimeException ex) {
                    Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", (Throwable)ex);
                }
            }
        }
        return null;
    }
    
    public void e(final View view, final Context context, final Cursor cursor) {
        final a a = (a)view.getTag();
        final int h0 = this.h0;
        int int1;
        if (h0 != -1) {
            int1 = cursor.getInt(h0);
        }
        else {
            int1 = 0;
        }
        if (a.a != null) {
            this.G(a.a, D(cursor, this.c0));
        }
        if (a.b != null) {
            final String d = D(cursor, this.e0);
            CharSequence charSequence;
            if (d != null) {
                charSequence = this.r(d);
            }
            else {
                charSequence = D(cursor, this.d0);
            }
            if (TextUtils.isEmpty(charSequence)) {
                final TextView a2 = a.a;
                if (a2 != null) {
                    a2.setSingleLine(false);
                    a.a.setMaxLines(2);
                }
            }
            else {
                final TextView a3 = a.a;
                if (a3 != null) {
                    a3.setSingleLine(true);
                    a.a.setMaxLines(1);
                }
            }
            this.G(a.b, charSequence);
        }
        final ImageView c = a.c;
        if (c != null) {
            this.F(c, this.z(cursor), 4);
        }
        final ImageView d2 = a.d;
        if (d2 != null) {
            this.F(d2, this.A(cursor), 8);
        }
        final int a4 = this.a0;
        if (a4 != 2 && (a4 != 1 || (int1 & 0x1) == 0x0)) {
            a.e.setVisibility(8);
        }
        else {
            a.e.setVisibility(0);
            a.e.setTag((Object)a.a.getText());
            a.e.setOnClickListener((View$OnClickListener)this);
        }
    }
    
    public View getDropDownView(final int n, View dropDownView, final ViewGroup viewGroup) {
        try {
            dropDownView = super.getDropDownView(n, dropDownView, viewGroup);
            return dropDownView;
        }
        catch (RuntimeException ex) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", (Throwable)ex);
            final View i = this.i(this.W, this.c(), viewGroup);
            if (i != null) {
                ((a)i.getTag()).a.setText((CharSequence)ex.toString());
            }
            return i;
        }
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        try {
            view = super.getView(n, view, viewGroup);
            return view;
        }
        catch (RuntimeException ex) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", (Throwable)ex);
            final View j = this.j(this.W, this.c(), viewGroup);
            if (j != null) {
                ((a)j.getTag()).a.setText((CharSequence)ex.toString());
            }
            return j;
        }
    }
    
    public boolean hasStableIds() {
        return false;
    }
    
    @Override
    public View j(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final View j = super.j(context, cursor, viewGroup);
        j.setTag((Object)new a(j));
        ((ImageView)j.findViewById(c.a.h.p0)).setImageResource(this.Y);
        return j;
    }
    
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.I(this.c());
    }
    
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        this.I(this.c());
    }
    
    public void onClick(final View view) {
        final Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.U.b0((CharSequence)tag);
        }
    }
    
    public void q() {
        this.b(null);
        this.Z = true;
    }
    
    Drawable x(final Uri uri) throws FileNotFoundException {
        final String authority = uri.getAuthority();
        if (!TextUtils.isEmpty((CharSequence)authority)) {
            try {
                final Resources resourcesForApplication = this.W.getPackageManager().getResourcesForApplication(authority);
                final List pathSegments = uri.getPathSegments();
                if (pathSegments == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("No path: ");
                    sb.append(uri);
                    throw new FileNotFoundException(sb.toString());
                }
                final int size = pathSegments.size();
                int n = 0;
                Label_0139: {
                    if (size == 1) {
                        try {
                            n = Integer.parseInt(pathSegments.get(0));
                            break Label_0139;
                        }
                        catch (NumberFormatException ex) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Single path segment is not a resource ID: ");
                            sb2.append(uri);
                            throw new FileNotFoundException(sb2.toString());
                        }
                    }
                    if (size != 2) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("More than two path segments: ");
                        sb3.append(uri);
                        throw new FileNotFoundException(sb3.toString());
                    }
                    n = resourcesForApplication.getIdentifier((String)pathSegments.get(1), (String)pathSegments.get(0), authority);
                }
                if (n != 0) {
                    return resourcesForApplication.getDrawable(n);
                }
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("No resource found for: ");
                sb4.append(uri);
                throw new FileNotFoundException(sb4.toString());
            }
            catch (PackageManager$NameNotFoundException ex2) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append("No package found for authority: ");
                sb5.append(uri);
                throw new FileNotFoundException(sb5.toString());
            }
        }
        final StringBuilder sb6 = new StringBuilder();
        sb6.append("No authority: ");
        sb6.append(uri);
        throw new FileNotFoundException(sb6.toString());
    }
    
    private static final class a
    {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;
        
        public a(final View view) {
            this.a = (TextView)view.findViewById(16908308);
            this.b = (TextView)view.findViewById(16908309);
            this.c = (ImageView)view.findViewById(16908295);
            this.d = (ImageView)view.findViewById(16908296);
            this.e = (ImageView)view.findViewById(c.a.h.p0);
        }
    }
}
