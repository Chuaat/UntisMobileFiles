// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.HttpRequest;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.io.InputStream;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.untis.wu.rest.auth.HttpBasicAuth;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import com.untis.wu.rest.auth.HttpBearerAuth;
import com.untis.wu.rest.auth.ApiKeyAuth;
import org.springframework.util.StringUtils;
import java.text.ParseException;
import java.util.ArrayList;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.http.InvalidMediaTypeException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import org.springframework.http.RequestEntity;
import java.net.URI;
import java.net.URLEncoder;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.HttpMethod;
import java.util.Collections;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.Date;
import java.util.Collection;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import java.util.Iterator;
import java.util.List;
import org.springframework.http.RequestEntity$BodyBuilder;
import org.springframework.web.client.RestClientException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.RestTemplate;
import org.springframework.util.MultiValueMap;
import org.springframework.http.HttpHeaders;
import java.text.DateFormat;
import com.untis.wu.rest.auth.Authentication;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component("com.untis.wu.rest.ApiClient")
public class ApiClient
{
    private Map<String, Authentication> authentications;
    private String basePath;
    private DateFormat dateFormat;
    private boolean debugging;
    private HttpHeaders defaultHeaders;
    private MultiValueMap<String, String> responseHeaders;
    private RestTemplate restTemplate;
    private HttpStatus statusCode;
    
    public ApiClient() {
        this.debugging = false;
        this.defaultHeaders = new HttpHeaders();
        this.basePath = "http://localhost/api";
        this.restTemplate = this.buildRestTemplate();
        this.init();
    }
    
    @Autowired
    public ApiClient(final RestTemplate restTemplate) {
        this.debugging = false;
        this.defaultHeaders = new HttpHeaders();
        this.basePath = "http://localhost/api";
        this.restTemplate = restTemplate;
        this.init();
    }
    
    private void updateParamsForAuth(final String[] array, final MultiValueMap<String, String> multiValueMap, final HttpHeaders httpHeaders) {
        for (final String str : array) {
            final Authentication authentication = this.authentications.get(str);
            if (authentication == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Authentication undefined: ");
                sb.append(str);
                throw new RestClientException(sb.toString());
            }
            authentication.applyToParams(multiValueMap, httpHeaders);
        }
    }
    
    public ApiClient addDefaultHeader(final String s, final String s2) {
        if (this.defaultHeaders.containsKey((Object)s)) {
            this.defaultHeaders.remove((Object)s);
        }
        this.defaultHeaders.add(s, s2);
        return this;
    }
    
    protected void addHeadersToRequest(final HttpHeaders httpHeaders, final RequestEntity$BodyBuilder requestEntity$BodyBuilder) {
        for (final Map.Entry<K, List> entry : httpHeaders.entrySet()) {
            for (final String s : entry.getValue()) {
                if (s != null) {
                    requestEntity$BodyBuilder.header((String)entry.getKey(), new String[] { s });
                }
            }
        }
    }
    
    protected RestTemplate buildRestTemplate() {
        final RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory((ClientHttpRequestFactory)new BufferingClientHttpRequestFactory(restTemplate.getRequestFactory()));
        return restTemplate;
    }
    
    public String collectionPathParameterToString(final CollectionFormat other, final Collection<? extends CharSequence> collection) {
        if (CollectionFormat.MULTI.equals(other)) {
            return this.parameterToString(collection);
        }
        CollectionFormat csv;
        if ((csv = other) == null) {
            csv = CollectionFormat.CSV;
        }
        return csv.collectionToString(collection);
    }
    
    public String formatDate(final Date date) {
        return this.dateFormat.format(date);
    }
    
    public Authentication getAuthentication(final String s) {
        return this.authentications.get(s);
    }
    
    public Map<String, Authentication> getAuthentications() {
        return this.authentications;
    }
    
    public String getBasePath() {
        return this.basePath;
    }
    
    public DateFormat getDateFormat() {
        return this.dateFormat;
    }
    
    public MultiValueMap<String, String> getResponseHeaders() {
        return this.responseHeaders;
    }
    
    public HttpStatus getStatusCode() {
        return this.statusCode;
    }
    
