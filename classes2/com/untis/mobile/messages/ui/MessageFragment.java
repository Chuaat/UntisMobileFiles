// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui;

import androidx.fragment.app.d;
import com.untis.mobile.ui.core.CoreActivity;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b" }, d2 = { "Lcom/untis/mobile/messages/ui/MessageFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "", "bottomNavigationBarVisibility", "Lkotlin/j2;", "onResume", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public abstract class MessageFragment extends UmFragment
{
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    protected boolean bottomNavigationBarVisibility() {
        return false;
    }
    
    @Override
    public void onResume() {
        super.onResume();
        final d activity = this.getActivity();
        CoreActivity coreActivity;
        if (activity instanceof CoreActivity) {
            coreActivity = (CoreActivity)activity;
        }
        else {
            coreActivity = null;
        }
        if (coreActivity == null) {
            return;
        }
        coreActivity.x(this.bottomNavigationBarVisibility());
    }
}
