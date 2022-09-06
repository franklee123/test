package com.fstop.test.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.fstop.test.entity.User;
import com.fstop.test.service.exampleService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/example")
@Slf4j
public class ExampleController {
	@Autowired
	exampleService examS;
	private String message = "Pages";
	@GetMapping("/test")
	public String index(Map<String, Object> model) {
		log.info("TEST controller");
		this.message="新增資料";
		model.put("message", this.message);
		return "test";
	}
	
	@PostMapping("/confirm")
    public String confirm(@RequestParam Map<String, Object> a,Map<String, Object>model){
		log.info("confirm");
		this.message="確定要新增嗎";
		model.put("message", this.message);
		model.put("id", a.get("id"));
		model.put("name", a.get("name"));
        return "confirm";
    }

	@PostMapping("/result")
	public String saveUser(@RequestParam Map<String, Object> a, Map<String, Object> model) {
		log.info("result");
		this.message = "成功";
		User tx = new User((String) a.get("id"), (String) a.get("name"));	
		examS.createUser(tx);
		List<User> list = examS.getUserList();
		model.put("message", this.message);
		model.put("list", list);
		return "result";
	}
	
	@PostMapping("/search")
	public String search(@RequestParam Map<String, Object> a, Map<String, Object> model) {
		log.info("search");
		List<User> list = examS.getUserList();
		model.put("list", list);
		return "search";
	}
	
	@PostMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") String id, Map<String, Object> model) {
		log.info("delete");
		examS.deleteUser(id);
		List<User> list = examS.getUserList();
		model.put("list", list);
		return "search";
	}
	
	@PostMapping("/update/{id}")
	public String updateUser(@PathVariable("id") String id, Map<String, Object> model) {
		log.info("update");
		User list = examS.getUserById(id);
		model.put("id", list.getId());
		model.put("name", list.getName());
		return "update";
	}
	
	@PostMapping("/exUpdate")
	public String exUpdate(@RequestParam Map<String, Object> a, Map<String, Object> model) {
		log.info("exUpdate");
		User tx = new User((String) a.get("id"), (String) a.get("name"));
		examS.upDateUser(tx);
		List<User> list = examS.getUserList();
		model.put("list", list);
		return "search";
}
	@PostMapping("/search1")
	public String search1(@RequestParam Map<String, Object> a, Map<String, Object> model) {
		log.info("search1");
		log.info((String)a.get("id"));
		log.info((String)a.get("name"));	
		User list = examS.getUserById((String)a.get("id"));
		model.put("id", list.getId());
		model.put("name", list.getName());
		return "search1";
}
}
