package cn.haohaowo.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookControl 
{
	private Map<Integer,Book> map = new HashMap<Integer,Book>();
	
	public void insert(Book book)
	{
		map.put(book.getId(), book);
	}
	
	@SuppressWarnings("unchecked")
	public List<Book> select()
	{
		List<Book> book = new ArrayList<Book>();
		book.addAll((Collection<? extends Book>) map.entrySet());
		return book;
	}
	public void update(Book book)
	{
		map.put(book.getId(), book);
	}
	public void delete(Book book)
	{
		map.remove(book);
	}
	
}
