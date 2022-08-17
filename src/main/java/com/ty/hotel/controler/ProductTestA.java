package com.ty.hotel.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hotel.dto.Product;
import com.ty.hotel.dto.Review;

public class ProductTestA {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	
	
	
	Product product=new Product();
	product.setName("mobile");
	product.setCost(150000);
	product.setBrand("samsung");
	
	Review review=new Review();
	review.setUserName("manu123");
	review.setDescription("good productes");
	review.setProduct(product);
	
	Review review1=new Review();
	review1.setUserName("gopi321");
	review1.setDescription("not good");
	review1.setProduct(product);
	
	Review review2=new Review();
	review2.setUserName("raju876");
	review2.setDescription("not bad");
	review2.setProduct(product);
	
	entityTransaction.begin();
	entityManager.persist(product);
	entityManager.persist(review);
	entityManager.persist(review1);
	entityManager.persist(review2);
	entityTransaction.commit();
	System.out.println("----------data stored-----------");
	
	
	
}
}
