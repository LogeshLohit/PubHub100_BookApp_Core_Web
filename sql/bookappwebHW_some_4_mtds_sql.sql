use ck;

create table BOOKS
(
bookid int primary key auto_increment not null,
bookname varchar(30) not null,
bookauthor varchar(30) not null,
price int not null,
unique(bookname,bookauthor)
);
insert into books(bookname,bookauthor,price) values('Jungle Book','Rudyard Kipling',500);

update books set bookname='Java 8' where bookname='Java 7';

update books set price=500 where price=555;

delete from books where bookname='Jungle Book';

delete from books where bookid=8;

select * from books;

select bookname from books where bookname like 'j%';	
