public class Image {

  private int[][][] imageRGB;
  private int height;
  private int width;

  public Image(int[][][] imageRGB, int height, int width) {
    this.imageRGB = imageRGB;
    this.height = height;
    this.width = width;
  }

  public int getHeight() {
    return this.height;
  }

  public int getWidth() {
    return this.width;
  }

  public int[][][] getImageRGB() {
    return this.imageRGB;
  }
}
