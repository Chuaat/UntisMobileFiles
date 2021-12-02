// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.messenger;

import com.untis.mobile.persistence.models.messenger.MessengerChannel;
import com.untis.mobile.persistence.models.messenger.MessengerCredential;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.messenger.MessengerChannelData;
import rx.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH&J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\tH&¨\u0006\u000f" }, d2 = { "Lcom/untis/mobile/services/messenger/a;", "", "Lrx/g;", "Lcom/untis/mobile/persistence/models/messenger/MessengerCredential;", "b", "", "lessonId", "Lcom/untis/mobile/persistence/models/messenger/MessengerChannelData;", "a", "", "channelName", "Lcom/untis/mobile/persistence/models/messenger/MessengerChannel;", "c", "channelId", "d", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface a
{
    @e
    g<MessengerChannelData> a(final long p0);
    
    @e
    g<MessengerCredential> b();
    
    @e
    g<MessengerChannel> c(final long p0, @e final String p1);
    
    @e
    g<MessengerChannel> d(final long p0, @e final String p1);
}
