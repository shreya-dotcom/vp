package com.target.Volunteeringplatform.Service;




import com.target.Volunteeringplatform.DAO.ProfileRepository;
import com.target.Volunteeringplatform.DAO.UserRepository;
import com.target.Volunteeringplatform.model.Profile;
//import com.target.VolunteeringPlatform.model.Role;
import com.target.Volunteeringplatform.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;





public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	ProfileRepository profileRepository;

	public ProfileRepository getProfileRepository() {
		return profileRepository;
	}

	public void setProfileRepository(ProfileRepository profileRepository) {
		this.profileRepository = profileRepository;
	}

	public void saveUser(User user) {
		user.setActive(1);
		user.setRole("USER");
		userRepository.save(user);
	}

	public void saveProfile(Profile profile,String email) {

		User user = userRepository.findByEmail(email);
		System.out.println(user);
		profileRepository.save(profile);
		user.setProfile(profile);

	}

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(email);
		System.out.println(user);
		if (user == null){
			throw new UsernameNotFoundException("Invalid username or password."+email);
		}
		return UserDetailsImpl.build(user);
	}


}








