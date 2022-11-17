
create sequence seq_food;
create table tbl_product(
    pid varchar2(50) not null,
    pname varchar2(50) not null,
    pkind varchar2(50) not null,
    pcontent varchar2(300),
    pprice number not null,
    pimg varchar2(50)
);
alter table tbl_product add CONSTRAINT pk_board primary key (pid);
commit;

create table tbl_cart(
    pid varchar2(50) not null,
    pname varchar2(50) not null,
    pprice number not null,
    pimg varchar2(50),
    pcount number not null
);

create table tbl_wishlist(
    pid varchar2(50) not null,
    pname varchar2(50) not null,
    pprice number not null,
    pimg varchar2(50),
    pcount number not null
);

create table tbl_checkout(
    id varchar2(50) not null,
    name varchar2(50) not null,
    adrress varchar2(100),
    psum number not null
);