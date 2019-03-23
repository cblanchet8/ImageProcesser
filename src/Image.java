/**
 * This class represents an image. An image holds the height and width of said image, and
 * contains methods for getting their values. It also stores the RGB values for every pixel in the
 * image, and contains a method for getting that data as well.
 */
public class Image {

  /**
   * The RGB values for each pixel in this image.
   */
  private int[][][] imageRGB;

  /**
   * The height of this image.
   */
  private int height;

  /**
   * The width of this image.
   */
  private int width;

  /**
   * Construct a new image with the given properties.
   * @param imageRGB the RGB values for each pixel of this new image.
   * @param height the height for this new image.
   * @param width the width for this new image.
   */
  public Image(int[][][] imageRGB, int height, int width) {
    this.imageRGB = imageRGB;
    this.height = height;
    this.width = width;
  }

  /**
   * Return this images height.
   * @return this images height.
   */
  public int getHeight() {
    return this.height;
  }

  /**
   * Return this images width.
   * @return this images width.
   */
  public int getWidth() {
    return this.width;
  }

  /**
   * Return an array that contains the RGB values for each pixel in this image.
   * @return an array that contains the RGB values for each pixel in this image.
   */
  public int[][][] getImageRGB() {
    return this.imageRGB;
  }
}
