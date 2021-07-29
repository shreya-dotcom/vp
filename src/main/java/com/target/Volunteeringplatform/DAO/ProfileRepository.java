package com.target.Volunteeringplatform.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.target.Volunteeringplatform.model.Profile;

@Repository("profileRepository")
public interface ProfileRepository extends JpaRepository<Profile,Long>{

	  Profile findByEmail(String email);
}
