package com.rekha.hibernate.util;
import com.rekha.hibernate.dao.BottleDAO;
import com.rekha.hibernate.dto.BottleDTO;

public class Tester {

	public static void main(String[] args) 
	{
		BottleDTO bdto=new BottleDTO();
		bdto.setBid(1);
		bdto.setBrand("tupper ware");
		bdto.setPrice(100);
		bdto.setType("plastic");
		
		BottleDAO dao=new BottleDAO();
		dao.save(bdto);
	}
}
