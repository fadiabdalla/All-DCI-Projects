package multi_threaded_production_line_exercise;

public class Worker implements Runnable{
	
	private String name;
	ProductionLine pl = new ProductionLine();

	public Worker(String name) {

		this.name = name;
	}

	public void tasks() {
		pl.producePart(name);
		pl.assembleProduct(name);
		
	}
	@Override
	public void run() {

		tasks();
		
		
	}
	

}
