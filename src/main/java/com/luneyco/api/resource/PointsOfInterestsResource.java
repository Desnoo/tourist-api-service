package com.luneyco.api.resource;

import com.luneyco.api.resource.support.ResponseWrapper;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.net.URI;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Set;


/**
 * Manage a list of Point of interests.
 */
@Path("pois")
public interface PointsOfInterestsResource {


    /**
     * Get a list of points of interests.
     *
     * @param lgt          The longitude where the user currently is. e.g. 11.534534
     * @param name         The name to search for. e.g. Luther Denkmal
     * @param category     The category ids. e.g. 1
     * @param lat          The latitude where the user currently is. e.g. 51.534534
     * @param searchRadius The radius in meters where the pois should be in range. e.g. 5300
     */
    @GET
    @Produces({
            "application/json"
    })
    GetPoisResponse getPois(
            @QueryParam("lat")
            BigDecimal lat,
            @QueryParam("lgt")
            BigDecimal lgt,
            @QueryParam("search_radius")
            BigDecimal searchRadius,
            @QueryParam("category")
            BigDecimal category,
            @QueryParam("name")
            String name)
            throws Exception
    ;

    /**
     * Get the poi with poiId = {poiId}
     *
     * @param poiId
     */
    @GET
    @Path("{poi_id}")
    @Produces({
            "application/json"
    })
    GetPoisByPoiIdResponse getPoisByPoiId(
            @PathParam("poi_id")
            String poiId)
            throws Exception
    ;

    /**
     * Get a list of images for the current poi.
     *
     * @param size  Specifies the size of the images. web, web_retina,mobile, mobile-retina, ipad, ipad_retina, original
     * @param poiId
     * @param type  The type of the image file to be sent. file,base64, URL
     */
    @GET
    @Path("{poi_id}/images")
    @Produces({
            "application/json"
    })
    GetPoisByPoiIdImagesResponse getPoisByPoiIdImages(
            @PathParam("poi_id")
            String poiId,
            @QueryParam("size")
            String size,
            @QueryParam("type")
            String type)
            throws Exception
    ;

    /**
     * @param poiId
     */
    @GET
    @Path("{poi_id}/ratings")
    @Produces({
            "application/json"
    })
    GetPoisByPoiIdRatingsResponse getPoisByPoiIdRatings(
            @PathParam("poi_id")
            String poiId)
            throws Exception
    ;

    /**
     * @param poiId
     */
    @GET
    @Path("{poi_id}/openings")
    @Produces({
            "application/json"
    })
    GetPoisByPoiIdOpeningsResponse getPoisByPoiIdOpenings(
            @PathParam("poi_id")
            String poiId)
            throws Exception
    ;

    /**
     * @param poiId
     */
    @GET
    @Path("{poi_id}/tickets")
    @Produces({
            "application/json"
    })
    GetPoisByPoiIdTicketsResponse getPoisByPoiIdTickets(
            @PathParam("poi_id")
            String poiId)
            throws Exception
    ;

    public class GetPoisByPoiIdImagesResponse extends ResponseWrapper {


        private GetPoisByPoiIdImagesResponse(Response delegate) {
            super(delegate);
        }

        /**
         * e.g. [
         * <p>
         * {
         * <p>
         * "id" : 0,
         * <p>
         * "url": "http://www.luneyco.com/images/example1.jpg",
         * <p>
         * "name" : "Image1"
         * <p>
         * },
         * <p>
         * {
         * <p>
         * "id" : 0,
         * <p>
         * "url": "http://www.luneyco.com/images/example2.jpg",
         * <p>
         * "name" : "Image2"
         * <p>
         * },
         * <p>
         * ]
         *
         * @param entity [
         *               <p>
         *               {
         *               <p>
         *               "id" : 0,
         *               <p>
         *               "url": "http://www.luneyco.com/images/example1.jpg",
         *               <p>
         *               "name" : "Image1"
         *               <p>
         *               },
         *               <p>
         *               {
         *               <p>
         *               "id" : 0,
         *               <p>
         *               "url": "http://www.luneyco.com/images/example2.jpg",
         *               <p>
         *               "name" : "Image2"
         *               <p>
         *               },
         *               <p>
         *               ]
         */
        public static GetPoisByPoiIdImagesResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPoisByPoiIdImagesResponse(responseBuilder.build());
        }

