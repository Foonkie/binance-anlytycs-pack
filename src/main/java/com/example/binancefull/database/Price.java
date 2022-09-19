package com.example.binancefull.database;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table (name = "prices")
@IdClass(PriceId.class)
public class Price {

    @Id
    @Column(name = "time")
   private LocalDateTime time;

    @Id
    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ticker_id")
   private Ticker ticker;

    @Column(name = "cost")
   private BigDecimal cost;
}
