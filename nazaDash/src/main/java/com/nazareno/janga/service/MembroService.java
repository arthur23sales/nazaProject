package com.nazareno.janga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nazareno.janga.repository.MemberRepository;

@Service
public class MembroService {

	@Autowired
	private MemberRepository memberRepository;
	
	
		
}
