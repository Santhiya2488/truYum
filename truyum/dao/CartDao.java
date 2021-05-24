package com.cognizant.truyum.dao;
import java.util.*;



public interface CartDao {
	public void addCartItem(long userId,long menuItemId);
	public ArrayList getAllCartItems(long userId) throws CartEmptyException;
	public void removeCartItem(long userId,long menuItemId);
}
