package com.demoqa.entites;

import lombok.*;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class TextBoxEntity {

     private  String fullName;
     private  String email;
     private  String genderRandom;
     private  String currentAddress;
     private  String permanentAddress;



}
