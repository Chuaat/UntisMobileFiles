// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.data;

import java.io.IOException;
import androidx.annotation.j0;
import java.io.FileNotFoundException;
import android.provider.ContactsContract$Contacts;
import android.net.Uri;
import android.content.ContentResolver;
import android.content.UriMatcher;
import java.io.InputStream;

public class o extends l<InputStream>
{
    private static final int K = 1;
    private static final int L = 2;
    private static final int M = 3;
    private static final int N = 4;
    private static final int O = 5;
    private static final UriMatcher P;
    
    static {
        final UriMatcher p = new UriMatcher(-1);
        (P = p).addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        p.addURI("com.android.contacts", "contacts/lookup/*", 1);
        p.addURI("com.android.contacts", "contacts/#/photo", 2);
        p.addURI("com.android.contacts", "contacts/#", 3);
        p.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        p.addURI("com.android.contacts", "phone_lookup/*", 5);
    }
    
    public o(final ContentResolver contentResolver, final Uri uri) {
        super(contentResolver, uri);
    }
    
    private InputStream i(Uri lookupContact, final ContentResolver contentResolver) throws FileNotFoundException {
        final int match = o.P.match(lookupContact);
        if (match != 1) {
            if (match == 3) {
                return this.j(contentResolver, lookupContact);
            }
            if (match != 5) {
                return contentResolver.openInputStream(lookupContact);
            }
        }
        lookupContact = ContactsContract$Contacts.lookupContact(contentResolver, lookupContact);
        if (lookupContact != null) {
            return this.j(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }
    
    private InputStream j(final ContentResolver contentResolver, final Uri uri) {
        return ContactsContract$Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
    
    @j0
    @Override
    public Class<InputStream> a() {
        return InputStream.class;
    }
    
    protected void g(final InputStream inputStream) throws IOException {
        inputStream.close();
    }
    
    protected InputStream h(final Uri obj, final ContentResolver contentResolver) throws FileNotFoundException {
        final InputStream i = this.i(obj, contentResolver);
        if (i != null) {
            return i;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("InputStream is null for ");
        sb.append(obj);
        throw new FileNotFoundException(sb.toString());
    }
}
