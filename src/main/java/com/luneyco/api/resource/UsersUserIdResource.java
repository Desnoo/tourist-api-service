
package com.luneyco.api.resource;

import com.luneyco.api.resource.support.ResponseWrapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * Get a user item
 */
@Path("users/{user_id}")
public interface UsersUserIdResource {


    /**
     * Get the user with userId = {userId}
     *
     * @param userId
     */
    @GET
    @Produces({
            "application/json"
    })
    GetUsersByUserIdResponse getUsersByUserId(
            @PathParam("user_id")
            String userId)
            throws Exception;

    public class GetUsersByUserIdResponse extends ResponseWrapper {


        private GetUsersByUserIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * @param entity
         */
        public static GetUsersByUserIdResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetUsersByUserIdResponse(responseBuilder.build());
        }

        /**
         * e.g. {"message": "No user was found!"}
         *
         * @param entity {"message": "No user was found!"}
         */
        public static GetUsersByUserIdResponse withJsonNotFound(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetUsersByUserIdResponse(responseBuilder.build());
        }

        @Override
        public StatusType getStatusInfo() {
            return null;
        }

        @Override
        public <T> T readEntity(Class<T> aClass) {
            return null;
        }

        @Override
        public <T> T readEntity(GenericType<T> genericType) {
            return null;
        }

        @Override
        public <T> T readEntity(Class<T> aClass, Annotation[] annotations) {
            return null;
        }

        @Override
        public <T> T readEntity(GenericType<T> genericType, Annotation[] annotations) {
            return null;
        }

        @Override
        public boolean hasEntity() {
            return false;
        }

        @Override
        public boolean bufferEntity() {
            return false;
        }

        @Override
        public void close() {

        }

        @Override
        public MediaType getMediaType() {
            return null;
        }

        @Override
        public Locale getLanguage() {
            return null;
        }

        @Override
        public int getLength() {
            return 0;
        }

        @Override
        public Set<String> getAllowedMethods() {
            return null;
        }

        @Override
        public Map<String, NewCookie> getCookies() {
            return null;
        }

        @Override
        public EntityTag getEntityTag() {
            return null;
        }

        @Override
        public Date getDate() {
            return null;
        }

        @Override
        public Date getLastModified() {
            return null;
        }

        @Override
        public URI getLocation() {
            return null;
        }

        @Override
        public Set<Link> getLinks() {
            return null;
        }

        @Override
        public boolean hasLink(String s) {
            return false;
        }

        @Override
        public Link getLink(String s) {
            return null;
        }

        @Override
        public Link.Builder getLinkBuilder(String s) {
            return null;
        }

        @Override
        public MultivaluedMap<String, String> getStringHeaders() {
            return null;
        }

        @Override
        public String getHeaderString(String s) {
            return null;
        }

    }

}
