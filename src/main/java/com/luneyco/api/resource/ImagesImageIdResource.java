package com.luneyco.api.resource;

import com.luneyco.api.resource.support.ResponseWrapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.*;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * Get a image item
 * 
 */
@Path("images/{image_id}")
public interface ImagesImageIdResource {


    /**
     * Get detailed statistics of the specified image.
     * 
     * @param imageId
     *     
     * @param size
     *     Specifies the size of the images. web, web_retina,mobile, mobile-retina, ipad, ipad_retina, original
     * @param type
     *     The type of the image file to be sent. file,base64, URL
     */
    @GET
    @Produces({
        "application/json"
    })
    GetImagesByImageIdResponse getImagesByImageId(
            @PathParam("image_id")
            String imageId,
            @QueryParam("size")
            String size,
            @QueryParam("type")
            String type)
        throws Exception
    ;

    public class GetImagesByImageIdResponse extends ResponseWrapper {


        private GetImagesByImageIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * e.g. {
         * <p>
         * "id": "802fc23c-c996-43b8-b285-f8a44fe67017",
         * <p>
         * "image_url" : "/images/image1.png",
         * <p>
         * "title" : "Luther Denkmal bei Tag",
         * <p>
         * "comments": [
         * <p>
         * {
         * <p>
         * "id": "802fc23c-c996-43b8-b285-f8a44fe67017",
         * <p>
         * "user_id": "802fc23c-c996-43b8-b285-f8a44fe67017",
         * <p>
         * "title": "Great",
         * <p>
         * "msg": "Some texti text"
         * <p>
         * },
         * <p>
         * ],
         * <p>
         * "likes": [
         * <p>
         * {
         * <p>
         * "user_id": "802fc23c-c996-43b8-b285-f8a44fe67017"
         * <p>
         * }
         * <p>
         * ]
         * <p>
         * <p>
         * <p>
         * }
         *
         * @param entity {
         *               <p>
         *               "id": "802fc23c-c996-43b8-b285-f8a44fe67017",
         *               <p>
         *               "image_url" : "/images/image1.png",
         *               <p>
         *               "title" : "Luther Denkmal bei Tag",
         *               <p>
         *               "comments": [
         *               <p>
         *               {
         *               <p>
         *               "id": "802fc23c-c996-43b8-b285-f8a44fe67017",
         *               <p>
         *               "user_id": "802fc23c-c996-43b8-b285-f8a44fe67017",
         *               <p>
         *               "title": "Great",
         *               <p>
         *               "msg": "Some texti text"
         *               <p>
         *               },
         *               <p>
         *               ],
         *               <p>
         *               "likes": [
         *               <p>
         *               {
         *               <p>
         *               "user_id": "802fc23c-c996-43b8-b285-f8a44fe67017"
         *               <p>
         *               }
         *               <p>
         *               ]
         *               <p>
         *               <p>
         *               <p>
         *               }
         */
        public static GetImagesByImageIdResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetImagesByImageIdResponse(responseBuilder.build());
        }

        /**
         * e.g. {"message": "No image was found!"}
         *
         * @param entity {"message": "No image was found!"}
         */
        public static GetImagesByImageIdResponse withJsonNotFound(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetImagesByImageIdResponse(responseBuilder.build());
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
