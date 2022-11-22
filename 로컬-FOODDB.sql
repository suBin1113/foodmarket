//drop table tbl_product;

create sequence seq_food;
create table tbl_product(
    pid number(10,0) not null,
    pname varchar2(50) not null,
    pkind varchar2(50) not null,
    pcontent varchar2(300),
    pprice number not null,
    pimg varchar2(50)
);
alter table tbl_product add CONSTRAINT pk_product primary key (pid);
insert into tbl_product values(seq_food.nextval, '이름1', '테스트 종류', '테스트 내용', 100, 'product-1.jpg'); //더미데이터 추가문

create sequence seq_cart;
create table tbl_cart(
    cno number(10,0) not null,
    pid number(10,0) not null,
    pname varchar2(50) not null,
    pprice number not null,
    pcontent varchar2(300),
    pimg varchar2(50),
    pcount number not null
);
alter table tbl_cart add CONSTRAINT pk_cart primary key (cno);
alter table tbl_cart add CONSTRAINT fk_cart FOREIGN key (pid) references tbl_product(pid);

create sequence seq_wishlist;
create table tbl_wishlist(
    wno number(10,0) not null,
    pid number(10,0) not null,
    pname varchar2(50) not null,
    pprice number not null,
    pcontent varchar2(300),
    pimg varchar2(50),
    pcount number not null
);
alter table tbl_wishlist add CONSTRAINT pk_wishlist primary key (wno);
alter table tbl_wishlist add CONSTRAINT fk_wishlist FOREIGN key (pid) references tbl_product(pid);

create table tbl_orderItem(
    orderId number(20) not null,
    orderItemId number(10, 0),
    pid number(10, 0),
    pname varchar2(50),
    pprice number,
    pcount number,
    totalPrice number
);

create sequence seq_checkout;
create table tbl_checkout(
    orderId number(20) not null,
    name varchar2(50),
    address varchar2(100),
    zip varchar2(50),
    orderDate date default sysdate,
    psum number
);
alter table tbl_checkout add CONSTRAINT pk_checkout primary key (orderId);

commit;