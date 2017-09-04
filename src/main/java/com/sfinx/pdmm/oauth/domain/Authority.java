package com.sfinx.pdmm.oauth.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

import org.springframework.security.core.GrantedAuthority;

/**
 * Entidad para persistencia de roles
 * 
 * @author marojas
 *
 */
@Data
@Entity
@Table(name = "authorities")
public class Authority implements GrantedAuthority {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String authority;

	@Override
	public String getAuthority() {
		return authority;
	}

}
