package com.springboot.blog.payload;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@ApiModel(description = "Post model information")
@Data
public class PostDto {

    @ApiModelProperty(value = "Blog post id")
    private long id;
    @ApiModelProperty(value = "Blog post title")
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;

    // post description should be not null or empty
    // post description should have at least 10 characters
    @ApiModelProperty(value = "Blog post description")
    @NotEmpty
    @Size(min = 10, message = "Post description should have at least 10 characters")
    private String description;

    // post content should not be null or empty
    @ApiModelProperty(value = "Blog post conent")
    @NotEmpty
    private String content;

    @ApiModelProperty(value = "Blog post comments")
    private Set<CommentDto> comments;
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Set<CommentDto> getComments() {
		return comments;
	}

	public void setComments(Set<CommentDto> comments) {
		this.comments = comments;
	}

	// title should not be null  or empty
    // title should have at least 2 characters
    
}
