// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.jsonadapter;

import org.joda.time.base.a;
import com.squareup.moshi.z;
import org.joda.time.c;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\n" }, d2 = { "Lcom/untis/mobile/utils/jsonadapter/MoshiJodaTimeAdapter;", "", "Lorg/joda/time/c;", "dateTime", "", "dateTimeToJson", "json", "dateTimeFromJson", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MoshiJodaTimeAdapter
{
    @com.squareup.moshi.f
    @f
    public final c dateTimeFromJson(@f final String s) {
        final c c = null;
        if (s == null) {
            return null;
        }
        try {
            return org.joda.time.c.K0(s);
        }
        catch (Exception ex) {
            return c;
        }
    }
    
    @z
    @f
    public final String dateTimeToJson(@f final c c) {
        String string;
        if (c == null) {
            string = null;
        }
        else {
            string = ((a)c).toString();
        }
        return string;
    }
}
