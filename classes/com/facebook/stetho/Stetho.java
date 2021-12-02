// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho;

import java.util.HashSet;
import java.util.Set;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.DevtoolsSocketHandler;
import com.facebook.stetho.dumpapp.DumpappHttpSocketLikeHandler;
import com.facebook.stetho.server.SocketLikeHandler;
import com.facebook.stetho.dumpapp.DumpappSocketLikeHandler;
import com.facebook.stetho.dumpapp.Dumper;
import com.facebook.stetho.server.ProtocolDetectingSocketHandler;
import com.facebook.stetho.server.ServerManager;
import com.facebook.stetho.server.SocketHandler;
import com.facebook.stetho.server.LocalSocketServer;
import com.facebook.stetho.server.SocketHandlerFactory;
import com.facebook.stetho.server.LazySocketHandler;
import com.facebook.stetho.server.AddressNameHelper;
import java.util.ArrayList;
import com.facebook.stetho.inspector.database.DatabaseDriver2Adapter;
import java.util.Iterator;
import com.facebook.stetho.inspector.database.DatabaseConnectionProvider;
import com.facebook.stetho.inspector.database.DefaultDatabaseConnectionProvider;
import com.facebook.stetho.inspector.database.DefaultDatabaseFilesProvider;
import com.facebook.stetho.inspector.database.SqliteDatabaseDriver;
import com.facebook.stetho.inspector.protocol.module.Database;
import com.facebook.stetho.inspector.protocol.module.Worker;
import com.facebook.stetho.inspector.protocol.module.Runtime;
import com.facebook.stetho.inspector.runtime.RhinoDetectingRuntimeReplFactory;
import com.facebook.stetho.inspector.protocol.module.Profiler;
import com.facebook.stetho.inspector.protocol.module.Page;
import com.facebook.stetho.inspector.protocol.module.Network;
import com.facebook.stetho.inspector.protocol.module.Inspector;
import com.facebook.stetho.inspector.protocol.module.HeapProfiler;
import com.facebook.stetho.inspector.protocol.module.DOMStorage;
import com.facebook.stetho.inspector.protocol.module.CSS;
import com.facebook.stetho.inspector.protocol.module.DOM;
import com.facebook.stetho.inspector.elements.Document;
import com.facebook.stetho.inspector.protocol.module.Debugger;
import com.facebook.stetho.inspector.protocol.module.Console;
import com.facebook.stetho.inspector.elements.android.AndroidDocumentProviderFactory;
import java.util.Collections;
import android.os.Build$VERSION;
import com.facebook.stetho.inspector.console.RuntimeReplFactory;
import com.facebook.stetho.inspector.elements.DocumentProviderFactory;
import com.facebook.stetho.inspector.database.DatabaseFilesProvider;
import com.facebook.stetho.inspector.protocol.module.DatabaseDriver2;
import java.util.List;
import com.facebook.stetho.dumpapp.plugins.FilesDumperPlugin;
import com.facebook.stetho.dumpapp.plugins.CrashDumperPlugin;
import com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin;
import com.facebook.stetho.dumpapp.plugins.HprofDumperPlugin;
import c6.h;
import com.facebook.stetho.common.LogUtil;
import android.app.Application;
import com.facebook.stetho.inspector.elements.android.ActivityTracker;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.dumpapp.DumperPlugin;
import android.content.Context;

public class Stetho
{
    private Stetho() {
    }
    
    public static DumperPluginsProvider defaultDumperPluginsProvider(final Context context) {
        return new DumperPluginsProvider() {
            @Override
            public Iterable<DumperPlugin> get() {
                return new DefaultDumperPluginsBuilder(context).finish();
            }
        };
    }
    
    public static InspectorModulesProvider defaultInspectorModulesProvider(final Context context) {
        return new InspectorModulesProvider() {
            @Override
            public Iterable<ChromeDevtoolsDomain> get() {
                return new DefaultInspectorModulesBuilder(context).finish();
            }
        };
    }
    
    public static void initialize(final Initializer initializer) {
        if (!ActivityTracker.get().beginTrackingIfPossible((Application)initializer.mContext.getApplicationContext())) {
            LogUtil.w("Automatic activity tracking not available on this API level, caller must invoke ActivityTracker methods manually!");
        }
        initializer.start();
    }
    
