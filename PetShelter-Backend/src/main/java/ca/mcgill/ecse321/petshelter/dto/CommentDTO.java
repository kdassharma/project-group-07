package ca.mcgill.ecse321.petshelter.dto;

import ca.mcgill.ecse321.petshelter.model.*;

import java.sql.Date;

public class CommentDTO {
	
	//Comment Attributes
	private Integer Id;
	private Date date;
	private Profile profile;
	private PostingDTO posting;
	private String content;
	
	//Constructor
	public CommentDTO(Integer Id, Date date, Profile profile, PostingDTO posting, String content) {
		this.Id = Id;
		this.date = date;
		this.profile = profile;
		this.posting = posting;
		this.content = content;
	}
	
	//Getters and Setters
	
	public void setId(Integer Id) {
		this.Id = Id;
	}
	
	public Integer getId() {
		return this.Id;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	public Profile getProfile() {
		return this.profile;
	}
	
	public void setPosting(PostingDTO posting) {
		this.posting = posting;
	}
	
	public PostingDTO getPosting() {
		return this.posting;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return this.content;
	}
}
