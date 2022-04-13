/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package springSecurity.springSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springSecurity.springSecurity.model.Users;

/**
 *
 * @author tiagolopes
 */
@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{

    public Users findByLogin(String login);
    
}
