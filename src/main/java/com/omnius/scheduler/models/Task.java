package com.omnius.scheduler.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Data
@Entity
@Table(name = "tasks")
public class Task implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "created_at" ,nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createdat;
	@Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
	private Date updatedat;
	private Date duedate;
	private Date resolvedat;
	private Date remindat;
	
	private String title;
	private String description;
	private int priority;
	private int status;	
	
	public int getId() 
	{
		return id;
	}

}
