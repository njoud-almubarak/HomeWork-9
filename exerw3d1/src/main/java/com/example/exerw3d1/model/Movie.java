package com.example.exerw3d1.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.time.DurationMin;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor @NoArgsConstructor
@Entity
@Data
@Table
public class Movie {
    @Id
    @NotNull (message = "id is required")
    @Column(nullable = false,length = 3)
  // @Min(value = 1000 ,message = "length of id must be more than 3 digit")
    private Integer id;
    @NotNull (message = "id is required")
 //   @Size (min = 4,message = "length of id must be more than 3 character")
    @Column (unique = true,nullable = false,length = 3)
    private String name;
    @Column (nullable = false)
    @Pattern(regexp = "Drama|Action|Comedy")
    private  String genre ;
    @NotNull (message = "rating is required")
    @Positive
    @Max(value = 5,message = "the rate must be between 1-5")
    @Min(value = 1,message = "the rate must be between 1-5")
    private  Integer rating  ;
    @Positive (message = "duration must be number")
    @NotNull(message = "duration is required")
    // @DurationMin(minutes = 60,inclusive = false,message = "the minutes must be more than 60")
     // @Min(value = 60,message = "the number must be more than 60")
    private Integer duration;
    @NotNull(message = "launch date is required")


    @JsonFormat(pattern="yyyy-MM-dd")
    private Date launchDate;

}
