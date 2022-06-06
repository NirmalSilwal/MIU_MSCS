/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.cov1.dao;

import cs544.cov1.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author mzijlstra
 */
public interface ContactDao extends JpaRepository<Contact, Long>{
    
}
