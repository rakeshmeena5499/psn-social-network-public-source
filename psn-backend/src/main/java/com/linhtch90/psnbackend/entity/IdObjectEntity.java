package com.linhtch90.psnbackend.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IdObjectEntity {
    private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public IdObjectEntity(String id) {
		super();
		this.id = id;
	}
	
	public IdObjectEntity() {
		
	}
    
}