    public static void initializeWithDefaults(final Context context) {
        initialize((Initializer)new Initializer(context) {
            @Override
            protected Iterable<DumperPlugin> getDumperPlugins() {
                return new DefaultDumperPluginsBuilder(context).finish();
            }
            
            @Override
            protected Iterable<ChromeDevtoolsDomain> getInspectorModules() {
                return new DefaultInspectorModulesBuilder(context).finish();
            }
        });
    }
    
    public static InitializerBuilder newInitializerBuilder(final Context context) {
        return new InitializerBuilder(context);
    }
    
    private static class BuilderBasedInitializer extends Initializer
    {
        @h
        private final DumperPluginsProvider mDumperPlugins;
        @h
        private final InspectorModulesProvider mInspectorModules;
        
        private BuilderBasedInitializer(final InitializerBuilder initializerBuilder) {
            super(initializerBuilder.mContext);
            this.mDumperPlugins = initializerBuilder.mDumperPlugins;
            this.mInspectorModules = initializerBuilder.mInspectorModules;
        }
        
        @h
        @Override
        protected Iterable<DumperPlugin> getDumperPlugins() {
            final DumperPluginsProvider mDumperPlugins = this.mDumperPlugins;
            Iterable<DumperPlugin> value;
            if (mDumperPlugins != null) {
                value = mDumperPlugins.get();
            }
            else {
                value = null;
            }
            return value;
        }
        
        @h
        @Override
        protected Iterable<ChromeDevtoolsDomain> getInspectorModules() {
            final InspectorModulesProvider mInspectorModules = this.mInspectorModules;
            Iterable<ChromeDevtoolsDomain> value;
            if (mInspectorModules != null) {
                value = mInspectorModules.get();
            }
            else {
                value = null;
            }
            return value;
        }
    }
    
    public static final class DefaultDumperPluginsBuilder
    {
        private final Context mContext;
        private final PluginBuilder<DumperPlugin> mDelegate;
        
        public DefaultDumperPluginsBuilder(final Context mContext) {
            this.mDelegate = (PluginBuilder<DumperPlugin>)new PluginBuilder();
            this.mContext = mContext;
        }
        
        private DefaultDumperPluginsBuilder provideIfDesired(final DumperPlugin dumperPlugin) {
            this.mDelegate.provideIfDesired(dumperPlugin.getName(), dumperPlugin);
            return this;
        }
        
        public Iterable<DumperPlugin> finish() {
            this.provideIfDesired(new HprofDumperPlugin(this.mContext));
            this.provideIfDesired(new SharedPreferencesDumperPlugin(this.mContext));
            this.provideIfDesired(new CrashDumperPlugin());
            this.provideIfDesired(new FilesDumperPlugin(this.mContext));
            return this.mDelegate.finish();
        }
        
        public DefaultDumperPluginsBuilder provide(final DumperPlugin dumperPlugin) {
            this.mDelegate.provide(dumperPlugin.getName(), dumperPlugin);
            return this;
        }
        
        public DefaultDumperPluginsBuilder remove(final String s) {
            this.mDelegate.remove(s);
            return this;
        }
    }
    
    public static final class DefaultInspectorModulesBuilder
    {
        private final Application mContext;
        @h
        private List<DatabaseDriver2> mDatabaseDrivers;
        @h
        private DatabaseFilesProvider mDatabaseFilesProvider;
        private final PluginBuilder<ChromeDevtoolsDomain> mDelegate;
        @h
        private DocumentProviderFactory mDocumentProvider;
        private boolean mExcludeSqliteDatabaseDriver;
        @h
        private RuntimeReplFactory mRuntimeRepl;
        
        public DefaultInspectorModulesBuilder(final Context context) {
            this.mDelegate = (PluginBuilder<ChromeDevtoolsDomain>)new PluginBuilder();
            this.mContext = (Application)context.getApplicationContext();
        }
        
        private DefaultInspectorModulesBuilder provideIfDesired(final ChromeDevtoolsDomain chromeDevtoolsDomain) {
            this.mDelegate.provideIfDesired(chromeDevtoolsDomain.getClass().getName(), chromeDevtoolsDomain);
            return this;
        }
        
        @h
        private DocumentProviderFactory resolveDocumentProvider() {
            final DocumentProviderFactory mDocumentProvider = this.mDocumentProvider;
            if (mDocumentProvider != null) {
                return mDocumentProvider;
            }
            if (Build$VERSION.SDK_INT >= 14) {
                return new AndroidDocumentProviderFactory(this.mContext, Collections.emptyList());
            }
            return null;
        }
        
