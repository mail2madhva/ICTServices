package com.ictservices.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.ictservices.model.Node;


@RestController
@EnableWebMvc
public class ICTRestServicesOne {
	
	
	@RequestMapping(value= "/nodes", method = RequestMethod.GET)
	@ResponseBody
	public Node getNodes() {
		 return createNodes(6);
	}
	
	@RequestMapping(value= "/nodes/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Node getNodes(@PathVariable("id") int id) {
		int i = 20;
		if(id < 20) {
			i = id;
		}
		 return createNodes(i);
	}
	
	private Node createNodes(int level) {
		
		if(level <= 0)
			return null;
		
		Node node = new Node("Level"+level, 40);
		Node parentNode1 = createNodes(level-1);
		Node parentNode2 = createNodes(level-2);
		Node parentNode3 = createNodes(level-3);
		if (parentNode1 != null) {
			node.addChild(parentNode1);
		}
		if (parentNode2 != null) {
			node.addChild(parentNode2);
		}
		if (parentNode3 != null) {
			node.addChild(parentNode3);
		}
		
		return node;
	}
	

}
