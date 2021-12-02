// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.provider;

import android.database.Cursor;
import android.net.Uri;
import android.content.ContentUris;
import android.os.Build$VERSION;
import android.net.Uri$Builder;
import androidx.annotation.b1;
import java.util.Collection;
import java.util.Collections;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.ProviderInfo;
import androidx.annotation.k0;
import android.os.CancellationSignal;
import androidx.annotation.j0;
import android.content.Context;
import android.content.res.Resources;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import android.content.pm.Signature;
import java.util.Comparator;

class c
{
    private static final Comparator<byte[]> a;
    
    static {
        a = new Comparator<byte[]>() {
            public int a(final byte[] array, final byte[] array2) {
                if (array.length == array2.length) {
                    for (int i = 0; i < array.length; ++i) {
                        if (array[i] != array2[i]) {
                            final byte b = array[i];
                            final int length = array2[i];
                            final int length2 = b;
                            return length2 - length;
                        }
                    }
                    return 0;
                }
                final int length2 = array.length;
                final int length = array2.length;
                return length2 - length;
            }
        };
    }
    
    private c() {
    }
    
    private static List<byte[]> a(final Signature[] array) {
        final ArrayList<byte[]> list = new ArrayList<byte[]>();
        for (int i = 0; i < array.length; ++i) {
            list.add(array[i].toByteArray());
        }
        return list;
    }
    
    private static boolean b(final List<byte[]> list, final List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); ++i) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    private static List<List<byte[]>> c(final d d, final Resources resources) {
        if (d.b() != null) {
            return d.b();
        }
        return androidx.core.content.res.d.c(resources, d.c());
    }
    
    @j0
    static f.b d(@j0 final Context context, @j0 final d d, @k0 final CancellationSignal cancellationSignal) throws PackageManager$NameNotFoundException {
        final ProviderInfo e = e(context.getPackageManager(), d, context.getResources());
        if (e == null) {
            return f.b.a(1, null);
        }
        return f.b.a(0, f(context, d, e.authority, cancellationSignal));
    }
    
    @b1
    @k0
    static ProviderInfo e(@j0 final PackageManager packageManager, @j0 final d d, @k0 final Resources resources) throws PackageManager$NameNotFoundException {
        final String f = d.f();
        int i = 0;
        final ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(f, 0);
        if (resolveContentProvider == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("No package found for authority: ");
            sb.append(f);
            throw new PackageManager$NameNotFoundException(sb.toString());
        }
        if (resolveContentProvider.packageName.equals(d.g())) {
            final List<byte[]> a = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort((List<Object>)a, (Comparator<? super Object>)c.a);
            for (List<List<byte[]>> c = c(d, resources); i < c.size(); ++i) {
                final ArrayList list = new ArrayList<byte[]>((Collection<? extends T>)c.get(i));
                Collections.sort((List<E>)list, (Comparator<? super E>)c.a);
                if (b(a, (List<byte[]>)list)) {
                    return resolveContentProvider;
                }
            }
            return null;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Found content provider ");
        sb2.append(f);
        sb2.append(", but package was not ");
        sb2.append(d.g());
        throw new PackageManager$NameNotFoundException(sb2.toString());
    }
    
    @b1
    @j0
    static f.c[] f(final Context context, final d d, String s, final CancellationSignal cancellationSignal) {
        final ArrayList<f.c> list = new ArrayList<f.c>();
        final Uri build = new Uri$Builder().scheme("content").authority(s).build();
        final Uri build2 = new Uri$Builder().scheme("content").authority(s).appendPath("file").build();
        final String s2 = s = null;
        try {
            final String[] array = { "_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code" };
            s = s2;
            Object o;
            if (Build$VERSION.SDK_INT > 16) {
                s = s2;
                o = context.getContentResolver().query(build, array, "query = ?", new String[] { d.h() }, (String)null, cancellationSignal);
            }
            else {
                s = s2;
                o = context.getContentResolver().query(build, array, "query = ?", new String[] { d.h() }, (String)null);
            }
            ArrayList<f.c> list2 = list;
            if (o != null) {
                list2 = list;
                s = (String)o;
                if (((Cursor)o).getCount() > 0) {
                    s = (String)o;
                    final int columnIndex = ((Cursor)o).getColumnIndex("result_code");
                    s = (String)o;
                    s = (String)o;
                    final ArrayList<f.c> list3 = new ArrayList<f.c>();
                    s = (String)o;
                    final int columnIndex2 = ((Cursor)o).getColumnIndex("_id");
                    s = (String)o;
                    final int columnIndex3 = ((Cursor)o).getColumnIndex("file_id");
                    s = (String)o;
                    final int columnIndex4 = ((Cursor)o).getColumnIndex("font_ttc_index");
                    s = (String)o;
                    final int columnIndex5 = ((Cursor)o).getColumnIndex("font_weight");
                    s = (String)o;
                    final int columnIndex6 = ((Cursor)o).getColumnIndex("font_italic");
                    while (true) {
                        s = (String)o;
                        if (!((Cursor)o).moveToNext()) {
                            break;
                        }
                        int int1;
                        if (columnIndex != -1) {
                            s = (String)o;
                            int1 = ((Cursor)o).getInt(columnIndex);
                        }
                        else {
                            int1 = 0;
                        }
                        int int2;
                        if (columnIndex4 != -1) {
                            s = (String)o;
                            int2 = ((Cursor)o).getInt(columnIndex4);
                        }
                        else {
                            int2 = 0;
                        }
                        Uri uri;
                        if (columnIndex3 == -1) {
                            s = (String)o;
                            uri = ContentUris.withAppendedId(build, ((Cursor)o).getLong(columnIndex2));
                        }
                        else {
                            s = (String)o;
                            uri = ContentUris.withAppendedId(build2, ((Cursor)o).getLong(columnIndex3));
                        }
                        int int3;
                        if (columnIndex5 != -1) {
                            s = (String)o;
                            int3 = ((Cursor)o).getInt(columnIndex5);
                        }
                        else {
                            int3 = 400;
                        }
                        boolean b = false;
                        Label_0445: {
                            if (columnIndex6 != -1) {
                                s = (String)o;
                                if (((Cursor)o).getInt(columnIndex6) == 1) {
                                    b = true;
                                    break Label_0445;
                                }
                            }
                            b = false;
                        }
                        s = (String)o;
                        list3.add(f.c.a(uri, int2, int3, b, int1));
                    }
                    list2 = list3;
                }
            }
            if (o != null) {
                ((Cursor)o).close();
            }
            return list2.toArray(new f.c[0]);
        }
        finally {
            if (s != null) {
                ((Cursor)s).close();
            }
        }
    }
}
