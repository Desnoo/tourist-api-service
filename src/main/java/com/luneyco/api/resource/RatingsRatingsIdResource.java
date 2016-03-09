
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
 * Get a rating item
 * 
 */
@Path("ratings/{ratings_id}")
public interface RatingsRatingsIdResource {


    /**
     * Get the rating with ratingId = {ratingId}
     * 
     * 
     * @param ratingsId
     *     
     */
    @GET
    @Produces({
        "application/json"
    })
    GetRatingsByRatingsIdResponse getRatingsByRatingsId(
            @PathParam("ratings_id")
            String ratingsId)
        throws Exception
    ;

    public class GetRatingsByRatingsIdResponse
        extends ResponseWrapper
    {


        private GetRatingsByRatingsIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         *  e.g. {

         *   "id": "a29ba433-5654-4018-a6f4-c5af25cb3c82",

         *   "title": "Awesome",

         *   "text": "Wow this was so great in this house!",

         *   "overall_rating": 0.8,

         *   "rating_factors": [

         *     {

         *       "id": "eaaae98f-004e-442d-958e-4aaa7261471d",

         *       "criteria": "location",

         *       "rating": 0.9,

         *       "distribution": [

         *         {

         *           "rating_nr": 1,

         *           "count" : 10

         *         },

         *         {

         *           "rating_nr": 2,

         *           "count" : 10

         *         },

         *         {

         *           "rating_nr": 3,

         *           "count" : 10

         *         },

         *         {

         *           "rating_nr": 4,

         *           "count" : 10

         *         },

         *         {

         *           "rating_nr": 5,

         *           "count" : 12

         *         }

         *       ]

         *     }

         *   ]

         * }

         * 
         * 
         * @param entity
         *     {

         *       "id": "a29ba433-5654-4018-a6f4-c5af25cb3c82",

         *       "title": "Awesome",

         *       "text": "Wow this was so great in this house!",

         *       "overall_rating": 0.8,

         *       "rating_factors": [

         *         {

         *           "id": "eaaae98f-004e-442d-958e-4aaa7261471d",

         *           "criteria": "location",

         *           "rating": 0.9,

         *           "distribution": [

         *             {

         *               "rating_nr": 1,

         *               "count" : 10

         *             },

         *             {

         *               "rating_nr": 2,

         *               "count" : 10

         *             },

         *             {

         *               "rating_nr": 3,

         *               "count" : 10

         *             },

         *             {

         *               "rating_nr": 4,

         *               "count" : 10

         *             },

         *             {

         *               "rating_nr": 5,

         *               "count" : 12

         *             }

         *           ]

         *         }

         *       ]

         *     }

         *     
         */
        public static GetRatingsByRatingsIdResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetRatingsByRatingsIdResponse(responseBuilder.build());
        }

        /**
         *  e.g. {"message": "No rating was found!"}
         * 
         * 
         * @param entity
         *     {"message": "No rating was found!"}
         *     
         */
        public static GetRatingsByRatingsIdResponse withJsonNotFound(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetRatingsByRatingsIdResponse(responseBuilder.build());
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
