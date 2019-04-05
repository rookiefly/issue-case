package com.rookiefly.issue.mybatiscase.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer orderId;

    private Integer gorderId;

    private String userId;

    private BigDecimal amount;

    private Timestamp createTime;

    private Timestamp updateTime;
}
