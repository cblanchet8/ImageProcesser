import java.io.IOException;

/**
 * Implementation for an ImageProcessorModel. An image process offers up various operators to
 * perform on an image. These include image filtering and color transformations. A base image is
 * stored, and new images are generated from that base image. The base image can be overwritten
 * by loading a new image file.
 */
public class ImageProcessorImpl implements ImageProcessorModel {

  /**
   * The base image loaded to this ImageProcessor. Calling loadImage will override this image.
   */
  private Image baseImage;

  /**
   * Read an image from file and load it into this ImageProcessor. This method makes use of the
   * ImageUtil class to correctly read an image from file. Calling loadImage will overwrite
   * baseImage and store the new image that is read from file.
   * @param filename the filename of the image to load
   * @throws IOException if a file with the given name cannot be found.
   */
  @Override
  public void loadImage(String filename) throws IOException {
    int[][][] imageRGB = ImageUtil.readImage(filename);
    int height = ImageUtil.getHeight(filename);
    int width = ImageUtil.getWidth(filename);

    baseImage = new Image(imageRGB, height, width);
  }

  /**
   * Write the given image to a new file. The file will be saved with the given filename.
   * @param image the image to save.
   * @param filename the name of the file to be saved as.
   * @throws IOException if the file fails to successfully write.
   */
  @Override
  public void saveImage(Image image, String filename) throws IOException {
    ImageUtil.writeImage(image.getImageRGB(), image.getWidth(), image.getHeight(), filename);
  }

  /**
   * 
   * @return
   * @throws IllegalStateException
   */
  @Override
  public Image filterImageBlur() throws IllegalStateException {
    if (baseImage == null) {
      throw new IllegalStateException("No base image loaded into Image Processor. Please load an" +
              "image before trying to apply a filter");
    }
    int[][] blurKernel;
    return filterImage(this.baseImage, blurKernel); //TODO implement blur kernel values from assignment.
  }

  @Override
  public Image filterImageBlur(Image image) {
    int[][] blurKernel;
    return filterImage(image, blurKernel); //TODO implement blur kernel values from assignment.
  }

  @Override
  public Image filterImageSharpen() throws IllegalStateException {
    if (baseImage == null) {
      throw new IllegalStateException("No base image loaded into Image Processor. Please load an" +
              "image before trying to apply a filter");
    }

    int[][] sharpenKernel;
    return filterImage(this.baseImage, sharpenKernel); //TODO implement sharpen kernel values from assignment.
  }

  @Override
  public Image filterImageSharpen(Image image) {
    int[][] sharpenKernel;
    return filterImage(image, sharpenKernel); //TODO implement sharpen kernel values from assignment.
  }

  private Image filterImage(Image image, int[][] kernel) {
    return null;
    //TODO Implement filtering here. Need to account for different kernel sizes, should
    // be generic for all filtering.
  }
}