        @Deprecated
        public DefaultInspectorModulesBuilder databaseFiles(final DatabaseFilesProvider mDatabaseFilesProvider) {
            this.mDatabaseFilesProvider = mDatabaseFilesProvider;
            return this;
        }
        
        public DefaultInspectorModulesBuilder documentProvider(final DocumentProviderFactory mDocumentProvider) {
            this.mDocumentProvider = mDocumentProvider;
            return this;
        }
        
        public DefaultInspectorModulesBuilder excludeSqliteDatabaseDriver(final boolean mExcludeSqliteDatabaseDriver) {
            this.mExcludeSqliteDatabaseDriver = mExcludeSqliteDatabaseDriver;
            return this;
        }
        
        public Iterable<ChromeDevtoolsDomain> finish() {
            this.provideIfDesired(new Console());
            this.provideIfDesired(new Debugger());
            final DocumentProviderFactory resolveDocumentProvider = this.resolveDocumentProvider();
            if (resolveDocumentProvider != null) {
                final Document document = new Document(resolveDocumentProvider);
                this.provideIfDesired(new DOM(document));
                this.provideIfDesired(new CSS(document));
            }
            this.provideIfDesired(new DOMStorage((Context)this.mContext));
            this.provideIfDesired(new HeapProfiler());
            this.provideIfDesired(new Inspector());
            this.provideIfDesired(new Network((Context)this.mContext));
            this.provideIfDesired(new Page((Context)this.mContext));
            this.provideIfDesired(new Profiler());
            RuntimeReplFactory mRuntimeRepl = this.mRuntimeRepl;
            if (mRuntimeRepl == null) {
                mRuntimeRepl = new RhinoDetectingRuntimeReplFactory((Context)this.mContext);
            }
            this.provideIfDesired(new Runtime(mRuntimeRepl));
            this.provideIfDesired(new Worker());
            if (Build$VERSION.SDK_INT >= 11) {
                final Database database = new Database();
                int n = 0;
                int n2 = 0;
                final List<DatabaseDriver2> mDatabaseDrivers = this.mDatabaseDrivers;
                if (mDatabaseDrivers != null) {
                    final Iterator<DatabaseDriver2> iterator = (Iterator<DatabaseDriver2>)mDatabaseDrivers.iterator();
                    while (true) {
                        n = n2;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final DatabaseDriver2 databaseDriver2 = iterator.next();
                        database.add(databaseDriver2);
                        if (!(databaseDriver2 instanceof SqliteDatabaseDriver)) {
                            continue;
                        }
                        n2 = 1;
                    }
                }
                if (n == 0 && !this.mExcludeSqliteDatabaseDriver) {
                    final Application mContext = this.mContext;
                    DatabaseFilesProvider mDatabaseFilesProvider = this.mDatabaseFilesProvider;
                    if (mDatabaseFilesProvider == null) {
                        mDatabaseFilesProvider = new DefaultDatabaseFilesProvider((Context)mContext);
                    }
                    database.add(new SqliteDatabaseDriver((Context)mContext, mDatabaseFilesProvider, new DefaultDatabaseConnectionProvider()));
                }
                this.provideIfDesired(database);
            }
            return this.mDelegate.finish();
        }
        
        @Deprecated
        public DefaultInspectorModulesBuilder provide(final ChromeDevtoolsDomain chromeDevtoolsDomain) {
            this.mDelegate.provide(chromeDevtoolsDomain.getClass().getName(), chromeDevtoolsDomain);
            return this;
        }
        
        @Deprecated
        public DefaultInspectorModulesBuilder provideDatabaseDriver(final Database.DatabaseDriver databaseDriver) {
            this.provideDatabaseDriver(new DatabaseDriver2Adapter(databaseDriver));
            return this;
        }
        
        public DefaultInspectorModulesBuilder provideDatabaseDriver(final DatabaseDriver2 databaseDriver2) {
            if (this.mDatabaseDrivers == null) {
                this.mDatabaseDrivers = new ArrayList<DatabaseDriver2>();
            }
            this.mDatabaseDrivers.add(databaseDriver2);
            return this;
        }
        
        @Deprecated
        public DefaultInspectorModulesBuilder remove(final String s) {
            this.mDelegate.remove(s);
            return this;
        }
        
        public DefaultInspectorModulesBuilder runtimeRepl(final RuntimeReplFactory mRuntimeRepl) {
            this.mRuntimeRepl = mRuntimeRepl;
            return this;
        }
    }
    
    public abstract static class Initializer
    {
        private final Context mContext;
        
