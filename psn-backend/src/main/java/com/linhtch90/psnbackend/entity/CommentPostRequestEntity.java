package com.linhtch90.psnbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentPostRequestEntity {
    private CommentEntity commentEntity;
    private IdObjectEntity postId;
    
	public CommentEntity getCommentEntity() {
		return commentEntity;
	}
	public void setCommentEntity(CommentEntity commentEntity) {
		this.commentEntity = commentEntity;
	}
	public IdObjectEntity getPostId() {
		return postId;
	}
	public void setPostId(IdObjectEntity postId) {
		this.postId = postId;
	}
	public CommentPostRequestEntity(CommentEntity commentEntity, IdObjectEntity postId) {
		super();
		this.commentEntity = commentEntity;
		this.postId = postId;
	}
	public CommentPostRequestEntity() {
		
	}
    
}
