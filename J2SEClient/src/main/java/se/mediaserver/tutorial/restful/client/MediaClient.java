package se.mediaserver.tutorial.restful.client;

import com.sun.jersey.api.client.UniformInterfaceException;
import se.mediaserver.tutorial.domain.Image;
import se.mediaserver.tutorial.domain.Media;
import se.mediaserver.tutorial.restful.util.RestfulImage;

/**
 *
 * @author ingimar
 */
public class MediaClient {

    public static void main(String args[]) throws UniformInterfaceException {
        System.out.println("Running MediaImageManager");
        createImage();
//      get();
//      update();

    }

    private static void createImage() throws UniformInterfaceException {
        RestfulImage restful = new RestfulImage();

        Media media = new Image();

        media.setFilename("spider.jpg");
        media.setOwner("inki");
        media.setVisibility("public");
        System.out.println("Media:Image " + media);
        restful.create_XML(media);
    }

//    private static void get() {
//        RestfulImage restful = new RestfulImage();
//
//        ClientResponse response = restful.findAll_XML(ClientResponse.class);
//
//        GenericType<List<Image>> genericType = new GenericType<List<Image>>() {
//        };
//
//        // Returns an ArrayList of Players from the web service
//        List<Image> images = new ArrayList<Image>();
//        images = (response.getEntity(genericType));
//        System.out.println("Retreiving and Displaying Players Details");
//        for (Image image : images) {
//            System.out.println("Filename: " + image.getFilename());
//            System.out.println(" Owner is: " + image.getOwner());
//
//        }
//    }
//
//    private static void update() {
//        RestfulImage restful = new RestfulImage();
//        ClientResponse response = restful.find_XML(ClientResponse.class, "3");
//        GenericType<Image> genericType = new GenericType<Image>() {
//        };
//        Image image = response.getEntity(genericType);
//        System.out.println("FirstName: " + image.getFilename());
//        image.setOwner("Erlingsson");
//        restful.edit_XML(image);
//    }
}
