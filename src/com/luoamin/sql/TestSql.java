package com.luoamin.sql;

public class TestSql {
	
	
	public static void main(String[] args) {
		/*
		 * 
		 * delete from test where id in
		 * (select id from test group by id having count(id)>1)and
		 *  
		 *  rowid not in  
		 * (select min(rowid) from test group by id having count(id)>1
		 * )
		 * 
		 * 
		 * 
		 * delete from test where id in (select id from test group by id having count(id)>1)
		 *and rowid not in (select min(rowid) from test group by id having count(id)>1) ;
		 * 
		 * s
		 * create table test2 as select distinct * from test;
		 * drop table test;
		 * create table test as select * from test2;
		 * 
		 * update test set (id,name,account ) = (select id,name,account from test1 where id =1)where id=1 
		 * 
		 * insert into (id,name,account)  select id,name,account from test1
		 * 
		 * insert into 
		 * Insert into test select * from test2;
		 * 
		 * insert into test select * from test2;
		 * 
		 * insert into test (name,sex,account) select name,sex,account from test1;
		 * 
		 * insert into test (name,sex,account) select name,sex,account from test1;
		 * 
		 * 
		 * update test set (name,sex,account)=(select name,sex,account from test1 where id=1)
		 * 
		 * 
		 * 
		 * 
		 * create sequence test_seq increment by 1 start with 10 maxvalue 999999 nocycle  nocache;
		 * 
		 * 
		 * 
		 * 
		 * create sequence test_seq increment by  1 start with 10 maxvalue 999999 nocycle nocache;
		 * 
		 * 
		 * create table ttt(
		 * id number(10,0), 
		 * name varchar2(30) not null ,
		 * sex char(1) 
		 * custId number(10,0),
		 * constrint 
		 * );
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
	}

}
