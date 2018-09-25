package com.rongji.dubbo.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rongji.dto.UserDTO;

@Path("users")
public interface UserService {

	@GET
	@Path("getUser/{id}/{name}")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	UserDTO getUser(@PathParam("id") Long id,@PathParam("name") String name);
}