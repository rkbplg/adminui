/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anz.adminui.repository;

import com.anz.adminui.domain.XeRates;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 631713
 */
@Repository
public interface XeRatesRepository extends CrudRepository<XeRates, Integer> {
    
    XeRates findBySrcAndTo(String src, String to);
    
}
