package com.SemTaskWZRZNC.project.carswebapp.service;

import com.SemTaskWZRZNC.project.carswebapp.domain.entity.EntityUser;
import com.SemTaskWZRZNC.project.carswebapp.domain.repository.IUserRepository;
import com.SemTaskWZRZNC.project.carswebapp.security.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
        EntityUser user = userRepository.findByEmail(userEmail).orElseThrow(() ->
                new UsernameNotFoundException("Not found " + userEmail));
        return new UserDetailsImpl(user);
    }
}
