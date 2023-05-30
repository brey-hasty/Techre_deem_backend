package org.skillgrowth.techre_deem_backend;

import org.springframework.data.repository.CrudRepository;
import org.skillgrowth.techre_deem_backend.entity.Item;

public interface repository extends CrudRepository<Item, Integer>
 {

 }
