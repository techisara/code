package com.te.productmangment.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Products implements Serializable{
@Id
private Integer pid;
private String pname;
private Date mgDate;
private Date exDate;
private Integer price;
private Integer quantity;
}
