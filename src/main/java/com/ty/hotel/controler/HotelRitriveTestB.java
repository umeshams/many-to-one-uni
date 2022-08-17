package com.ty.hotel.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.hotel.dto.Room1;

public class HotelRitriveTestB {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	   Room1 room1=  entityManager.find(Room1.class, 3);
	
	System.out.println("id is :"+room1.getId());
	System.out.println("type is :"+room1.getType());
	System.out.println("capacity is :"+room1.getCapacity());
	
	System.out.println("hotel name is :"+room1.getHotel().getName());
	System.out.println("hotel adress is :"+room1.getHotel().getAddress());
	   
}
}
