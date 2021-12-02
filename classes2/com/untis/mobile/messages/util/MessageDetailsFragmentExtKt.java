// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.util;

import android.webkit.MimeTypeMap;
import kotlin.text.s;
import android.content.ContentResolver;
import android.content.ContentValues;
import org.jetbrains.annotations.f;
import android.database.Cursor;
import java.io.File;
import android.provider.MediaStore$Downloads;
import android.os.Environment;
import android.os.Build$VERSION;
import kotlin.jvm.internal.k0;
import android.net.Uri;
import org.jetbrains.annotations.e;
import com.untis.mobile.ui.fragments.common.UmFragment;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0007" }, d2 = { "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "", "fileName", "Landroid/net/Uri;", "createDownloadFile", "checkFileExists", "getFileMediaType", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class MessageDetailsFragmentExtKt
{
    @f
    public static final Uri checkFileExists(@e final UmFragment umFragment, @e String string) {
        k0.p(umFragment, "<this>");
        k0.p(string, "fileName");
        final int sdk_INT = Build$VERSION.SDK_INT;
        final Uri uri = null;
        final Uri uri2 = null;
        Uri uri3;
        if (sdk_INT >= 29) {
            final String c = k0.C(Environment.DIRECTORY_DOWNLOADS, "/Untis");
            final StringBuilder sb = new StringBuilder();
            sb.append('%');
            sb.append(c);
            sb.append('%');
            final String string2 = sb.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append('%');
            sb2.append(string);
            sb2.append('%');
            string = sb2.toString();
            final Cursor query = umFragment.requireContext().getContentResolver().query(MediaStore$Downloads.EXTERNAL_CONTENT_URI, new String[] { "_display_name", "relative_path", "_id" }, "relative_path like ? and _display_name like ?", new String[] { string2, string }, (String)null);
            k0.m(query);
            uri3 = uri2;
            if (query.getCount() > 0) {
                query.moveToFirst();
                final String string3 = query.getString(query.getColumnIndex("_id"));
                k0.o(string3, "cursor.getString(cursor\n                    .getColumnIndex(MediaStore.MediaColumns._ID))");
                uri3 = Uri.withAppendedPath(MediaStore$Downloads.EXTERNAL_CONTENT_URI, string3);
            }
            query.close();
        }
        else {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString());
            sb3.append((Object)File.separator);
            sb3.append("Untis");
            final File file = new File(new File(sb3.toString()), string);
            uri3 = uri;
            if (file.exists()) {
                uri3 = Uri.fromFile(file);
                k0.o(uri3, "fromFile(this)");
            }
        }
        return uri3;
    }
    
    @f
    public static final Uri createDownloadFile(@e final UmFragment umFragment, @e final String child) {
        k0.p(umFragment, "<this>");
        k0.p(child, "fileName");
        Uri uri;
        if (Build$VERSION.SDK_INT >= 29) {
            final ContentResolver contentResolver = umFragment.requireContext().getContentResolver();
            k0.o(contentResolver, "requireContext().contentResolver");
            final ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", child);
            contentValues.put("mime_type", getFileMediaType(child));
            final StringBuilder sb = new StringBuilder();
            sb.append(Environment.DIRECTORY_DOWNLOADS);
            sb.append((Object)File.separator);
            sb.append("Untis");
            contentValues.put("relative_path", sb.toString());
            uri = contentResolver.insert(MediaStore$Downloads.EXTERNAL_CONTENT_URI, contentValues);
        }
        else {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString());
            sb2.append((Object)File.separator);
            sb2.append("Untis");
            final File parent = new File(sb2.toString());
            if (!parent.exists()) {
                parent.mkdir();
            }
            uri = Uri.fromFile(new File(parent, child));
            k0.o(uri, "fromFile(this)");
        }
        return uri;
    }
    
    @f
    public static final String getFileMediaType(@e String substring) {
        k0.p(substring, "fileName");
        substring = substring.substring(s.F3((CharSequence)substring, ".", 0, false, 6, (Object)null) + 1);
        k0.o(substring, "(this as java.lang.String).substring(startIndex)");
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(substring);
    }
}
