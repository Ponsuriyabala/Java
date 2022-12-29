package Arraylistexample;

import java.util.*;

public class Person {
	String name;
	int tam;
	int eng;
	int mat;
	void setall(int m1)
	{
		this.eng=m1;
		this.tam=m1;
		this.mat=m1;
	}
	Person getObject()
	{
		return this;
	}
	void init(String name,int m1,int m2,int m3)
	{
		this.name=name;
		this.eng=m2+5;
		this.tam=m1+5;
		this.mat=m3+5;
	}
	ArrayList getAll()
	{
		ArrayList details = new ArrayList();
		details.add(name);
		details.add(tam);
		details.add(eng);
		details.add(mat);
		return details;
	}

			
}