        /**
         * e.g. {"message": "No images were found!"}
         *
         * @param entity {"message": "No images were found!"}
         */
        public static GetPoisByPoiIdImagesResponse withJsonNotFound(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPoisByPoiIdImagesResponse(responseBuilder.build());
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

    public class GetPoisByPoiIdOpeningsResponse
            extends ResponseWrapper {


        private GetPoisByPoiIdOpeningsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * e.g. [
         * <p>
         * {
         * <p>
         * "day" : 0,
         * <p>
         * "time_begin" : "0000-01-01T08:00+00:00",
         * <p>
         * "time_end" : "0000-01-01T18:00+00:00",
         * <p>
         * "comment" : "ISO 8601 Date in UTC time with year 0000. Day 0 is Monday and Day 6 is Sunday",
         * <p>
         * },
         * <p>
         * {
         * <p>
         * "day" : 1,
         * <p>
         * "time_begin" : "0000-01-01T08:00+00:00",
         * <p>
         * "time_end" : "0000-01-01T18:00+00:00",
         * <p>
         * "comment" : "ISO 8601 Date in UTC time with year 0000. Day 0 is Monday and Day 6 is Sunday",
         * <p>
         * }
         * <p>
         * ]
         *
         * @param entity [
         *               <p>
         *               {
         *               <p>
         *               "day" : 0,
         *               <p>
         *               "time_begin" : "0000-01-01T08:00+00:00",
         *               <p>
         *               "time_end" : "0000-01-01T18:00+00:00",
         *               <p>
         *               "comment" : "ISO 8601 Date in UTC time with year 0000. Day 0 is Monday and Day 6 is Sunday",
         *               <p>
         *               },
         *               <p>
         *               {
         *               <p>
         *               "day" : 1,
         *               <p>
         *               "time_begin" : "0000-01-01T08:00+00:00",
         *               <p>
         *               "time_end" : "0000-01-01T18:00+00:00",
         *               <p>
         *               "comment" : "ISO 8601 Date in UTC time with year 0000. Day 0 is Monday and Day 6 is Sunday",
         *               <p>
         *               }
         *               <p>
         *               ]
         */
        public static GetPoisByPoiIdOpeningsResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPoisByPoiIdOpeningsResponse(responseBuilder.build());
        }

        /**
         * e.g. {"message": "No openings were found!"}
         *
         * @param entity {"message": "No openings were found!"}
         */
        public static GetPoisByPoiIdOpeningsResponse withJsonNotFound(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPoisByPoiIdOpeningsResponse(responseBuilder.build());
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

    public class GetPoisByPoiIdRatingsResponse extends ResponseWrapper {


        private GetPoisByPoiIdRatingsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * e.g. [
         * <p>
         * {
         * <p>
         * "id": "a29ba433-5654-4018-a6f4-c5af25cb3c82",
         * <p>
         * "title": "Awesome",
         * <p>
         * "text": "Wow this was so great in this house!",
         * <p>
         * "overall_rating": 0.8,
         * <p>
         * "rating_factors": [
         * <p>
         * {
         * <p>
         * "id": "eaaae98f-004e-442d-958e-4aaa7261471d",
         * <p>
         * "criteria": "location",
         * <p>
         * "rating": 0.9,
         * <p>
         * "distribution": [
         * <p>
         * {
         * <p>
         * "rating_nr": 1,
         * <p>
         * "count" : 10
         * <p>
         * },
         * <p>
         * {
         * <p>
         * "rating_nr": 2,
         * <p>
         * "count" : 10
         * <p>
         * },
         * <p>
         * {
         * <p>
         * "rating_nr": 3,
         * <p>
         * "count" : 10
         * <p>
         * },
         * <p>
         * {
         * <p>
         * "rating_nr": 4,
         * <p>
         * "count" : 10
         * <p>
         * },
         * <p>
         * {
         * <p>
         * "rating_nr": 5,
         * <p>
         * "count" : 12
         * <p>
         * }
         * <p>
         * ]
         * <p>
         * }
         * <p>
         * ]
         * <p>
         * }
         * <p>
         * ]
         *
         * @param entity [
         *               <p>
         *               {
         *               <p>
         *               "id": "a29ba433-5654-4018-a6f4-c5af25cb3c82",
         *               <p>
         *               "title": "Awesome",
         *               <p>
         *               "text": "Wow this was so great in this house!",
         *               <p>
         *               "overall_rating": 0.8,
         *               <p>
         *               "rating_factors": [
         *               <p>
         *               {
         *               <p>
         *               "id": "eaaae98f-004e-442d-958e-4aaa7261471d",
         *               <p>
         *               "criteria": "location",
         *               <p>
         *               "rating": 0.9,
         *               <p>
         *               "distribution": [
         *               <p>
         *               {
         *               <p>
         *               "rating_nr": 1,
         *               <p>
         *               "count" : 10
         *               <p>
         *               },
         *               <p>
         *               {
         *               <p>
         *               "rating_nr": 2,
         *               <p>
         *               "count" : 10
         *               <p>
         *               },
         *               <p>
         *               {
         *               <p>
         *               "rating_nr": 3,
         *               <p>
         *               "count" : 10
         *               <p>
         *               },
         *               <p>
         *               {
         *               <p>
         *               "rating_nr": 4,
         *               <p>
         *               "count" : 10
         *               <p>
         *               },
         *               <p>
         *               {
         *               <p>
         *               "rating_nr": 5,
         *               <p>
         *               "count" : 12
         *               <p>
         *               }
         *               <p>
         *               ]
         *               <p>
         *               }
         *               <p>
         *               ]
         *               <p>
         *               }
         *               <p>
         *               ]
         */
        public static GetPoisByPoiIdRatingsResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPoisByPoiIdRatingsResponse(responseBuilder.build());
        }

        /**
         * e.g. {"message": "No ratings were found!"}
         *
         * @param entity {"message": "No ratings were found!"}
         */
        public static GetPoisByPoiIdRatingsResponse withJsonNotFound(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPoisByPoiIdRatingsResponse(responseBuilder.build());
        }

        @Override
        public Response.StatusType getStatusInfo() {
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

    public class GetPoisByPoiIdResponse extends ResponseWrapper {


        private GetPoisByPoiIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * e.g. {
         * <p>
         * "id" : "33c583ae-88ed-409d-9f07-e77bc34ea6cc",
         * <p>
         * "name" : "Martin Luther Denkmal",
         * <p>
         * "position": {
         * <p>
         * "lgt": 11.534534,
         * <p>
         * "lat": 51.534534
         * <p>
         * },
         * <p>
         * "tags" : [
         * <p>
         * {
         * <p>
         * "id" : "acbbb8ae-cffd-467a-a63d-5b9ac2b23a8d",
         * <p>
         * "name" : "denkmal"
         * <p>
         * },
         * <p>
         * {
         * <p>
         * "id" : "43a3cde5-9d8b-42c0-8371-08e148ebbb19",
         * <p>
         * "name" : "Luther"
         * <p>
         * }
         * <p>
         * ],
         * <p>
         * "front_image" : {
         * <p>
         * "id" : "802fc23c-c996-43b8-b285-f8a44fe67017",
         * <p>
         * "image_url" : "/images/image1.png",
         * <p>
         * "title" : "Luther Denkmal bei Tag"
         * <p>
         * }
         * <p>
         * }
         *
         * @param entity {
         *               <p>
         *               "id" : "33c583ae-88ed-409d-9f07-e77bc34ea6cc",
         *               <p>
         *               "name" : "Martin Luther Denkmal",
         *               <p>
         *               "position": {
         *               <p>
         *               "lgt": 11.534534,
         *               <p>
         *               "lat": 51.534534
         *               <p>
         *               },
         *               <p>
         *               "tags" : [
         *               <p>
         *               {
         *               <p>
         *               "id" : "acbbb8ae-cffd-467a-a63d-5b9ac2b23a8d",
         *               <p>
         *               "name" : "denkmal"
         *               <p>
         *               },
         *               <p>
         *               {
         *               <p>
         *               "id" : "43a3cde5-9d8b-42c0-8371-08e148ebbb19",
         *               <p>
         *               "name" : "Luther"
         *               <p>
         *               }
         *               <p>
         *               ],
         *               <p>
         *               "front_image" : {
         *               <p>
         *               "id" : "802fc23c-c996-43b8-b285-f8a44fe67017",
         *               <p>
         *               "image_url" : "/images/image1.png",
         *               <p>
         *               "title" : "Luther Denkmal bei Tag"
         *               <p>
         *               }
         *               <p>
         *               }
         */
        public static GetPoisByPoiIdResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPoisByPoiIdResponse(responseBuilder.build());
        }

        /**
         * e.g. {"message": "No poi was found!"}
         *
         * @param entity {"message": "No poi was found!"}
         */
        public static GetPoisByPoiIdResponse withJsonNotFound(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPoisByPoiIdResponse(responseBuilder.build());
        }

        @Override
        public Response.StatusType getStatusInfo() {
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

    public class GetPoisByPoiIdTicketsResponse extends ResponseWrapper {


        private GetPoisByPoiIdTicketsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * e.g. [
         * <p>
         * {
         * <p>
         * "type":
         * <p>
         * {
         * <p>
         * "id" : 0,
         * <p>
         * "name": "Einzelticket",
         * <p>
         * "persons": 1
         * <p>
         * },
         * <p>
         * "price": 10.5,
         * <p>
         * "price_cc" : 978,
         * <p>
         * "comment": "ISO code"
         * <p>
         * }
         * <p>
         * ]
         *
         * @param entity [
         *               <p>
         *               {
         *               <p>
         *               "type":
         *               <p>
         *               {
         *               <p>
         *               "id" : 0,
         *               <p>
         *               "name": "Einzelticket",
         *               <p>
         *               "persons": 1
         *               <p>
         *               },
         *               <p>
         *               "price": 10.5,
         *               <p>
         *               "price_cc" : 978,
         *               <p>
         *               "comment": "ISO code"
         *               <p>
         *               }
         *               <p>
         *               ]
         */
        public static GetPoisByPoiIdTicketsResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPoisByPoiIdTicketsResponse(responseBuilder.build());
        }

        /**
         * e.g. {"message": "No tickets were found!"}
         *
         * @param entity {"message": "No tickets were found!"}
         */
        public static GetPoisByPoiIdTicketsResponse withJsonNotFound(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPoisByPoiIdTicketsResponse(responseBuilder.build());
        }

        @Override
        public Response.StatusType getStatusInfo() {
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

    public class GetPoisResponse extends ResponseWrapper {

        private GetPoisResponse(Response delegate) {
            super(delegate);
        }

        /**
         * e.g. [
         * <p>
         * {
         * <p>
         * "id" : "33c583ae-88ed-409d-9f07-e77bc34ea6cc",
         * <p>
         * "name" : "Martin Luther Denkmal",
         * <p>
         * "polygons": [{
         * <p>
         * "lgt": 11.534534,
         * <p>
         * "lat": 51.534534
         * <p>
         * }],
         * <p>
         * "tags" : [
         * <p>
         * {
         * <p>
         * "id" : "acbbb8ae-cffd-467a-a63d-5b9ac2b23a8d",
         * <p>
         * "name" : "denkmal"
         * <p>
         * },
         * <p>
         * {
         * <p>
         * "id" : "43a3cde5-9d8b-42c0-8371-08e148ebbb19",
         * <p>
         * "name" : "Luther"
         * <p>
         * }
         * <p>
         * ],
         * <p>
         * "front_image" : {
         * <p>
         * "id" : "802fc23c-c996-43b8-b285-f8a44fe67017",
         * <p>
         * "image_url" : "/images/image1.png",
         * <p>
         * "title" : "Luther Denkmal bei Tag"
         * <p>
         * }
         * <p>
         * },
         * <p>
         * {
         * <p>
         * "id" : "ac292f47-1d73-46f9-ad70-741a3a129399",
         * <p>
         * "name" : "Anger 1",
         * <p>
         * "polygons": [{
         * <p>
         * "lgt": 11.534534,
         * <p>
         * "lat": 51.534534
         * <p>
         * }],
         * <p>
         * "tags" : [
         * <p>
         * {
         * <p>
         * "id" : "ca78143a-2a53-4fe4-8527-d057c0b7585e",
         * <p>
         * "name" : "Shopping"
         * <p>
         * },
         * <p>
         * {
         * <p>
         * "id" : "555193c3-a364-4b78-8596-462e60a0a3e4",
         * <p>
         * "name" : "Erfurt"
         * <p>
         * }
         * <p>
         * ],
         * <p>
         * "front_image" : {
         * <p>
         * "id" : "802fc23c-c996-43b8-b285-f8a44fe67017",
         * <p>
         * "image_url" : "/images/image1.png",
         * <p>
         * "title" : "Luther Denkmal bei Tag"
         * <p>
         * }
         * <p>
         * }]
         *
         * @param entity [
         *               <p>
         *               {
         *               <p>
         *               "id" : "33c583ae-88ed-409d-9f07-e77bc34ea6cc",
         *               <p>
         *               "name" : "Martin Luther Denkmal",
         *               <p>
         *               "polygons": [{
         *               <p>
         *               "lgt": 11.534534,
         *               <p>
         *               "lat": 51.534534
         *               <p>
         *               }],
         *               <p>
         *               "tags" : [
         *               <p>
         *               {
         *               <p>
         *               "id" : "acbbb8ae-cffd-467a-a63d-5b9ac2b23a8d",
         *               <p>
         *               "name" : "denkmal"
         *               <p>
         *               },
         *               <p>
         *               {
         *               <p>
         *               "id" : "43a3cde5-9d8b-42c0-8371-08e148ebbb19",
         *               <p>
         *               "name" : "Luther"
         *               <p>
         *               }
         *               <p>
         *               ],
         *               <p>
         *               "front_image" : {
         *               <p>
         *               "id" : "802fc23c-c996-43b8-b285-f8a44fe67017",
         *               <p>
         *               "image_url" : "/images/image1.png",
         *               <p>
         *               "title" : "Luther Denkmal bei Tag"
         *               <p>
         *               }
         *               <p>
         *               },
         *               <p>
         *               {
         *               <p>
         *               "id" : "ac292f47-1d73-46f9-ad70-741a3a129399",
         *               <p>
         *               "name" : "Anger 1",
         *               <p>
         *               "polygons": [{
         *               <p>
         *               "lgt": 11.534534,
         *               <p>
         *               "lat": 51.534534
         *               <p>
         *               }],
         *               <p>
         *               "tags" : [
         *               <p>
         *               {
         *               <p>
         *               "id" : "ca78143a-2a53-4fe4-8527-d057c0b7585e",
         *               <p>
         *               "name" : "Shopping"
         *               <p>
         *               },
         *               <p>
         *               {
         *               <p>
         *               "id" : "555193c3-a364-4b78-8596-462e60a0a3e4",
         *               <p>
         *               "name" : "Erfurt"
         *               <p>
         *               }
         *               <p>
         *               ],
         *               <p>
         *               "front_image" : {
         *               <p>
         *               "id" : "802fc23c-c996-43b8-b285-f8a44fe67017",
         *               <p>
         *               "image_url" : "/images/image1.png",
         *               <p>
         *               "title" : "Luther Denkmal bei Tag"
         *               <p>
         *               }
         *               <p>
         *               }]
         */
        public static GetPoisResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPoisResponse(responseBuilder.build());
        }

        /**
         * e.g. {"message": "No pois were found!"}
         *
         * @param entity {"message": "No pois were found!"}
         */
        public static GetPoisResponse withJsonNotFound(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPoisResponse(responseBuilder.build());
        }


        @Override
        public Response.StatusType getStatusInfo() {
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
