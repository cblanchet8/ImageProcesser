import java.io.IOException;

/**
 * A model for an Image Processor. An Image Processor offers multiple ways to alter an image and
 * produce a new image as a result of that alteration.
 */
public interface ImageProcessorModel {

  /**
   * Read an image from file and load it in this ImageProcessor.
   * @param filename the filename of the image to load
   * @throws IOException if a file with the given name does not exist.
   */
  void loadImage(String filename) throws IOException;

  /**
   * Write an image to file.
   * @param image the image to write to file.
   * @param filename the string to name the new file.
   * @throws IOException if the file fails to successfully write.
   */
  void saveImage(Image image, String filename) throws IOException;

  /**
   * Apply a blur filter the base Image loaded in this ImageProcessor and return a new image.
   * This does not alter the base image.
   * @return the new image that is a blurred version of the base image.
   */
  Image imageFilterBlur();

  /**
   * Take in an image and apply a blur filter to it. This returns a new image with the blur filter
   * applied to it and does not alter the given image.
   * @param image the image to apply the blur filter to.
   * @return the new image that is a blurred version of the given image.
   */
  Image imageFilterBlur(Image image);

  /**
   * Apply a sharpen filter to the base Image loaded in this ImageProcessor and return a new image.
   * This does not alter the base image.
   * @return the new image that is a sharpened version of the base image.
   */
  Image imageFilterSharpen();

  /**
   * Take in an image and apply a sharpen filter to it. This returns a new image with the sharpen
   * filter applied to it and does not alter the given image.
   * @param image the image to apply a sharpen filter to.
   * @return the new image that is a sharpened version of the given image.
   */
  Image imageFilterSharpen(Image image);

  //TODO Implement Image Generation. This is separate from altering the loaded image, and will
  // instead generate a new image from code. This should probably be in a separate "ImageGenerator"
  // class, since it is different from altering/processing an image and we want to ensure that
  // each class enforces the "1 job per class" rule.
}
