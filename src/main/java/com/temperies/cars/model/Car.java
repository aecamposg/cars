package com.temperies.cars.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Car implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @ApiModelProperty(notes = "The database generated car ID")
    private Long id;

    @ApiModelProperty(notes = "The car brand", required = true)
    @JsonProperty("brand")
    private String brand;

    @ApiModelProperty(notes = "The model of the car", required = true)
    @JsonProperty("model")
    private String model;

    @ApiModelProperty(notes = "The max kms that the car can reach", required = true)
    @JsonProperty("maxKms")
    private int maxKms;

    @ApiModelProperty(notes = "The car hoursepower", required = true)
    @JsonProperty("cv")
    private int cv;

    @ApiModelProperty(notes = "The revolutions per minutes", required = true)
    @JsonProperty("minTime")
    private int minTime;

    @ApiModelProperty(notes = "The engine capacity", required = true)
    @JsonProperty("cc")
    private int cc;

    @ApiModelProperty(notes = "The car cylinders", required = true)
    @JsonProperty("cylinders")
    private int cylinders;

    @ApiModelProperty(notes = "The vehicle weight", required = true)
    @JsonProperty("kg")
    private float kg;

    @ApiModelProperty(notes = "The car image", required = true)
    @JsonProperty("image")
    private String image;

    @ApiModelProperty(notes = "The creation date", required = true)
    @JsonProperty("created")
    private Date created;
}
