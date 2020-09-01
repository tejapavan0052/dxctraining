package com.product.service;

import com.product.dao.productsdao;
import com.product.deletion.proud;
import com.product.model.products;

public class ProductService {
	public static void main(String[] args) {

		products product=new products(4,115,"light","avail");

		productsdao dao=new productsdao();
		proud pao=new proud();
		//System.out.println(dao.createproducts(product));
		System.out.println(pao.deleteproductsByP_num(112));

		}

		}


