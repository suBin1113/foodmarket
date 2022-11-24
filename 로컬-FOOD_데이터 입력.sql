//전체를 드래그하여 2번 이상 실행해 데이터 개수를 많이 늘려둘 것을 권장합니다.

insert into tbl_product values(seq_food.nextval, '파프리카', 'vegetable', '신선한 파프리카입니다.', 1300, 'product-1.jpg'); 
insert into tbl_product values(seq_food.nextval, '딸기', 'fruit', '신선한 딸기입니다.', 2700, 'product-2.jpg'); 
insert into tbl_product values(seq_food.nextval, '그린빈', 'vegetable', '신선한 그린빈입니다.', 900, 'product-3.jpg'); 
insert into tbl_product values(seq_food.nextval, '적양배추', 'vegetable', '신선한 적양배추입니다.', 1500, 'product-4.jpg'); 
insert into tbl_product values(seq_food.nextval, '토마토', 'vegetable', '신선한 토마토입니다.', 1300, 'product-5.jpg'); 
insert into tbl_product values(seq_food.nextval, '브로콜리', 'vegetable', '신선한 브로콜리입니다.', 4000, 'product-6.jpg'); 
insert into tbl_product values(seq_food.nextval, '당근', 'vegetable', '신선한 당근입니다.', 1300, 'product-7.jpg'); 
insert into tbl_product values(seq_food.nextval, '주스', 'juice', '신선한 주스입니다.', 2000, 'product-8.jpg'); 
insert into tbl_product values(seq_food.nextval, '적양파', 'vegetable', '신선한 적양파입니다.', 1600, 'product-9.jpg'); 
insert into tbl_product values(seq_food.nextval, '사과', 'fruit', '신선한 사과입니다.', 1700, 'product-10.jpg'); 
insert into tbl_product values(seq_food.nextval, '마늘', 'vegetable', '신선한 마늘입니다.', 700, 'product-11.jpg'); 
insert into tbl_product values(seq_food.nextval, '고추', 'vegetable', '신선한 고추입니다.', 600, 'product-12.jpg'); 
insert into tbl_product values(seq_food.nextval, '건조 파인애플', 'dried', '건조한 파인애플입니다.', 4000, 'product-13.jpg'); 
insert into tbl_product values(seq_food.nextval, '건조 사과', 'dried', '건조한 사과입니다.', 4500, 'product-14.jpg'); 
insert into tbl_product values(seq_food.nextval, '건조 망고', 'dried', '건조한 망고입니다.', 4000, 'product-15.jpg'); 
commit;

select * from tbl_product;
