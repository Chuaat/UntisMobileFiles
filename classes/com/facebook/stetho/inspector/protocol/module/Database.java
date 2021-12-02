// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback;
import java.util.Iterator;
import com.facebook.stetho.inspector.helper.ObjectIdMapper;
import d6.a;
import android.util.SparseArray;
import d6.d;
import com.facebook.stetho.inspector.helper.PeersRegisteredListener;
import android.content.Context;
import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.common.LogUtil;
import java.util.Arrays;
import android.database.sqlite.SQLiteException;
import java.util.Collections;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import org.json.JSONObject;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.common.Util;
import java.io.UnsupportedEncodingException;
import android.database.Cursor;
import com.facebook.stetho.inspector.helper.PeerRegistrationListener;
import java.util.ArrayList;
import com.facebook.stetho.json.ObjectMapper;
import java.util.List;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import android.annotation.TargetApi;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

@TargetApi(11)
public class Database implements ChromeDevtoolsDomain
{
    private static final int MAX_BLOB_LENGTH = 512;
    private static final int MAX_EXECUTE_RESULTS = 250;
    private static final String UNKNOWN_BLOB_LABEL = "{blob}";
    private final ChromePeerManager mChromePeerManager;
    private List<DatabaseDriver2> mDatabaseDrivers;
    private final ObjectMapper mObjectMapper;
    private final DatabasePeerRegistrationListener mPeerListener;
    
    public Database() {
        this.mDatabaseDrivers = new ArrayList<DatabaseDriver2>();
        (this.mChromePeerManager = new ChromePeerManager()).setListener(this.mPeerListener = new DatabasePeerRegistrationListener((List)this.mDatabaseDrivers));
        this.mObjectMapper = new ObjectMapper();
    }
    
    private static String blobToString(final byte[] bytes) {
        if (bytes.length > 512 || !fastIsAscii(bytes)) {
            return "{blob}";
        }
        try {
            return new String(bytes, "US-ASCII");
        }
        catch (UnsupportedEncodingException ex) {
            return "{blob}";
        }
    }
    
    private static boolean fastIsAscii(final byte[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if ((array[i] & 0xFFFFFF80) != 0x0) {
                return false;
            }
        }
        return true;
    }
    
    private static ArrayList<String> flattenRows(final Cursor cursor, int i) {
        final int n = 0;
        Util.throwIfNot(i >= 0);
        final ArrayList<String> list = new ArrayList<String>();
        final int columnCount = cursor.getColumnCount();
        for (int n2 = 0; n2 < i && cursor.moveToNext(); ++n2) {
            for (int j = 0; j < columnCount; ++j) {
                final int type = cursor.getType(j);
                String e;
                if (type != 0) {
                    if (type != 1) {
                        if (type != 2) {
                            if (type != 4) {
                                e = cursor.getString(j);
                            }
                            else {
                                e = blobToString(cursor.getBlob(j));
                            }
                        }
                        else {
                            e = String.valueOf(cursor.getDouble(j));
                        }
                    }
                    else {
                        e = String.valueOf(cursor.getLong(j));
                    }
                }
                else {
                    e = null;
                }
                list.add(e);
            }
        }
        if (!cursor.isAfterLast()) {
            for (i = n; i < columnCount; ++i) {
                list.add("{truncated}");
            }
        }
        return list;
    }
    
    public void add(final DatabaseDriver2 databaseDriver2) {
        this.mDatabaseDrivers.add(databaseDriver2);
    }
    
