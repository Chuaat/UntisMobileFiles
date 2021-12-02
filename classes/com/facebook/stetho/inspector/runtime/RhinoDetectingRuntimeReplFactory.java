// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.runtime;

import com.facebook.stetho.inspector.console.RuntimeRepl;
import androidx.annotation.k0;
import com.facebook.stetho.common.LogUtil;
import java.lang.reflect.InvocationTargetException;
import android.content.Context;
import com.facebook.stetho.inspector.console.RuntimeReplFactory;

public class RhinoDetectingRuntimeReplFactory implements RuntimeReplFactory
{
    private final Context mContext;
    private RuntimeException mRhinoJsUnexpectedError;
    private RuntimeReplFactory mRhinoReplFactory;
    private boolean mSearchedForRhinoJs;
    
    public RhinoDetectingRuntimeReplFactory(final Context mContext) {
        this.mContext = mContext;
    }
    
    @k0
    private static RuntimeReplFactory findRhinoReplFactory(final Context context) throws RuntimeException {
        try {
            return (RuntimeReplFactory)Class.forName("com.facebook.stetho.rhino.JsRuntimeReplFactoryBuilder").getDeclaredMethod("defaultFactory", Context.class).invoke(null, context);
        }
        catch (IllegalAccessException cause) {
            throw new RuntimeException(cause);
        }
        catch (InvocationTargetException cause2) {
            throw new RuntimeException(cause2);
        }
        catch (NoSuchMethodException cause3) {
            throw new RuntimeException(cause3);
        }
        catch (ClassNotFoundException ex) {
            LogUtil.i("Error finding stetho-js-rhino, cannot enable console evaluation!");
            return null;
        }
    }
    
    @Override
    public RuntimeRepl newInstance() {
        if (!this.mSearchedForRhinoJs) {
            this.mSearchedForRhinoJs = true;
            try {
                this.mRhinoReplFactory = findRhinoReplFactory(this.mContext);
            }
            catch (RuntimeException mRhinoJsUnexpectedError) {
                this.mRhinoJsUnexpectedError = mRhinoJsUnexpectedError;
            }
        }
        final RuntimeReplFactory mRhinoReplFactory = this.mRhinoReplFactory;
        if (mRhinoReplFactory != null) {
            return mRhinoReplFactory.newInstance();
        }
        return new RuntimeRepl() {
            @Override
            public Object evaluate(final String s) throws Exception {
                if (RhinoDetectingRuntimeReplFactory.this.mRhinoJsUnexpectedError != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("stetho-js-rhino threw: ");
                    sb.append(RhinoDetectingRuntimeReplFactory.this.mRhinoJsUnexpectedError.toString());
                    return sb.toString();
                }
                return "Not supported without stetho-js-rhino dependency";
            }
        };
    }
}
