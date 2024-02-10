package com.example.Zero.entity.member;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "member_id")
	private Long memberId;
	
	private String name;
	
	private String id;
	
	private String pw;
	
	private String nickname;
	
	private String email;
	
	@Column(name = "created_at")
	private Date createdAt;
	
	@Column(name = "created_at")
	private Date updatedAt;
	
	@Column(name = "is_deleted")
	private char isDeleted;
}