    @ChromeDevtoolsMethod
    public void disable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        this.mChromePeerManager.removePeer(jsonRpcPeer);
    }
    
    @ChromeDevtoolsMethod
    public void enable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        this.mChromePeerManager.addPeer(jsonRpcPeer);
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult executeSQL(JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        jsonRpcPeer = (JsonRpcPeer)this.mObjectMapper.convertValue(jsonObject, ExecuteSQLRequest.class);
        final DatabaseDescriptorHolder databaseDescriptorHolder = this.mPeerListener.getDatabaseDescriptorHolder(((ExecuteSQLRequest)jsonRpcPeer).databaseId);
        try {
            return databaseDescriptorHolder.driver.executeSQL(databaseDescriptorHolder.descriptor, ((ExecuteSQLRequest)jsonRpcPeer).query, (BaseDatabaseDriver.ExecuteResultHandler)new BaseDatabaseDriver.ExecuteResultHandler<ExecuteSQLResponse>() {
                public ExecuteSQLResponse handleInsert(final long l) throws SQLiteException {
                    final ExecuteSQLResponse executeSQLResponse = new ExecuteSQLResponse();
                    executeSQLResponse.columnNames = Collections.singletonList("ID of last inserted row");
                    executeSQLResponse.values = Collections.singletonList(String.valueOf(l));
                    return executeSQLResponse;
                }
                
                public ExecuteSQLResponse handleRawQuery() throws SQLiteException {
                    final ExecuteSQLResponse executeSQLResponse = new ExecuteSQLResponse();
                    executeSQLResponse.columnNames = Collections.singletonList("success");
                    executeSQLResponse.values = Collections.singletonList("true");
                    return executeSQLResponse;
                }
                
                public ExecuteSQLResponse handleSelect(final Cursor cursor) throws SQLiteException {
                    final ExecuteSQLResponse executeSQLResponse = new ExecuteSQLResponse();
                    executeSQLResponse.columnNames = Arrays.asList(cursor.getColumnNames());
                    executeSQLResponse.values = flattenRows(cursor, 250);
                    return executeSQLResponse;
                }
                
                public ExecuteSQLResponse handleUpdateDelete(final int i) throws SQLiteException {
                    final ExecuteSQLResponse executeSQLResponse = new ExecuteSQLResponse();
                    executeSQLResponse.columnNames = Collections.singletonList("Modified rows");
                    executeSQLResponse.values = Collections.singletonList(String.valueOf(i));
                    return executeSQLResponse;
                }
            });
        }
        catch (RuntimeException ex) {
            LogUtil.e(ex, "Exception executing: %s", ((ExecuteSQLRequest)jsonRpcPeer).query);
            final Error sqlError = new Error();
            sqlError.code = 0;
            sqlError.message = ex.getMessage();
            final ExecuteSQLResponse executeSQLResponse = new ExecuteSQLResponse();
            executeSQLResponse.sqlError = sqlError;
            return executeSQLResponse;
        }
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult getDatabaseTableNames(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) throws JsonRpcException {
        final DatabaseDescriptorHolder databaseDescriptorHolder = this.mPeerListener.getDatabaseDescriptorHolder(this.mObjectMapper.convertValue(jsonObject, GetDatabaseTableNamesRequest.class).databaseId);
        try {
            final GetDatabaseTableNamesResponse getDatabaseTableNamesResponse = new GetDatabaseTableNamesResponse();
            getDatabaseTableNamesResponse.tableNames = (List<String>)databaseDescriptorHolder.driver.getTableNames(databaseDescriptorHolder.descriptor);
            return getDatabaseTableNamesResponse;
        }
        catch (SQLiteException ex) {
            throw new JsonRpcException(new JsonRpcError(JsonRpcError.ErrorCode.INVALID_REQUEST, ex.toString(), null));
        }
    }
    
    public static class AddDatabaseEvent
    {
        @JsonProperty(required = true)
        public DatabaseObject database;
    }
    
    private static class DatabaseDescriptorHolder
    {
        public final DatabaseDescriptor descriptor;
        public final DatabaseDriver2 driver;
        
        public DatabaseDescriptorHolder(final DatabaseDriver2 driver, final DatabaseDescriptor descriptor) {
            this.driver = driver;
            this.descriptor = descriptor;
        }
    }
    
    @Deprecated
    public abstract static class DatabaseDriver extends BaseDatabaseDriver<String>
    {
        public DatabaseDriver(final Context context) {
            super(context);
        }
    }
    
    public static class DatabaseObject
    {
        @JsonProperty(required = true)
        public String domain;
        @JsonProperty(required = true)
        public String id;
        @JsonProperty(required = true)
        public String name;
        @JsonProperty(required = true)
        public String version;
    }
    
    @d
    private static class DatabasePeerRegistrationListener extends PeersRegisteredListener
    {
        private final List<DatabaseDriver2> mDatabaseDrivers;
        @a("this")
        private final SparseArray<DatabaseDescriptorHolder> mDatabaseHolders;
        @a("this")
        private final ObjectIdMapper mDatabaseIdMapper;
        
        private DatabasePeerRegistrationListener(final List<DatabaseDriver2> mDatabaseDrivers) {
            this.mDatabaseHolders = (SparseArray<DatabaseDescriptorHolder>)new SparseArray();
            this.mDatabaseIdMapper = new ObjectIdMapper();
            this.mDatabaseDrivers = mDatabaseDrivers;
        }
        
        public DatabaseDescriptorHolder getDatabaseDescriptorHolder(final String s) {
            return (DatabaseDescriptorHolder)this.mDatabaseHolders.get(Integer.parseInt(s));
        }
        
        @Override
        protected void onFirstPeerRegistered() {
            synchronized (this) {
                for (final DatabaseDriver2<DatabaseDescriptor> databaseDriver2 : this.mDatabaseDrivers) {
                    for (final DatabaseDescriptor databaseDescriptor : databaseDriver2.getDatabaseNames()) {
                        if (this.mDatabaseIdMapper.getIdForObject(databaseDescriptor) == null) {
                            this.mDatabaseHolders.put((int)this.mDatabaseIdMapper.putObject(databaseDescriptor), (Object)new DatabaseDescriptorHolder(databaseDriver2, databaseDescriptor));
                        }
                    }
                }
            }
        }
        
        @Override
        protected void onLastPeerUnregistered() {
            synchronized (this) {
                this.mDatabaseIdMapper.clear();
                this.mDatabaseHolders.clear();
            }
        }
        
        @Override
        protected void onPeerAdded(final JsonRpcPeer jsonRpcPeer) {
            // monitorenter(this)
            int i = 0;
            try {
                while (i < this.mDatabaseHolders.size()) {
                    final int key = this.mDatabaseHolders.keyAt(i);
                    final DatabaseDescriptorHolder databaseDescriptorHolder = (DatabaseDescriptorHolder)this.mDatabaseHolders.valueAt(i);
                    final DatabaseObject database = new DatabaseObject();
                    database.id = String.valueOf(key);
                    database.name = databaseDescriptorHolder.descriptor.name();
                    database.domain = databaseDescriptorHolder.driver.getContext().getPackageName();
                    database.version = "N/A";
                    final AddDatabaseEvent addDatabaseEvent = new AddDatabaseEvent();
                    addDatabaseEvent.database = database;
                    jsonRpcPeer.invokeMethod("Database.addDatabase", addDatabaseEvent, null);
                    ++i;
                }
            }
            finally {
            }
            // monitorexit(this)
        }
        
        @Override
        protected void onPeerRemoved(final JsonRpcPeer jsonRpcPeer) {
        }
        // monitorenter(this)
        // monitorexit(this)
    }
    
    public static class Error
    {
        @JsonProperty(required = true)
        public int code;
        @JsonProperty(required = true)
        public String message;
    }
    
    public static class ExecuteSQLRequest
    {
        @JsonProperty(required = true)
        public String databaseId;
        @JsonProperty(required = true)
        public String query;
    }
    
    public static class ExecuteSQLResponse implements JsonRpcResult
    {
        @JsonProperty
        public List<String> columnNames;
        @JsonProperty
        public Error sqlError;
        @JsonProperty
        public List<String> values;
    }
    
    private static class GetDatabaseTableNamesRequest
    {
        @JsonProperty(required = true)
        public String databaseId;
    }
    
    private static class GetDatabaseTableNamesResponse implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public List<String> tableNames;
    }
}
