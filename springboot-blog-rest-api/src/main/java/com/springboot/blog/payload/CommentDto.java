package com.springboot.blog.payload;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
@Api(value = "Comment model information")
@Data
public class CommentDto {

    @ApiModelProperty(value = "comment id")
    private long id;

    @ApiModelProperty(value = "comment name")
    @NotEmpty(message = "Name should not be null or empty")
    private String name;

    @ApiModelProperty(value = "comment email")
    @NotEmpty(message = "Email should not be null or empty")
    @Email
    private String email;

    @NotEmpty
    @ApiModelProperty(value = "comment body")
    @Size(min = 10, message = "comment body must be minimum 10 characters")
    private String body;
}
