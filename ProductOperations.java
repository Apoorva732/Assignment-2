package com.project.cms;

import java.util.ArrayList;
import java.util.List;

public class ProductOperations {
	List<Product> prod=new ArrayList<>();
	public void addproduct(Product prods)
	{
		prod.add(prods);
	}
	public void removeproduct(String id)
	{
		if(prod.equals(id))
		{
			prod.remove(id);
		}
	}
	public List<Product> getallproducts(){
		return prod;
		
	}


}
