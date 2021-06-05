DROP TABLE IF BOOKS ;  
CREATE TABLE BOOKS (  
UUID INT AUTO_INCREMENT  PRIMARY KEY,  
Title VARCHAR(50) NOT NULL, 
Author VARCHAR(50) NOT NULL, 
Edition VARCHAR(50) NOT NULL, 
Category VARCHAR(50) NOT NULL, 
Rack INT NOT NULL, 

); 


DROP TABLE IF User_Book_Issue_Details;  
create table User_Book_Issue_Details (
    bookUuid INT,
    user_id int,
    return_date varchar,
    issue_date varchar,
    CONSTRAINT FK_Book_ID FOREIGN KEY (bookUuid) REFERENCES BOOKS(UUID),
    CONSTRAINT FK_User_ID FOREIGN KEY (user_id) REFERENCES MEMBERS(id)
);

DROP TABLE IF MEMBERS ;  
CREATE TABLE MEMBERS (  

 id INT PRIMARY KEY,
  name VARCHAR(250),
  roles VARCHAR,
  username varchar,
  password varchar
); 






