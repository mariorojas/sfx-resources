package com.sfinx.oauth.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sfinx.pdmm.oauth.domain.User;

/**
 * Repositorio para persistencia de usuarios
 * 
 * @author marojas
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
	
	/**
	 * Obtiene un usuario en base a su nombre
	 * @param username					Nombre de usuario
	 * @return							Usuario
	 */
	public User findOneByUsername(String username);

}
