public class Box {
    int width;
	int length;
	int height;
	int volume;
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	public int getWidth()
	{
		return width;
	}
	public void setLength(int length)
	{
		this.length = length;
	}
	public int getLength()
	{
		return length;
	}
	public void setHeight(int height)
	{
		this.height = height;
	}
	public int getHeight()
	{
		return height;
	}
	
	public void getVolume()
	{
		volume = this.width * this.length * this.height;
		System.out.println(volume);
	}
	
	public String toStrng()
	{
		return volume + "";
	}
}
