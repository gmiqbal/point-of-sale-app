package com.gmiqbal.pos.repos;

import com.gmiqbal.pos.entities.MasterCategory;
import com.gmiqbal.pos.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterCategoryRepo extends JpaRepository<MasterCategory, Integer> {
}