        protected Initializer(final Context context) {
            this.mContext = context.getApplicationContext();
        }
        
        @h
        protected abstract Iterable<DumperPlugin> getDumperPlugins();
        
        @h
        protected abstract Iterable<ChromeDevtoolsDomain> getInspectorModules();
        
        final void start() {
            new ServerManager(new LocalSocketServer("main", AddressNameHelper.createCustomAddress("_devtools_remote"), new LazySocketHandler(new RealSocketHandlerFactory()))).start();
        }
        
        private class RealSocketHandlerFactory implements SocketHandlerFactory
        {
            @Override
            public SocketHandler create() {
                final ProtocolDetectingSocketHandler protocolDetectingSocketHandler = new ProtocolDetectingSocketHandler(Initializer.this.mContext);
                final Iterable<DumperPlugin> dumperPlugins = Initializer.this.getDumperPlugins();
                if (dumperPlugins != null) {
                    final Dumper dumper = new Dumper(dumperPlugins);
                    protocolDetectingSocketHandler.addHandler((ProtocolDetectingSocketHandler.MagicMatcher)new ProtocolDetectingSocketHandler.ExactMagicMatcher(DumpappSocketLikeHandler.PROTOCOL_MAGIC), new DumpappSocketLikeHandler(dumper));
                    final DumpappHttpSocketLikeHandler dumpappHttpSocketLikeHandler = new DumpappHttpSocketLikeHandler(dumper);
                    protocolDetectingSocketHandler.addHandler((ProtocolDetectingSocketHandler.MagicMatcher)new ProtocolDetectingSocketHandler.ExactMagicMatcher("GET /dumpapp".getBytes()), dumpappHttpSocketLikeHandler);
                    protocolDetectingSocketHandler.addHandler((ProtocolDetectingSocketHandler.MagicMatcher)new ProtocolDetectingSocketHandler.ExactMagicMatcher("POST /dumpapp".getBytes()), dumpappHttpSocketLikeHandler);
                }
                final Iterable<ChromeDevtoolsDomain> inspectorModules = Initializer.this.getInspectorModules();
                if (inspectorModules != null) {
                    protocolDetectingSocketHandler.addHandler((ProtocolDetectingSocketHandler.MagicMatcher)new ProtocolDetectingSocketHandler.AlwaysMatchMatcher(), new DevtoolsSocketHandler(Initializer.this.mContext, inspectorModules));
                }
                return protocolDetectingSocketHandler;
            }
        }
    }
    
    public static class InitializerBuilder
    {
        final Context mContext;
        @h
        DumperPluginsProvider mDumperPlugins;
        @h
        InspectorModulesProvider mInspectorModules;
        
        private InitializerBuilder(final Context context) {
            this.mContext = context.getApplicationContext();
        }
        
        public Initializer build() {
            return new BuilderBasedInitializer(this);
        }
        
        public InitializerBuilder enableDumpapp(final DumperPluginsProvider dumperPluginsProvider) {
            this.mDumperPlugins = Util.throwIfNull(dumperPluginsProvider);
            return this;
        }
        
        public InitializerBuilder enableWebKitInspector(final InspectorModulesProvider mInspectorModules) {
            this.mInspectorModules = mInspectorModules;
            return this;
        }
    }
    
    private static class PluginBuilder<T>
    {
        private boolean mFinished;
        private final ArrayList<T> mPlugins;
        private final Set<String> mProvidedNames;
        private final Set<String> mRemovedNames;
        
        private PluginBuilder() {
            this.mProvidedNames = new HashSet<String>();
            this.mRemovedNames = new HashSet<String>();
            this.mPlugins = new ArrayList<T>();
        }
        
        private void throwIfFinished() {
            if (!this.mFinished) {
                return;
            }
            throw new IllegalStateException("Must not continue to build after finish()");
        }
        
        public Iterable<T> finish() {
            this.mFinished = true;
            return this.mPlugins;
        }
        
        public void provide(final String s, final T e) {
            this.throwIfFinished();
            this.mPlugins.add(e);
            this.mProvidedNames.add(s);
        }
        
        public void provideIfDesired(final String s, final T e) {
            this.throwIfFinished();
            if (!this.mRemovedNames.contains(s) && this.mProvidedNames.add(s)) {
                this.mPlugins.add(e);
            }
        }
        
        public void remove(final String s) {
            this.throwIfFinished();
            this.mRemovedNames.add(s);
        }
    }
}
