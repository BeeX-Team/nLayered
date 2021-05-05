package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		//�� Kodlar�...
		
		//Basit bir �rnek
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride �r�n kabul edilemez");
			return;
		}
		
		
		this.productDao.add(product);
		this.loggerService.logToSystem("�r�n logland�: "+product.getName());
		
	}

	@Override
	public List<Product> getAll() {
			
		return null;
	}

}
