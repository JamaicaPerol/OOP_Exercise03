public class Camera
{
	private String brand;
	private Lens lens;
	
	public Camera(String brand){
		this.brand=brand;
		lens=new Lens();
	}
	public void getBrand(String brand){
	this.brand=brand;
	}
	public String test(){
		return lens.testLens();
	}
}
