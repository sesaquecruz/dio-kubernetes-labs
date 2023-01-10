package com.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CommentDto {
    @NotBlank
    @Size(max = 40)
    @JsonProperty("name")
    private String name;
    @NotBlank
    @Size(max = 40)
    @Email
    @JsonProperty("email")
    private String email;
    @NotBlank
    @Size(max = 200)
    @JsonProperty("comment")
    private String comment;
}
