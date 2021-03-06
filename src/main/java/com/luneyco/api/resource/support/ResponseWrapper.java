
package com.luneyco.api.resource.support;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

/**
 * Response wrapper for JAX-RS 1.1
 */
public abstract class ResponseWrapper extends Response
{
    private final Response delegate;

    protected ResponseWrapper(final Response delegate)
    {
        this.delegate = delegate;
    }

    protected static ResponseBuilder headers(final Map<String, List<Object>> headers, final ResponseBuilder responseBuilder)
    {
        if (headers != null)
        {
            for (final Entry<String, List<Object>> nameAndValues : headers.entrySet())
            {
                for (final Object value : nameAndValues.getValue())
                {
                    responseBuilder.header(nameAndValues.getKey(), value);
                }
            }
        }

        return responseBuilder;
    }

    @Override
    public int hashCode()
    {
        return delegate.hashCode();
    }

    @Override
    public int getStatus()
    {
        return delegate.getStatus();
    }

    @Override
    public boolean equals(final Object obj)
    {
        return delegate.equals(obj);
    }

    @Override
    public Object getEntity()
    {
        return delegate.getEntity();
    }

    @Override
    public String toString()
    {
        return delegate.toString();
    }

    @Override
    public MultivaluedMap<String, Object> getMetadata()
    {
        return delegate.getMetadata();
    }
}

