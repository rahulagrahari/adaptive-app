### format consumed by _"/getfirst"_ post api:

> Consumption type : String

> Format: [username, opt1, opt2, opt3, opt4] -> where opt are 0 or 1 based on wrong or correct option selected

> example: [rahul, 0,1,1,2]

> return type: this will return the list of question 


### format consumed by _"/next"_ post api:

> Consumption type : String

> Format: [username, score:{0 or 1}, topic,, level] -> where opt are 0 or 1 based on wrong or correct option selected

> example: [rahul, 0,1,1]

> return type: this will return the list of question 


## update the heuristic function according to your need in the MainQuestionService.java file


## steps to get started:

first add the list of some questions in problem table
> insert into problem values(1, 'hello world', 1, 'a',  'a',  'a',  'a', 1);
  insert into problem values(2, 'no world', 2, 'a',  'a',  'a',  'a', 1);
  insert into problem values(3, 'hellhdo', 3, 'a',  'a',  'a',  'a', 1);
  insert into problem values(4, 'hellasfo', 4, 'a',  'a',  'a',  'a', 1);
  insert into problem values(5, 'hevxzcfllo', 5, 'a',  'a',  'a',  'a', 1);
  insert into problem values(6, 'helsfddflo world', 1, 'a',  'a',  'b',  'a', 2);
  insert into problem values(7, 'no world', 2, 'a',  'a',  'a',  'a', 2);
  insert into problem values(8, 'hellhdo', 3, 'a',  'a',  'a',  'a', 2);
  insert into problem values(9, 'hellasfo', 4, 'a',  'a',  'a',  'a', 2);
  insert into problem values(10, 'hevxzcfllo', 5, 'a',  'a',  'a',  'a', 2);
  
  you can use the above sql statement to insert some question
  
> then call the /getfirst api which will calculate the heuristic and fetch the problem statement based on heuristic

> then call /next api which will update the score and queue based on the information sent from front end and then fetches the new question  