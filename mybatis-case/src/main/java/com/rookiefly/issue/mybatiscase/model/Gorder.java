package com.rookiefly.issue.mybatiscase.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@ToString
public class Gorder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer gorderId;

    private String userId;

    private BigDecimal amount;

    private Timestamp createTime;

    private Timestamp updateTime;

    private Order order;

    private List<Order> orderList;
}
