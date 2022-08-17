package com.ty.hotel.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.hotel.dto.Review;
import com.ty.hotel.dto.Room1;

public class ProductRetrive {

	public static void main(String[] args) {
		
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	  Review review=  entityManager.find(Review.class, 3);

	  System.out.println("id is :"+review.getId());
	  System.out.println("userName is:"+review.getUserName());
	  System.out.println("discription is :"+review.getDescription());
	  System.out.println("product name :"+review.getProduct().getName());
	  System.out.println("product brand :"+review.getProduct().getBrand());
	  System.out.println("product cost :"+review.getProduct().getCost());
	  
	}   
}
