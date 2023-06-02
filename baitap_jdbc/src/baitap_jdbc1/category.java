package baitap_jdbc1;

public class category {
 private int id;
 private char name;
 
public category() {
	super();
	// TODO Auto-generated constructor stub
}

public category(int id, char name) {
	super();
	this.id = id;
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public char getName() {
	return name;
}

public void setName(char name) {
	this.name = name;
}
	
}
