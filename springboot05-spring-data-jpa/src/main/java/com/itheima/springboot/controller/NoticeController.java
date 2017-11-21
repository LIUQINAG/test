package com.itheima.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itheima.springboot.entity.Notice;
import com.itheima.springboot.service.NoticeService;

@RestController
public class NoticeController {

	@Autowired
	private NoticeService noticeService;

	@GetMapping("/findAll")
	public List<Notice> findAll() {
		return noticeService.findAll();
	}
}
