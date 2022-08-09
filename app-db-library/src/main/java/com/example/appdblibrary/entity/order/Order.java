package com.example.appdblibrary.entity.order;

import com.example.appdblibrary.entity.template.AbsLongEntity;
import com.example.appdblibrary.entity.users.Address;
import lombok.*;
import com.example.appdblibrary.entity.enums.OrderStatus;
import com.example.appdblibrary.entity.users.User;

import javax.persistence.*;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "orders")
public class Order extends AbsLongEntity {

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "customer_id",insertable = false,updatable = false)
    private User customer;

    @Column(name = "customer_id")
    private Long customerId;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "courier_id",insertable = false,updatable = false)
    private User courier;

    @Column(name = "courier_id")
    private Long courierId;

    @OneToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "address_id",insertable = false,updatable = false)
    private Address address;

    @Column(name = "address_id")
    private Long addressId;

    @ManyToOne(fetch =FetchType.LAZY,optional = false)
    @JoinColumn(name = "branch_id",insertable = false,updatable = false)
    private Branch branch;

    @Column(name = "branch_id")
    private Long branchId;

    @ManyToOne(fetch = FetchType.LAZY)
    private PayType payType;

//    @OneToMany(fetch = FetchType.LAZY)
//    private List<BasketProduct> basketProductList;

    private Double basketPrice;

    private Double fare;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderType;

//    @Enumerated(EnumType.STRING)
//    private OrderTypeEnum orderTypeEnum;

    private String comment;

    private Double finalPrice;

}

