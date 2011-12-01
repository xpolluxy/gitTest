package com.cnpc.hello;

import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class ItemList{
	
	private List<String> lists = null;
	
	public ItemList(){
		lists = new ArrayList<String>();
		
		lists.add("aaaaa");
		lists.add("bbbbb");
		lists.add("ccccc");
		lists.add("ddddd");
		lists.add("eeeee");
		System.out.println(this.display());
	}

	public List<String> getLists() {
		return lists;
	}

	public void setLists(List<String> lists) {
		this.lists = lists;
	}
	
	public String display(){
		String s = "";
		
		for(int i = 0; i < lists.size(); i ++){
			if(i != lists.size() - 1)
				s += i + 1 + ":" + lists.get(i) + "\n";
			else
				s += i + 1 + ":" + lists.get(i) + ";";
		}
		
		return s;
	}
}