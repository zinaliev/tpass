package com.genesys.tpass.api;

import com.genesys.tpass.api.dto.ApiResponseDto;
import com.genesys.tpass.api.dto.PasswordDto;
import com.genesys.tpass.api.dto.VerificationResultDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/password")
@Produces(MediaType.APPLICATION_JSON)
public class PasswordResource {

    /**
     * Generate password
     * @param userName user name (unique)
     * @param timeout timeout in seconds after which generated password expires
     * @return password to be used for verification
     */
    @GET
    @Path("/create")
    public ApiResponseDto<PasswordDto> create(@QueryParam("user") String userName, @QueryParam("timeout") Integer timeout ){
        return ApiResponseDto.notImplemented("/password/create");
    }

    /**
     * Verify user's password
     * @param userName user name (unique)
     * @param password password generated by /password/create method
     * @return whether verification:
     * has passed successfully - given password matches to specified user and isn't expired,
     * has failed - given password either doesn't match to specified user or has been expired
     */
    @GET
    @Path("/verify")
    public ApiResponseDto<VerificationResultDto> verify(@QueryParam("user") String userName, @QueryParam("pass") String password ){
        return ApiResponseDto.notImplemented("/password/verify");
    }
}