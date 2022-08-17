package com.ty.hotel.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hotel.dto.Hotel;
import com.ty.hotel.dto.Room1;

public class HotelTestA {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Hotel hotel=new Hotel();
	hotel.setAddress("rajajinagra");
	hotel.setName("swathi");
	
	Room1 room1=new Room1();
	room1.setCapacity(3);
	room1.setType("Ac");
	room1.setHotel(hotel);
	
	Room1 room2=new Room1();
	room2.setCapacity(4);
	room2.setType("normal");
	room2.setHotel(hotel);
	
	Room1 room3=new Room1();
	room3.setCapacity(5);
	room3.setType("general");
	room3.setHotel(hotel);
	
	entityTransaction.begin();
	entityManager.persist(hotel);
	entityManager.persist(room1);
	entityManager.persist(room2);
	entityManager.persist(room3);
	entityTransaction.commit();
	System.out.println("-----data stored----------");
}
}
