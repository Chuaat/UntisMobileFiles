// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.util.Iterator;
import java.util.Collection;

final class o1
{
    private o1() {
    }
    
    public static String a(final String str, final Collection<?> collection) {
        final StringBuilder sb = new StringBuilder();
        final Iterator<?> iterator = collection.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (!iterator.hasNext()) {
                break;
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
