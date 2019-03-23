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
   * @throws IOException
   */
  @Override
  public void loadImage(String filename) throws IOException {
    int[][][] imageRGB = ImageUtil.readImage(filename);
    int height = ImageUtil.getHeight(filename);
    int width = ImageUtil.getWidth(filename);

    baseImage = new Image(imageRGB, height, width);
  }

  /**
   *
   * @param image
   * @param filename
   * @throws IOException
   */
  @Override
  public void saveImage(Image image, String filename) throws IOException {

  }

  @Override
  public Image imageFilterBlur() {
    return null;
  }

  @Override
  public Image imageFilterBlur(Image image) {
    return null;
  }

  @Override
  public Image imageFilterSharpen() {
    return null;
  }

  @Override
  public Image imageFilterSharpen(Image image) {
    return null;
  }
}
