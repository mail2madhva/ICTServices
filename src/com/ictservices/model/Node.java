package com.ictservices.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_EMPTY)
public class Node {
	
	String name;
	String detail;
	int value;
	
	List<Node> children = new ArrayList<Node>();
	
	public Node(String name, int value) {
		this.name = name;
		this.value = value;
		this.detail = "";
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public List<Node> getChildren() {
		return children;
	}

	public void addChild(Node child) {
		this.children.add(child);
	}

}
