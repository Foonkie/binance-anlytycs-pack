package com.example.binancefull.database;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
@Setter
@EqualsAndHashCode
@ToString
public class PriceId implements Serializable {

private Long ticker;

private LocalDateTime time;

}