    protected void init() {
        (this.dateFormat = (DateFormat)new RFC3339DateFormat()).setTimeZone(TimeZone.getTimeZone("UTC"));
        this.setUserAgent("Java-SDK");
        final HashMap<String, Authentication> hashMap = new HashMap<String, Authentication>();
        this.authentications = hashMap;
        this.authentications = (Map<String, Authentication>)Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public <T> T invokeAPI(String s, final HttpMethod ex, MultiValueMap<String, String> s2, final Object o, final HttpHeaders httpHeaders, final MultiValueMap<String, Object> multiValueMap, final List<MediaType> list, final MediaType mediaType, String[] iterator, final ParameterizedTypeReference<T> parameterizedTypeReference) throws RestClientException {
        this.updateParamsForAuth(iterator, (MultiValueMap<String, String>)s2, httpHeaders);
        s = (String)UriComponentsBuilder.fromHttpUrl(this.basePath).path(s);
        Label_0120: {
            if (s2 == null) {
                break Label_0120;
            }
            iterator = (String[])(Object)((MultiValueMap)s2).values().iterator();
        Label_0068:
            while (true) {
                Label_0114: {
                    List<String> list2;
                    int n;
                    while (true) {
                        while (((Iterator)(Object)iterator).hasNext()) {
                            list2 = ((Iterator<List<String>>)(Object)iterator).next();
                            if (list2 != null) {
                                n = 0;
                                break Label_0068;
                            }
                        }
                        break Label_0114;
                        if (n >= list2.size()) {
                            continue;
                        }
                        break;
                    }
                    while (true) {
                        try {
                            list2.set(n, URLEncoder.encode(list2.get(n), "utf8"));
                            ++n;
                            continue Label_0068;
                            while (true) {
                                try {
                                    s2 = new URI(((UriComponentsBuilder)s).build().toUriString());
                                    s = (String)RequestEntity.method((HttpMethod)ex, (URI)s2);
                                    if (list != null) {
                                        ((RequestEntity$BodyBuilder)s).accept((MediaType[])list.toArray(new MediaType[list.size()]));
                                    }
                                    if (mediaType != null) {
                                        ((RequestEntity$BodyBuilder)s).contentType(mediaType);
                                    }
                                    this.addHeadersToRequest(httpHeaders, (RequestEntity$BodyBuilder)s);
                                    this.addHeadersToRequest(this.defaultHeaders, (RequestEntity$BodyBuilder)s);
                                    s = (String)((RequestEntity$BodyBuilder)s).body(this.selectBody(o, multiValueMap, mediaType));
                                    s = (String)this.restTemplate.exchange((RequestEntity)s, (ParameterizedTypeReference)parameterizedTypeReference);
                                    this.statusCode = ((ResponseEntity)s).getStatusCode();
                                    this.responseHeaders = (MultiValueMap<String, String>)((ResponseEntity)s).getHeaders();
                                    if (((ResponseEntity)s).getStatusCode() == HttpStatus.NO_CONTENT) {
                                        return null;
                                    }
                                    if (!((ResponseEntity)s).getStatusCode().is2xxSuccessful()) {
                                        s = (String)new StringBuilder();
                                        ((StringBuilder)s).append("API returned ");
                                        ((StringBuilder)s).append(this.statusCode);
                                        ((StringBuilder)s).append(" and it wasn't handled by the RestTemplate error handler");
                                        throw new RestClientException(((StringBuilder)s).toString());
                                    }
                                    if (parameterizedTypeReference == null) {
                                        return null;
                                    }
                                    return (T)((ResponseEntity)s).getBody();
                                }
                                catch (URISyntaxException ex) {
                                    s2 = new StringBuilder();
                                    ((StringBuilder)s2).append("Could not build URL: ");
                                    ((StringBuilder)s2).append(((UriComponentsBuilder)s).toUriString());
                                    throw new RestClientException(((StringBuilder)s2).toString(), (Throwable)ex);
                                }
                                ((UriComponentsBuilder)s).queryParams((MultiValueMap)s2);
                                continue;
                            }
                        }
                        catch (UnsupportedEncodingException ex2) {
                            continue;
                        }
                        break;
                    }
                }
                break;
            }
        }
    }
    
    public boolean isDebugging() {
        return this.debugging;
    }
    
    public boolean isJsonMime(final String anObject) {
        if ("*/*".equals(anObject)) {
            return true;
        }
        try {
            return this.isJsonMime(MediaType.parseMediaType(anObject));
        }
        catch (InvalidMediaTypeException ex) {
            return false;
        }
    }
    
    public boolean isJsonMime(final MediaType mediaType) {
        return mediaType != null && (MediaType.APPLICATION_JSON.isCompatibleWith(mediaType) || mediaType.getSubtype().matches("^.*\\+json[;]?\\s*$"));
    }
    
    public MultiValueMap<String, String> parameterToMultiValueMap(final CollectionFormat collectionFormat, final String s, final Object o) {
        final LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
        if (s != null && !s.isEmpty() && o != null) {
            CollectionFormat csv;
            if ((csv = collectionFormat) == null) {
                csv = CollectionFormat.CSV;
            }
            String s2;
            if (o instanceof Collection) {
                final Collection collection = (Collection)o;
                if (collection.isEmpty()) {
                    return (MultiValueMap<String, String>)linkedMultiValueMap;
                }
                if (csv.equals(CollectionFormat.MULTI)) {
                    final Iterator<Object> iterator = collection.iterator();
                    while (iterator.hasNext()) {
                        ((MultiValueMap)linkedMultiValueMap).add((Object)s, (Object)this.parameterToString(iterator.next()));
                    }
                    return (MultiValueMap<String, String>)linkedMultiValueMap;
                }
                final ArrayList<String> list = new ArrayList<String>();
                final Iterator<Object> iterator2 = collection.iterator();
                while (iterator2.hasNext()) {
                    list.add(this.parameterToString(iterator2.next()));
                }
                s2 = csv.collectionToString(list);
            }
            else {
                s2 = this.parameterToString(o);
            }
            ((MultiValueMap)linkedMultiValueMap).add((Object)s, (Object)s2);
            return (MultiValueMap<String, String>)linkedMultiValueMap;
        }
        return (MultiValueMap<String, String>)linkedMultiValueMap;
    }
    
    public String parameterToString(final Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof Date) {
            return this.formatDate((Date)obj);
        }
        if (obj instanceof Collection) {
            final StringBuilder sb = new StringBuilder();
            for (final Object next : (Collection)obj) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(String.valueOf(next));
            }
            return sb.toString();
        }
        return String.valueOf(obj);
    }
    
    public Date parseDate(final String source) {
        try {
            return this.dateFormat.parse(source);
        }
        catch (ParseException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    protected Object selectBody(Object o, final MultiValueMap<String, Object> multiValueMap, final MediaType mediaType) {
        if (MediaType.MULTIPART_FORM_DATA.isCompatibleWith(mediaType) || MediaType.APPLICATION_FORM_URLENCODED.isCompatibleWith(mediaType)) {
            o = multiValueMap;
        }
        return o;
    }
    
    public List<MediaType> selectHeaderAccept(final String[] array) {
        if (array.length == 0) {
            return null;
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            final MediaType mediaType = MediaType.parseMediaType(array[i]);
            if (this.isJsonMime(mediaType)) {
                return Collections.singletonList(mediaType);
            }
        }
        return (List<MediaType>)MediaType.parseMediaTypes(StringUtils.arrayToCommaDelimitedString((Object[])array));
    }
    
    public MediaType selectHeaderContentType(final String[] array) {
        if (array.length == 0) {
            return MediaType.APPLICATION_JSON;
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            final MediaType mediaType = MediaType.parseMediaType(array[i]);
            if (this.isJsonMime(mediaType)) {
                return mediaType;
            }
        }
        return MediaType.parseMediaType(array[0]);
    }
    
    public void setApiKey(final String apiKey) {
        for (final Authentication authentication : this.authentications.values()) {
            if (authentication instanceof ApiKeyAuth) {
                ((ApiKeyAuth)authentication).setApiKey(apiKey);
                return;
            }
        }
        throw new RuntimeException("No API key authentication configured!");
    }
    
    public void setApiKeyPrefix(final String apiKeyPrefix) {
        for (final Authentication authentication : this.authentications.values()) {
            if (authentication instanceof ApiKeyAuth) {
                ((ApiKeyAuth)authentication).setApiKeyPrefix(apiKeyPrefix);
                return;
            }
        }
        throw new RuntimeException("No API key authentication configured!");
    }
    
    public ApiClient setBasePath(final String basePath) {
        this.basePath = basePath;
        return this;
    }
    
    public void setBearerToken(final String bearerToken) {
        for (final Authentication authentication : this.authentications.values()) {
            if (authentication instanceof HttpBearerAuth) {
                ((HttpBearerAuth)authentication).setBearerToken(bearerToken);
                return;
            }
        }
        throw new RuntimeException("No Bearer authentication configured!");
    }
    
    public ApiClient setDateFormat(final DateFormat dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }
    
    public void setDebugging(final boolean debugging) {
        final List interceptors = this.restTemplate.getInterceptors();
        Label_0112: {
            List<ApiClientHttpRequestInterceptor> interceptors2;
            if (debugging) {
                if ((interceptors2 = (List<ApiClientHttpRequestInterceptor>)interceptors) == null) {
                    interceptors2 = new ArrayList<ApiClientHttpRequestInterceptor>();
                }
                interceptors2.add(new ApiClientHttpRequestInterceptor());
            }
            else {
                if (interceptors == null || interceptors.isEmpty()) {
                    break Label_0112;
                }
                final Iterator<ApiClientHttpRequestInterceptor> iterator = interceptors.iterator();
                while (true) {
                    interceptors2 = (List<ApiClientHttpRequestInterceptor>)interceptors;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    if (!(((ClientHttpRequestInterceptor)iterator.next()) instanceof ApiClientHttpRequestInterceptor)) {
                        continue;
                    }
                    iterator.remove();
                }
            }
            this.restTemplate.setInterceptors((List)interceptors2);
        }
        this.debugging = debugging;
    }
    
    public void setPassword(final String password) {
        for (final Authentication authentication : this.authentications.values()) {
            if (authentication instanceof HttpBasicAuth) {
                ((HttpBasicAuth)authentication).setPassword(password);
                return;
            }
        }
        throw new RuntimeException("No HTTP basic authentication configured!");
    }
    
    public ApiClient setUserAgent(final String s) {
        this.addDefaultHeader("User-Agent", s);
        return this;
    }
    
    public void setUsername(final String username) {
        for (final Authentication authentication : this.authentications.values()) {
            if (authentication instanceof HttpBasicAuth) {
                ((HttpBasicAuth)authentication).setUsername(username);
                return;
            }
        }
        throw new RuntimeException("No HTTP basic authentication configured!");
    }
    
    private class ApiClientHttpRequestInterceptor implements ClientHttpRequestInterceptor
    {
        private final Log log;
        
        private ApiClientHttpRequestInterceptor() {
            this.log = LogFactory.getLog((Class)ApiClientHttpRequestInterceptor.class);
        }
        
        private String bodyToString(final InputStream in) throws IOException {
            final StringBuilder sb = new StringBuilder();
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
            while (true) {
                final String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append(System.lineSeparator());
            }
            bufferedReader.close();
            return sb.toString();
        }
        
        private String headersToString(final HttpHeaders httpHeaders) {
            final StringBuilder sb = new StringBuilder();
            for (final Map.Entry<String, V> entry : httpHeaders.entrySet()) {
                sb.append(entry.getKey());
                sb.append("=[");
                final Iterator iterator2 = ((List)entry.getValue()).iterator();
                while (iterator2.hasNext()) {
                    sb.append(iterator2.next());
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
                sb.append("],");
            }
            sb.setLength(sb.length() - 1);
            return sb.toString();
        }
        
        private void logRequest(final HttpRequest httpRequest, final byte[] bytes) throws UnsupportedEncodingException {
            final Log log = this.log;
            final StringBuilder sb = new StringBuilder();
            sb.append("URI: ");
            sb.append(httpRequest.getURI());
            log.info((Object)sb.toString());
            final Log log2 = this.log;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("HTTP Method: ");
            sb2.append(httpRequest.getMethod());
            log2.info((Object)sb2.toString());
            final Log log3 = this.log;
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("HTTP Headers: ");
            sb3.append(this.headersToString(httpRequest.getHeaders()));
            log3.info((Object)sb3.toString());
            final Log log4 = this.log;
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Request Body: ");
            sb4.append(new String(bytes, StandardCharsets.UTF_8));
            log4.info((Object)sb4.toString());
        }
        
        private void logResponse(final ClientHttpResponse clientHttpResponse) throws IOException {
            final Log log = this.log;
            final StringBuilder sb = new StringBuilder();
            sb.append("HTTP Status Code: ");
            sb.append(clientHttpResponse.getRawStatusCode());
            log.info((Object)sb.toString());
            final Log log2 = this.log;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Status Text: ");
            sb2.append(clientHttpResponse.getStatusText());
            log2.info((Object)sb2.toString());
            final Log log3 = this.log;
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("HTTP Headers: ");
            sb3.append(this.headersToString(clientHttpResponse.getHeaders()));
            log3.info((Object)sb3.toString());
            final Log log4 = this.log;
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Response Body: ");
            sb4.append(this.bodyToString(clientHttpResponse.getBody()));
            log4.info((Object)sb4.toString());
        }
        
        public ClientHttpResponse intercept(final HttpRequest httpRequest, final byte[] array, final ClientHttpRequestExecution clientHttpRequestExecution) throws IOException {
            this.logRequest(httpRequest, array);
            final ClientHttpResponse execute = clientHttpRequestExecution.execute(httpRequest, array);
            this.logResponse(execute);
            return execute;
        }
    }
    
    public enum CollectionFormat
    {
        CSV(","), 
        MULTI((String)null), 
        PIPES("|"), 
        SSV(" "), 
        TSV("\t");
        
        private final String separator;
        
        private CollectionFormat(final String separator) {
            this.separator = separator;
        }
        
        private String collectionToString(final Collection<? extends CharSequence> collection) {
            return StringUtils.collectionToDelimitedString((Collection)collection, this.separator);
        }
    }
}
