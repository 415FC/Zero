package com.example.Zero.entity.comment;

import java.sql.Date;

import com.example.Zero.entity.member.Member;
import com.example.Zero.entity.post.Post;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comment_id")
	private Long commentId;

	@ManyToOne(targetEntity = Member.class)
	@JoinColumn(name = "member_id", referencedColumnName = "member_id")
	private Long memberId;

	@ManyToOne(targetEntity = Post.class)
	@JoinColumn(name = "post_id", referencedColumnName = "post_id")
	private Long postId;

	@Column(name = "comment_content")
	private String commentContent;

	@Column(name = "created_at")
	private Date createdAt;
	
	@Column(name = "updated_at")
	private Date updatedAt;
	
	@Column(name = "is_deleted")
	private char isDeleted;
}
