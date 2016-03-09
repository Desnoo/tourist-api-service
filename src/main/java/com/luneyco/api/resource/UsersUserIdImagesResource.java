
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
 * A collection of images elements.
 */
@Path("users/{user_id}/images")
public interface UsersUserIdImagesResource {


    /**
     * Get a list of images of an specific user.
     *
     * @param userId
     */
    @GET
    @Produces({
            "application/json"
    })
    GetUsersByUserIdImagesResponse getUsersByUserIdImages(
            @PathParam("user_id")
            String userId)
            throws Exception
    ;

    public class GetUsersByUserIdImagesResponse extends ResponseWrapper {


        private GetUsersByUserIdImagesResponse(Response delegate) {
            super(delegate);
        }

        /**
         * @param entity
         */
        public static GetUsersByUserIdImagesResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetUsersByUserIdImagesResponse(responseBuilder.build());
        }

        /**
         * e.g. {"message": "No images were found!"}
         *
         * @param entity {"message": "No images were found!"}
         */
        public static GetUsersByUserIdImagesResponse withJsonNotFound(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetUsersByUserIdImagesResponse(responseBuilder.build());
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
